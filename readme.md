Um projeto simples em **Spring Boot** para cadastro de carros.  
Este projeto demonstra o funcionamento básico de um **formulário HTML** integrado com uma **API REST** em Java.

---

## Tecnologias Utilizadas
- Java 17+
- Spring Boot
    - Spring Web
    - Spring Actuator
- Maven

---

## Estrutura do Projeto

```text
src/
└── main/
├── java/br/com/carstore/
│ ├── controller/
│ │ └── IndexController.java
│ └── model/
│ └── Car.java
└── resources/
└── static/
└── index.html
```

- **IndexController.java** → Controller responsável pelas rotas de cadastro.
- **Car.java** → Classe modelo que representa um carro.
- **index.html** → Formulário simples para criar um carro.

---

## 🚀 Como Executar

   ```text
   #Clone o repositório:
   git clone https://github.com/FLNOG/carstore-dsw.git
   cd carstore
   
   #Compile e execute o projeto:
   mvn spring-boot:run
   ```
Acesse no navegador: http://localhost:8080/index.html