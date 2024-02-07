package ru.igor17.example.device;

import ru.igor17.example.powersource.PowerSource;

public class Computer extends Device {   //Computer Is A Device

	private PowerSource powerSource;     //Computer Has A PowerSource

	private String gpuName;
	private String cpuName;


	public Computer(float price, String gpuName, String cpuName, PowerSource powerSource) {
		super(price);
		this.gpuName = gpuName;
		this.cpuName = cpuName;
		this.powerSource = powerSource;
	}

	public String getCpuName() {
		return cpuName;
	}

	public String getGpuName() {
		return gpuName;
	}

	public PowerSource getPowerSource() {
		return powerSource;
	}

}
