--
-- Copyright (c) [2021] Payara Foundation and/or its affiliates. All rights reserved.
--
-- Licensed under the Apache License, Version 2.0 (the "License");
-- you may not use this file except in compliance with the License.
-- You may obtain a copy of the License at
--
--     http://www.apache.org/licenses/LICENSE-2.0
--
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an "AS IS" BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-- See the License for the specific language governing permissions and
-- limitations under the License.
--

INSERT INTO company(`id`,`name`) VALUES(1,'Payara');
INSERT INTO company(`id`,`name`) VALUES(2,'ACME');

INSERT INTO Employee(`EMPLOYEE_ID`,`FIRST_NAME`, `LAST_NAME`, `HIRE_DATE`, `GENDER`, `COMPANY_ID`) VALUES (100, 'Leslie','Andrews', '2018-09-01', 'FEMALE', 2, );
INSERT INTO Employee(`EMPLOYEE_ID`,`FIRST_NAME`, `LAST_NAME`, `HIRE_DATE`, `GENDER`, `COMPANY_ID`) VALUES (101, 'Emma','Baumgarten', '2016-06-15', 'FEMALE', 2 );
INSERT INTO Employee(`EMPLOYEE_ID`,`FIRST_NAME`, `LAST_NAME`, `HIRE_DATE`, `GENDER`, `COMPANY_ID`) VALUES (102, 'Avani','Gupta', '2020-04-01', 'MALE', 2 );
INSERT INTO Employee(`EMPLOYEE_ID`,`FIRST_NAME`, `LAST_NAME`, `HIRE_DATE`, `GENDER`, `COMPANY_ID`) VALUES (103, 'Yuri','Petrov', '2019-11-01', 'MALE', 2 );
INSERT INTO Employee(`EMPLOYEE_ID`,`FIRST_NAME`, `LAST_NAME`, `HIRE_DATE`, `GENDER`, `COMPANY_ID`) VALUES (104, 'Juan','Vega', '2021-01-01', 'MALE', 2 );