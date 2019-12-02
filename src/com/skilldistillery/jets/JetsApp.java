package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
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

public List<Jets> parseFile(String fileName) {
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
			System.out.println("Welcome to the Jets, please select a menu number: ");
			System.out.println("1 : List fleet ");
			System.out.println("2 : Fly all jets ");
			System.out.println("3 : View fastest jet ");
			System.out.println("4 : View jet with longest range");
//			System.out.println("5 : Load all Cargo Jets ");
//			System.out.println("6 : Dogfight! ");
			System.out.println("7 : Add a jet to Fleet ");
//			System.out.println("8 : Remove a jet from Fleet ");
			System.out.println("9 : Quit ");

			int opt = sc.nextInt();

			if (opt == 1) {
				for (Jets jet : jets) {
					System.out.println(jet);
				}
			}
			if (opt == 2) {
				airTime();
			}
			if (opt == 3) {
				fastest();
			}
			if (opt == 4) {
				longest();
			}
			if (opt == 5) {
			}
			if (opt == 6) {

			}
			if (opt == 7) {
				addJet(jets);
			}
			if (opt == 8) {

			}
			if (opt == 9) {
				System.out.println("Thanks for flying on air catastrophe!");
				break;
			}

		}
	}

	public void airTime() {
		for (Jets jet : jets) {
			int ft = (int) (jet.getRange() / (jet.getSpeed() * 714));
			System.out.println(jet + "can fly for: " + ft + " hours.");
		}
	}

	public Jets fastest() {
		Jets fjet = jets.get(0);
		for (Jets jet : jets) {
			if (jet.getSpeed() > fjet.getSpeed()) {
				fjet = jet;
			}
		}
		System.out.println("The fastest jet has a top speed of Mach: " + fjet.getSpeed());
		System.out.println(fjet.toString());
		return fjet;
	}

	public Jets longest() {
		Jets rjet = jets.get(0);
		for (Jets jet : jets) {
			if (jet.getRange() > rjet.getRange()) {
				rjet = jet;
			}
		}
		System.out.println("The longest ranged jet can travel a distance of: " + rjet.getRange() + " miles.");
		System.out.println(rjet.toString());
		return rjet;
	}

	public void addJet(List<Jets> jets) {
		JetImpl newJet;
//		input.nextLine();
		while (true) {
			try {
				System.out.println("Please enter a model");
				String mod = sc.next();
				System.out.println("Please enter a speed");
				double spe = sc.nextDouble();
				System.out.println("Please enter a range");
				int ran = sc.nextInt();
				System.out.println("Please enter a price");
				long pri = sc.nextLong();

				newJet = new JetImpl(mod, spe, ran, pri);
				break;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Please enter valid parameters");
				continue;
			}
		}jets.add(newJet);
	}

	private void launch() {

	}
}
