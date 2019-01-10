class program4{
	public static void main(String args[]){
		long minutes = 4555222;
		float year = minutes/525600f;
		float months = minutes/43800f;
		float days = minutes/1440f;
		System.out.println("Total no. of years are:" +year);
		System.out.println("Total no. of months are:" +months);
		System.out.println("Total no. of days are:" +days);
	}
}
