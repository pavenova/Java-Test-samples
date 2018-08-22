package test.main.stackoverflow.enums;

public enum CardsEnumWithProps {
	HEARTS("H"),
    SPADES("S"),
    DIAMONDS("D"),
    CLUBS("C");
	
	private String stringSign;
	
	
	private CardsEnumWithProps(String strSign) {
		this.stringSign = strSign;	//stringSign = strSign
	
	}
	
	public String getStr() {
		return this.stringSign;
	}
	
}
