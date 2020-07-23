CREATE TABLE IF NOT EXISTS `laboratorio` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `status` varchar(7) NOT NULL,
  PRIMARY KEY (`id`)
) 