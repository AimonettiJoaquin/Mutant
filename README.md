
# Mutant 🧬

Mutant es una aplicación java que determina si la secuencia de ADN pertenece a un mutante o un humano.

## Instalación

Clona el repositorio

```bash
  git clone https://github.com/AimonettiJoaquin/Mutant.git
  cd Mutant

```
    
Build el proyecto:
Asegurate que tengas Java 11+ y maven instalado.
```bash
  mvn clean install
```
Corre la aplicación
```bash
  mvn spring-boot:run
```
La aplicación estara en http://localhost:8080/mutant
## Ejemplo de uso
POST /mutant
```bash
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
```

Respuestas

    200 OK: Mutant detected!.
    403 Forbidden: Not a mutant.

