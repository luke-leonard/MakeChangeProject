
public class Denomination {
	public String m_Name;
	public int m_ValueInCents;

	Denomination(String name, int valueInCents) {
		m_Name = name;
		m_ValueInCents = valueInCents;
	}

	public void print(int number) {
		System.out.print(toString(number));
	}
	
	public String toString() {
		return toString(1);
	}

	public String toString(int numberOfCoins) {
		switch (numberOfCoins) {
			case 0:
				return "";
			case 1:
				return "\t" + numberOfCoins + " " + m_Name + "\n";
			default:
				String tempName = (m_Name.charAt(m_Name.length()-1) == 'y')?
						m_Name.substring(0,m_Name.length()-1) + "ies":m_Name + "s";
							;
				return "\t" + numberOfCoins + " " + tempName + "\n";
		}

	}

}
