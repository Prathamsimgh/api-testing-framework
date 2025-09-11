# API Testing Framework

This repository contains an automated testing framework for API testing, built with Java, TestNG, and Maven.

## Project Structure

- `src/test/java/com/apitesting/tests/functional/SmokeTest.java`: Smoke tests for API functionality
- `src/test/resources/suites/api-tests.xml`: TestNG suite configuration
- `pom.xml`: Maven project configuration
- `.gitignore`: Git ignore rules for Maven and IDE files

## Prerequisites

- Java 8 or higher
- Maven 3.x

## How to Run

1. Clone the repository
2. Navigate to the project directory
3. Run the tests:

```bash
mvn clean test
```

## Configuration

The tests can be configured via the TestNG XML suite files in `src/test/resources/suites/`.

## Reporting

Test reports are generated automatically after running the tests.
