# QueMePongo

|Apellido|Nombre|Legajo|
|:---|:---|:---|
|Casadoumecq|Tomás|193.391-0|
|García|Ignacio|167.347-6|
|Horak|Pablo|111.984-9|
|Ostrovsky|Tomás|171.917-8|
|Putrino|Rodrigo|171.515-0|
|Valentín|Victor|147.079-6|

[Diagrama de Objetos](./DDS-QMP-1eraIteracion.pdf)

Observaciones del diagrama:

- Los accesorios, las partes superiores, las partes inferiores y calzado son subclases que heredan de CategoríaPrenda. Tienen un atributo único que es una lista de strings de tipos posibles por categoría.
- No agregamos el método generarAtuendo porque no se especifica, en esta iteración, de qué manera se debe resolver.