
# 🚀 Outseara Projeto Completo

Projeto de automação de testes completo e integrado com CI/CD, abrangendo testes para APIs, Web e Mobile. A automação utiliza as tecnologias **Rest Assured**, **Selenium WebDriver**, **Appium** e **Cucumber**, organizadas em um projeto Maven pronto para execução local e via GitHub Actions.

---

## 📦 Estrutura do Projeto

```
Outseara_Projeto_Completo/
│
├── pom.xml                           # Gerenciamento de dependências Maven
├── .github/
│   └── workflows/
│       └── ci.yml                   # Pipeline de CI/CD com GitHub Actions
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── br.com.outseara/
│   │           ├── pages/           # Page Objects Web e Mobile
│   │           └── utils/           # Utilitários e configurações
│
│   └── test/
│       ├── java/
│       │   └── br.com.outseara/
│       │       ├── steps/           # Step Definitions (Web, API, Mobile)
│       │       └── runners/         # Test Runners JUnit
│       │
│       └── resources/
│           └── features/            # Arquivos .feature do Cucumber
│
└── drivers/
    └── chromedriver.exe             # WebDriver para testes locais
```

---

## 🧪 Tecnologias Utilizadas

- **Java 17**
- **Maven 3.9.9**
- **JUnit 4.13.2**
- **Cucumber 7.14.0**
- **Selenium WebDriver 4.21.0**
- **Appium Java Client 9.1.0**
- **Rest Assured 5.4.0**
- **JSON (org.json)**
- **GitHub Actions (CI/CD)**

---

## ✅ Funcionalidades Testadas

### 🧩 Web
- Login com validação de credenciais
- Navegação até formulário e preenchimento

### 📱 Mobile
- Login com Appium em Android
- Execução de testes mobile via emulador ou dispositivo real

### 🌐 API
- Testes com métodos **GET, POST, PUT, DELETE**
- Validações de resposta HTTP e JSON com Rest Assured

---

## 🧰 Pré-requisitos

- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven 3.9.9](https://maven.apache.org/download.cgi)
- [Appium Server](https://appium.io/)
- Android SDK + Emulador ou dispositivo real
- IntelliJ IDEA ou Eclipse
- Node.js e npm (para Appium, caso use o Appium Desktop)

---

## ▶️ Como Executar os Testes

### 🖥️ Testes Web
```bash
mvn test -Dcucumber.filter.tags="@web"
```

### 📱 Testes Mobile
```bash
mvn test -Dcucumber.filter.tags="@mobile"
```

### 🌐 Testes de API
```bash
mvn test -Dcucumber.filter.tags="@api"
```

> Altere os filtros de tag conforme definido nos arquivos `.feature`.

---

## 🧪 Relatórios

Após a execução, os relatórios Cucumber serão gerados em:
```
target/cucumber-reports/
```

---

## 🔁 Integração Contínua (CI)

A cada push ou pull request na branch `main`, o GitHub Actions executa os testes definidos em `.github/workflows/ci.yml`. O pipeline realiza:

- Instalação de dependências Maven
- Execução de testes (Web, API, Mobile)
- Geração de relatórios
- Upload dos resultados (em breve)

---

## 🛠️ Comandos Úteis

### Limpar e instalar dependências
```bash
mvn clean install
```

### Executar todos os testes
```bash
mvn test
```

---

## ✍️ Autora

Desenvolvido por [@gabriellribeirosp](https://github.com/gabriellribeirosp) 💻  
Contribuições, sugestões e feedbacks são bem-vindos!

---

## 📄 Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.
