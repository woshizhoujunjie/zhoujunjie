package Wechat;
import Base.BaseUnit;
import Back.BackUnit;
public class Conduct 
{
	private boolean button=false;
	public BaseUnit ValueDeal(BaseUnit base)
	{	
		if(button)
		{
			if(base.option.equals("log"))
			{
				return log(base);
			}
		
			else if(base.option.equals("delete"))
			{
				return delete(base);
			}
			else if(base.option.equals("read"))
			{
				return read(base);
			}
			
		}

		
		return base;
	}
	
	public BackUnit ValueDeal(BackUnit back)
	{
		if(back.button)
		{
			button=true;
		}
		return back;
	}
	private BaseUnit delete(BaseUnit base)
	{
		int i,t=1;
		String valueS;
		int blackspace1=0,blackspace2=0;
		char[] instead=new char[100];
		char[] valuechar=new char[base.PasswordCheck.length()];
		i=base.option.length()+3;
		//System.out.println(i);
		
		valuechar=base.PasswordCheck.toCharArray();
		while (i<valuechar.length)
		{
			if(valuechar[i]==' ')
			{
				t++;
				if(t%2==0)
				{
					blackspace1=i;
					
				}
				else
				{
					blackspace2=i;
					for(int j=0;j<blackspace2-blackspace1-1;j++)
					{
						instead[j]=valuechar[blackspace1+j+1];
					}
					valueS=String.valueOf(instead);
					base.Username=valueS;
					break;
				}
			}
			i++;
		}
		base.check=true;
		return base;
	}
	private BaseUnit read(BaseUnit base)
	{
		base.check=true;
		return base;
	}
	private BaseUnit log(BaseUnit base)
	{
		int i,t=1;
		String valueS;
		int blackspace1=0,blackspace2=0;
		char[] instead=new char[100];
		char[] valuechar=new char[base.PasswordCheck.length()];
		i=base.option.length()+3;
		//System.out.println(i);
		valuechar=base.PasswordCheck.toCharArray();
		while (i<valuechar.length)
		{
			if(valuechar[i]==' ')
			{
				t++;
				if(t%2==0)
				{
					blackspace1=i;
					
				}
				else
				{
					blackspace2=i;
					for(int j=0;j<blackspace2-blackspace1-1;j++)
					{
						instead[j]=valuechar[blackspace1+j+1];
					}
					valueS=String.valueOf(instead);
					base.Username=valueS;
					break;
				}
			}
			i++;
		}
		i++;
		for(int j=0;j<blackspace2-blackspace1-1;j++)
		{
			instead[j]=' ';
		}
		while (i<valuechar.length)
		{
			if(valuechar[i]==' ')
			{
				t++;
				if(t%2==0)
				{
					blackspace1=i;
					
				}
				else
				{
					
					blackspace2=i;
					for(int j=0;j<blackspace2-blackspace1-1;j++)
					{
						instead[j]=valuechar[blackspace1+j+1];
					}
					valueS=String.valueOf(instead);
					base.Telephone=valueS;
					break;
				}
				
			}
			i++;
		}
		i++;
		for(int j=0;j<blackspace2-blackspace1-1;j++)
		{
			instead[j]=' ';
		}
		while (i<valuechar.length)
		{
			if(valuechar[i]==' ')
			{
				t++;

				if(t%2==0)
				{
					blackspace1=i;
					
				}
				

				else
				{
					blackspace2=i;
					for(int j=0;j<blackspace2-blackspace1-1;j++)
					{
						instead[j]=valuechar[blackspace1+j+1];
					}
					valueS=String.valueOf(instead);
					base.Remark=valueS;
					break;
				}
			}
			i++;
		}
		base.check=true;
		return base;
	}

	/*public static void main(String[] args) 
	{

		Conduct l=new Conduct();
		BaseUnit base=new BaseUnit();
		BackUnit back=new BackUnit();
		l.button=true;
		//base.Username="zhoujunjie ";
		base.PasswordCheck="log -u zhoujunjie -t 18007948148 -r Ë§¸ç ";
		base.option="log";
		//base.Telephone="18007948148";
		//base.Remark="hello world";
		base=l.ValueDeal(base);
		System.out.println(base.Remark);
	}
*/
	

}

