CREATE SCHEMA estoque; 
USE estoque;

CREATE TABLE produtos(
    codigo INTEGER NOT NULL,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    preco DECIMAL(5,2) NOT NULL,
    quantidade INTEGER NOT NULL,
    CONSTRAINT pk_produtos PRIMARY KEY(codigo)
);

INSERT INTO produtos (codigo, nome, descricao, preco, quantidade) VALUES (545155, "Arroz", "Arroz Alto Alegre 5KG", 15.99, 123),
																		 (604020, "Feijão", "Feijão Tio Patinhas 1KG", 10.99, 120);
select * from produtos;
SELECT * FROM produtos WHERE codigo = 604020 ORDER BY codigo