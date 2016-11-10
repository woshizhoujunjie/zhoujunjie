package Wechat;
import Base.BaseUnit;
import Back.BackUnit;
import Log.LogUnit;
public class ConductBuffer 
{
	private String preclient;
	private int bufferseatsum=0;
	//private BaseUnit[] buffer=new BaseUnit[100];
	private BaseUnit origin=new BaseUnit();
	
	private BaseUnit bufferseat;
	private LogUnit logseat;
	{
		bufferseat=origin;
		//logseat=logorigin;
		//origin.right=logorigin;
	}

	public BackUnit ValueDeal(BaseUnit base)
	{
		BackUnit back=new BackUnit();
		back.option=base.option;
		if(back.option.equals("create"))
		{
			return create(back,base);	
		}	
		else if(back.option.equals("login"))
		{
			return login(back,base);
		}
		else if(back.option.equals("log")&&base.check)
		{
			return log(back,base);
		}
		else if(back.option.equals("delete")&&base.check)
		{
			return delete(back,base);
		}
		else if(back.option.equals("read")&&base.check)
		{
			return read(back,base);
		}
		return back;
	}
	private BackUnit read(BackUnit back,BaseUnit base)
	{
		try
		{
			BaseUnit instead;
			instead=origin.next;
			for(int j=0;j<bufferseatsum;j++)
			{
				if(instead.Username.equals(preclient))
				{
					break;
				}
				else
					instead=instead.next;
			}
			back.check=true;
			back.logorigin=instead.right;
			return back;
		}
		catch(Exception e)
		{
			return back;
		}
	}
	private BackUnit delete(BackUnit back,BaseUnit base)
	{
		BaseUnit instead;
		LogUnit instead1;
		LogUnit leftinstead1;
		instead=origin.next;
		for(int j=0;j<bufferseatsum;j++)
		{
			if(instead.Username.equals(preclient))
			{
				break;
			}
			else
				instead=instead.next;
		
		}
		instead1=instead.right;
		leftinstead1=instead1;
		do
		{
			
			try	
			{
				if(instead1.Username.equals(base.Username))
				{
					if(instead1!=logseat)
					{
						leftinstead1.right=instead1.right;
					}
					else
					{
						leftinstead1.right=null;
						logseat=leftinstead1;
					}
					back.check=true;
					break;
				}
				
				leftinstead1=instead1;
				instead1=instead1.right;
			}
			catch(Exception e)
			{
				
				break;
			}
			
			
		}while(true);
		return back;
	}
	private BackUnit log(BackUnit back,BaseUnit base)
	{
/*		BaseUnit instead;
		instead=origin.next;
		for(int j=0;j<bufferseatsum;j++)
		{
			if(instead.Username.equals(preclient))
			{
			
				break;
			}
			else
				instead=instead.next;
		
		}
		*/
		LogUnit l=new LogUnit();
		l.Username=base.Username;
		l.Telephone=base.Telephone;
		l.Remark=base.Remark;
		logseat.right=l;
		logseat=l;
		back.check=true;
		return back;

	}

	private BackUnit create(BackUnit back,BaseUnit base)
	{
		LogUnit logorigin=new LogUnit();
		logorigin.Username="@@";
		if(true)
		{
			BaseUnit l=new BaseUnit();
			l=base;
			l.right=logorigin;
			bufferseat.next=l;
			bufferseat=l;
		}
		/*buffer[bufferseat]=new BaseUnit();
		buffer[bufferseat]=base;*/
		bufferseatsum++;
		back.check=true;
		return back;
	}
	private BackUnit login(BackUnit back,BaseUnit base)
	{
		//BackUnit back=new BackUnit();
		BaseUnit instead;
		instead=origin.next;
		for(int j=0;j<bufferseatsum;j++)
		{
			if(instead.Username.equals(base.Username)||instead.Telephone.equals(base.Username))
			{
				if(instead.Password.equals(base.Password))
				{
					back.Username=instead.Username;
					preclient=instead.Username;
					logseat=instead.right;
					back.button=true;
					back.check=true;
				}
				
			}
			
			instead=instead.next;
		}
	
		
	//	System.out.println("qq");
		return back ;
	}

	/*public static void main(String[] args) 
	{
		ConductBuffer l=new ConductBuffer();
		BaseUnit base=new BaseUnit();
		BackUnit back=new BackUnit();
		base.Username="zhoujunjie";
		base.Password="123456";
		base.Telephone="18007948148";
		base.Remark="hello world";
		BaseUnit base1=new BaseUnit();
		base1.Username="duzhiyao";
		base1.Password="123456";
		base1.Telephone="18007948148";
		base1.Remark="hello good";
		BaseUnit base2=new BaseUnit();
		base2.Username="zhujiehao";
		base2.Password="123456";
		base2.Telephone="18007948148";
		base2.Remark="hello good";
		l.create(back,base);
		l.create(back,base1);
		//l.create(back,base);
		l.login(back,base1);
		l.log(back,base);
		l.log(back,base1);
		l.login(back,base);
		l.log(back,base2);
		l.log(back,base);
		l.login(back,base1);
		//l.log(back,base);
//		l.delete(back,base1);
		//l.log(back,base1);
		back=l.read(back,base1);
		System.out.println(back.logorigin.right.right.Username);
	}

	*/
}
