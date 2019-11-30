package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {

	private List<Jets> jets = new ArrayList<>();
	
	public AirField() {
//		jets = new ArrayList<>();
		
		AirField af = new AirField();
		List<Jets> jets = af.parseFile("jets.txt");
//		for (Jets jet : jets) {
//			System.out.println(jet);
//		}

	}
	public List<Jets> parseFile(String fileName) {
		List<Jets> jets = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine(); // Read and discard header line
			// id, name color breed age gender comments
			while ((line = br.readLine()) != null) {

				String[] fields = line.split(", ");
				Jets jet = new Jets(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]),
						Long.parseLong(fields[3])) {
				};
//        
				jets.add(jet);
				System.out.println();

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
//	BufferedReader bufReader = new BufferedReader(new 
//			FileReader("jets.txt"));
//			LArrayList<String> listOfLines = new ArrayList<>);
//			String line = bufReader.readLine(); while (line != null)
//			{
//			    listOfLines.add(line);
//			    line = bufReader.readLine();
//			} 
//			bufReader.close();

