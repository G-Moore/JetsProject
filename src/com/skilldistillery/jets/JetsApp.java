package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsApp {

	Scanner sc = new Scanner(System.in);
	List<Jets> jets = parseFile("jets.txt");

	public JetsApp() {

	}

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.displayUserMenu();
		ja.launch();
	}

	List<Jets> parseFile(String fileName) {
		List<Jets> jets = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();

			while ((line = br.readLine()) != null) {

				String[] fields = line.split(", ");
				Jets jet = new Jets(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]),
						Long.parseLong(fields[3])) {
				};

				jets.add(jet);
				System.out.println("Craft is a " + fields[0] + "that goes mach: " + fields[1]);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jets;
	}

	private void displayUserMenu() {
		while (true) {
			System.out.println("1 : List fleet: ");
			System.out.println("2 : Fly all jets: ");
			System.out.println("3 : View fastest jet: ");
			System.out.println("4 : View jet with longest range");
			System.out.println("5 : Load all Cargo Jets: ");
			System.out.println("6 : Dogfight!: ");
			System.out.println("7 : Add a jet to Fleet: ");
			System.out.println("8 : Remove a jet from Fleet: ");
			System.out.println("9 : Quit: ");

			int opt = sc.nextInt();

			if (opt == 1) {
				for (Jets jet : jets) {
					System.out.println(jet);
				}
			}
			if (opt == 2) {

			}
			if (opt == 3) {
				for (Jets jet : jets) {
					System.out.println(jet.getSpeed());
					for (int i = 0; i < 4; i++) {
						double hiRate = jet.getSpeed();
						if (hiRate < jet.getSpeed()) {
							hiRate = jet.getSpeed();
//								System.out.println(jet.getSpeed());
						}
					}
				}

			}
			if (opt == 4) {
				for (Jets jet : jets) {
					System.out.println(jet.getRange());
				}
			}
			if (opt == 5) {

			}
			if (opt == 6) {

			}
			if (opt == 7) {

			}
			if (opt == 8) {

			}
			if (opt == 9) {
				System.out.println("Thanks for flying on air catastrophe!");
				break;
			}

		}
//		sc.close();
	}

	private void launch() {

	}

//	List<Jets> parseFile(String fileName) {
//		List<Jets> jets = new ArrayList<>();
//		try {
//			BufferedReader br = new BufferedReader(new FileReader(fileName));
//			String line = br.readLine();
//
//			while ((line = br.readLine()) != null) {
//
//				String[] fields = line.split(", ");
//				Jets jet = new Jets(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]),
//						Long.parseLong(fields[3])) {
//				};
//
//				jets.add(jet);
//				System.out.println("Craft is a " + fields[0] + "that goes mach: " + fields[1]);
//			}
//			br.close();
//			sc.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return jets;
//	}
}
