# Spring Boot Code Challenge

## A REST WEB App that serves two unrelated functionalities

1) Show list of transactions of both banks 1 and 2
2) Show account balance of both banks 1 and 2

## 📝 Contents

- [About](#about)
- [Getting Started](#getting_started)
- [Usage](#usage)
- [Built Using](#built_using)

## 🧐 About <a name = "about"></a>
I implemented the project matching Par's request, focusing on the adapter pattern.

### General

#### Design

The application implements a simple MVC architecture, with a controller acting as view,
a service which in this case are handled by the classes that implement the common data structure for balance and transactions list, so they are in the same class as the model.

#### Exception Handler

Try - Catch statements were used to handle exceptions at the controller methods aiming debug as the Java standard suggests.

If - Else statements were used to handle exceptions at the service methods aiming to provide user feedback about him or her inputs.

### Design of Balance

Implemented with 3 fields, the amount as a double and currency as string, and a list of banks(adapters) that implement the IBank interface.

Beyond getters and setters balance contains it's print method.

### Design of Transactions

The transactions list are made of two lists, one with the adapters just like balance, and another called "bankRecord"
which is a list of BankTransaction objects, which are made of 3 fields, amount(double), type(int) and text(string).

Beyond getter and setters, transactions contain it's print method, and transaction contain a getWrittenType, which returns a string "Credit" if it's equal to 1, and "Debit" if it's equal to 2, which is considered as a default of the project and part of the requirements on the adapters if it was necessary to deal with.

## 🏁 Getting Started <a name = "getting_started"></a>

After cloning the repository, you can run the application using the following command:

```bash
git clone https://github.com/raissacorreia/spring-challenge-two
cd ./spring-challenge-two
mvn spring-boot:run
```

For that it's necessary to install the following requisites.

### Prerequisites

- Java openjdk version "17.0.2"
- Apache Maven 3.6.3

I run and developed the application on Ubuntu 22.04.2 LTS, here are the links to check for your OS.

[JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

[Maven](https://maven.apache.org/)

```bash
apt install openjdk-17-jdk openjdk-17-jre
unzip apache-maven-3.6.3-bin.zip
tar xzvf apache-maven-3.6.3-bin.tar.gz
```

### Running

## 🔧 Running the tests <a name = "tests"></a>

To run all the tests just run the following command:

```bash
mvn test
```

To run tests from a specific class, just run the following command:

"BalanceTest" are for the Balance functionality
"TransactionsTest" are for the key-value Transactions functionality

```bash
mvn test -Dtest=BalanceTest
mvn test -Dtest=TransactionsTest
```

The tests are implemented using JUnit 5.

## 🎈 Usage <a name="usage"></a>

To make it more simple I added the Postman JSON export on the root of the project, with the name
"Hiring-Test-Spring.postman_collection.json"

### Usage of Balance

- Get Balance: http://localhost:8080/balances

```JSON
{
    "id": 0,
}
```

#### Expected Returns for Balance

- Get Balance:
  - Return the data as a string like this: "Balance: Amount Currency", Amount is a double and Currency a string.
  - "Error: Error Message" if an error occurs and fall into catch statement in controller

### Usage of Transactions

- Get transactions list: http://localhost:8080/transactions

```JSON
{
    "id": 0,
}
```
#### Expected Returns for Transactions

- Get Transactions:
  - Return Array of Strings, each string show a transaction like this: "Amount: amount(double), Type: ("debit" or "credit"), Text: text(string)"
  - "Error: Erro Message" if an error occurs and fall into catch statement in controller

## ⛏️ Built Using <a name = "built_using"></a>

- [Postman](https://www.postman.com/)
- [Java 17](https://docs.oracle.com/en/java/javase/17/docs/api/index.html)
- [Spring Boot 3.0.2](https://spring.io/projects/spring-boot)
- [JUnit 5.8.1](https://junit.org/junit5/)
- [Maven 3.6.3](https://maven.apache.org/guides/index.html)
