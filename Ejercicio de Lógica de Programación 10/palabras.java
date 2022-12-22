package diccionario;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class palabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		// TODO Auto-generated method stub
		HashMap<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("carro", "car");
		diccionario.put("agua", "water");
		diccionario.put("cama", "bed");
		diccionario.put("sol", "sun");
		diccionario.put("estufa", "stove");
		diccionario.put("rojo", "red");
		diccionario.put("azul", "blue");
		diccionario.put("verde", "green");
		diccionario.put("puente", "bridge");
		diccionario.put("grilla", "grid");
		diccionario.put("verbo", "verb");
		diccionario.put("sustantivo", "noun");
		diccionario.put("lunes", "monday");
		diccionario.put("viernes", "friday");
		diccionario.put("día", "day");
		diccionario.put("año", "year");
		diccionario.put("billetera", "wallet");
		diccionario.put("paraguas", "umbrella");
		diccionario.put("reloj", "watch");
		diccionario.put("batería", "battery");
		diccionario.put("bolsa", "bag");
		
		// Obtener un conjunto de las claves del HashMap
		Set<String> keys = diccionario.keySet();
		// Convertir el conjunto de claves a un array
		String[] keysArray = keys.toArray(new String[0]);
		//Establesemos una variable llamada correcta que nos indica cuantas respuestas correctas llevamos
		int correcta=0;
		//Esta accion se repitara cinco veces y la inicialisamo en cero
		for (int i=1; i<=5; i++){
			int numero = r.nextInt(20);
			System.out.println(numero);
			System.out.println("porfavor digite la siguiente palabra en ingles: " + keysArray[numero] );
			String name = sc.nextLine();
			String palabra = diccionario.get(keysArray[numero]);
			if (palabra.equals(name)){
				correcta++;
			}else {
				System.out.println("Incorrecto");
			}
		}
		//Imprimimos el numero de respuetas correctas
		System.out.println("Tu numero de respuestas correctas fue " + correcta);
		
		//Cerramos la entrada del teclado
		sc.close();
		
	}

}
