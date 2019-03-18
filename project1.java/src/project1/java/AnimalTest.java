package project1.java;

import java.util.*;


public class AnimalTest {


	public static void main(String[] args) {

		// TODO Auto-generated method stub


		Scanner s = new Scanner(System.in);

		Animal arr[] = null;


		while (true) {

			System.out.println("Please enter 1 for new objects \n"

					+ "2 for displaying \n" + "3 for exit ");


			int option = s.nextInt();


			switch (option) {

			case 1:

				arr=addAnimals(arr);

				break;

			case 2:

				displayAnimals(arr);

				break;

			case 3:

				System.exit(0);

				break;

			default:

				System.out.println("Please enter correct option ");


			}

		}

	}


	public static Animal[] addAnimals(Animal[] arr) {


		Scanner s = new Scanner(System.in);

		System.out.println("please enter the no of objects to be created");

		int count = s.nextInt();


		arr = new Animal[count];


		for (int i = 0; i < count; i++) {

			System.out.println("Please enter animal name ");

			String name = s.next();

			System.out.println("Please enter animal breed ");


			String breed = s.next();

			System.out.println("Please enter animal age ");


			int age = s.nextInt();


			Animal a1 = new Animal();


			System.out.println("Total no of objects =" + Animal.getCount());


			a1.setName(name);

			a1.setAge(age);

			a1.setBreed(breed);


			arr[i] = a1;

			


		}

		return arr;


	}

}


}