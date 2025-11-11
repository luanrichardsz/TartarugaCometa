INSERT INTO Endereco (cidade, rua, numero, bairro, estado) VALUES
('São Paulo', 'Rua Augusta', '100', 'Consolação', 'SP'),
('Rio de Janeiro', 'Av. Atlântica', '1700', 'Copacabana', 'RJ'),
('Belo Horizonte', 'Rua da Bahia', '500', 'Centro', 'MG');

select * from Endereco;

INSERT INTO Produto (nome, peso, volume, valor) VALUES
('Notebook Gamer', 2.5, 0.015, 5500.00),
('Monitor 27" 4K', 4.1, 0.025, 2100.50),
('Teclado Mecânico RGB', 0.8, 0.005, 349.90);

INSERT INTO Cliente (nome, cpf_cnpj, razaoSocial, isFisico, Endereco_ID) VALUES
('Bruno Costa', '123.456.789-10', NULL, true, 1),
('Tech Eletrônicos', '11.222.333/0001-44', 'Tech Soluções Varejista LTDA', false, 2),
('Carla Dias', '987.654.321-20', NULL, true, 3)

INSERT INTO Entrega (realizado, PRODUTO_id, clienteRemetente_ID, clienteDestinatario_ID) VALUES
(false, 1, 2, 1), -- Entrega 1: Produto 1, do Cliente 2 para o Cliente 1
(true, 3, 2, 3),  -- Entrega 2: Produto 3, do Cliente 2 para o Cliente 3
(false, 2, 3, 1); -- Entrega 3: Produto 2, do Cliente 2 para o Cliente 1

-- Ligando produtos à Entrega 1:
INSERT INTO Produto_Entrega (entrega_ID, produto_ID, quantidade) VALUES
(1, 1, 1); -- Entrega 1 tem 1 unidade do Produto 1 (Notebook)

-- Ligando produtos à Entrega 2:
INSERT INTO Produto_Entrega (entrega_ID, produto_ID, quantidade) VALUES
(2, 3, 3); -- Entrega 2 tem 3 unidades do Produto 3 (Teclado)

-- Ligando produtos à Entrega 3 (exemplo com mais de um item):
INSERT INTO Produto_Entrega (entrega_ID, produto_ID, quantidade) VALUES
(3, 2, 2); -- Entrega 3 tem 2 unidades do Produto 2 (Monitor)