-- Inserir ou atualizar categorias
INSERT INTO tb_category (name) 
VALUES ('Eletrônicos')
ON DUPLICATE KEY UPDATE name = VALUES(name);

INSERT INTO tb_category (name) 
VALUES ('Liros')
ON DUPLICATE KEY UPDATE name = VALUES(name);

-- Inserir ou atualizar produtos com a associação de categoria
INSERT INTO tb_product (name, price, quantity, category_id) 
VALUES ('Computador', 1500.0, 10, 1)
ON DUPLICATE KEY UPDATE price = VALUES(price), quantity = VALUES(quantity), category_id = VALUES(category_id);

INSERT INTO tb_product (name, price, quantity, category_id) 
VALUES ('A Rosa Branca', 100.0, 5, 2)
ON DUPLICATE KEY UPDATE price = VALUES(price), quantity = VALUES(quantity), category_id = VALUES(category_id);

INSERT INTO tb_product (name, price, quantity, category_id) 
VALUES ('Iphone', 8500.0, 8, 1)
ON DUPLICATE KEY UPDATE price = VALUES(price), quantity = VALUES(quantity), category_id = VALUES(category_id);

