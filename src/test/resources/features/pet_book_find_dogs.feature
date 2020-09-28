# language: es
Característica: Buscar solo los perros
  Como usuario web
  Quiero buscar solo los perros
  Para ver que perros hay en el libro

  Escenario: Ingresar a la pagina principal de pet-book
    Cuando un usuario le da clic al boton Perro
    Entonces debe ver la imagen Perro assets/images/perro1.jpg
    Entonces debe ver la imagen Perro assets/images/perro2.jpg
    Entonces debe ver la imagen Perro assets/images/perro3.jpg