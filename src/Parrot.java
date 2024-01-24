public class Parrot {

	//static
	public static void say() {
		System.out.println("Кар!");
	}

	public static String TYPE = "Попугай";


	//не static
	private String name;

	public Parrot(String parrotName) {
		this.name = parrotName;
	}

	public void sayName() {
		System.out.println("Меня зовут " + this.name + ". Вид: " + Parrot.TYPE);   //static поле из non-static метода
	}

}
