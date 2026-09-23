package lab8;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;



public class ArtistList extends RefUnsortedList<Artist>{

	public void fromFile (String fileName) {
		
			
		InputStream file = ArtistList.class.getResourceAsStream(fileName);
			if (file == null) {
				System.out.println("Please enter a vaild file");
				return;
				}
			InputStreamReader reader = new InputStreamReader(file, StandardCharsets.UTF_8);
			Scanner scanner = new Scanner(reader);
			if (scanner.hasNextLine()) {
				scanner.nextLine();
				}
	        while (scanner.hasNextLine()) {
	        	String temp = scanner.nextLine(); 
		        this.add(new Artist(temp));
		            
		                  
		        }
		        scanner.close();
		        
			}
	public ArtistList findNameContains (String name) {
		ArtistList toReturn = new ArtistList ();
		reset();
		for (int i=0;i<numElements;i++) {
			Artist a = getNext();
			if(a.getName().contains(name)) {
				toReturn.add(a);
			}
		
		}
		
		return toReturn;
	}
	public ArtistList findNameContains (String name, int min) {
		ArtistList toReturn = new ArtistList ();
		reset();
		for (int i=0;i<numElements;i++) {
			Artist a = getNext();
			if(a.getName().contains(name) && a.getFollowers() >= min) {
				toReturn.add(a);
			}
		
		}
		
		return toReturn;
	}
	public void clear () {
		reset();
		while (numElements>0) {
			this.remove(getNext());
		}
	}
	}

