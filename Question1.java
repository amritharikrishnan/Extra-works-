import java.text.*;
import java.util.*;
class DayFinder{
	public static void main(String[]args) throws ParseException{
		//First date
		String[]s=new String[]{"2020-01-28","2020-04-14","2020-05-06"};
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d=sdf.parse(s[0]);
		SimpleDateFormat e=new SimpleDateFormat("EEEE");
		String s2=e.format(d);
		System.out.print("[ "+s2+" ");
		
		//Second Date
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		Date d1=sdf1.parse(s[1]);
		String s3=e.format(d1);
		System.out.print(s3+" ");
		
		//Third Date
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
		Date d2=sdf2.parse(s[2]);
		String s4=e.format(d2);
		System.out.println(s4+" ]");
	}
}