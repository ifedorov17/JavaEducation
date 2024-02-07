package ru.igor17.example.device;

import ru.igor17.example.powersource.PowerSource;

public class Mouse extends Device {   //Mouse Is A Device

	private PowerSource powerSource;  //Mouse Has A PowerSource

	private int dpi;
	private String type;

	public Mouse(float price, int dpi, String type, PowerSource powerSource) {
		super(price);
		this.dpi = dpi;
		this.type = type;
		this.powerSource = powerSource;
	}

	public int getDpi() {
		return dpi;
	}

	public String getType() {
		return type;
	}

	public PowerSource getPowerSource() {
		return powerSource;
	}
}
