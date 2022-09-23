# Backend

Se realizaron los siguientes 3 servicios:
- Consultar eventos por plataforma: https://bvc-eventos.herokuapp.com/evento/idPlataforma, las opciones para el idPlataforma son las siguientes: PACTO, DEPO, BAKO, PLATGI   
ejemplo: GET https://bvc-eventos.herokuapp.com/evento/PACTO
- Crear evento por plataforma: POST https://bvc-eventos.herokuapp.com/evento, el body es el siguiente:
  
  {  
    "plataforma": {  
        "idPlataforma": "PACTO" //Opciones: PACTO, DEPO, BAKO, PLATGI  
    },  
    "evento": {
        "idEvento": "F002", //Opciones: F001, F002, F003, F004, F005  
        "valorUnitario": "200" //Valor unitario  
    },  
    "cantidad": "5" //Cantidad  
}
- Consultar lista de plataformas: GET https://bvc-eventos.herokuapp.com/plataforma

# Fronted
URL del front= https://bvc-eventos-frontend.herokuapp.com/
