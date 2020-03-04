import java.util.*;
import java.time.*;
import java.text.*;
class Age{
	public static void main(String[] args)throws ParseException{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("Amrit","20/06/1997");
		hm.put("Anagha","12/11/1999");
		hm.put("Rama","25/01/2005");

		Check obj=new Check();
		obj.test(hm);
	}
}

class Check{
	public void test(HashMap<String,String> hm1) throws ParseException{
		for(Map.Entry me:hm1.entrySet()){
		String s=me.getValue().toString();

		Date d=new SimpleDateFormat("dd/MM/yyyy").parse(s);

		Calendar c=Calendar.getInstance();
		c.setTime(d);
		int old=c.get(Calendar.YEAR);
		//System.out.println(old);
		Calendar c1=Calendar.getInstance();
		int now=c1.get(Calendar.YEAR);
		//System.out.println(now);
		int age=now-old;
		if(age>=18){
			System.out.println("Eligible for voting: "+me.getKey());
		}
		else{
			System.out.println("Not eligible: "+me.getKey());
			
		}

		
	}

}
}