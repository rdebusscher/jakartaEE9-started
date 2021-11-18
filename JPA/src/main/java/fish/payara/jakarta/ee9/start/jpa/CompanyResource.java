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
package fish.payara.jakarta.ee9.start.jpa;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path("/company")
@RequestScoped
public class CompanyResource {

    //@Inject
    //private CompanyBoundary companyBoundary;

    @Inject
    private CompanyService companyService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Company getCompany(@PathParam("id") Long id) {
        //return companyBoundary.findCompany(id);
        return companyService.findCompany(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Company> getAllCompany() {
        return companyService.allCompanies();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Company getAllCompany(Company company) {
        return companyService.insertCompany(company);
    }

}
