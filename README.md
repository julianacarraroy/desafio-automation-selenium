# Projeto - automação de testes E2E com Selenium Webdriver

---


Projeto para implementar Automação de Testes E2E em uma aplicação de gerenciamento de finanças

---
## Ferramentas utilizadas:
- [Maven](https://maven.apache.org/)
- [Java](https://www.oracle.com/br/java/technologies/downloads/)
- [TestNG](https://testng.org/)
- [Selenium](https://www.selenium.dev/)
- [ChromeDriver](https://chromedriver.chromium.org/downloads)

---

## Instalação

### Clone 
Clone o repositório:

	$ git clone https://github.com/julianacarraroy/desafio-automation-selenium.git

### Execução
Execute o comando para executar todos os testes do projeto:

	$ mvn clean test
---

## Funcionalidades automatizadas

- Cadastro 
- Login/logout
- Adicionar/excluir Contas
- Criar movimentação
- Resumo mensal
- Exclusão de registros

---

## Casos de Teste 

Os casos de teste automatizados foram modelados e implementados segundo as principais funcionalidades e os critérios de aceite. Os mesmos estão detalhados pelo documento de testes abaixo:

![cts-sr-barriga.jpg](docs%2Fcts-sr-barriga.jpg)

## Report de testes

Os reports são gerados pela biblioteca do [Extent Report](https://www.extentreports.com/) após cada execução para medir o progresso dos testes assegurando a confiabilidade necessária e o correto funcionamento do sistema

![extent_report.jpg](docs%2Fextent_report.jpg)