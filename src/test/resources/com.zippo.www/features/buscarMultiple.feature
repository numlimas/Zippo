#language: es
Característica: Probar la busqueda de multiples productos del Home de Zippo

  Esquema del escenario: Validar producto del Homepage
    Dado Estoy en la Homepage de Zippo
    Cuando quiero un <producto> le doy click
    Y valido que me encuentro en la pagina con "nombre"
    Entonces me aseguro que el producto esta listado

    Ejemplos:
      | producto | nombre                                                   |
      | 1        | Mecha Para Encendedor Zippo – Cod 2425                   |
      | 2        | Dispensador Guarda Combustible Zippo – Cod 121503        |
      | 3        | Combustible Para Encendedor Zippo 4oz – Cod 3141laex     |
      | 4        | Encendedor Zippo Dorado Espejo – Cod 254b                |
      | 5        | Inserto Encendedor Zippo Butano Llama Sencilla Cod 65826 |