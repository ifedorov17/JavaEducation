public class Main {

	public static void main(String[] args) {

		Parrot.say();                        //вызов static method
		System.out.println(Parrot.TYPE);     //обращение к static полю



		//Parrot.sayName();                    //попытка обратится к non-static методу без экземпляра

		Parrot kesha = new Parrot("Кеша");
		kesha.sayName();

	}

}
