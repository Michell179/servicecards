# **SERVICE CARDS API** ![Status badge](https://img.shields.io/badge/status-in%20progress-yellow) 

Project based in Java 17 and SpringBoot, CashCards is a service for manage money in our family.  
![Status badge](https://img.shields.io/badge/Developed_By-Michell_Arias-green)


## 🛠 Deployment
1. Use Gradle   
`/gradlew bootRun`



### **Endpoints**

 ``POST:`` Expected **Json Body** and **create new sub-resource.**
``` http request
/cashcards
```   
```json
{
	"amount": 1
}
```   

``PUT: `` Use for **update** a **Resource.**
``` http request
/cashcards/{id}
``` 
```json
{
	"amount": 2 
}
```
   
``GET:`` Get resource if you are an **authorized owner.**
``` http request
/cashcards/{id}
``` 


``GET:`` Get **list** of resources in order for **id**, **amount** or **page.**
``` http request
/cashcards?page=0&size=20&sort=id,asc
```

