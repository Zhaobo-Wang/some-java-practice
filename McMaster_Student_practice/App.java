package lesson_practice;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		String[] names = {"Chris","Jimbo","Evangeline","bob","lyla","jack","clary"};
		
		School McMaster = new School("McMaster");
		
		//Student[] students = McMaster.getStudents();
		
		for (int i = 0; i < McMaster.getStudents().length; i++) {
			
			McMaster.getStudents()[i] = new Student(names[rand.nextInt(names.length)]); 

		}
		
		McMaster.printStudents();
	}

}
