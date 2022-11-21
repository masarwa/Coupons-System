# Coupons-System

# docker-containers
the folder docker-containers contain the docker-compose of mysql
which is used to launch mysql locally

# coupons
the folder contains the java project of coupon system, which was developed in a course in john bryce.
The project was implemented using spring boot

it has three main entities:
1. Coupon
2. Customer
3. Company

Each company offer multiple coupon for selling
Each customer can buy one or more coupons
The coupons has many-to-many relation to customer and company
The relations are managed with join tables, which are created by spring, the same as the rest of tables.
