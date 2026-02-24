# Taskify API

Taskify API é uma aplicação backend desenvolvida com Spring Boot, utilizando JPA/Hibernate para persistência de dados.  
O projeto consiste em uma API RESTful para gerenciamento de tarefas (To-Do List), aplicando boas práticas de arquitetura em camadas.

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Banco de Dados: H2 / MySQL
- Maven

## 📌 Funcionalidades

- Criar tarefas
- Listar todas as tarefas
- Buscar tarefa por ID
- Atualizar tarefa
- Deletar tarefa
- Filtrar tarefas por status
- Tratamento global de exceções
- Uso de DTO para transferência de dados

## 🏗️ Arquitetura

O projeto segue o padrão de arquitetura em camadas:

Controller → Service → Repository → Database

Separação de responsabilidades:
- Controller: exposição dos endpoints REST
- Service: regras de negócio
- Repository: acesso a dados
- DTO: comunicação externa
- Entity: modelagem do banco

## 🗄️ Modelo da Entidade Task

- id
- title
- description
- status (PENDENTE, EM_ANDAMENTO, CONCLUIDA)
- priority
- createdAt

## 🔥 Diferenciais Técnicos

- Uso de Enum para status da tarefa
- Validações de regra de negócio
- Tratamento centralizado de exceções
- Estrutura escalável para futura implementação de autenticação com Spring Security

## 🎯 Objetivo do Projeto

Projeto desenvolvido para consolidar conhecimentos em:

- Desenvolvimento de APIs REST
- Persistência com JPA/Hibernate
- Arquitetura em camadas
- Boas práticas em backend Java

---

- Desenvolvido por Eric Vieira
- Agradecimentos DevSuperior
