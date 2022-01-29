class BSNL
{
	int phone = 312345;
	double getPhone()
	{
		System.out.println("Phone no. received");
		return phone;
	}
	public static void main(String[] args)
	{
		BSNL cus1 = new BSNL();
		System.out.println(cus1.getPhone());
	}
}