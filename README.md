Mutant 🧬

Mutant is a Java application that determines whether a DNA sequence belongs to a mutant or a human. It provides a RESTful API to analyze DNA sequences and respond based on predefined rules.
Table of Contents

Overview

This project implements an algorithm to detect mutant DNA sequences. Mutant DNA is identified by searching for patterns in rows, columns, or diagonals of the DNA sequence matrix.
Features

    Mutant Detection Algorithm: Validates DNA patterns for mutants.
    REST API: Exposes an endpoint for DNA analysis.
    Built with Spring Boot: Leveraging Spring Boot for rapid development and scalability.
    Test Coverage: Includes unit and integration tests.

Installation

    Clone the repository:

git clone https://github.com/AimonettiJoaquin/Mutant.git
cd Mutant

Build the project:
Ensure you have Java 11+ and Maven installed. Then run:

mvn clean install

Run the application:

    mvn spring-boot:run

    The application will start at http://localhost:8080.

Usage

Send a POST request to analyze DNA sequences.
Example Request

POST /mutant
Payload:

{
  "dna": [
    "ATGCGA",
    "CAGTGC",
    "TTATGT",
    "AGAAGG",
    "CCCCTA",
    "TCACTG"
  ]
}

Responses

    200 OK: The DNA belongs to a mutant.
    403 Forbidden: The DNA belongs to a human.

API Endpoints
POST /mutant

Description: Analyzes a DNA sequence to determine if it belongs to a mutant.

    Request Body:

    {
      "dna": ["<array of strings representing DNA>"]
    }

    Response:
        200 OK: DNA is mutant.
        403 Forbidden: DNA is human.

Testing

Run the tests with:

mvn test

You can find unit tests under src/test/java. Ensure the tests cover edge cases and invalid inputs for robust DNA validation.
Contributing

Contributions are welcome! Here's how you can help:

    Fork this repository.
    Create a feature branch:

git checkout -b feature-name

Make your changes and commit:

git commit -m "Add your message here"

Push to your fork:

    git push origin feature-name

    Open a pull request with a detailed description of your changes.

License

This project is licensed under the MIT License. See the LICENSE file for more details.
