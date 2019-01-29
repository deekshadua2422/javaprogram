class BoxWeightDemo{
	public static void main(String args[]){
		Box b = new Box(3,4,5);
		BoxWeight a = new BoxWeight(65,3,4,5);
		b.DisplayVolume();
		a.DisplayWeight();
	}
}