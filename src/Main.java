public class Main {

	public static void main(String[] args) {

		Parrot.say();                        //����� static method
		System.out.println(Parrot.TYPE);     //��������� � static ����



		//Parrot.sayName();                    //������� ��������� � non-static ������ ��� ����������

		Parrot kesha = new Parrot("����");
		kesha.sayName();

	}

}
