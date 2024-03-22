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
																		 (124952, "Quiabo", "Quiabo topzera kg", 10.90, 15),
                                                                         (123456, "Doritos", "Doritos sc grande", 11.00, 100),
                                                                         (547022, "Suco tang", "Suco tang cx 50 unidades", 0.90, 20),
                                                                         (5702, "Camisa Social", "Camisa Social TNG", 350.99, 15);
select * from produtos;
SELECT * FROM produtos WHERE codigo = 604020 ORDER BY codigo