package Wechat;
import Base.BaseUnit;
import Back.BackUnit;
public class Console 
{
	/*private String Username;
	private String Password;
	private String Sex;
	private String PasswordCheck;*/
	
	private int i;
	{
		i=0;
	}
	public BackUnit ValueDeal(BackUnit back)
	{
		return back;
	}
	public BaseUnit ValueDeal(String value)
	{
		BaseUnit base=new BaseUnit();
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
		i++;
		base.option=valueS;
		//System.out.println(valueS);
		if(valueS.equals("create"))
		{
			return create(base,valuechar,value);
		}
		else if(valueS.equals("login"))
		{
			return login(base,valuechar,value);
		}
		else
		{
			i=0;
		//	System.out.println(i);
			base.PasswordCheck=value;
			return base;
		}	
	}
	private BaseUnit login(BaseUnit base,char[] valuechar,String value)
	{
		
//		BaseUnit base=new BaseUnit();
		int blanksum=0;
		int blankspacesum=0;
		int blankspace1=0,blankspace2=0;
		String valueS=null,minusvalue=null;
		char[] instead=new char[100];
		//base.option="login";
		for(int j=0;j<value.length();j++)
		{
			if(value.charAt(j)==' ')
				blankspacesum++;
		}
		if(blankspacesum==5)
		{	
			while (i<=valuechar.length)
			{
				
				if(valuechar[i]==' ')
				{
					blanksum++;
					if(blanksum%2!=0)

						blankspace1=i;
					else
					{
						blankspace2=i;
						//System.out.println(blankspace2);
						for(int j=0;j<blankspace2-blankspace1-1;j++)
						{
							instead[j]=valuechar[blankspace1+1+j];
						}
						valueS=String.valueOf(instead);
						base.Username=valueS;
						break;
					}		
					
					
				}
				i++;
			}
			i++;
			
			for(int j=0;j<blankspace2-blankspace1-1;j++)
				{
						instead[j]=' ';
				}
			//System.out.println(i);
			while(i<=valuechar.length)
			{
				if(valuechar[i]==' ')
				{
						
				blanksum++;
				if(blanksum%2!=0)

					blankspace1=i;
				else
				{
					
					blankspace2=i;
					//System.out.println(blankspace2);
					for(int j=0;j<blankspace2-blankspace1-1;j++)
					{
						instead[j]=valuechar[blankspace1+1+j];
					}
					valueS=String.valueOf(instead);
					base.Password=valueS;
					break;
				}
				}
				i++;
			}
		}
		i=0;
		
		return base;
	}

	private BaseUnit create(BaseUnit base,char[] valuechar,String value)
	{
//		BaseUnit base=new BaseUnit();
		int blanksum=0;
		int blankspacesum=0;
		int blankspace1=0,blankspace2=0;
		String valueS=null,minusvalue=null;
		char[] instead=new char[100];
		//base.option="create";
		for(int j=0;j<value.length();j++)
		{
			if(value.charAt(j)==' ')
				blankspacesum++;
		}
		//System.out.println(blankspacesum);
		if(blankspacesum==11)
		{	
			while (i<=valuechar.length)
			{
				
				if(valuechar[i]==' ')
				{
					blanksum++;
					if(blanksum%2!=0)

						blankspace1=i;
					else
					{
						
						blankspace2=i;
						//System.out.println(blankspace2);
						for(int j=0;j<blankspace2-blankspace1-1;j++)
						{
							instead[j]=valuechar[blankspace1+1+j];
						}
						valueS=String.valueOf(instead);
						base.Username=valueS;
						break;
					}		
					
					
				}
				i++;
			}
			i++;
			for(int j=0;j<blankspace2-blankspace1-1;j++)
				{
						instead[j]=' ';
				}
//				
			while(i<=valuechar.length)
			{
				if(valuechar[i]==' ')
				{
				blanksum++;
				if(blanksum%2!=0)

					blankspace1=i;
				else
				{
					
					blankspace2=i;
					//System.out.println(blankspace2);
					for(int j=0;j<blankspace2-blankspace1-1;j++)
					{
						instead[j]=valuechar[blankspace1+1+j];
					}
					valueS=String.valueOf(instead);
					base.Password=valueS;
					break;
				}		
				
				
			}
			i++;
			
			}
			i++;
			for(int j=0;j<blankspace2-blankspace1-1;j++)
			{
				instead[j]=' ';
			}
//

			while(i<=valuechar.length)
			{
				if(valuechar[i]==' ')
				{
				blanksum++;
				if(blanksum%2!=0)

					blankspace1=i;
				else
				{
					
					blankspace2=i;
					//System.out.println(blankspace2);
					for(int j=0;j<blankspace2-blankspace1-1;j++)
					{
						instead[j]=valuechar[blankspace1+1+j];
					}
					valueS=String.valueOf(instead);
					base.PasswordCheck=valueS;
					break;
				}
				}
				i++;
			}
			i++;
			for(int j=0;j<blankspace2-blankspace1-1;j++)
			{
				instead[j]=' ';
			}
//

			while(i<=valuechar.length)
			{
				if(valuechar[i]==' ')
				{
				blanksum++;
				if(blanksum%2!=0)

					blankspace1=i;
				else
				{
					
					blankspace2=i;
					//System.out.println(blankspace2);
					for(int j=0;j<blankspace2-blankspace1-1;j++)
					{
						instead[j]=valuechar[blankspace1+1+j];
					}
					valueS=String.valueOf(instead);
					base.Sex=valueS;
					break;
				}
				}
				i++;
			}
			i++;
			for(int j=0;j<blankspace2-blankspace1-1;j++)
			{
				instead[j]=' ';
			}


			while(i<=valuechar.length)
			{
				if(valuechar[i]==' ')
				{
				blanksum++;
				if(blanksum%2!=0)

					blankspace1=i;
				else
				{
					
					blankspace2=i;
					//System.out.println(blankspace2);
					for(int j=0;j<blankspace2-blankspace1-1;j++)
					{
						instead[j]=valuechar[blankspace1+1+j];
					}
					valueS=String.valueOf(instead);
					base.Telephone=valueS;
					break;
				}
				}
				i++;
			}
		}
		//else 
		//	System.out.println("Read  your message unsuccessfully,you format is false!!");
		i=0;
		return base;
	}
	
 
	/*public static void main(String[] args) 
	{
		String t="login -u zhoujunjie -p 123456 ";
		Console l=new Console();
		
		
		System.out.println(l.ValueDeal(t).option);
	}*/
	
}
