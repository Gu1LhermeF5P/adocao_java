🐾 Projeto Diamante Final: Sistema de Adoção de Animais
Este projeto é o Produto Final da disciplina de Java Advanced (Segundo Semestre). Trata-se de uma aplicação web completa desenvolvida com a arquitetura MVC (Model-View-Controller) usando a stack Spring Boot.

👥 Integrantes
Nome Completo	
Guilherme Francisco	RM-557648
Larissa de Freitas	RM-555136

Exportar para as Planilhas
🚀 Tecnologias e Requisitos
Este projeto foi construído para atender todos os requisitos técnicos estabelecidos:

Requisito	Tecnologia Utilizada	Detalhes
Arquitetura	Spring Boot MVC	Estrutura modular para gerenciar requisições e dados.
Front-end	Thymeleaf e DaisyUI	Thymeleaf para templates dinâmicos e DaisyUI (via Tailwind CSS) para estilização moderna e responsiva.
Persistência	Spring Data JPA	Utilizado para mapeamento Objeto-Relacional (ORM) e interação com o banco de dados.
Banco de Dados	PostgreSQL (via Docker Compose)	O banco de dados é inicializado em um contêiner Docker para garantir a portabilidade do ambiente.
Migrações	Flyway	Gerenciamento de versionamento do esquema do banco de dados (tabelas e índices).
Autenticação	OAuth2	Implementado para login seguro utilizando um provedor externo (ex: GitHub).

Exportar para as Planilhas
🛠️ Configuração e Execução
Para rodar o projeto, você precisa ter o Java 17+, o Maven e o Docker Desktop instalados e em execução.

Passo 1: Configurar o Docker (Banco de Dados)
O banco de dados PostgreSQL deve ser iniciado primeiro usando o docker-compose.yml.

Abra o Docker Desktop e certifique-se de que ele está Running.

Navegue até a pasta raiz do projeto (/adocao) no seu terminal.

Execute o Docker Compose para iniciar o banco de dados em segundo plano:

Bash

docker compose up -d
(O serviço do PostgreSQL estará rodando na porta 5432).

Passo 2: Configurar Credenciais OAuth2
Para que o login funcione, você deve substituir as credenciais no arquivo src/main/resources/application.properties pelas suas credenciais reais do GitHub:

Properties

spring.security.oauth2.client.registration.github.client-id=SEU_CLIENT_ID
spring.security.oauth2.client.registration.github.client-secret=SEU_CLIENT_SECRET
Passo 3: Executar a Aplicação Spring Boot
Com o banco de dados ativo e as credenciais configuradas, inicie o servidor da aplicação.

Via IDE: Abra o projeto na sua IDE (IntelliJ, VS Code, etc.) e execute a classe principal AdocaoApplication.java.

Via Terminal (Maven):

Bash

./mvnw spring-boot:run
🌍 Acesso à Aplicação
Após o log indicar que o servidor Tomcat iniciou (na porta 8080), a aplicação estará disponível no seu navegador:

URL de Acesso: http://localhost:8080

A página inicial exigirá que o usuário realize o Login com OAuth2 (GitHub) antes de acessar a listagem de animais.

📂 Estrutura de Pastas
Abaixo está a estrutura simplificada do projeto:

adocao
├───src/main/java/com/meuprojeto/adocao
│   ├───config        # Configurações de Segurança (OAuth2)
│   ├───controller    # Lógica MVC e Mapeamento de Rotas
│   ├───model         # Entidades JPA (Animal.java)
│   ├───repository    # Interfaces Spring Data JPA
│   └───AdocaoApplication.java
├───src/main/resources
│   ├───db/migration  # Scripts Flyway (V1__create_animal_table.sql)
│   ├───static/css    # Arquivos CSS (DaisyUI/Tailwind CSS compilado)
│   ├───templates     # Arquivos HTML com Thymeleaf
│   └───application.properties # Configurações de BD, Server e OAuth2
└───docker-compose.yml # Configuração do PostgreSQL no Docker
