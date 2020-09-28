# language: es
Característica: Buscar todos las mascotas
  Como usuario web
  Quiero buscar todas las mascotas
  Para ver que mascotas hay en el libro

  Escenario: Ingresar a la pagina principal de pet-book
    Cuando un usuario le da clic al boton all
    Entonces debe encontrar la imagen assets/images/perro1.jpg
    Entonces debe encontrar la imagen assets/images/perro2.jpg
    Entonces debe encontrar la imagen assets/images/gato1.jpg
    Entonces debe encontrar la imagen assets/images/gato2.jpeg
    Entonces debe encontrar la imagen assets/images/perro3.jpg