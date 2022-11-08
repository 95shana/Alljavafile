package java1.problem1;

import java.util.Scanner;

public class loop {
	private static final int A = 0;
	private static int length;
	private static int marks;
	public static void main( String []agrs) {
		//place();
		//add();
		//aa();
		//bb();
		//cc();
		//cc();
		//math();
	    //math();
		//swth();
		
	}

	public static void place() {
		String[] Pokhara = {"LakeSide","Chinese Gumba","Mahendra Ghufa"};
		for (String a:Pokhara) {
			System.out.println(a);
		}
	}
	
	public static void add() {
		int a,b,c;
		System.out.println("Enter any Number");
		try (Scanner user_input = new Scanner (System.in)) {
			a=user_input.nextInt();
			b=user_input.nextInt();
			c=a+b;
			System.out.println("sum of two number:"+c);
		}
			
	}
	public static void aa(){
		//int a[]= {10,20,30,40,50,60,70};
		//System.out.println(a[6]);
		int a[]=new int[5];
		//int a[] = {100,200,300};
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i=0;i<5 ;i++)
		{
			System.out.println(a[i]);
		}
	}
		public static void bb() {
		String Nepal[]= {"Katmandu","Pokhara","Butwal","Butwal"};
		for( int i=2;i<Nepal.length;i++) {
			System.out.println(Nepal[i]);
			}
	}
		public static void cc(){
			String Japan[]= {"Tokyo","Sapporo","Saitama"};
		for(int n=0;n<Japan.length;n++) {
			System.out.println(Japan[n]);
			}
	}	
		public static void math() {
			String n="Apple Orang";
			System.out.println(n.indexOf("b"));
			System.out.println(n.contains("A")); //tr
			System.out.println(n.startsWith("nn")); //false
			}
		public static void swth() {
			int day = 3;
		    switch (day) {
		      case 1:
		        System.out.println("Monday");
		        break;
		      case 2:
		        System.out.println("Tuesday");
		        break;
		      case 3:
		        System.out.println("Wednesday");
		        break;
		      case 4:
		        System.out.println("Thursday");
		        break;
			
			}
			
		    int i = 0;
		    do {
		      System.out.println(i);
		      i++;
		    }
		
		    while (i < 5);
		

		for (int i1 = 0; i1 < 5; i1++) {
			
			  System.out.println(i1);
		   }
     }	
		public static void n() {
			
		}
			
		
			
		

		
		
	
	
		
	





}	

			
			
		
		
	  
		
	
		
		
	
	





