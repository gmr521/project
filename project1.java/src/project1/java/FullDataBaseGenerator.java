package project1.java;

import java.awt.*;
//import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;


public class FullDataBaseGenerator
{

	// Method that takes a String (from the film time cb)
	// And returns a String of the name of the text file it belongs to
	public static String returnFileName(String input)

	{
		
	}




	//Method to Create a blank database of all the seats available
	public ArrayList<Integer> seatNumberCalculate()
	{
		// Variables to values for each block of seats
		int A = 0;
		int B = 0;
		int C  = 0;

		// ArrayList to hold the values
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Add zero at the start of the array to act as a defauilt value for the cbs
		al.add(0);

		// Calculate the seatnumbers and add them into the array
		for (int i=0; i < 36; i++)
		{
			A = 101+i;
			al.add(A);
		}
		for (int i = 0; i < 40; i++)
		{
			B = 201+i;
			al.add(B);
		}
		for (int i = 0; i < 36; i++)
		{
			C = 301+i;
			al.add(C);
		}

		return al;
	}



	// Method that generates a fresh database
	public void FullDataBaseGeneration(String file_name)
	{
		// Name of database (calculated by 'returnFileName' method)
		String name = file_name;

		// Get ArrayList cointaining values for every seat
		ArrayList <Integer> input = seatNumberCalculate();

		// Name of database
		String selectedTime = returnFileName(name);

		File selectedTimeFile = new File(selectedTime);

		try{
		// if the file exists, do not create a new file (leave existing file alone)
		if (selectedTimeFile.exists() == true)
		{
			return;
		}
		}catch (Exception ex){
		System.err.println(ex.getMessage());
		}

		// if the file doesnt exist..
		try{

			// create a new file with the correct name
			selectedTimeFile.createNewFile();

			// Start dependencies for file reading
			FileInputStream fs = new FileInputStream(selectedTimeFile.toString());
			DataInputStream in = new DataInputStream(fs);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			//Start dependancy for file writing
			String stringLine;
			BufferedWriter fw1 = new BufferedWriter(new FileWriter(selectedTime));

			// Write a ; to the file (this is needed to add some content to replace)
			fw1.write(";");
			// Close this write dependancy
			fw1.close();

			// While there are Lines left to be read
		  	while ((stringLine = br.readLine()) != null)
		  	{
				// Create dependencies for writing to same file
				BufferedWriter fw = new BufferedWriter(new FileWriter(selectedTime));
				int x=0;
				// Iterate through the new edited array (orginal array minus selected seat)
				while(x < input.size())
				{
					// Rewrite every line of the text file with each entry in the new array
					String line = input.get(x).toString();
					fw.write(line + ";");
					x++;
				}
				//Close the file writing dependency
				fw.close();
			}

			}catch (Exception ex){
	  				System.err.println(ex.getMessage());}

	}



		// Method for returning an array of the available seats, for passing into the Main class
		public static ArrayList<Integer> AvailableSeatsArrayReturn(String file_name)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();

			String name = file_name;
			String selectedTime = returnFileName(name);
			File selectedTimeFile = new File(selectedTime);



			if (selectedTimeFile.exists())
			{

				try{

	 			FileInputStream fs = new FileInputStream(selectedTimeFile.toString());
	  			DataInputStream in = new DataInputStream(fs);
	  			BufferedReader br = new BufferedReader(new InputStreamReader(in));
	  			String stringLine;

	  			while ((stringLine = br.readLine()) != null)
	  			{
	  				String[] array = stringLine.split(";");

					// For every object in the array, built from items in the text file
	  				for (int i=0; i < array.length; i++)
	  				{
						// Convert the item to an integer
		  				Integer num = Integer.parseInt(array[i]);

		  				// Add Item to arraylist to be rerturned
		  				temp.add(num);
	  				}
	  			}

	  			in.close();

	    			}catch (Exception ex){System.err.println(ex.getMessage());}

			}
			return temp;
		}


}

