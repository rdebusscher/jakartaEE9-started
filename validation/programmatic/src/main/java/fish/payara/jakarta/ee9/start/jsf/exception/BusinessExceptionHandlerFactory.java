/*
 * Copyright 2014-2019 Rudy De Busscher (https://www.atbash.be)
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
package fish.payara.jakarta.ee9.start.jsf.exception;

import jakarta.faces.context.ExceptionHandler;
import jakarta.faces.context.ExceptionHandlerFactory;

public class BusinessExceptionHandlerFactory extends ExceptionHandlerFactory {
    private ExceptionHandlerFactory parent;

    // this injection handles jsf
    public BusinessExceptionHandlerFactory(ExceptionHandlerFactory parent) {
        this.parent = parent;
    }

    @Override
    public ExceptionHandler getExceptionHandler() {

        return new BusinessExceptionHandler(parent.getExceptionHandler());
    }

}