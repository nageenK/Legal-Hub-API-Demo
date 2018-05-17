# Legal-Hub-API

## Below are the API's developed

## GET:<br />
**`URI`**: **/customer** <br />
**`Respone`**:
```json
[{
	"id": 2,
	"firstName": "Sai",
	"lastName": "Kanikanti",
	"organizationId": 213324,
	"addressLine1": "1100 Maroubra Loop",
	"city": "Cary",
	"state": "NC",
	"country": "US",
	"zipCode": 27513
}]
```
## POST:<br />
**`URI`**: **/postcustomer**<br />
**`Request`**:
```json
{
	"id": 2,
	"firstName": "Sai",
	"lastName": "Kanikanti",
	"organizationId": 213324,
	"addressLine1": "1100 Maroubra Loop",
	"city": "Cary",
	"state": "NC",
	"country": "US",
	"zipCode": 27513
}
```
**`Response`**:<br />
200 HTTP Status Code.(May be enhanced to return an ID)<br />

## GET:<br />
**`URI`**: **/findByLastName/{searchTerm}

## DELETE:<br />
**`URI`**: **/customer/{id}** // id - Customer Id 
**`Respone`**:
```json
[{
	"id": 2,
	"firstName": "Sai",
	"lastName": "Kanikanti",
	"organizationId": 213324,
	"addressLine1": "1100 Maroubra Loop",
	"city": "Cary",
	"state": "NC",
	"country": "US",
	"zipCode": 27513
}]
```

This sub-project is the backend server portion of the Legal Hub.<br />

# Install the repo with mvn<br />
mvn install<br />

# Start the server<br />
mvn spring-boot:run<br />

# Then make some requests:<br />
– http://localhost:8080/customer<br />

# Technologies
– Java 1.8
– Maven 3.3.9
– Spring Tool Suite – Version 3.8.4.RELEASE
– Spring Boot: RELEASE

# About project file structure
– Class Customer corresponds to entity and table customer, it should be implemented Serializable.<br />
– CustomerController is a REST Controller which has request mapping methods for RESTful requests such as: getAll, postCustomer, 	  delete, findByLastName.<br />
– Configuration for Spring Datasource and Spring JPA properties in application.properties<br />
– Dependencies for Spring Boot and MariaDB in pom.xml<br />
