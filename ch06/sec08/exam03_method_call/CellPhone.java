package sec08.exam03_method_call;

import java.util.Random;

public class CellPhone {
	private byte batteryLevel;

	public CellPhone(byte batteryLevel) {
		super();
		this.batteryLevel = batteryLevel;
	}

	public byte getBatteryLevel() {
		return batteryLevel;
	}

	public void recharge(byte power) {
		batteryLevel = power;
	}

	public void setBatteryLevel(byte batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public boolean 어플이끝까지실행했나(int appEnergy) {
		if (batteryLevel >= appEnergy) {
			batteryLevel -= appEnergy;
			return true;
		} else {
			batteryLevel = 0;
			return false;
		}
	}

	public static void main(String[] args) {
		CellPhone phone = new CellPhone((byte) 100);
		int totalEnergy = 0;
		while (true) {
			while (phone.getBatteryLevel() > 0) {
				Random rand = new Random();
				int energy = rand.nextInt(20);
				if (phone.어플이끝까지실행했나(energy)) {
					System.out.println("어플소모energy %: " + energy);
					totalEnergy += energy;
					if (totalEnergy == 100) {
						System.out.println("totalEnergy %: " + totalEnergy);
						return;
					}
				} else {
					System.out.println("totalEnergy %: " + totalEnergy);
					System.out.println("요구량 %: " + energy);
					int undone = energy - (100 - totalEnergy);
					System.out.println("미실행%: " + undone);
					System.out.println("잔여 %: " + phone.getBatteryLevel());
					break;
				}
			}
			phone.setBatteryLevel((byte)100);
			totalEnergy = 0;
		}
	}
}
