# Legal-Hub-API

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

## DELETE:<br />
**`URI`**: **/customer/{id}** // id - Customer Id 
