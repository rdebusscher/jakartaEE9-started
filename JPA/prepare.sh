#!/bin/bash
#
# Copyright (c) [2021] Payara Foundation and/or its affiliates. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#


./asadmin add-library /Users/rubus/resources/mysql-connector-java-5.1.39.jar

./asadmin create-jdbc-connection-pool --datasourceclassname com.mysql.jdbc.jdbc2.optional.MysqlDataSource --restype javax.sql.DataSource --property url="jdbc\:mysql\://localhost\:3306/rubus" rubus-pool

./asadmin set resources.jdbc-connection-pool.rubus-pool.property.password=rubus resources.jdbc-connection-pool.rubus-pool.property.databaseName=rubus resources.jdbc-connection-pool.rubus-pool.property.serverName=localhost resources.jdbc-connection-pool.rubus-pool.property.user=rubus resources.jdbc-connection-pool.rubus-pool.property.portNumber=3306



./asadmin ping-connection-pool rubus-pool

./asadmin create-jdbc-resource --enabled=true --poolName=rubus-pool --target=domain jdbc/local-mysql
./asadmin create-resource-ref --enabled=true --target=server jdbc/local-mysql
