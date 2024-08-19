Java project using Hibernate, build on Gradle. 
Its purpose is to map an entity onto existing tables and add minimal functionality to check that the mapping is done correctly. 
These functions and some technical issues are implemented in the main file to save time, although incorrectly.
I make 2 folders in project. One for database and one for code.
An entity was created for each table and mapping was configured.
Added a transactional method that can create a new customer (customer table) with all dependent fields.
Added a transaction method that describes the event “a customer went and returned a previously rented movie.”
Added transaction method
which describes the event “the buyer went to the store and rented inventory there.” At the same time, he made a payment (payment) from the seller (staff).”
Added a transaction method that describes the event “a new movie was made and it became available for rent.”
