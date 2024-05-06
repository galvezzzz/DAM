(:Recupera el nombre del jugador cuyo entrenador tenga una "X" en su nombre:)
for $e in /jugadores/jugador
where contains($e/entrenador, "X")
return $e/nombre/text(),

(:Recupera aquellos equipos que tienen jugadores que cuestan más de 50 millones de euros (no tienes que mostrar los que cobran en libras):)
for $e in /jugadores/jugador
where $e/precio > 50000000
and $e/precio/@moneda = "euro"
return $e/equipo/text(),

(:Devuelve una etiqueta xml jugador con el precio y el nombre del jugador con el salario más alto (ignorando euros o libras):)
let $m :=max(
  for $e in /jugadores/jugador
  return $e/precio
)
for $e in /jugadores/jugador
where $e/precio = $m
return 
<jugador>
  <precio>{$e/precio/text()}</precio>
  <nombre>{$e/nombre/text()}</nombre>
</jugador>,

(:Realiza la suma de todos los precios de jugadores, teniendo en cuenta la moneda usada (1 libra= 1,17 euros):)
let $precio1 :=sum(
  for $e in jugadores/jugador
  where $e/precio/@moneda = "euro"
  return $e/precio/text())

let $precio2 :=sum(
  for $l in jugadores/jugador
  where $l/precio/@moneda = "libra"
  return $l/precio/text() * 1.17)

return concat("Precio total: ", $precio1 + $precio2)
 



