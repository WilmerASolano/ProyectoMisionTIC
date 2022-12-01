-- DISTINCT
-- mostrar las editoriales que existen en la BDs
-- SELECT DISTINCT editorial
-- FROM libro

-- DISTINCT
-- Mostrar las editoriales y año de publicacion de los libros
-- SELECT DISTINCT editorial, anio_publicacion
-- FROM libro

-- OR
-- Mostrar los libro de las editoriales norma y prisma
-- SELECT titulo, editorial
-- FROM libro
-- WHERE editorial = 'norma' or editorial = 'prisma'

-- AND
-- Mostrar los libros de la editorial Prisma con año publicación mayor al año 2000
-- SELECT titulo, anio_publicacion
-- FROM libro
-- WHERE editorial = 'prisma' and anio_publicacion > 2000

-- NOT
-- Mostrar los libros que no pertencen a la editorial KARMA
-- SELECT titulo, editorial
-- FROM libro
-- WHERE not editorial = 'karma'

-- SELECT titulo, editorial
-- FROM libro
-- WHERE editorial <> 'karma'

-- mostrar los libros de la editorial PRISMA ordenados por anio_publicacion
-- SELECT titulo, anio_publicacion
-- FROM libro
-- WHERE editorial = 'prisma'
-- ORDER BY anio_publicacion DESC


-- LIMIT
-- mostrar las 3 primeras editoriales con la mayor cantidad de libros
-- SELECT  editorial, count(*) 'total'
-- FROM libro
-- GROUP BY editorial
-- order by total DESC
-- LIMIT 3

-- MIN  MAX
-- Mostrar el año publicación más antiguo
-- SELECT min(anio_publicacion)
-- FROM libro

-- mostrar el libro con el titulo 
-- SELECT MAX(titulo)
-- FROM libro


-- AVG => Promedio
-- mostrar el promedio de paginas de los libros de la biblioteca
-- SELECT AVG(cantidad_paginas)
-- FROM capitulo

-- SUM => Sumar
-- Mostrar la cantidad de paginas del libro 'EL CIELO GRIS'
-- SELECT sum(cantidad_paginas) 'Total Paginas'
-- FROM libro l INNER JOIN capitulo c on l.libro_id = c.libro_id
-- where l.titulo = 'EL CIELO GRIS'

-- mostrar la cantidad de paginas que tienen cada uno de los libros
-- SELECT l.titulo, sum(cantidad_paginas) 'Total Paginas'
-- FROM libro l INNER JOIN capitulo c on l.libro_id = c.libro_id
-- GROUP BY l.titulo

-- SELECT l.titulo, sum(cantidad_paginas) 'Total Paginas'
-- FROM libro l LEFT JOIN capitulo c on l.libro_id = c.libro_id
-- GROUP BY l.titulo

-- IN 
-- mostra los libros de la editoriales 'norma, prisma', karma
-- SELECT titulo, editorial
-- FROM libro
-- WHERE editorial IN ('norma','prisma', 'karma')

-- BETWEEN
-- mostrar los libros con año de publicación entre 2000 y 2022
-- SELECT titulo, anio_publicacion
-- FROM libro
-- WHERE anio_publicacion BETWEEN 2000 and 2022
