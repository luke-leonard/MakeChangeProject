import java.util.Scanner;

public class MakeChange {
	// F I E L D S -----------------------------------------------------------------
	public static Scanner input;
	//Create an array that holds all the currency names and values. this is all that is required to add a new currency to the list
	public static final Denomination[] denominations = { new Denomination("One-Hundred", 100_00),
			new Denomination("Fifty", 50_00), new Denomination("Twenty", 20_00), new Denomination("Ten", 10_00),
			new Denomination("Five", 5_00), new Denomination("One", 1_00), new Denomination("Quarter", 25),
			new Denomination("Dime", 10), new Denomination("Nickel", 5), new Denomination("Penny", 1) };

	// M E T H O D S ---------------------------------------------------------------
	public static void main(String[] args) {
		input = new Scanner((System.in));

		//User input: This takes in a double and casts it to an int for easier handling
		System.out.print("Enter cost:");
		double costAsDouble = input.nextDouble();
		int costInCents = (int) (costAsDouble * 100);

		//User input: This takes in a double and casts it to an int for easier handling
		System.out.print("Amount Paid:");
		double valueAsDouble = input.nextDouble();
		int valueInCents = (int) (valueAsDouble * 100);

		// determine the change required
		int moneyBack = valueInCents - costInCents;

		//determine what to do given any amount of change
		if (moneyBack == 0) {
			System.out.println("Wow, perfect change!");
		} else if (moneyBack < 0) {
			System.out.println("Not enough money!!!!!");
		} else {
			//print the change due in a common format
			System.out.printf("Change Due: $%d.%02d \n", moneyBack / 100, moneyBack % 100);

			//Iterate through the list off denominations, largest to smallest and outputing if they are divisible
			for (int i = 0; i < denominations.length; i++) {
				int numberOfCoins = moneyBack / denominations[i].m_ValueInCents;
				denominations[i].print(numberOfCoins);
				moneyBack %= denominations[i].m_ValueInCents;
			}

		}

		input.close();
	}
}
