-- criar schema ou banco 
CREATE SCHEMA `zoo` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci ;

-- script para criar uma tabela
CREATE TABLE `zoo`.`animal` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `especie` VARCHAR(20) NOT NULL,
  `idade` INT NULL,
  `estavivo` TINYINT NULL,
  PRIMARY KEY (`codigo`));
  
 -- definições dos comandos
DDL - DATA DEFINITION LINGUAGE - LINGUAGEM DE DEFINIÇÃO DE DADOS
CREATE TABLE
ALTER TABLE
DROP TABLE

DML - DATA MANIPULATION LINGUAGE - LINGUAGEM DE MANIPULAÇÃO DE DADOS
CREATE	---- INSERT	---- INSERIR
READ	---- SELECT	---- CONSULTAR
UPDATE	---- DELETE	---- EXCLUIR

-- inserindo registros da tabela
use zoo;

INSERT INTO animal(especie, idade, estavivo)values("Cachorro", 5, 1);
INSERT INTO animal(especie, idade, estavivo)values("CAVALO", 10, 1);
INSERT INTO animal(especie, idade, estavivo)values("GATO", 3, 1);


SELECT especie, idade, estavivo FROM ANIMAL;

-- select all
use zoo;

INSERT INTO animal(especie, idade, estavivo)values("Cachorro", 5, 1);
INSERT INTO animal(especie, idade, estavivo)values("CAVALO", 10, 1);
INSERT INTO animal(especie, idade, estavivo)values("GATO", 3, 1);


SELECT * FROM ANIMAL;

-- alterando valor da coluna
UPDATE animal SET nome = 'jojo todinho'
UPDATE animal SET nome = 'toto' where codigo = 1