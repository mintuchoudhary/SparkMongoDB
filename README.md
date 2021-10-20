# Spark with Cloud MongoDB

###### Here I will be creating Cloud MongoDB database and will connect using Spark to read and write the data back to database as collection

`In this example, I will demonstrate how to create your mongodb database using Cloud MongoDB service
`

Create your account on Cloud MongoDB : https://account.mongodb.com/account/login

    1. Once your logged in Create cluster and select type as Shared which is free.
    2. Go to SECURITY --> Database Access menu and create new user with password 
    2. Load data into the database using : DEPLOYMENT : Databases --> Browse Data --> Load Sample Data
    3. One the database and collection is created, Click on Connect and select "Connect your application"
    4. Copy the connection url and add it in the given spark code and replace the password with acutal one (given in step 2) 

