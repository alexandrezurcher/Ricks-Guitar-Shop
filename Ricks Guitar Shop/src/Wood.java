
public enum Wood {
	MAHOGANY, INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, CEDAR;
	private String wood;
	
	public String toString() {
		switch(this) {
		case MAHOGANY:
			wood = "MAHOGANY";
			break;
		case INDIAN_ROSEWOOD:
			wood = "INDIAN_ROSEWOOD";
			break;
		case BRAZILIAN_ROSEWOOD:
			wood = "BRAZILIAN_ROSEWOOD";
			break;
		case CEDAR:
			wood = "CEDAR";
			break;
		default: ;
		break;
		}
		return wood;
	}
	
}
