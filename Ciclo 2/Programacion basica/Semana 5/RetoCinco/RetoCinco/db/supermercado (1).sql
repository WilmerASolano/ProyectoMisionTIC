-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 29, 2022 at 07:51 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `supermercado`
--

-- --------------------------------------------------------

--
-- Table structure for table `categoria`
--

CREATE TABLE `categoria` (
  `id_categoria` int(11) NOT NULL,
  `nombre_categoria` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `descripcion` varchar(20) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `categoria`
--

INSERT INTO `categoria` (`id_categoria`, `nombre_categoria`, `descripcion`) VALUES
(1, 'electrodomesticos', 'productos electricos'),
(2, 'lacteos', 'leches y yogures '),
(3, 'granos', 'productos perecedero'),
(4, 'frutas y verduras', 'productos de frutas '),
(5, 'panaderia', 'productos elaborados'),
(6, 'aseo', 'jabones,detergentes '),
(7, 'frios', 'carnes,heledos,gaseo');

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `documento_identidad` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `apellido` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `id_direccion` int(11) NOT NULL,
  `correo_electronico` varchar(40) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `documento_identidad`, `nombre`, `apellido`, `id_direccion`, `correo_electronico`) VALUES
(1, '4545468', 'jose', 'narvaez', 8, 'josenar@gmail.com'),
(2, '7986543', 'mario', 'gomez', 9, 'mariogom@hotmail.com'),
(3, '5123467', 'maria', 'pabon', 10, 'mariiia@gmail.com'),
(4, '56790137', 'sara', 'triana', 11, 'saritriana@outlook.com'),
(5, '1030455677', 'andrea', 'hernandez', 12, 'andreher@gmail.com'),
(6, '1001324666', 'luis', 'pinto', 13, 'lpintoo@yahoo.com'),
(7, '1234562890', 'miranda', 'gonzalez', 14, 'gonzalezmira@hotmail.com'),
(9, '12345', 'ejemplo2', 'perez', 2, 'ej@correo'),
(11, '5678', 'ejemplo', 'ejemplo', 3, 'ejemplo@correo.com');

-- --------------------------------------------------------

--
-- Table structure for table `direccion`
--

CREATE TABLE `direccion` (
  `id_direccion` int(11) NOT NULL,
  `calle_carrera` varchar(10) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `numero` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `barrio` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `ciudad` varchar(15) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `direccion`
--

INSERT INTO `direccion` (`id_direccion`, `calle_carrera`, `numero`, `barrio`, `ciudad`) VALUES
(1, 'calle', '62sur', 'atalayas', 'bogota'),
(2, 'carrera', '76c', 'polo', 'medellin'),
(3, 'carrera', '76c', 'polo', 'medellin'),
(4, 'calle', '6sur', 'victoria', 'manizales'),
(5, 'carrera', '14f', 'la junta', 'medellin'),
(6, 'calle', '12', 'recodo', 'bogota'),
(7, 'carrera', '14h', 'rosales', 'medellin'),
(8, 'calle', '90i', 'torres', 'pereira'),
(9, 'carrera', '1', 'cerros', 'neiva'),
(10, 'calle', '123sur', 'palmira', 'bogota'),
(11, 'carrera', '70j', 'juanchito', 'cali'),
(12, 'calle', '7i', 'aguablanca', 'cali'),
(13, 'carrera', '4fsur', 'luz', 'medellin'),
(14, 'calle', '9j', 'el palmar', 'manizales'),
(15, 'carrera', '89c', 'el obispo', 'pereira');

-- --------------------------------------------------------

--
-- Table structure for table `existencia`
--

CREATE TABLE `existencia` (
  `id_existencia` int(11) NOT NULL,
  `nombre` varchar(40) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `existencia`
--

INSERT INTO `existencia` (`id_existencia`, `nombre`) VALUES
(1, 'disponible'),
(2, 'pocas unidades'),
(3, 'agotado'),
(4, 'no disponible en tienda'),
(5, 'en abastecimiento'),
(6, 'ejemplo'),
(7, 'este');

-- --------------------------------------------------------

--
-- Table structure for table `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(11) NOT NULL,
  `codigo_producto` int(11) NOT NULL,
  `nombre` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `precio_actual` double NOT NULL,
  `id_proveedor` int(11) DEFAULT NULL,
  `id_existencia` int(11) DEFAULT NULL,
  `id_categoria` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `producto`
--

INSERT INTO `producto` (`id_producto`, `codigo_producto`, `nombre`, `precio_actual`, `id_proveedor`, `id_existencia`, `id_categoria`) VALUES
(3, 11, 'yogurt griego', 2.23, 15, 1, 2),
(10, 12, 'frijoles rojos', 8.99, 16, 1, 3),
(11, 13, 'mandarina', 19.45, 17, 3, 4),
(12, 14, 'pan rollo', 19.78, 1, 3, 5),
(13, 15, 'limpiatodo', 27.11, 18, 4, 6),
(14, 16, 'carne res', 9.14, 19, 1, 7),
(15, 17, 'ejemplo unooo', 6.8, 19, 1, 7);

-- --------------------------------------------------------

--
-- Table structure for table `proveedor`
--

CREATE TABLE `proveedor` (
  `id_proveedor` int(11) NOT NULL,
  `razon_social` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `NIT` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `id_direccion` int(11) DEFAULT NULL,
  `correo_electronico` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `representante_legal` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `sitio_web` varchar(70) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `proveedor`
--

INSERT INTO `proveedor` (`id_proveedor`, `razon_social`, `NIT`, `telefono`, `id_direccion`, `correo_electronico`, `representante_legal`, `sitio_web`) VALUES
(1, 'elabora panes ltda', '34567643', '6789054', 1, 'elaborapanes@gmail.com', 'gilberto varon', 'elaborapanes.com'),
(14, 'electricosigm', '34587667', '8976533', 2, 'electricosigm@outlook.com', 'miguel lopez', 'electricos.net'),
(15, 'lacteos sanchez ltda', '56432387', '9865321', 3, 'lacteossanchez@gmail.com', 'leidy soto', 'lanchezschez.com'),
(16, 'industria gramos s.a.s', '34567643', '44656721', 4, 'gramosindustria@hotmail.com', 'milena vargas', 'indusgramos.net'),
(17, 'fruvers ltda', '34567643', '6789244', 5, 'fruvers@gmail.com', 'fernando torres', 'somosfruvers.com'),
(18, 'limpiamos s.a', '57897923', '3458721', 6, 'limpiamos@hotmail.com', 'laura jimenez', 'limpiamos.net'),
(19, 'frios sur ltda', '124098542', '89321945', 7, 'friossur@yahoo.com', 'mateo montenegro', 'friosdelsur.com'),
(23, 'razon', 'ejemplo', '43423', 1, 'correo@correo.com', 'ejemplo', 'sitioweb');

-- --------------------------------------------------------

--
-- Table structure for table `reporte_pago`
--

CREATE TABLE `reporte_pago` (
  `id_reporte` int(11) NOT NULL,
  `detalle_reporte` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reporte_tipo`
--

CREATE TABLE `reporte_tipo` (
  `id_tipo_venta` int(11) DEFAULT NULL,
  `id_reporte` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `telefono`
--

CREATE TABLE `telefono` (
  `id_telefono` int(11) NOT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `numero` varchar(15) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tipo_pago`
--

CREATE TABLE `tipo_pago` (
  `id_tipo` int(11) NOT NULL,
  `medio` varchar(30) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `tipo_pago`
--

INSERT INTO `tipo_pago` (`id_tipo`, `medio`) VALUES
(1, 'tajeta debito'),
(2, 'tarjeta credito'),
(3, 'efectivo');

-- --------------------------------------------------------

--
-- Table structure for table `tipo_venta`
--

CREATE TABLE `tipo_venta` (
  `id_tipo_venta` int(11) NOT NULL,
  `id_tipo` int(11) DEFAULT NULL,
  `id_venta` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `tipo_venta`
--

INSERT INTO `tipo_venta` (`id_tipo_venta`, `id_tipo`, `id_venta`) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 2, 4),
(5, 3, 5),
(6, 1, 6);

-- --------------------------------------------------------

--
-- Table structure for table `venta`
--

CREATE TABLE `venta` (
  `id_venta` int(11) NOT NULL,
  `fecha_venta` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `valor_descuento` double NOT NULL DEFAULT 0,
  `valor_total` double NOT NULL,
  `id_producto` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `venta`
--

INSERT INTO `venta` (`id_venta`, `fecha_venta`, `id_cliente`, `valor_descuento`, `valor_total`, `id_producto`) VALUES
(1, '2021-07-07', 1, 0, 0, 3),
(2, '2022-07-07', 2, 0, 0, 10),
(3, '2020-04-03', 3, 0, 0, 11),
(4, '2019-03-08', 4, 0, 0, 12),
(5, '2017-03-08', 5, 0, 0, 13),
(6, '2018-04-26', 6, 0, 0, 14),
(7, '2020-09-11', 7, 0, 0, 15),
(9, '0000-00-00', 5, 0, 0, 13);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`),
  ADD UNIQUE KEY `documento_identidad` (`documento_identidad`),
  ADD KEY `id_direccion` (`id_direccion`);

--
-- Indexes for table `direccion`
--
ALTER TABLE `direccion`
  ADD PRIMARY KEY (`id_direccion`);

--
-- Indexes for table `existencia`
--
ALTER TABLE `existencia`
  ADD PRIMARY KEY (`id_existencia`);

--
-- Indexes for table `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`),
  ADD UNIQUE KEY `codigo_producto` (`codigo_producto`),
  ADD KEY `id_proveedor` (`id_proveedor`),
  ADD KEY `id_existencia` (`id_existencia`),
  ADD KEY `id_categoria` (`id_categoria`);

--
-- Indexes for table `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id_proveedor`),
  ADD KEY `id_direccion` (`id_direccion`);

--
-- Indexes for table `reporte_pago`
--
ALTER TABLE `reporte_pago`
  ADD PRIMARY KEY (`id_reporte`);

--
-- Indexes for table `reporte_tipo`
--
ALTER TABLE `reporte_tipo`
  ADD KEY `id_tipo_venta` (`id_tipo_venta`),
  ADD KEY `id_reporte` (`id_reporte`);

--
-- Indexes for table `telefono`
--
ALTER TABLE `telefono`
  ADD PRIMARY KEY (`id_telefono`);

--
-- Indexes for table `tipo_pago`
--
ALTER TABLE `tipo_pago`
  ADD PRIMARY KEY (`id_tipo`);

--
-- Indexes for table `tipo_venta`
--
ALTER TABLE `tipo_venta`
  ADD PRIMARY KEY (`id_tipo_venta`),
  ADD KEY `id_venta` (`id_venta`),
  ADD KEY `id_tipo` (`id_tipo`);

--
-- Indexes for table `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`id_venta`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_producto` (`id_producto`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_categoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `direccion`
--
ALTER TABLE `direccion`
  MODIFY `id_direccion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `existencia`
--
ALTER TABLE `existencia`
  MODIFY `id_existencia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `id_proveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `reporte_pago`
--
ALTER TABLE `reporte_pago`
  MODIFY `id_reporte` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `telefono`
--
ALTER TABLE `telefono`
  MODIFY `id_telefono` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tipo_pago`
--
ALTER TABLE `tipo_pago`
  MODIFY `id_tipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tipo_venta`
--
ALTER TABLE `tipo_venta`
  MODIFY `id_tipo_venta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `venta`
--
ALTER TABLE `venta`
  MODIFY `id_venta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`id_direccion`) REFERENCES `direccion` (`id_direccion`),
  ADD CONSTRAINT `cliente_ibfk_2` FOREIGN KEY (`id_direccion`) REFERENCES `direccion` (`id_direccion`),
  ADD CONSTRAINT `cliente_ibfk_3` FOREIGN KEY (`id_direccion`) REFERENCES `direccion` (`id_direccion`);

--
-- Constraints for table `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`),
  ADD CONSTRAINT `producto_ibfk_2` FOREIGN KEY (`id_existencia`) REFERENCES `existencia` (`id_existencia`),
  ADD CONSTRAINT `producto_ibfk_3` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`);

--
-- Constraints for table `proveedor`
--
ALTER TABLE `proveedor`
  ADD CONSTRAINT `proveedor_ibfk_1` FOREIGN KEY (`id_direccion`) REFERENCES `direccion` (`id_direccion`),
  ADD CONSTRAINT `proveedor_ibfk_2` FOREIGN KEY (`id_direccion`) REFERENCES `direccion` (`id_direccion`);

--
-- Constraints for table `reporte_tipo`
--
ALTER TABLE `reporte_tipo`
  ADD CONSTRAINT `reporte_tipo_ibfk_1` FOREIGN KEY (`id_tipo_venta`) REFERENCES `tipo_venta` (`id_tipo_venta`),
  ADD CONSTRAINT `reporte_tipo_ibfk_2` FOREIGN KEY (`id_reporte`) REFERENCES `reporte_pago` (`id_reporte`);

--
-- Constraints for table `tipo_venta`
--
ALTER TABLE `tipo_venta`
  ADD CONSTRAINT `tipo_venta_ibfk_1` FOREIGN KEY (`id_tipo`) REFERENCES `tipo_pago` (`id_tipo`),
  ADD CONSTRAINT `tipo_venta_ibfk_2` FOREIGN KEY (`id_venta`) REFERENCES `venta` (`id_venta`),
  ADD CONSTRAINT `tipo_venta_ibfk_3` FOREIGN KEY (`id_tipo`) REFERENCES `tipo_pago` (`id_tipo`);

--
-- Constraints for table `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `venta_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
