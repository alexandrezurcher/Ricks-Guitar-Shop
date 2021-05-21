
public enum Type {
	ACOUSTIC, ELECTRIC;
	private String type;

	public String toString() {
		switch(this) {
			case ACOUSTIC:
				type = "acoustic";
			break;
			case ELECTRIC:
				type =  "electric";
			break;	
			default: ;
			break;	
		}
		return type;
	}
} 
