class ABC2 
{	
	int x;
	int y=2;
	ABC2(int a)
	{	x=a;
	}
	public static void main(String[] args)
	{
		ABC2 obj = new ABC2(10);
		System.out.println(obj.x+obj.y+10);
	}
}