# spring-cloud-microservice

&#8194;&#8194; ![enter image description here](https://github.com/VickyFengYu/spring-cloud-microservice/blob/master/image/microservice.png?raw=true)

## <i class="icon-folder-open"></i> Register Okta

Sign in  [Okta Sign In](https://login.okta.com/signin/) and following steps below, then you will get 

```
okta.oauth2.issuer=
okta.oauth2.client-id=
okta.oauth2.client-secret=
```
Which need to be configured in application.properties


Applications-> Add Application-> Web-> Login redirect URIs (http://localhost:8080/login/oauth2/code/okta)-> Check (Authorization Code & Refresh Token)-> Done

![enter image description here](https://github.com/VickyFengYu/spring-cloud-microservice/blob/master/image/client-credentials.jpg?raw=true)

API-> Authorization Servers-> Issuer URI

![enter image description here](https://github.com/VickyFengYu/spring-cloud-microservice/blob/master/image/authorization-servers.jpg?raw=true)


## <i class="icon-folder-open"></i> Start Application

#### <i class="icon-folder-open"></i> [http://localhost:8761/](http://localhost:8761/)

![enter image description here](https://github.com/VickyFengYu/spring-cloud-microservice/blob/master/image/eureka-service.jpg?raw=true)


#### <i class="icon-folder-open"></i> [http://localhost:8080/index](http://localhost:8080/index)

> Hello, your username in Okta


#### <i class="icon-folder-open"></i> [http://localhost:8080/restaurants](http://localhost:8080/restaurants)

```
{
  "_embedded" : {
    "restaurants" : [ {
      "name" : "Armani Hotel Dubai",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8090/restaurants/1"
        },
        "restaurant" : {
          "href" : "http://localhost:8090/restaurants/1"
        }
      }
    }, {
      "name" : "Baur au Lac",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8090/restaurants/2"
        },
        "restaurant" : {
          "href" : "http://localhost:8090/restaurants/2"
        }
      }
    }, {
      "name" : "Bellagio",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8090/restaurants/3"
        },
        "restaurant" : {
          "href" : "http://localhost:8090/restaurants/3"
        }
      }
    }, {
      "name" : "Belmond Charleston Place",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8090/restaurants/4"
        },
        "restaurant" : {
          "href" : "http://localhost:8090/restaurants/4"
        }
      }
    }, {
      "name" : "Belmond Copacabana Palace",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8090/restaurants/5"
        },
        "restaurant" : {
          "href" : "http://localhost:8090/restaurants/5"
        }
      }
    }, {
      "name" : "Carlisle Bay",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8090/restaurants/6"
        },
        "restaurant" : {
          "href" : "http://localhost:8090/restaurants/6"
        }
      }
    }, {
      "name" : "Ciragan Palace Kempinski Istanbul",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8090/restaurants/7"
        },
        "restaurant" : {
          "href" : "http://localhost:8090/restaurants/7"
        }
      }
    }, {
      "name" : "Claridges",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8090/restaurants/8"
        },
        "restaurant" : {
          "href" : "http://localhost:8090/restaurants/8"
        }
      }
    } ]
  },
  "_links" : {
    "self" : {
      "href" : "http://localhost:8090/restaurants"
    },
    "profile" : {
      "href" : "http://localhost:8090/profile/restaurants"
    }
  },
  "page" : {
    "size" : 20,
    "totalElements" : 8,
    "totalPages" : 1,
    "number" : 0
  }
}
```


#### <i class="icon-folder-open"></i> [http://localhost:8080/five-star-restaurant](http://localhost:8080/five-star-restaurant)

```
[{"name":"Baur au Lac"},{"name":"Bellagio"},{"name":"Belmond Copacabana Palace"},{"name":"Carlisle Bay"},{"name":"Claridges"}]
```

### <i class="icon-folder-open"></i> Reference

[https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-intro-to-microservices-part-1-c0d24cd422c3](https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-intro-to-microservices-part-1-c0d24cd422c3r)

[https://gorillalogic.com/blog/microservices-with-spring-boot-and-spring-cloud-developer-tutorial/](https://gorillalogic.com/blog/microservices-with-spring-boot-and-spring-cloud-developer-tutorial/)


