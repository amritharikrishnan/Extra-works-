import java.util.*;
class Sorted{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit array : ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the Values: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Target Value :");
		int t=sc.nextInt();
		int result=0;
		for(int i=0;i<arr.length;i++){
			if(t>arr[i]&&t<arr[i+1]){
				result= i+1;
				break;
			}
			else if(t==arr[i]){
				result= i-1;
				break;
			}
			else if(t<arr[i]){
				result= i;
				break;
			}
			else{
				result= arr.length;
				break;
			}
		}
		System.out.println(result);
	}
}