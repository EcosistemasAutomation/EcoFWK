
Feature: Prueba de API

  @tag1 @api
  Scenario Outline: Se realiza una consulta a una API sin certificado
		Given accedo a la url <url>
		And tengo el path de la api <api>
		When ingreso los paramatros <parametros>
		And indico la cabecera <header>
		Then me responde <codigo> como respuesta
    Examples: 
    |url 	 		|api 		|parametros  	|header  	|codigo  |
    |"URL"  	|"API" 	|"parametros" |"header" |200		  |

