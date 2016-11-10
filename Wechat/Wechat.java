package Wechat;
import java.util.Scanner;
import Back.BackUnit;
import Log.LogUnit;
public class Wechat 
{
	private int t;
	private String Username="YourName";
	private boolean Loginvalue;
	{
		t=0;
		Loginvalue=false;
	}
	private void Set_Loginvalue(boolean Loginvalue) 
	{
		this.Loginvalue=Loginvalue;
	}
	private void Startprinter()
	{
		System.out.println("                              Welcome to Wechat Phone Book System");
		System.out.println("                                                                                               by zhoujunjie");
	}
	private void Clear()
	{
		for(int j=0;j<45;j++)
			System.out.println("");


	}
	private String HeadDeal(String value)
	{
		int i=0;
		String valueS=null;
		char[] valuechar=new char[100];
		char[] instead=new char[100];
		valuechar=value.toCharArray();
		while(i<=valuechar.length)
		{	
			if(valuechar[i]==' ')
			{
				for(int j=0;j<i;j++)
				{
					instead[j]=valuechar[j];
				}
				valueS=String.valueOf(instead);
				valueS=valueS.trim();
				break;
			}
			i++;
		}
		return valueS;
	}
	private void Help()
	{
		System.out.println("Usages:");
		System.out.println("  [option] -[args...]");
		System.out.println("其中选项包括:");
		System.out.println("  create -u <您的姓名> -p <您的密码> -c <确认密码> -s <男|女> -t <你的电话> ");
		System.out.println("  login -u <您的姓名或电话> -p <您的密码> " );
		System.out.println("  log -u （您需要添加的好友）<姓名> -t <电话> -r <备注> 提示：(必须在登入成功之后可选)");
		System.out.println("  delete -u （您需要删除的好友）<姓名> 提示：(必须在登入成功之后可选)");
		System.out.println("  read  (获取您添加的好友信息)  提示：(必须在登入成功之后可选)");
		System.out.println("  help  (获取帮助菜单)");
		System.out.println("  clear  ");
		System.out.println("  quit");
		System.out.println("\n");
		System.out.println("例子:");
		System.out.println("  Create >eg."+"\n"+"create -u zhoujunjie -p 123456 -c 123456 -s 男 -t 18007948148");
		System.out.println("  Login >eg."+"\n"+"login -u zhoujunjie -p 123456");
		System.out.println("  Log >eg."+"\n"+"log -u zhoujunjie -t 18007948148 -r 帅哥");
		System.out.println("  Delete >eg."+"\n"+"delete -u zhoujunjie");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	
	public String InputValue()
	{	
		String instead;
		String value=null;
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\n");
		if(t==0)
		{
			Startprinter();
			t=1;
		}
		while(true)
		{
			System.out.print(Username.trim()+"@Menghui:$^");
			value=sc.next();
			value=value.substring(0,value.length()-1);
			instead=HeadDeal((value+" "));
			if(instead.equals("help"))
			{
				Help();
				continue;
			}
			else if(instead.equals("clear"))
			{
				Clear();
				continue;
			}
			else if(instead.equals(""))
				continue;
			else if(instead.equals("create")||instead.equals("login")||instead.equals("log")||instead.equals("read")||instead.equals("delete"))
				break;
			else 
				System.out.println("读取您输入的信息失败，请重新输入");

		}
		return (value+" ");
	}
	public void ValueDeal(BackUnit back)
	{	
		if(back.option.equals("login"))
		{
			if(back.check)
			{
				//Loginvalue=back.button;
				System.out.println("登入成功");
				Hostname(back.Username);
				
			}
			else 
				System.out.println("登入失败");
		}
		else if(back.option.equals("create"))
		{
			if(back.check)
			{
				System.out.println("创建成功");

			}
			else
				System.out.println("创建失败");
		}
		else if(back.option.equals("help"))
		{
			Help();
		}
		else if(back.option.equals("log"))
		{
			if(back.check)
			{
				System.out.println("添加成功");

			}
			else
				System.out.println("添加失败");
		}
		else if(back.option.equals("delete"))
		{
			if(back.check)
			{
				System.out.println("删除成功");

			}
			else
				System.out.println("删除失败");
		}
		else if(back.option.equals("read"))
		{
			if(back.check)
			{
				read(back);

			}
			else
				System.out.println("读取失败");
		}
		else 
			System.out.println("读取您输入的信息失败");
	}
	private void read(BackUnit back)
	{
		
			LogUnit logorigin;
			int i=1;
			logorigin=back.logorigin.right;
			System.out.println("   好友姓名          好友电话          好友备注");
		try
		{
			while(logorigin.right!=null)
			{
				System.out.print(i+"   ");
				System.out.print(logorigin.Username.trim()+"          ");
				System.out.print(logorigin.Telephone.trim()+"          ");
				System.out.println(logorigin.Remark.trim());
				logorigin=logorigin.right;
				i++;
			}
			if(logorigin.right==null)
			{
				System.out.print(i+"   ");
				System.out.print(logorigin.Username.trim()+"          ");
				System.out.print(logorigin.Telephone.trim()+"          ");
				System.out.println(logorigin.Remark.trim());
			}
		}
		catch(Exception e)
		{
			;
		}

	}
	
	private void Hostname(String Username)
	{
		this.Username=Username;
		//System.out.print(this.Username.trim()+"@Menghui:$^");	
	}
	
	
}
