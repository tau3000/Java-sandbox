public enum TabType{
	ALL("all"),
	COMPANY("conpany"),
	INDUSTRY("industry");

	private final String type;
	private TabType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}

	public static void showTabType(){
		System.out.println(ALL.getType());
		System.out.println(COMPANY.getType());
		System.out.println(INDUSTRY.getType());
	}
}