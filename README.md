**SERVICE CARDS API**


Project based in Java 17 and SpringBoot.

- **Endpoints**  
  

 ``POST:`` Expected **Json Body** and **create new sub-resource.**
``` http request
/cashcards
```   
```json
{
	"amount": 1
}
```
   
``GET:`` Get resource if you are an **authorized owner.**
``` http request
/cashcards/{id}
``` 


``GET:`` Get **list** of resources in order for **id**, **amount** or **page.**
```http request
/cashcards?page=0&size=20&sort=id,asc
```

