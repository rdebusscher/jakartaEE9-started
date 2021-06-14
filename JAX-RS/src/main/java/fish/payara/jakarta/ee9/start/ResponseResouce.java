/*
 * Copyright (c) [2021] Payara Foundation and/or its affiliates. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fish.payara.jakarta.ee9.start;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Collections;

@Path("/evenValue")
public class ResponseResouce {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{intVal}")
    public Response testValue(@PathParam("intVal") Integer value) {
        if (value % 2 == 0) {
           return Response.ok("Value is a correct even number") .build();
        } else {
            return Response.notAcceptable(Collections.emptyList()).build();
        }
    }
}
