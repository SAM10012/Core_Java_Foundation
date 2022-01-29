class XYZ 
{
	int x=1;
	int y=2;
	void multiply()
	{
		y=y*2;
	}
	public static void main(String[] args)
	{
		XYZ obj1 = new XYZ();
		XYZ obj2,obj3;
		obj2 = obj1;
		obj2.multiply();
		obj1.multiply();
		obj3=obj2;
		for(int i=0;i<3;i++)
		{
			obj3.multiply();
		}
		obj2.y = obj1.y + obj2.x;
		System.out.println(obj3.y);
	}
}