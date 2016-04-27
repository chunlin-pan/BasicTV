import java.util.Scanner;

public class BasicTV
{	
	private int Channel;
	private int Volume;
	int l;
		
	public  BasicTV()
	{
		Channel=0;
		Volume=0;
	}
	
	public  BasicTV(int i)
	{
		Channel=i;
		setVolume();
	}
	
	public void setChannel()
	{
		
		System.out.println("whitch channel would you want to see(1¡B2¡B3)");
		Scanner input=new Scanner (System.in);
		l=input.nextInt();
		if (l != 1 && l != 2 && l != 3)
		{
			System.out.println("Wrong number of Channel!");
			return;
		}
		
		Channel=l;
	}
	
	public int getChannel()
	{
		return Channel;
	}

	public void setVolume()
	{
		int k;
		if(l != 1 && l != 2 && l != 3)
		{
			return;
		}
		System.out.println("change volume");
		Scanner input=new Scanner (System.in);
		k=input.nextInt();
		if(k<0)
		{	
			System.out.println("Wrong number of Volume!");
			return;
		}
		Volume=k;
	}
	
	public int getVolume()
	{
		return Volume;
	}
}