package java1.problem1;

import java.util.Scanner;

public class MathCal {
	public static void main(String[] args) {
		//print1_100();
	  //  print2_100();
		print3_100();
		//print_odd_number();
		//print_stament();
		//print_stament1();
		//Multiplication();
		//print_stament3() ;
		//System.out.println("hi");
		input();
		
		
	
		
		
	}
	
	public static void print1_100() {
		for(int i=1; i<=100; i++) {
			System.out.println(i);
			}
		
	}
	
	public static void print2_100() {
		for (int n=1; n<100; n++) {
			
			if(n%2 ==0) {
				System.out.println(n);}
			}	
		}
		public static void print3_100(){
			for (int m=1; m<100; m++) {
				if(m%2 ==0) {
					System.out.println(m);
				}
			}
	
		}
		
		public static void print_odd_number() {
			for(int i = 1;i<=100;i++) {
				if(i%2!=0) {
					System.out.println(i);
					}
				}
			}
		public static void print_stament() {
			for (int n=1; n<=5;n++ ) {
				int nooftime=n;
				for(int n1=1;n1<=nooftime;n1++){
					System.out.print("1");
				}
				System.out.println("");
				
			}
		}
		
	public static void print_stament1() {
		for (int i=1; i<=5; i++) {
			int nooftime=i;
			for (int i1=1;i1<=nooftime;i1++) {
				System.out.print(i1);
				
			}
			System.out.println("");
			
		}
	}
	
	public static void print_stament3() 
	{
		int num = 5;
		for(int i= 1; i<=10;i++){
			
				System.out.println(num + "*" + i + "="+num*i); 
				}
	}
		
	public static void input() {
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter username");
		int user_input = Integer.parseInt(myObj.nextLine());
		//int user_input=9;
		if(user_input==1) {
			System.out.println("janury");
		}
		else if(user_input==2) {
			System.out.println("Fabruary");
		}
		else if(user_input==3) {
			System.out.println("March");
		}
		else if(user_input==4) {
			System.out.println("April");
		}
		else if(user_input==5) {
			System.out.println("May");
		}
		else if (user_input==6) {
			System.out.println("june");
		}
		else if (user_input==7) {
			System.out.println("july");
		}
		else if (user_input==8) {
			System.out.println("August");
		}
		else if (user_input==9) {
			System.out.println("Septmber");
		}
		else if (user_input==10) {
			System.out.println("October");
		}
		else if (user_input==11) {
			System.out.println("November");
		}
		else if (user_input==12){
			System.out.println("December");
		}
		else {
			System.out.println("you enter wrong number");
		}
		
	}
	

		
	}   	   
        
           
           
           



	

			
			
		
			
