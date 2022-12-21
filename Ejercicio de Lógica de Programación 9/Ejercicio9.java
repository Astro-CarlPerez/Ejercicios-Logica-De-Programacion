package ejercicios;

import java.util.HashMap;
import java.util.Scanner;


public class Ejercicio9 {

	public static void main(String[] args) {
		// 1.- Creamos el diccionario como un objeto usando la funcion HashMap
	    HashMap<String, String> diccionario = new HashMap<>();

	    // 2.- Introducimos palabras para nuestro diccionario
	    diccionario.put("Avion", "Airplane");
	    diccionario.put("Ave", "Bird");
	    diccionario.put("Aire", "Aird");
	    diccionario.put("Balon", "Ball");
	    diccionario.put("Burro", "Donkey");
	    diccionario.put("Carro", "Car");
	    diccionario.put("Camaron", "Shrimp");
	    diccionario.put("Catolisismo", "Catholicism");
	    diccionario.put("Cocina", "Kitchen");
	    diccionario.put("Dardo", "dart");
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
	    
	 // 3. Creamos un escáner para leer la entrada del usuario
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Ingresa la palabra que quieres traducir del espaniol al ingles, por favor:");
	    String palabra = sc.nextLine();

	    // 4.- Verificamos si la palabra está en el diccionario ES-EN
	    if (diccionario.containsKey(palabra)) {
	      // 4.1- Si está, mostramos su traducción al ingles
	      System.out.println("La traduccion es: " + diccionario.get(palabra));
	    } 
	    else {
	      // 5. Si no está, mostramos un mensaje indicando que no tenemos la traduccion 
	      System.out.println("La palabra no se encuentra en el diccionario.");
	    }
	  }
	
	 
		
}


