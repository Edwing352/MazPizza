-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-06-2023 a las 22:46:35
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mazpizza`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `NombreCli` varchar(45) DEFAULT NULL,
  `RFC` varchar(11) DEFAULT NULL,
  `CorreoCliente` varchar(45) DEFAULT NULL,
  `TelefonoCliente` varchar(15) DEFAULT NULL,
  `DireccionCliente` varchar(50) DEFAULT NULL,
  `Estatus` varchar(45) NOT NULL DEFAULT 'Activo'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `NombreCli`, `RFC`, `CorreoCliente`, `TelefonoCliente`, `DireccionCliente`, `Estatus`) VALUES
(2, 'dayana', 'sdfgs774', 'dayana@gmail.com', '6692300702', 'Av. Prados del Sol #7844', 'Activo'),
(3, 'dominga', 'dafs552', 'Dominga@gmail.com', '6682346565', 'Av. Siempre Viva #1234', 'Activo'),
(4, 'Ricardo', 'qwe2', 'Richard@gmail.com', '6678974523', 'Av. Rios Fuentes #1456', 'Activo'),
(6, 'Roberto', '3456', 'Robertillo@gmail.com', '6692305678', 'Av. Juaréz #9999', 'Activo'),
(7, 'Mike', 'errer3', 'Michaelqwerr.com', '6678765432', 'Olas Altas', 'Eliminado'),
(8, 'wer', 'asdfsdf', 'erwerw', 'asdfasdf', 'arwqerqwe', 'Activo'),
(9, 'Rosa', '354g', 'Rosa@gmail.com', '66785495', 'v.Joyas', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comanda`
--

CREATE TABLE `comanda` (
  `idComanda` int(11) NOT NULL,
  `Hora` time DEFAULT NULL,
  `Fecha` date DEFAULT NULL,
  `Cliente_idCliente` int(11) NOT NULL,
  `Empleado_idEmpleado` int(11) NOT NULL,
  `Estatus` varchar(15) NOT NULL,
  `Valor` double NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `comanda`
--

INSERT INTO `comanda` (`idComanda`, `Hora`, `Fecha`, `Cliente_idCliente`, `Empleado_idEmpleado`, `Estatus`, `Valor`) VALUES
(1, '21:23:21', '2022-09-12', 3, 2, 'Terminado', 100),
(2, '22:01:56', '2022-09-12', 2, 2, 'Terminado', 480),
(3, '22:02:06', '2022-09-12', 2, 2, 'Terminado', 480),
(4, '22:04:05', '2022-09-12', 4, 2, 'Terminado', 20),
(5, '22:11:42', '2022-09-12', 3, 2, 'Terminado', 300),
(6, '22:12:33', '2022-09-12', 2, 2, 'Terminado', 150),
(7, '22:13:19', '2022-09-12', 2, 2, 'Terminado', 100),
(8, '22:16:48', '2022-09-12', 2, 2, 'final', 100),
(9, '22:18:23', '2022-09-12', 3, 2, 'Terminado', 150),
(10, '22:20:14', '2022-09-12', 2, 2, 'Terminado', 150),
(11, '21:32:25', '2022-09-13', 2, 2, 'Terminado', 100),
(12, '21:32:44', '2022-09-13', 4, 2, 'Terminado', 320),
(13, '21:33:08', '2022-09-13', 3, 2, 'Terminado', 450),
(14, '21:33:49', '2022-09-13', 3, 2, 'Terminado', 300),
(15, '21:34:06', '2022-09-13', 2, 2, 'Terminado', 600),
(16, '23:25:35', '2022-09-13', 2, 2, 'final', 100),
(17, '23:26:25', '2022-09-13', 3, 2, 'Terminado', 150),
(18, '23:27:49', '2022-09-13', 3, 2, 'Terminado', 100),
(19, '23:28:58', '2022-09-13', 3, 2, 'Terminado', 100),
(20, '23:31:03', '2022-09-13', 3, 2, 'Terminado', 150),
(21, '23:31:41', '2022-09-13', 4, 2, 'final', 410),
(22, '11:42:20', '2022-09-14', 3, 2, 'final', 220),
(23, '15:34:18', '2022-09-14', 6, 2, 'final', 790),
(24, '22:29:28', '2022-09-14', 2, 2, 'final', 150),
(25, '05:35:22', '2022-09-15', 3, 2, 'final', 130),
(26, '09:14:42', '2022-09-15', 9, 2, 'Terminado', 980);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comanda_has_productos`
--

CREATE TABLE `comanda_has_productos` (
  `Comanda_idComanda` int(11) NOT NULL,
  `Productos_idProductos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `comanda_has_productos`
--

INSERT INTO `comanda_has_productos` (`Comanda_idComanda`, `Productos_idProductos`) VALUES
(20, 2),
(21, 1),
(21, 2),
(21, 3),
(22, 1),
(22, 5),
(23, 2),
(23, 3),
(24, 2),
(25, 3),
(26, 1),
(26, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `correocli`
--

CREATE TABLE `correocli` (
  `CorreoCliente` varchar(45) DEFAULT NULL,
  `Cliente_idCliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direccioncli`
--

CREATE TABLE `direccioncli` (
  `DireccionCliente` varchar(40) DEFAULT NULL,
  `Cliente_idCliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `idEmpleado` int(11) NOT NULL,
  `NombreEmp` varchar(45) DEFAULT NULL,
  `CalleNumero` varchar(20) DEFAULT NULL,
  `NumeroSS` varchar(11) DEFAULT NULL,
  `Colonia` varchar(35) DEFAULT NULL,
  `FechaContrato` date DEFAULT NULL,
  `NombreUsuario` varchar(45) DEFAULT NULL,
  `Password` varchar(10) DEFAULT NULL,
  `Puesto_idPuesto` int(11) NOT NULL,
  `Estatus` varchar(45) NOT NULL DEFAULT 'Activo'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`idEmpleado`, `NombreEmp`, `CalleNumero`, `NumeroSS`, `Colonia`, `FechaContrato`, `NombreUsuario`, `Password`, `Puesto_idPuesto`, `Estatus`) VALUES
(2, 'Edwing', '7815', 'ddee3', 'Prados del Sol', '2022-08-30', 'admin', 'admin1', 1, 'Activo'),
(3, 'Chester', '7132', 'Chester', 'Av. Maple', '2022-09-14', 'Chester', 'admin12', 2, 'Activo'),
(5, 'Jessica', 'Jess', '125sd', 'Conocida', '2022-09-01', 'Jess123', '1234567', 1, 'Activo'),
(12, 'Simon', 'Conocida 10', 'ihbsdf24', 'prados', '2022-09-10', 'smn', '123', 4, 'Eliminado'),
(15, 'Alejandrou', 'Av. Revolución', 'Ale', 'Independencia', '2022-09-14', 'Ale', '123', 2, 'Activo'),
(17, 'wqer', 'wer', 'wer', 'wer', '2022-09-14', 'wer', 'wer', 1, 'Activo'),
(18, 'sdf', 'sadf', 'sdfs', 'sdf', '2022-09-14', 'sdfs', 'sd', 4, 'Activo'),
(19, 'Carlos', 'Av. Soles', 'ngg2', 'Averardo', '2022-09-15', 'Carlius', '124', 2, 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `idFacturas` int(11) NOT NULL,
  `FechaFactura` date DEFAULT NULL,
  `Comanda_idComanda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `insumos`
--

CREATE TABLE `insumos` (
  `idInsumos` int(11) NOT NULL,
  `NombreInsumo` varchar(45) DEFAULT NULL,
  `PrecioI` double DEFAULT NULL,
  `descripcionI` varchar(45) DEFAULT NULL,
  `PrecioPorcion` double NOT NULL DEFAULT 0,
  `EsIngrediente` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `insumos`
--

INSERT INTO `insumos` (`idInsumos`, `NombreInsumo`, `PrecioI`, `descripcionI`, `PrecioPorcion`, `EsIngrediente`) VALUES
(1, 'Queso', 100, 'Rayado', 20, 1),
(3, 'Chorizo', 120, 'Goliz', 20, 1),
(4, 'Peperoni', 150, 'Chimex', 30, 1),
(5, 'Frijol', 60, 'Del pais', 10, 1),
(6, 'Harina', 30, 'Selecta', 0, 0),
(7, 'Huevos', 50, 'Campeone', 0, 0),
(11, 'Salchicha', 70, 'Vegana', 0, 0),
(13, 'Piña', 55, 'En almibar', 0, 0),
(14, 'Tomate', 35, 'Natural', 10, 1),
(15, 'Camarones', 200, 'Fresco', 40, 1),
(16, 'Anchoas', 350, 'En lata', 50, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `idProductos` int(11) NOT NULL,
  `NombreProducto` varchar(45) DEFAULT NULL,
  `Descripcion` varchar(100) DEFAULT NULL,
  `PrecioProducto` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`idProductos`, `NombreProducto`, `Descripcion`, `PrecioProducto`) VALUES
(1, 'Pizza Peperoni', 'contiene queso y peperoni', 100),
(2, 'Pizza Mexicana', 'contiene queso, chorizo y frijol', 150),
(3, 'Pizza Mixta', 'Tu elijes los ingredientes, con cargo extra', 100),
(5, 'Coca cola', 'Desechable', 20),
(6, 'Pepsi', 'Light', 21),
(8, 'wer', 'wer', 23),
(9, 'wer', 'asda', 23),
(10, 'Pizza Vegana', 'Con frutas', 250);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos_has_insumos`
--

CREATE TABLE `productos_has_insumos` (
  `Productos_idProductos` int(11) NOT NULL,
  `Insumos_idInsumos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `productos_has_insumos`
--

INSERT INTO `productos_has_insumos` (`Productos_idProductos`, `Insumos_idInsumos`) VALUES
(1, 1),
(1, 4),
(2, 1),
(2, 3),
(2, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puesto`
--

CREATE TABLE `puesto` (
  `idPuesto` int(11) NOT NULL,
  `NombreP` varchar(45) DEFAULT NULL,
  `Salario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `puesto`
--

INSERT INTO `puesto` (`idPuesto`, `NombreP`, `Salario`) VALUES
(1, 'Admin', 0),
(2, 'Cajero', 1200),
(3, 'Gerente', 4000),
(4, 'Almacenista', 3000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telefonocli`
--

CREATE TABLE `telefonocli` (
  `TelefonoCliente` varchar(12) DEFAULT NULL,
  `Cliente_idCliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `comanda`
--
ALTER TABLE `comanda`
  ADD PRIMARY KEY (`idComanda`),
  ADD KEY `fk_Comanda_Cliente1_idx` (`Cliente_idCliente`),
  ADD KEY `fk_Comanda_Empleado1_idx` (`Empleado_idEmpleado`);

--
-- Indices de la tabla `comanda_has_productos`
--
ALTER TABLE `comanda_has_productos`
  ADD PRIMARY KEY (`Comanda_idComanda`,`Productos_idProductos`),
  ADD KEY `fk_Comanda_has_Productos_Productos1_idx` (`Productos_idProductos`),
  ADD KEY `fk_Comanda_has_Productos_Comanda1_idx` (`Comanda_idComanda`);

--
-- Indices de la tabla `correocli`
--
ALTER TABLE `correocli`
  ADD KEY `fk_CorreoCli_Cliente1_idx` (`Cliente_idCliente`);

--
-- Indices de la tabla `direccioncli`
--
ALTER TABLE `direccioncli`
  ADD KEY `fk_DireccionCli_Cliente1_idx` (`Cliente_idCliente`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`idEmpleado`),
  ADD KEY `fk_Empleado_Puesto1_idx` (`Puesto_idPuesto`);

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`idFacturas`),
  ADD KEY `fk_Facturas_Comanda1_idx` (`Comanda_idComanda`);

--
-- Indices de la tabla `insumos`
--
ALTER TABLE `insumos`
  ADD PRIMARY KEY (`idInsumos`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`idProductos`);

--
-- Indices de la tabla `productos_has_insumos`
--
ALTER TABLE `productos_has_insumos`
  ADD PRIMARY KEY (`Productos_idProductos`,`Insumos_idInsumos`),
  ADD KEY `fk_Productos_has_Insumos_Insumos1_idx` (`Insumos_idInsumos`),
  ADD KEY `fk_Productos_has_Insumos_Productos1_idx` (`Productos_idProductos`);

--
-- Indices de la tabla `puesto`
--
ALTER TABLE `puesto`
  ADD PRIMARY KEY (`idPuesto`);

--
-- Indices de la tabla `telefonocli`
--
ALTER TABLE `telefonocli`
  ADD KEY `fk_TelefonoCli_Cliente_idx` (`Cliente_idCliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `comanda`
--
ALTER TABLE `comanda`
  MODIFY `idComanda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `idEmpleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `facturas`
--
ALTER TABLE `facturas`
  MODIFY `idFacturas` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `insumos`
--
ALTER TABLE `insumos`
  MODIFY `idInsumos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `idProductos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `puesto`
--
ALTER TABLE `puesto`
  MODIFY `idPuesto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comanda`
--
ALTER TABLE `comanda`
  ADD CONSTRAINT `fk_Comanda_Cliente1` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`),
  ADD CONSTRAINT `fk_Comanda_Empleado1` FOREIGN KEY (`Empleado_idEmpleado`) REFERENCES `empleado` (`idEmpleado`);

--
-- Filtros para la tabla `comanda_has_productos`
--
ALTER TABLE `comanda_has_productos`
  ADD CONSTRAINT `fk_Comanda_has_Productos_Comanda1` FOREIGN KEY (`Comanda_idComanda`) REFERENCES `comanda` (`idComanda`),
  ADD CONSTRAINT `fk_Comanda_has_Productos_Productos1` FOREIGN KEY (`Productos_idProductos`) REFERENCES `productos` (`idProductos`);

--
-- Filtros para la tabla `correocli`
--
ALTER TABLE `correocli`
  ADD CONSTRAINT `fk_CorreoCli_Cliente1` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`);

--
-- Filtros para la tabla `direccioncli`
--
ALTER TABLE `direccioncli`
  ADD CONSTRAINT `fk_DireccionCli_Cliente1` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`);

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `fk_Empleado_Puesto1` FOREIGN KEY (`Puesto_idPuesto`) REFERENCES `puesto` (`idPuesto`);

--
-- Filtros para la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD CONSTRAINT `fk_Facturas_Comanda1` FOREIGN KEY (`Comanda_idComanda`) REFERENCES `comanda` (`idComanda`);

--
-- Filtros para la tabla `productos_has_insumos`
--
ALTER TABLE `productos_has_insumos`
  ADD CONSTRAINT `fk_Productos_has_Insumos_Insumos1` FOREIGN KEY (`Insumos_idInsumos`) REFERENCES `insumos` (`idInsumos`),
  ADD CONSTRAINT `fk_Productos_has_Insumos_Productos1` FOREIGN KEY (`Productos_idProductos`) REFERENCES `productos` (`idProductos`);

--
-- Filtros para la tabla `telefonocli`
--
ALTER TABLE `telefonocli`
  ADD CONSTRAINT `fk_TelefonoCli_Cliente` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
