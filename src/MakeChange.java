import java.util.Scanner;

public class MakeChange {
	public static Scanner input;
	public static final Denomination[] denominations = { new Denomination("One-Hundred", 100_00),
			new Denomination("Fifty", 50_00), new Denomination("Twenty", 20_00), new Denomination("Ten", 10_00),
			new Denomination("Five", 5_00), new Denomination("One", 1_00), new Denomination("Quarter", 25),
			new Denomination("Dime", 10), new Denomination("Nickel", 5), new Denomination("Penny", 1) };

	public static void main(String[] args) {
		input = new Scanner((System.in));

		System.out.print("Enter cost:");
		double costAsDouble = input.nextDouble();
		int costInCents = (int) (costAsDouble * 100);

		System.out.print("Amount Paid:");
		double valueAsDouble = input.nextDouble();
		int valueInCents = (int) (valueAsDouble * 100);

		int moneyBack = valueInCents - costInCents;

		if (moneyBack == 0) {
			System.out.println("Wow, perfect change!");
		} else if (moneyBack < 0) {
			System.out.println("Not enough money!!!!!");
		} else {
			System.out.printf("Change Due: $%d.%02d \n", moneyBack / 100, moneyBack % 100);

			for (int i = 0; i < denominations.length; i++) {
				int numberOfCoins = moneyBack / denominations[i].m_ValueInCents;
				denominations[i].print(numberOfCoins);
				moneyBack %= denominations[i].m_ValueInCents;
			}

		}

		input.close();
	}
}
