import java.util.Scanner;

public class Channel
{
	public static void main(String argv[])
	{	boolean i=true;
		int g;
		while(i==true)
		{
			System.out.println("���N��J�i�J��x�A��J1�h���X");			
			Scanner set=new Scanner (System.in);
			g=set.nextInt();
			if (g==1)
			{
				break;
			}
			BasicTV lion = new BasicTV();
			System.out.println("Channel:"+lion.getChannel()+" "+"volume:" +lion.getVolume());
			
		}
	}
}