# Projeto de exemplo de API REST com SpringBoot para uma Loja Virtual  [![maven](https://github.com/manoelcampos/loja-virtual-springboot-rest/actions/workflows/build.yml/badge.svg)](https://github.com/manoelcampos/loja-virtual-springboot-rest/actions/workflows/build.yml)

## Configurar Ambiente de Desenvolvimento


### JDK

Requer o JDK 17 que pode ser instalado no ubuntu com:

```bash
sudo apt update
sudo apt install openjdk-17-jdk
```

Ou usando o [sdkman](http://sdkman.io).

### IDE

O melhor IDE para desenvolvimento do projeto é o IntelliJ, pois tem excelente suporte ao Spring.

Como estamos usando [Lombok](http://projectlombok.org) e JPA, é interessante instalar a extensão [JPA Buddy](https://plugins.jetbrains.com/plugin/15075-jpa-buddy) para mostrar warnings quando as anotações do Lombok não estiverem sendo usadas da melhor forma.

Ao abrir o projeto no IntelliJ, ele também pede para habilitar o "Processamento de Anotações" para o Lombok funcionar. 
Assim, tal opção precisa ser habilitada.

### Configurações do Projeto

O arquivo [application.properties](src/main/resources/application.properties) contém as configurações do projeto.

# Executando o projeto em ambiente dev

Você pode executar a classe CompeteAquiApplication no seu IDE ou digitar `mvn spring-boot:run` em um terminal.
