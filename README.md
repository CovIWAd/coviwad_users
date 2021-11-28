# Coviwad - Users


#### Don't forget to launch keycloack first!


## Database
The database should be available thanks to the command : `docker exec -it covid-postgres-keycloak psql -U postgres`
Then connect to the database '\c keycloak'
The table we are interested in is  `user_entity

## Launch microservice

#### This microservice does not work with the hosted version of keyclok!


Run `bootRun`  with the environment variables given in the documentation.


See [kafka](/kafka).
Go back to [gateway](/gateway).