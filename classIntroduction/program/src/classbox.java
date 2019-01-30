class Box{
	double width;
	double heigth;
	double depth;

	void setDim(int a,int b,int c){
		width=a;
		heigth=b;
		depth=c;
	}

	double volume(){   
		double vol=width*heigth*depth;
		System.out.println("volume");
		return vol;
	}

	Box()
	{
		width=1;
		heigth=1;
		depth=1;
	}

	Box(double w,double h, double d){
		this.width=w;
		this.heigth=h;
		this.depth=d;
	}
	Box(double w, double d){
		width=w;
		heigth=1;
		depth=d;
    }
}