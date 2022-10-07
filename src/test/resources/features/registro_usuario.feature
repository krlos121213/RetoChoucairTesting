#Autor: Carlos Andres Zapata
  @stories
  Feature: Registro de usuario en Utest
    @scenario1
    Scenario: Registro de Carlos en la pagina Utest
      Given Carlos desea registarse en Utest
      When eL usuario ingresa los datos requerido por el sistema
        | strNombre | strApellido | strEmail | strMesNacimiento | strDiaNacimiento | strAnoNacimiento | strCiudad | strPostal | strPais  | strDispositivoMovil  | strModelo | strSistemaOperativoMovil | strClave |
        | Carlos    | Zapata      | carlos.zapatam1234@gmail.com  | June | 25        | 2000             | Medellin  | 050024    | Colombia | Xiaomi               | Redmi 9   | Android 11           |  Carlos.12345 |
      Then El registro se completa al ver el boton complete setup
        | strTextoFinal |
        | Complete Setup |