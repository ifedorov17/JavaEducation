package ru.igor17.abstracts.animal;

public class Dog extends Animal {

	private String breed;

	@Override
	public void voice() {
		System.out.println("���!");
	}

	public void fetch() {
		System.out.println("������ �������� �����");
	}

}
