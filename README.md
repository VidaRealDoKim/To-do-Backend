# ✅ To-do Backend - Java

Projeto backend de uma aplicação **To-do List**, desenvolvido em **Java** durante o curso gratuito da [Rocketseat](https://www.rocketseat.com.br/).

> 🚀 Desenvolvimento de uma aplicação back-end em Java; Maven; Spring Boot; API Rest; Lombok; Integração com H2 Database Engine; Implementando segurança nos dados do usuário; Tratamento de Exceções e Deploy do back-end.

---

## 🛠️ Tecnologias Utilizadas

- ☕ **Java 17+**
- 🌐 **Spring Boot**
- 🛢️ **JPA / Hibernate**
- 🐘 **PostgreSQL** (ou outro banco relacional)
- 🔄 **Spring Data JPA**
- 🧪 **JUnit** (para testes unitários, se aplicável)

---

## 📌 Funcionalidades

- Criar uma nova tarefa (`POST /tasks`)
- Listar todas as tarefas (`GET /tasks`)
- Atualizar uma tarefa (`PUT /tasks/{id}`)
- Deletar uma tarefa (`DELETE /tasks/{id}`)
- Marcar como concluída (`PATCH /tasks/{id}/complete`)

---

## ▶️ Como rodar localmente

```bash
# 1. Clone o repositório
git clone https://github.com/seu-usuario/to-do-backend.git
cd to-do-backend

# 2. Importe o projeto na sua IDE (IntelliJ, VSCode, Eclipse...)

# 3. Configure o application.properties
# (ou application.yml para o Spring Boot)
spring.datasource.url=jdbc:postgresql://localhost:5432/todo_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

# 4. Rode o projeto com Maven ou Gradle
