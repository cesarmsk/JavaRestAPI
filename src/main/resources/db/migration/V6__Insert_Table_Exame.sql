/*!40000 ALTER TABLE `exame` DISABLE KEYS */;
INSERT IGNORE INTO `exame` (`id`, `nome`, `tipo`, `status`) VALUES
	(1, 'exame 1', 'analise clinica', 'ativo'),
	(2, 'exame 2', 'analise clinica', 'ativo'),
	(3, 'exame 3', 'imagem', 'ativo'),
	(4, 'exame 4', 'imagem', 'inativo'),
	(5, 'exame 5', 'imagem', 'inativo'),
	(6, 'exame 6', 'analise clinica', 'inativo'),
	(7, 'exame 7', 'analise clinica', 'ativo');
/*!40000 ALTER TABLE `exame` ENABLE KEYS */;