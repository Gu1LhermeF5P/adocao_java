Que ótimo! Melhorar o README é sempre uma excelente ideia para garantir a clareza e profissionalismo do seu projeto.

O README a seguir está otimizado com melhor formatação, emojis e foco na clareza para a execução.

🐾 Projeto Diamante Final: Sistema de Adoção de Animais
Este é o projeto final para a disciplina de Java Advanced, focado na construção de uma aplicação web completa com a arquitetura Spring Boot MVC para facilitar a adoção de animais.

👨‍💻 Equipe de Desenvolvimento
Nome Completo	RM
Guilherme Francisco	RM-557648
Larissa de Freitas	RM-555136

Exportar para as Planilhas
✨ Stack Tecnológica e Requisitos
O projeto foi desenvolvido atendendo aos seguintes requisitos mandatórios:

Categoria	Requisito Técnico	Detalhes
Backend/Core	Spring Boot MVC	Fornece a estrutura (Controller, Service, Repository) da aplicação.
Persistência	Spring Data JPA	Utilizado para mapeamento ORM (Objeto-Relacional).
Banco de Dados	Docker Compose Suporte	O PostgreSQL é executado em um container para ambiente padronizado.
Migrações	Flyway	Gerencia e versiona o schema do banco de dados (Ex: criação da tabela animal).
Autenticação	OAuth2	Login seguro com provedor externo (Ex: GitHub).
Frontend	Thymeleaf & DaisyUI	Thymeleaf para views dinâmicas e DaisyUI (plugin Tailwind CSS) para estilização moderna.

Exportar para as Planilhas
⚙️ Guia de Configuração e Execução
Siga os passos abaixo para colocar o projeto no ar.

Pré-requisitos
Certifique-se de que os seguintes softwares estão instalados e funcionando:

Java Development Kit (JDK) 17+

Apache Maven 3+

Docker Desktop (Aberto e em execução)

Node.js & npm (Necessário apenas para compilar o Tailwind/DaisyUI)

1. Inicialização do Banco de Dados (Docker)
Navegue até a pasta raiz do projeto (/adocao) no seu terminal e inicie o serviço PostgreSQL:

Bash

docker compose up -d
Verificação: Use docker ps para confirmar que o contêiner postgres-db está ativo na porta 5432.

2. Configuração de Variáveis de Ambiente
Edite o arquivo src/main/resources/application.properties para configurar as credenciais do OAuth2.

Properties

# Credenciais OAuth2 do GitHub (SUBSTITUA PELAS SUAS!)
spring.security.oauth2.client.registration.github.client-id=SOv23liTQKK671jPo5eLh
spring.security.oauth2.client.registration.github.client-secret=Sbeeb6882bd912b4523578d78a11024991b6a0923
Atenção: Se não fizer essa substituição, o login OAuth2 não funcionará.

3. Compilação do Frontend (DaisyUI / Tailwind)
DaisyUI é compilado via Node.js. Se você alterou algum arquivo HTML ou configurou o tailwind.config.js, compile o CSS final:

Instale as dependências Node na raiz do projeto:

Bash

npm install
Gere o arquivo CSS final:

Bash

npm run build:css
4. Execução da Aplicação Spring Boot
Inicie a aplicação após garantir que o banco de dados está rodando.

Bash

./mvnw spring-boot:run
O log deve indicar que o Flyway migrou o banco de dados e que o servidor Tomcat iniciou:

... Tomcat initialized with port 8080 (http)
🌐 Acesso ao Sistema
Acesse a URL abaixo no seu navegador para utilizar o sistema de adoção:

URL: http://localhost:8080

A página inicial irá direcioná-lo para a tela de login via OAuth2 para acessar o conteúdo
