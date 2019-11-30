package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class JetsApp {

//	private AirField airField;
	
	public JetsApp() {
		
	}
	public static void main(String[] args) {
//		JetsApp ja = new JetsApp();
		JetsApp ja = new JetsApp();
		Scanner sc = new Scanner(System.in);
		ja.launch();
		ja.displayUserMenu();
		
		
		List<Jets> jets = ja.parseFile("jets.txt");
		for (Jets jet : jets) {
			System.out.println(jet);
		}

	}
	private void displayUserMenu() {
		
	}
	private void launch() {
		
	}


	List<Jets> parseFile(String fileName) {
		List<Jets> jets = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine(); // Read and discard header line
			// id, name color breed age gender comments
			while ((line = br.readLine()) != null) {
				// Split each line into fields,
				// use the fields to construct a Pet object and add it to the list
				// Fields are separated by a tab that's optionally preceded by a comma.

				String[] fields = line.split(", ");
				Jets jet = new Jets(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]),
						Long.parseLong(fields[3])) {
				};
//        
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
}
