# language: es
Característica: Buscar solo los gatos
  Como usuario web
  Quiero buscar solo los gatos
  Para ver que gatos hay en el libro

  Escenario: Ingresar a la pagina principal de pet-book
    Cuando un usuario le da clic al boton Gato
    Entonces debe ver la imagen del Gato assets/images/gato1.jpg
    Entonces debe ver la imagen del Gato assets/images/gato2.jpeg