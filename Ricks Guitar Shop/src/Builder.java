
public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS;
	private String builder;
	
	public String toString() {
		switch(this) {
			case FENDER:
				builder = "FENDER";
				break;
			case MARTIN:
				builder = "MARTIN";
				break;
			case GIBSON:
				builder = "GIBSON";
				break;
			case COLLINGS:
				builder = "COLLINGS";
				break;
			default: ;
			break;
		}
		return builder;
		
	}
} 
