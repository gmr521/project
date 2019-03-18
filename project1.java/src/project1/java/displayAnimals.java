package project1.java;


public class displayAnimals {
	public static void displayAnimals(Animal[] arr) {

		System.out.println("the array is " + arr);


		if (arr != null) {

			for (int i = 0; i < arr.length; i++) {

				System.out.println(arr[i]);

			}

		} else {

			System.out.println("no objects to be displayed");

		}


	}


}
