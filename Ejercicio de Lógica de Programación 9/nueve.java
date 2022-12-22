package diccionario;

import java.util.HashMap;
import java.util.Scanner;

public class nueve {

	public static void main(String[] args) {
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
		diccionario.put("dia", "day");
		diccionario.put("año", "year");
		diccionario.put("billetera", "wallet");
		diccionario.put("paraguas", "umbrella");
		diccionario.put("reloj", "watch");
		diccionario.put("bateria", "battery");
		diccionario.put("bolsa", "bag");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una palabra en español");
		String name = sc.nextLine();
		String valor = diccionario.get(name);
		if (valor==null) {
			System.out.println("la palabra no existe en el diccionario");
		}else {
		System.out.println("la traducion es: " + valor);
		}
		sc.close();
	}

}
