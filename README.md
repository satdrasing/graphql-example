# graphql-example


##### URLS
``` java
http://localhost:8080/graphiql
http://localhost:8080/graphql?query={findAllBooks{id title}}
http://localhost:8080/graphql?query=%7BfindAllBooks%7Bid%20title%7D%7D
http://localhost:8080/graphql/schema.json

mutation

mutation {
  createVehicle(type: "car", modelCode: "XYZ0192", brandName: "XYZ", launchDate: "2016-08-16") 
  {
    id
  }
}

{
  "data": {
    "createVehicle": {
      "id": "1"
    }
  }
}


query:-----
query {
  vehicles(count: 1) 
  {
    id, 
    type, 
    modelCode
	}
}

{
  "data": {
    "vehicles": [
      {
        "id": "1",
        "type": "bus",
        "modelCode": "XYZ123"
      }
    ]
  }
}
```
