# LoGott

## 👥 Autores
- Rodrigo Vinzent Ariñez Viscarra 
- Erick Santos Santana 
- Gabriel Borges Gonçalves
- Olivier Virthe Farias
- Tarik Omar Mazloum
  
## 🎯 Objetivo
- API REST que simule um sistema de monitoramento de robôs logísticos inteligentes atuando em ambientes internos.

### Instruções para rodar localmente:
- Pré-requisitos: Listar o software necessário (JDK versão X, Maven versão Y, IntelliJ IDEA ou outra IDE).
-  Clonagem: O comando git clone para clonar o repositório.
- Navegação: Instruções para navegar até a pasta do projeto no terminal.
- Execução da Aplicação: O comando Maven para executar a aplicação Spring Boot (mvn spring-boot:run). Mencionar a porta padrão (http://localhost:8080).
-  Acesso ao Console H2: Como acessar o console web do H2 (http://localhost:8080/h2-console), a URL JDBC (jdbc:h2:file:./data/logitrackdb), o nome de usuário (sa), e a senha (em branco).

## ✅ Estrutura de pacotes montada: 
- Estrutura de pacotes com.innoroutetech.logitrack (ou com.logott.logitrack) com subpacotes controller, model, repository, service criada.

## ✅ Entidades e repositórios implementados:
- Classes de entidade (RoboLogistico, EntregaSimulada, EventoSensorial) e suas respectivas interfaces de repositório (RoboLogisticoRepository, EntregaSimuladaRepository, EventoSensorialRepository) implementadas, estendendo JpaRepository. 

## ✅ Endpoints básicos funcionando via Postman:
- ✅ Registro de RoboLogistico (POST em /robots).
- ✅ Listagem de RoboLogistico (GET em /robots).
- ✅ Busca de RoboLogistico por ID (GET em /robots/{id}).
- ✅ Registro de EntregaSimulada (POST em /entregas).
- ✅ Listagem de EntregaSimulada (GET em /entregas).
- ✅ Busca de EntregaSimulada por ID (GET em /entregas/{id}).
- ✅ Atualização de EntregaSimulada (PUT em /entregas/{id} - lembrando da necessidade de enviar todos os campos).
- ✅ Registro de EventoSensorial (POST em /eventos).
- ✅ Listagem de EventoSensorial por roboId (GET em /eventos/robo/{roboId}).
- ✅ Busca de EventoSensorial por ID (GET em /eventos/{id}).

## Status atual do projeto:
- A API REST para gerenciamento de robôs e entregas básicas está funcional. Os endpoints para criar, listar, buscar e atualizar robôs e entregas foram implementados e testados com sucesso. A persistência de dados está configurada com o banco de dados H2 em arquivo.




