package ru.igor17.casting;

import ru.igor17.casting.animal.Animal;
import ru.igor17.casting.animal.Cat;
import ru.igor17.casting.animal.Dog;

public class Main {

	public static void main(String[] args) {

		Animal animal = new Dog();              //UpCasting

		animal.voice();						    //Тип в памяти - Dog
		animal.fetch();                         //compile time error (upcasting is safe)


		Animal another = new Dog();
		Cat cat = (Cat)another;                 //DownCasting (unsafe)
	}

}
