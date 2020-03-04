import java.util.*;
class HashMapprog{
	public static void main(String[]args){
		HashMap<String,String> h1 = new HashMap<String,String>();
		HashMap<String,String> h2 = new HashMap<String,String>();
		h1.put("India","New Delhi");
		h1.put("Japan","Tokyo");
		h1.put("Russia","Moscow");
		h1.put("Sri Lanka","Columbia");
		h1.put("Nepal","Timpu");
		h2=sort(h1);
		System.out.println(h2.entrySet());
	}
	public static HashMap sort(HashMap<String,String> h3){
		ArrayList<String> arr = new ArrayList<String>();
		arr.add(h3.values(i));
		
	}
}