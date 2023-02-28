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

The application implements a simple MVC architecture, with a controller acting as view, a service, and a model one for each functionality.

#### Exception Handler

Exception-handling is managed locally in controllers. Improvement would be to leverage Spring global exception handlers.
### Design of Balance

Implemented with 3 fields, the amount as a double and currency as string, and a list of banks(adapters) that implement the IBank interface.

### Design of Transactions

BankTransaction object is made of 3 fields, amount(double), type(int) and text(string), and each transaction
list is implemented as list of BankTransaction objects.

## 🏁 Getting Started <a name = "getting_started"></a>

Clone the repository and run the application using the following command:

```bash
git clone https://github.com/raissacorreia/spring-challenge-two
cd ./spring-challenge-two
mvn spring-boot:run
```

For that, it's necessary to install the following pre-requisites.

### Prerequisites

- Java openjdk version "17.0.2"
- Apache Maven 3.6.3

I ran and developed the application on Ubuntu 22.04.2 LTS, here are the links to check for your environment.

[JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

[Maven](https://maven.apache.org/)

```bash
apt install openjdk-17-jdk openjdk-17-jre
unzip apache-maven-3.6.3-bin.zip
tar xzvf apache-maven-3.6.3-bin.tar.gz
```

### Running

## 🔧 Running the tests <a name = "tests"></a>

To run all the tests:

```bash
mvn test
```

To run tests from a specific class:

"BalanceTest" are for the Balance functionality
"TransactionsTest" are for the key-value Transactions functionality

```bash
mvn test -Dtest=BalanceTest
mvn test -Dtest=TransactionsTest
```

The tests are implemented using JUnit 5, and are towards the service layer instead of controller, because they're unit tests. Controller tests are supposed to be integration ones.

## 🎈 Usage <a name="usage"></a>

To make it more simple I added the Postman JSON export on the root of the project, with the name
"Hiring-Test-Spring-Two.postman_collection"

### Usage of Balance

- Get Balance: http://localhost:8080/balances
  
Numbers 0 or 1, other numbers will return a handled exception
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
  
  Numbers 0 or 1, other numbers will return a handled exception

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
