package ru.igor17.example;

import ru.igor17.example.device.Computer;
import ru.igor17.example.powersource.PowerSource;

public class Main {

	public static void main(String[] args) {

		PowerSource computerPowerSource = new PowerSource(1000);

		Computer computer = new Computer(
				1500,
				"GeForce RTX 4060Ti",
				"Intel Core i7 13700F",
				computerPowerSource
		);

		System.out.println("CPU: " + computer.getCpuName());                      //calling object method
		System.out.println("Power: " + computer.getPowerSource().getPower());     //calling method of part of object
		System.out.println("Price: " + computer.getPrice());                      //calling parent class method (Computer is a Device!)

	}

}
