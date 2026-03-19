# Front Gestão de Vagas

Interface web desenvolvida em **Spring Boot + Thymeleaf** para interação com candidatos em um sistema de gestão de vagas.  
Este projeto atua como **camada de apresentação (front-end)** consumindo a API backend **job-management-api**, que já está em produção.

---

## 🌐 Integração com Backend

Esta aplicação está integrada com a API:

👉 **job-management-api (produção)**  
Responsável por:
- Autenticação com JWT
- Regras de negócio
- Persistência de dados
- Gestão de candidatos, empresas e vagas

O front-end consome essa API via requisições HTTP utilizando `RestTemplate`.

---

## 🎨 Estilização com TailwindCSS

Este projeto utiliza o **TailwindCSS** para estilização das páginas.

Isso demonstra:

- Uso de **framework moderno de CSS utilitário**
- Criação de interfaces responsivas e escaláveis
- Organização visual limpa e profissional
- Agilidade no desenvolvimento de UI

O Tailwind foi aplicado diretamente nos templates **Thymeleaf**, permitindo uma integração simples e eficiente entre backend e frontend.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.5.11**
- **Spring Web**
- **Thymeleaf**
- **TailwindCSS** ✅
- **Maven**
- **Spring Boot DevTools**

---

## 📋 Pré-requisitos

Antes de executar:

- Java 17+
- Maven 3.6+
- Navegador moderno
- Backend `job-management-api` disponível (local ou produção)

---

## 🚀 Como Executar

### 1. Clonar repositório

```bash
git clone <url-do-repositorio>
cd front_gestao_vaga
```

### 2. Build

```bash
mvn clean install
```

### 3. Rodar aplicação

```bash
mvn spring-boot:run
```

Acesse:

👉 http://localhost:8082

---

## 📁 Estrutura do Projeto

```
front_gestao_vaga/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── modules/
│   │   │       └── candidate/
│   │   │           ├── controller/
│   │   │           ├── service/
│   │   │           └── dto/
│   │   └── resources/
│   │       ├── templates/
│   │       │   └── candidate/
│   │       │       ├── login.html
│   │       │       └── profile.html
│   │       └── application.properties
├── pom.xml
└── README.md
```

---

## ✨ Funcionalidades

- Login de candidatos
- Integração com autenticação JWT
- Renderização dinâmica com Thymeleaf
- Interface responsiva com TailwindCSS
- Feedback de erro no login

---

## 🎯 Endpoints

| Método | Endpoint | Descrição |
|--------|----------|----------|
| GET | /candidate/login | Página de login |
| POST | /candidate/signIn | Autenticação |
| GET | /candidate/profile | Perfil do usuário |

---

## ⚙️ Configuração

Arquivo:

```
src/main/resources/application.properties
```

Exemplo:

```properties
server.port=8082
```

---

## 🧠 Arquitetura

O projeto segue padrão MVC:

- **Controller** → entrada HTTP
- **Service** → comunicação com API
- **View (Thymeleaf + TailwindCSS)** → renderização

Separação clara de responsabilidades.

---

## 🔐 Autenticação

- Login realizado via API backend
- Retorno esperado: **JWT**
- Token deve ser armazenado para futuras requisições (melhoria futura)

---

## 🔗 Integrações

- API REST (Spring Boot backend)
- Comunicação via JSON
- Preparado para evolução com API Gateway

---

## 🚀 Melhorias Futuras

- Armazenamento de JWT em sessão
- Interceptor para envio automático de token
- Dashboard de vagas
- Cadastro de candidatos via front
- Integração completa com fluxo real de aplicação

---

## 👨‍💻 Autor

Carlos Jorge

---

## 📄 Licença

Projeto open-source com foco em desenvolvimento front-end utilizando Spring Boot, seguindo boas práticas de mercado..

---

**Última atualização:** Março de 2026
