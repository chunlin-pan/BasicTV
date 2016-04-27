import java.util.Scanner;

public class TestTV
{
	public static void main(String argv[])
	{	boolean i=true;
		int g;
		while(i==true)
		{
			System.out.println("輸入\n 1->discovery channel\n 2->MTV channel\n 3->HBO channel\n 輸入0則跳出");			
			Scanner set=new Scanner (System.in);
			g=set.nextInt();
			switch (g)
			{
			case 0:
				return;
			case 1:
				{
					Channel1 discovery = new Channel1();
					System.out.println("Channel:"+discovery.getChannel()+"\n");
					break;
				}
			case 2:
				{
					Channel2 MTV = new Channel2();
					System.out.println("Channel:"+MTV.getChannel()+"\n");
					break;
				}
			case 3:
				{
					Channel3 HBO = new Channel3();
					System.out.println("Channel:"+HBO.getChannel()+"\n");
					break;
				}
			default:
					System.out.println("error");
				}
		}
	}
}