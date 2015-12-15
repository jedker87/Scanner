package klawiatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		List<Double> numbers;
		        
		numbers = new ArrayList<>();

		int sum = 0;

		System.out.println("Liczby z klawiatur: ");

		int a = in.nextInt();

		sum = sum + a;

		System.out.println("Wczytana liczba to: " + a);

		System.out.println("Czy to koniec T/N?");
		
		numbers.add(0.0 + a);
		
		String text = in.next();

		System.out.println("Odpowiedz: " + text);

		while (!text.equals("T")) {
			System.out.println("Liczby z klawiatur: ");

			a = in.nextInt();
			sum = sum + a;
			numbers.add(0.0 + a);

			System.out.println("Czy to koniec T/N?");

			text = in.next();
		}
		
		
		System.out.println("Lista liczb: ");
		
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		System.out.println("suma: " + sum);
		
		int aver = sum/numbers.size();
		
		System.out.println("ilosc: " + numbers.size());
		
		System.out.println("Srednia: " + aver);
		
		
	}

        
}
