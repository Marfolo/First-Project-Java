import java.util.Scanner;

public class Wczytywanie {
	public static void main(String[] args) {
		//informujemy użytkownika, co ma robić
		System.out.println("Prosze podac imie: ");
		
		//wczytujemy od uzytkownika pojedyncze slowo do zmiennej imie
		String imie = getString();
		
		//wypisujemy komunikat, uzywajac wczytane od uzytkownika imie
		System.out.println("Witaj, " + imie + "!");
		
		//kolejny przyklad - tym razem prosimy i wczytujemy liczbe calkowita
		System.out.println("Prosze podac promien kola: ");
		int radius = getInt();
		double circleArea = 3.14159 * radius * radius;
		System.out.println("Pole kola o promieniu " + radius + " wynosi: " + circleArea);
	}
	
	public static int getInt() {
		return new Scanner(System.in).nextInt();
	}
	
	public static String getString() {
		return new Scanner(System.in).next();
	}
}