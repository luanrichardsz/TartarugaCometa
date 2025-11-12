SELECT * FROM cliente;
SELECT * FROM endereco;
SELECT * FROM entrega;
SELECT * FROM produto;
SELECT * FROM produto_entrega;

SELECT -- Selecionando os dados mais importantes para a ENTREGA
	ent.idEntrega,
	ent.realizado,
	rem.nome AS NomeRemetente,
	dest.nome AS NomeDestinatario,
	prod.nome AS Produto,
	pe.quantidade,
	prod.valor AS ValorUnitario
FROM
	Entrega AS ent
JOIN
	Cliente AS rem ON ent.clienteRemetente_ID = rem.idCliente
JOIN
	Cliente AS dest ON ent.clienteDestinatario_ID = dest.idCliente
JOIN
	Produto_Entrega AS pe ON ent.idEntrega = pe.entrega_ID
JOIN
	Produto AS prod ON pe.produto_ID = prod.idProduto;


SELECT -- Listando CLIENTES PJ
	nome AS NomeFantasia,
	cpf_cnpj AS CNPJ,
	razaoSocial
FROM
	Cliente
WHERE
	isFisico = false;


SELECT -- Listando CLIENTES que moram em São Paulo
	cli.nome AS Cliente,
	e.rua,
	e.bairro,
	e.cidade
FROM
	Cliente AS cli
JOIN
	Endereco AS e ON cli.Endereco_ID = e.idEndereco
WHERE
	e.estado = 'SP';


SELECT -- Listando ENTREGAS pendentes
	ent.idEntrega,
	prod.nome AS Produto,
	pe.quantidade
FROM
	Entrega AS ent
JOIN
	Produto_Entrega AS pe ON ent.idEntrega = pe.entrega_ID
JOIN
	Produto AS prod ON pe.produto_ID = prod.idProduto
WHERE
	ent.realizado = false;