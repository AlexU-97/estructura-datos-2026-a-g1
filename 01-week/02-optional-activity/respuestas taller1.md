# Taller 1 - Estructura de datos

1. Contexto
Antes de programar estructuras de datos, es importante reconocer dónde aparecen en situaciones reales. Esta actividad busca que identifiques ejemplos cotidianos donde se utilice la organización de datos.

2. Actividad
* Piensa en una aplicación o sistema que uses frecuentemente.
* Identifica al menos tres tipos de datos que maneja.
* Describe cómo crees que esos datos podrían organizarse.

3. Solucion de guia

   * Aplicacion: Sistema de monitoreo y control de caldera mediante PLC
  
   * Datos: Consumo de carbon por hora, consumo diario de carbon, produccion de vapor por hora y produccion diaria de vapor
  
   * Organizacion: El PLC maneja estos datos mediante variables donde guarda los datos y luego los acumula para obtener un valor diario y real. Estos datos pueden organizarse como arrreglos para almacenar consumo por hora y realizar calculos automaticos. Luego, la informacion se pasa a una tabla de excel, organizada en filas y columnas, lo que permite visualizar y analizar el comportamiento del consumo y la produccion de la maquina
