public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first=Integer.valueOf(arg[0]);
		int second=Integer.valueOf(arg[1]);
		//int three=Integer.valueOf(arg[2]);
		int sum=first+second;
		int raz=first-second;
		int umn=first*second;
		int del=first/second;
		int ste=first^second;
		System.out.println("sum "+sum);
		System.out.println("raz "+raz);
		System.out.println("umn "+umn);
		System.out.println("del "+del);
		System.out.println("ste "+ste);
	}
}			
