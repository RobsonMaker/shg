DROP DATABASE IF EXISTS projeto_SGH;
CREATE DATABASE IF NOT EXISTS projeto_SGH;
USE projeto_SGH ;


CREATE TABLE IF NOT EXISTS produto (
  id_produto INT NOT NULL AUTO_INCREMENT,
  nome_produto VARCHAR(20) NOT NULL,
  descricao VARCHAR(80) NOT NULL,
  qtd INT NOT NULL,
  valor DOUBLE NOT NULL,
  PRIMARY KEY (id_produto));




CREATE TABLE IF NOT EXISTS hospede (
  id_hospede INT NOT NULL AUTO_INCREMENT,
  cpf VARCHAR(15) NOT NULL,
  nome VARCHAR(40) NOT NULL,
  rg VARCHAR(9) NOT NULL,
  estado_sivil VARCHAR(15) NOT NULL,
  telefone_cont VARCHAR(14) NOT NULL,
  endereco VARCHAR(40) NOT NULL,
  cidade VARCHAR(20) NOT NULL,
  cep VARCHAR(15) NOT NULL,
  uf VARCHAR(10) NOT NULL,
  data_nascimento DATE NOT NULL,
  PRIMARY KEY (id_hospede));




CREATE TABLE IF NOT EXISTS funcionario (
  id_funcionario INT NOT NULL AUTO_INCREMENT,
  cpf VARCHAR(15) NOT NULL,
  nome VARCHAR(40) NOT NULL,
  rg VARCHAR(9) NOT NULL,
  estado_sivil VARCHAR(15) NOT NULL,
  telefone_cont VARCHAR(14) NOT NULL,
  endereco VARCHAR(40) NOT NULL,
  cidade VARCHAR(20) NOT NULL,
  cep VARCHAR(15) NOT NULL,
  uf VARCHAR(10) NOT NULL,
  data_nascimento DATE NOT NULL,
  funcao VARCHAR(50) NOT NULL,
  valor_salario DOUBLE NOT NULL,
  turno VARCHAR(20) NOT NULL,
  usuario VARCHAR(15) NOT NULL,
  senha VARCHAR(15) NOT NULL,
  PRIMARY KEY (id_funcionario));

CREATE TABLE IF NOT EXISTS tipo(
id_tipo INT NOT NULL AUTO_INCREMENT,
nome_tipo VARCHAR(20) NOT NULL,
preco DOUBLE NOT NULL,
PRIMARY KEY(id_tipo)

);

CREATE TABLE IF NOT EXISTS quarto (
  id_quarto INT NOT NULL AUTO_INCREMENT,
  id_tipo INT NOT NULL,
  bloco VARCHAR(10) NULL,
  numero_quarto INT(6) NOT NULL,
  status VARCHAR(20) NOT NULL,
  PRIMARY KEY (id_quarto),
  FOREIGN KEY(id_tipo) REFERENCES tipo(id_tipo));




CREATE TABLE IF NOT EXISTS servico (
  id_servico INT NOT NULL AUTO_INCREMENT,
  nome_servico VARCHAR(25) NOT NULL,
  descricao VARCHAR(80) NULL,
  valor DOUBLE NOT NULL,
  PRIMARY KEY (id_servico));

   CREATE TABLE IF NOT EXISTS hospedagem (
  id_hospedagem INT NOT NULL auto_increment,
  id_hospede INT NOT NULL,
  id_quarto INT NOT NULL,
  funcionario INT NOT NULL,
  qtd_diaria INT NOT NULL,
  dataCheckin DATETIME NOT NULL,
  dataCheckout DATETIME NOT NULL,
  formaPagamento VARCHAR(15) NOT NULL,
  PRECO_DIARIA_TOTAL DOUBLE NOT NULL,
  status VARCHAR(15) NOT NULL,
  PRIMARY KEY (id_hospedagem),
    FOREIGN KEY (id_hospede)
    REFERENCES hospede (id_hospede),
    FOREIGN KEY (id_quarto)
    REFERENCES quarto (id_quarto),
    FOREIGN KEY (funcionario)
    REFERENCES funcionario (id_funcionario)
    );





CREATE TABLE IF NOT EXISTS itemConsumo (
  quantidade INT NOT NULL,
  preco FLOAT NOT NULL,
  id_hospedagem INT NOT NULL,
  id_produto INT NOT NULL,
  PRIMARY KEY (id_hospedagem, id_produto),
    FOREIGN KEY (id_hospedagem)
    REFERENCES hospedagem (id_hospedagem),  
    FOREIGN KEY (id_produto)
    REFERENCES produto (id_produto)
  );



CREATE TABLE IF NOT EXISTS ConsumoServico (
  valor DOUBLE NOT NULL,
  id_hospedagem INT NOT NULL,
  id_servico INT NOT NULL,
  quantidade INT NOT NULL,
  PRIMARY KEY (id_hospedagem, id_servico),
    FOREIGN KEY (id_hospedagem)
    REFERENCES hospedagem (id_hospedagem),
    
    FOREIGN KEY (id_servico)
    REFERENCES servico (id_servico)
   );
   
   INSERT INTO `projeto_SGH`.`funcionario` (`id_funcionario`, `cpf`, `nome`, `rg`, `estado_sivil`, `telefone_cont`, `endereco`, `cidade`, `cep`, `uf`, `data_nascimento`, `funcao`, `valor_salario`, `turno`, `usuario`, `senha`) VALUES ('1', '50454296800', 'Robson', '563563', 'Solteiro', '189817711', 'Olavo Bilac', 'pres epitacio', '19470000', 'sp', '2002-01-03', 'Gerente', '1500', 'Noite', 'robson', '0101');

INSERT INTO `projeto_SGH`.`produto` (`id_produto`, `nome_produto`, `descricao`, `qtd`, `valor`) VALUES ('1', 'Chocolate', 'Barra', '999', '5');
INSERT INTO `projeto_SGH`.`produto` (`id_produto`, `nome_produto`, `descricao`, `qtd`, `valor`) VALUES ('2', 'Agua', 'garrafa 1,5l', '999', '7.50');

INSERT INTO `projeto_SGH`.`tipo` (`id_tipo`, `nome_tipo`, `preco`) VALUES ('1', 'Casal', 90 );
INSERT INTO `projeto_SGH`.`tipo` (`id_tipo`, `nome_tipo`, `preco`) VALUES ('2', 'Solteiro', 70 );
INSERT INTO `projeto_SGH`.`tipo` (`id_tipo`, `nome_tipo`, `preco`) VALUES ('3', 'Suíte', 100 );
INSERT INTO `projeto_SGH`.`tipo` (`id_tipo`, `nome_tipo`, `preco`) VALUES ('4', 'Suíte Master', 150 );

INSERT INTO `projeto_SGH`.`quarto` (`id_quarto`, `id_tipo`, `bloco`,  `numero_quarto`, `status`) VALUES ('1', '1', 'Bloco a',  '111111', 'Disponivel');
INSERT INTO `projeto_SGH`.`quarto` (`id_quarto`, `id_tipo`, `bloco`,  `numero_quarto`, `status`) VALUES ('2', '2', 'Bloco a',  '222222', 'Disponivel');
INSERT INTO `projeto_SGH`.`quarto` (`id_quarto`, `id_tipo`, `bloco`,  `numero_quarto`, `status`) VALUES ('3', '3', 'Bloco a',  '333333', 'Disponivel');
INSERT INTO `projeto_SGH`.`quarto` (`id_quarto`, `id_tipo`, `bloco`,  `numero_quarto`, `status`) VALUES ('4', '4', 'Bloco a',  '444444', 'Disponivel');
INSERT INTO `projeto_SGH`.`quarto` (`id_quarto`, `id_tipo`, `bloco`,  `numero_quarto`, `status`) VALUES ('5', '2', 'Bloco a',  '555555', 'Disponivel');
INSERT INTO `projeto_SGH`.`quarto` (`id_quarto`, `id_tipo`, `bloco`,  `numero_quarto`, `status`) VALUES ('6', '2', 'Bloco a',  '666666', 'Disponivel');
INSERT INTO `projeto_SGH`.`quarto` (`id_quarto`, `id_tipo`, `bloco`,  `numero_quarto`, `status`) VALUES ('7', '1', 'Bloco a',  '777777', 'Disponivel');
INSERT INTO `projeto_SGH`.`quarto` (`id_quarto`, `id_tipo`, `bloco`,  `numero_quarto`, `status`) VALUES ('8', '3', 'Bloco a',  '888888', 'Disponivel');
INSERT INTO `projeto_SGH`.`quarto` (`id_quarto`, `id_tipo`, `bloco`,  `numero_quarto`, `status`) VALUES ('9', '2', 'Bloco a',  '999999', 'Disponivel');





INSERT INTO `projeto_SGH`.`hospede` (`id_hospede`, `cpf`, `nome`, `rg`, `estado_sivil`, `telefone_cont`, `endereco`, `cidade`, `cep`, `uf`, `data_nascimento`) VALUES ('1', '50454296800', 'Robson', '53243543', 'solteiro', '182735276', 'jose alencar', 'pres epitacio', '1970000', 'sp', '2002-01-03');
INSERT INTO `projeto_SGH`.`hospede` (`id_hospede`, `cpf`, `nome`, `rg`, `estado_sivil`, `telefone_cont`, `endereco`, `cidade`, `cep`, `uf`, `data_nascimento`) VALUES ('2', '54276273', 'Giovana', '868457', 'solteira', '186246436', 'joao agregar', 'pres epitacio', '19470000', 'sp', '2005-06-08');


INSERT INTO `projeto_SGH`.`servico` (`id_servico`, `nome_servico`, `descricao`, `valor`) VALUES ('1', 'Limpeza', 'Limpeza de Quarto', '80');
INSERT INTO `projeto_SGH`.`servico` (`id_servico`, `nome_servico`, `descricao`, `valor`) VALUES ('2', 'Almoço', 'Serviço de almoço', '30');



   

