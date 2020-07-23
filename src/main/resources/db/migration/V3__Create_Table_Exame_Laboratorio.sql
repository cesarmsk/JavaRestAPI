CREATE TABLE IF NOT EXISTS `exame_laboratorio` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_exame` bigint(20) NOT NULL,
  `id_laboratorio` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `FK1_exames` (`id_exame`),
  KEY `FK2_laboratorios` (`id_laboratorio`),
  CONSTRAINT `FK1_exames` FOREIGN KEY (`id_exame`) REFERENCES `exame` (`id`),
  CONSTRAINT `FK2_laboratorios` FOREIGN KEY (`id_laboratorio`) REFERENCES `laboratorio` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;