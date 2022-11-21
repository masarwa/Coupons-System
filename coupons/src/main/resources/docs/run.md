

run: 

mvn compile exec:java -Dexec.mainClass="com.aiser.coupons.CouponsApplication"

get customers:
   http://localhost:8080/api/v1/customer/

companies: http://localhost:8080/api/v1/company/
coupons: http://localhost:8080/api/v1/coupon/


mysql port: 33061



add customer: post request: http://localhost:8080/api/v1/customer/

{
    "name": "aiser",
    "age": 33,
     "email": "aiser@g.com"
}

body type==json

