class Demo
{
	int a ;
	int b ;
	Demo(int a, int b ){
		this.a = a;
		this.b = b;
	}

	int sum(){
		return a+b;
	
	}
}
class Test{
	Test(){}
	void sum(Demo d){
		System.out.print("Sum : " +d.sum());
	}
		public static void main (String[] args){
			Demo d = new Demo(7,8);
			Test t = new Test();
			t.sum(d);
		}
	}