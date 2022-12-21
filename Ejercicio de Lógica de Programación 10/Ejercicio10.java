package ejercicios;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
	// 1.- Creamos el diccionario como un objeto usando la funcion HashMap
	HashMap<String, String> diccionario = new HashMap<>();

	// 2.- Introducimos palabras para nuestro diccionario
    diccionario.put("Avion", "Airplane");
    diccionario.put("Ave", "Bird");
    diccionario.put("Aire", "Air");
    diccionario.put("Balon", "Ball");
    diccionario.put("Burro", "Donkey");
    diccionario.put("Carro", "Car");
    diccionario.put("Camaron", "Shrimp");
    diccionario.put("Catolisismo", "Catholicism");
    diccionario.put("Cocina", "Kitchen");
    diccionario.put("Dardo", "Dart");
    diccionario.put("Dentadura", "Teeth");
    diccionario.put("Disco", "Disc");
    diccionario.put("Economia", "Economics");
    diccionario.put("Editor", "Editor");
    diccionario.put("Enfermera", "Nurse");
    diccionario.put("Fallo", "Fail");
    diccionario.put("Feliz", "Happy");
    diccionario.put("Funcion", "Function");
    diccionario.put("Gato", "Cat");
    diccionario.put("Gallo", "Rooster");
    
    
    
		    
	// 3.- Pedir al usuario que teclee la traducción al inglés de c/u de las palabras y comprobar si el input es correcto
    
	Scanner sc = new Scanner(System.in); // 3.1-Se crea objeto Scanner para entrada del usuario 
	
	// 3.2 Hacemos del uso de 2 contadores, uno para respuestas correctas y uno para respuestas incorrectas
	int respCorrectas = 0;
	int respIncorrectas = 0;
	
	// 4.- Elegir 5 palabras aleatorias de nuestro diccionario
	
	// 4.1- Se crea un objeto del tipo RANDOM 
	//La clase Random proporciona un generador de números aleatorios que es más flexible que la función estática random de la clase Math.
    Random random = new Random();
    
    // 4.2- Se crea ciclo for para elegir cinco palabras aleatorias de nuestro mini diccionario 
    for (int i = 0; i < 5; i++) {
      // Obtenemos una palabra aleatoria diccionario
      String palabra = (String) diccionario.keySet().toArray()[random.nextInt(diccionario.size())];

      // 5.- Pedimos al usuario que teclee la traducción al inglés de la palabra
      System.out.println("Por favor, traduce al ingles la palabra '" + palabra + "'(NOTA: La primera letra debe ser mayuscula siempre):");
      String respuesta = sc.nextLine();

      // 6.- Comprobamos si el input del usuario es correcto
      if (respuesta.equals(diccionario.get(palabra))) {
        // Si la respuesta es correcta, aumentamos el contador de respuestas correctas
        respCorrectas++;
      } else {
        // Si la respuesta es incorrecta, aumentamos el contador de respuestas incorrectas
        respIncorrectas++;
      }
    }

    // Mostramos al usuario cuántas respuestas correctas e incorrectas tiene
    System.out.println("De 5 palabras traducidas del Espaniol al Ingles, estos fueron tus resultados:");
    System.out.println("Respuestas incorrectas: " + respIncorrectas);   
    System.out.println("Respuestas correctas: " + respCorrectas);
   
  }
}