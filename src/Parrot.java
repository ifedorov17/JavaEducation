public class Parrot {

	//static
	public static void say() {
		System.out.println("���!");
	}

	public static String TYPE = "�������";


	//�� static
	private String name;

	public Parrot(String parrotName) {
		this.name = parrotName;
	}

	public void sayName() {
		Parrot.say();
		System.out.println("���� ����� " + this.name + ". ���: " + Parrot.TYPE);   //static ���� �� non-static ������
	}

}
