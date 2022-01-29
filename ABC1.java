class ABC1 
{	
	int x;
	int y;
	ABC1(int a)
	{	x=5;
	}
	public static void main(String[] args)
	{
		ABC1 obj = new ABC1();
		System.out.println(obj.x+obj.y+10);
	}
}