
public class Denomination {
	// F I E L D S -----------------------------------------------------------------
	public String m_Name;
	public int m_ValueInCents;

	// M E T H O D S ---------------------------------------------------------------
	// create a constructer that takes in a name and a value
	Denomination(String name, int valueInCents) {
		m_Name = name;
		m_ValueInCents = valueInCents;
	}

	//create a print function simply to make the call easier.
	public void print(int number) {
		System.out.print(toString(number));
	}

	//create a default to string function
	public String toString() {
		return toString(1);
	}

	// Create a to string method that takes in a number of coins
	//
	// This method is a large way to simplify the printing process.
	// Instead of having many if checks in code for if I should or shouldn't print something,
	// this code takes in a number of coins and outputs something or nothing or the plural form
	// depending on how many coins are being returned.
	// It is pretty simple, it just checks if there is 'y' at the end and if so switches it for 'ies'
	// otherwise it tacks an 's' on the end
	// I'm sure there are some names that would break this but it works for all the purposes i need it to.
	public String toString(int numberOfCoins) {
		switch (numberOfCoins) {
			case 0:
				return "";
			case 1:
				return "\t" + numberOfCoins + " " + m_Name + "\n";
			default:
				String tempName = (m_Name.charAt(m_Name.length() - 1) == 'y')
						? m_Name.substring(0, m_Name.length() - 1) + "ies"
						: m_Name + "s";
				return "\t" + numberOfCoins + " " + tempName + "\n";
		}

	}

}
