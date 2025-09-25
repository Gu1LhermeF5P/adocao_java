🐾 Sistema de Adoção de Animais (AdocãoApp)
O AdocãoApp é uma aplicação web completa, desenvolvida como Projeto Diamante Final de Java Advanced. O sistema propõe uma solução moderna e segura para a gestão de animais em abrigos, conectando animais resgatados a potenciais adotantes através de uma plataforma intuitiva.

👨‍💻 Desenvolvedores
Membro	Matrícula (RM)
Guilherme Francisco	RM-557648
Larissa de Freitas	RM-555136

Exportar para as Planilhas
✨ Funcionalidades Principais
🔒 Autenticação Externa (OAuth2): Login seguro implementado via Spring Security utilizando provedores externos (e.g., GitHub).

🐶 Dashboard de Adoção: Lista intuitiva de animais disponíveis, apresentando informações essenciais como nome, espécie e descrição.

🎨 Interface Responsiva: Estilização moderna e limpa garantida pelo uso do DaisyUI (baseado em Tailwind CSS).

🔄 Persistência com JPA: Gestão de dados de animais persistidos através de entidades JPA.

🗃️ Migração de Banco de Dados: O Flyway assegura o versionamento e a integridade do schema da base de dados.

🛠️ Tecnologias Utilizadas
Categoria	Tecnologia	Detalhes
Backend	Java 17, Spring Boot 3, Spring Data JPA, Spring Security	Núcleo da aplicação e lógica de negócio.
Frontend	Thymeleaf, daisyUI, Tailwind CSS	Criação de views dinâmicas e design elegante.
Banco de Dados	PostgreSQL & Flyway	Banco relacional robusto rodando via Docker Compose.
Build	Maven	Gerenciamento de dependências.
Infra	Docker Compose	Ambiente padronizado para o banco de dados.

Exportar para as Planilhas
🚀 Como Executar o Projeto Localmente
Pré-requisitos
Para rodar o projeto, você deve ter instalado:

Java Development Kit (JDK) 17+

Apache Maven

Docker Desktop (OBRIGATÓRIO): Deve estar aberto e em execução.

Node.js & npm: Necessário para compilar o DaisyUI.

1. Inicialização da Infraestrutura (PostgreSQL)
Navegue até o diretório raiz do projeto (onde está o docker-compose.yml) e inicie o banco de dados:

Bash

# Inicia o container PostgreSQL em background (porta 5432)
docker compose up -d
2. Configuração e Build do Frontend
Compile o CSS do DaisyUI e configure as credenciais de autenticação:

A. Build do CSS:
Bash

# Instala dependências de frontend (se for a primeira vez)
npm install
# Compila o Tailwind/DaisyUI para o arquivo style.css final
npm run build:css
B. Credenciais OAuth2:
Substitua os placeholders SEU_CLIENT_ID e SEU_CLIENT_SECRET no arquivo src/main/resources/application.properties com suas credenciais de um provedor OAuth2 (e.g., GitHub).

3. Execução da Aplicação Spring Boot
Com o banco de dados ativo e as configurações prontas, inicie a aplicação:

Bash

# Inicia o servidor Tomcat
./mvnw spring-boot:run
🔑 Acesso ao Sistema
Após a aplicação iniciar (o log mostrará o servidor Tomcat na porta 8080), acesse o link abaixo:

URL da Aplicação: http://localhost:8080

O sistema irá solicitar o login, que será feito através do botão de Login com GitHub (ou o provedor OAuth2 configurado).
