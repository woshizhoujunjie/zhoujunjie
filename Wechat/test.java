import Wechat.Wechat;
import Wechat.Console;
import Wechat.Conduct;
import Wechat.ConductBuffer;
import Base.BaseUnit;
import Back.BackUnit;
public class Test 
{
	Wechat t1=new Wechat();
	Console t2=new Console();
	Conduct t3=new Conduct();
	ConductBuffer t4=new ConductBuffer();
	public static void main(String[] args) 
	{
		String x="login -u zhoujunjie -p 123456 ";
		BackUnit back;
		BaseUnit base;
		Test t=new Test();
		while(true)
		{
			t.t1.ValueDeal(t.t2.ValueDeal(t.t3.ValueDeal(t.t4.ValueDeal(t.t3.ValueDeal(t.t2.ValueDeal(t.t1.InputValue()))))));
			//back=t.t4.ValueDeal(t.t3.ValueDeal(t.t2.ValueDeal(x)));
			//System.out.println(back.Username);
		}
	}
	
}
