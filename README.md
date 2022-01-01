# Jina Food Backend

It a web application developed using java and its framwork spring boot to realize a **`Backend API`** server & an **`Admin Dashboard`** to manage a restaurant business.

# Online Application

The application is hosted on heroku, and you can find it on https://jinafoodbackend.herokuapp.com

# Understanding the database

We used MongoDB as a database for our application.
it contains 5 collections:

- _Employees:_ Data about employee working in the restaurant.
- _Customers:_ Data about customers that submited orders or filled the subscribe form.
- _Foods:_ Managing Infos about foods and products displayed in our web app.
- _Tables:_ Getting infos about tables existing in our restaurant.
- _Orders:_ Managing client orders.

# More Infos

- the source code is completed.
- the database used in dev mode was in localhost, but in production it is already in a real mongodb cluster.
- this backend app has 2 functionalities: Admin Dashboard (using jsp) & Rest API (using spring boot framwork).

# The Frontend

The frontend for this app is hosted on https://jinafood.vercel.app

**_`You can find the source code of the frontend on `_** https://github.com/AhmedCoolProjects/jinaFoodFrontend
