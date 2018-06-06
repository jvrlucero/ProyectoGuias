-- phpMyAdmin SQL Dump
-- version 2.10.3
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tiempo de generación: 12-10-2014 a las 15:36:58
-- Versión del servidor: 5.0.51
-- Versión de PHP: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Base de datos: `costos`
-- 

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `hojas`
-- 

DROP TABLE IF EXISTS `hojas`;
CREATE TABLE IF NOT EXISTS `hojas` (
  `codigoHoja` int(5) NOT NULL default '0',
  `descripcion` varchar(100) default NULL,
  `unidad` varchar(10) default NULL,
  PRIMARY KEY  (`codigoHoja`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Volcar la base de datos para la tabla `hojas`
-- 

INSERT INTO `hojas` VALUES (1, 'nueva hoja', 'ARROBA');
INSERT INTO `hojas` VALUES (2, 'NUEVA', 'ARROBA');
INSERT INTO `hojas` VALUES (3, 'NUEVA', 'ARROBA');
INSERT INTO `hojas` VALUES (4, 'NUEVA HOJA', 'ARROBA');
INSERT INTO `hojas` VALUES (5, 'QWDEQWDQ', 'ARROBA');
INSERT INTO `hojas` VALUES (6, 'LKLKLK', 'ARROBA');
INSERT INTO `hojas` VALUES (7, 'NUEVA HOJA', 'ARROBA');
INSERT INTO `hojas` VALUES (8, 'NKLLKJHLK', 'ARROBA');
INSERT INTO `hojas` VALUES (9, 'NUEVE', 'ARROBA');
INSERT INTO `hojas` VALUES (10, 'diez', 'ARROBA');
INSERT INTO `hojas` VALUES (11, 'hoja once', 'ARROBA');
INSERT INTO `hojas` VALUES (12, 'HOJA NUEMERO DOCE', 'UN');
INSERT INTO `hojas` VALUES (13, 'HOJA TRECE', 'AR');
INSERT INTO `hojas` VALUES (14, 'hoja catorce', 'AR');
INSERT INTO `hojas` VALUES (15, 'HOJA QUINCE', 'AR');
INSERT INTO `hojas` VALUES (16, 'HOJA DIECISEIS', 'AR');
INSERT INTO `hojas` VALUES (17, 'dddd', 'AR');
INSERT INTO `hojas` VALUES (18, 'dieciocho', 'AR');
INSERT INTO `hojas` VALUES (19, 'dd', 'AR');
INSERT INTO `hojas` VALUES (20, 'DEDD', 'AR');
INSERT INTO `hojas` VALUES (21, 'WWW', 'AR');
INSERT INTO `hojas` VALUES (22, 'SFSFSDFSD', 'AR');
INSERT INTO `hojas` VALUES (23, 'kljlkjlj', 'AR');
INSERT INTO `hojas` VALUES (24, 'ddd', 'AR');
INSERT INTO `hojas` VALUES (25, 'veinticinco', 'AR');
INSERT INTO `hojas` VALUES (26, 'VEINTISEIS', 'AR');
INSERT INTO `hojas` VALUES (27, 'veintisiete', 'AR');

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `insumos`
-- 

DROP TABLE IF EXISTS `insumos`;
CREATE TABLE IF NOT EXISTS `insumos` (
  `codigoInsumo` int(5) NOT NULL default '0',
  `descripcion` varchar(100) default NULL,
  `unidad` varchar(10) default NULL,
  `precio` decimal(6,2) default NULL,
  `tipo` int(1) default NULL,
  PRIMARY KEY  (`codigoInsumo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Volcar la base de datos para la tabla `insumos`
-- 

INSERT INTO `insumos` VALUES (1, 'UNO', 'ARROBA', 2.50, 1);
INSERT INTO `insumos` VALUES (2, 'DOS', 'ARROBA', 2.50, 1);
INSERT INTO `insumos` VALUES (3, 'TRES', 'UN', 9.99, 1);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `insumosxhoja`
-- 

DROP TABLE IF EXISTS `insumosxhoja`;
CREATE TABLE IF NOT EXISTS `insumosxhoja` (
  `codigoHoja` int(5) NOT NULL default '0',
  `codigoInsumo` int(5) NOT NULL default '0',
  `cantidad` decimal(6,2) default NULL,
  PRIMARY KEY  (`codigoInsumo`,`codigoHoja`),
  KEY `codigoHoja` (`codigoHoja`),
  KEY `codigoInsumo` (`codigoInsumo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Volcar la base de datos para la tabla `insumosxhoja`
-- 

INSERT INTO `insumosxhoja` VALUES (2, 1, 3.00);
INSERT INTO `insumosxhoja` VALUES (3, 1, 3.00);
INSERT INTO `insumosxhoja` VALUES (4, 1, 4.00);
INSERT INTO `insumosxhoja` VALUES (5, 1, 4.00);
INSERT INTO `insumosxhoja` VALUES (6, 1, 2.00);
INSERT INTO `insumosxhoja` VALUES (7, 1, 2.00);
INSERT INTO `insumosxhoja` VALUES (8, 1, 2.00);
INSERT INTO `insumosxhoja` VALUES (10, 1, 3.00);
INSERT INTO `insumosxhoja` VALUES (12, 1, 1.00);
INSERT INTO `insumosxhoja` VALUES (13, 1, 1.00);
INSERT INTO `insumosxhoja` VALUES (15, 1, 2.00);
INSERT INTO `insumosxhoja` VALUES (18, 1, 2.00);
INSERT INTO `insumosxhoja` VALUES (23, 1, 1.00);
INSERT INTO `insumosxhoja` VALUES (24, 1, 2.00);
INSERT INTO `insumosxhoja` VALUES (27, 1, 2.00);
INSERT INTO `insumosxhoja` VALUES (10, 2, 1.00);
INSERT INTO `insumosxhoja` VALUES (11, 2, 3.00);
INSERT INTO `insumosxhoja` VALUES (15, 2, 3.00);
INSERT INTO `insumosxhoja` VALUES (25, 2, 2.00);
INSERT INTO `insumosxhoja` VALUES (26, 2, 2.00);
INSERT INTO `insumosxhoja` VALUES (20, 3, 2.00);
INSERT INTO `insumosxhoja` VALUES (27, 3, 10.00);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `tipos`
-- 

DROP TABLE IF EXISTS `tipos`;
CREATE TABLE IF NOT EXISTS `tipos` (
  `tipo` int(3) unsigned zerofill NOT NULL auto_increment,
  `descripcion` varchar(100) NOT NULL,
  PRIMARY KEY  (`tipo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

-- 
-- Volcar la base de datos para la tabla `tipos`
-- 

INSERT INTO `tipos` VALUES (001, 'MATERIAL');
INSERT INTO `tipos` VALUES (002, 'MANO DE OBRA');

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `unidades`
-- 

DROP TABLE IF EXISTS `unidades`;
CREATE TABLE IF NOT EXISTS `unidades` (
  `unidad` varchar(10) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  PRIMARY KEY  (`unidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Volcar la base de datos para la tabla `unidades`
-- 

INSERT INTO `unidades` VALUES ('AR', 'ARROBA');
INSERT INTO `unidades` VALUES ('ML', 'METRO LINEAL');
INSERT INTO `unidades` VALUES ('UN', 'UNIDAD');

-- 
-- Filtros para las tablas descargadas (dump)
-- 

-- 
-- Filtros para la tabla `insumosxhoja`
-- 
ALTER TABLE `insumosxhoja`
  ADD CONSTRAINT `insumosxhoja_ibfk_1` FOREIGN KEY (`codigoHoja`) REFERENCES `hojas` (`codigoHoja`),
  ADD CONSTRAINT `insumosxhoja_ibfk_2` FOREIGN KEY (`codigoInsumo`) REFERENCES `insumos` (`codigoInsumo`);
