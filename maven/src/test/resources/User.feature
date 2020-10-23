Feature: This feature is about User creation and deletion and access

Scenario: Get User details
When user gets details of user "ganesh" from uri "https://petstore.swagger.io/v2/user/"
When user "ganesh" logs in using "https://petstore.swagger.io/v2/user/login/"
When user "ganesh" gets by name "https://petstore.swagger.io/v2//user​/{username}"
When user "ganesh" updates details  "https://petstore.swagger.io/v2//user​/{username}"
When user "ganesh" delets  "https://petstore.swagger.io/v2/user​/{username}"