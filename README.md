# 📅 Agenda em Java Web

## 📌 Descrição

Projeto realizado para colocar em prática os conhecimentos em Java e apresentar para uma oportunidade de promoção no trabalho.

## 🛠️ Tecnologias Utilizadas

<p align="left">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java" width="40" />
  <img src="https://upload.wikimedia.org/wikipedia/commons/7/7b/Tomcat-logo.svg" alt="Tomcat" width="40" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" alt="MySQL" width="40" />
  <img src="https://img.shields.io/badge/JSP-blue?logo=java" alt="JSP" height="25" />
  <img src="https://img.shields.io/badge/Servlets-orange?logo=java" alt="Servlets" height="25" />
  <img src="https://img.shields.io/badge/JDBC-yellow?logo=java" alt="JDBC" height="25" />
  <img src="https://img.shields.io/badge/MVC-green" alt="MVC" height="25" />
  <img src="https://img.shields.io/badge/JavaBeans-lightgrey" alt="JavaBeans" height="25" />
  <img src="https://img.shields.io/badge/iTextPDF-red" alt="iTextPDF" height="25" />
</p>

## 💬 Observações

Nas últimas semanas venho me dedicando a aprender Java e estou encantado com essa linguagem. Sempre ouvi falar que é uma linguagem difícil, porém, com a ajuda de diversos professores, essa jornada tem se tornado bem divertida e prazerosa.

---

## 🚀 Como Rodar o Projeto Localmente

### 1. Pré-requisitos

- Java JDK 8 ou superior
- Apache Tomcat (versão compatível com o projeto)
- MySQL Server
- IDE compatível com Java Web (Eclipse, IntelliJ IDEA, NetBeans etc.)
- Navegador web

### 2. Clone o Repositório

```bash
git clone https://github.com/emiliosarges/projeto-agenda.git
```

### 3. Importe o Projeto na IDE

- **Eclipse:** `File > Import > Existing Projects into Workspace`
- **IntelliJ:** `File > New > Project from Existing Sources`

### 4. Configure o Servidor Tomcat na IDE

- Adicione o Tomcat à IDE (ex: `Servers > Add New Server`)
- Aponte para o diretório de instalação do Tomcat
- Adicione o projeto ao servidor

### 5. Configure o Banco de Dados MySQL

- Crie um banco de dados chamado `agenda`
- Execute o script `agenda.sql` (caso disponível no projeto) para criar as tabelas
- Altere as configurações de conexão no arquivo de configuração (ex: `DAO.java`):

```java
String url = "jdbc:mysql://localhost:3306/agenda";
String user = "seu_usuario";
String password = "sua_senha";
```

### 6. Execute o Projeto

- Inicie o servidor Tomcat pela IDE
- Acesse o sistema via navegador:

```
http://localhost:8080/nome-do-projeto
```

### 7. Exportar PDF (opcional)

- A funcionalidade de exportação em PDF usa a biblioteca **iTextPDF**
- Certifique-se de que o `.jar` da biblioteca está no classpath (`/lib`)

---

### 📂 Estrutura do Projeto

```
/src
├── main
│   ├── java
│   │   ├── controller
│   │   │   └── Controller.java
│   │   └── model
│   │       ├── DAO.java
│   │       └── JavaBeans.java
│   └── webapp
│       ├── imagens/
│       ├── META-INF/
│       ├── scripts/
│       │   └── validador.js
│       ├── WEB-INF/
│       ├── agenda.jsp
│       ├── index.html
│       ├── novo.html
│       └── style.css
```

---

Sinta-se à vontade para contribuir ou sugerir melhorias! 💡
