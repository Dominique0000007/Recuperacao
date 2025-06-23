# 📚 Atividade de Recuperação - Java Spring Boot

Este repositório contém as implementações dos três projetos desenvolvidos como parte da atividade de recuperação para a disciplina de Desenvolvimento de Sistemas. Cada projeto foi baseado em vídeos sugeridos pelo professor e foca na construção de APIs REST usando o framework **Spring Boot**.

---

## 📁 Projetos

### ✅ Projeto 1 — CRUD de Produtos  
**Vídeo:** [Live Coding Java: CRUD com Java Spring | Fernanda Kipper](https://www.youtube.com/watch?v=tP6wtEaCnSI)

**Descrição:**  
API para cadastro de produtos com funcionalidades CRUD (Create, Read, Update, Delete).

**Tecnologias:**  
- Java 17  
- Spring Boot  
- Spring Data JPA  
- H2 Database  

**Endpoints principais:**
- `POST /produtos`
- `GET /produtos`
- `GET /produtos/{id}`
- `PUT /produtos/{id}`
- `DELETE /produtos/{id}`

---

### ✅ Projeto 2 — Gerenciador de Tarefas  
**Vídeo:** [Build a Complete CRUD Application with Spring Boot and React | The Dev World](https://www.youtube.com/watch?v=mxOcw4FZRa8)

**Descrição:**  
API para criação e gerenciamento de tarefas, utilizando DTOs e arquitetura em camadas (controller, service, repository).

**Tecnologias:**  
- Java 17  
- Spring Boot  
- Spring Data JPA  
- H2 Database  
- Validação com `@Valid`

**Endpoints principais:**
- `POST /tarefas`
- `GET /tarefas`
- `DELETE /tarefas/{id}`

---

### ✅ Projeto 3 — Cadastro de Usuários  
**Vídeo:** [Curso de Spring para Iniciantes | Fernanda Kipper](https://www.youtube.com/watch?v=YY_hf0FOIcU)

**Descrição:**  
API simples para cadastro de usuários com nome e email. Projeto voltado para quem está começando com Spring Boot.

**Tecnologias:**  
- Java 17  
- Spring Boot  
- Spring Data JPA  
- H2 Database

**Endpoints principais:**
- `POST /usuarios`
- `GET /usuarios`
- `GET /usuarios/{id}`
- `PUT /usuarios/{id}`
- `DELETE /usuarios/{id}`

---

## 🧪 Testes e Resultados

Os projetos foram testados utilizando o **Postman**, simulando as principais requisições de criação, listagem, atualização e exclusão de dados. Os testes demonstraram que os endpoints funcionam corretamente e a persistência no banco de dados está operando conforme esperado.

---

## 💡 Conclusão

Esses projetos me ajudaram a consolidar o entendimento sobre:
- Criação de APIs REST com Spring Boot
- Padrão MVC e boas práticas com DTOs
- Uso do Spring Data JPA e integração com bancos de dados
- Validação de dados com anotações como `@NotBlank` e `@Valid`

A experiência foi muito útil para reforçar minha base em Java e backend.

---

## 🔗 Autor

**Lara Souza**  
[GitHub](https://github.com/Dominique0000007)
