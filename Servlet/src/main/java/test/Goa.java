package test;

import java.util.Scanner;

public class Goa {
	public void goaHotel() {

Scanner sc= new Scanner(System.in);
		
		System.out.println("Welocome to Goa Hotel");
		System.out.println("Types of rooms");
		
		int typesOfRoom=2;
		String type[]=new String[typesOfRoom];
		int cost[]=new int [typesOfRoom];
		
		type[0]="1-Ac with Sea View";
		type[1]="2-Non-Ac with Sea View";
		cost[0]=3000;
		cost[1]=2500;
		
		for(int i=0; i<typesOfRoom; i++)
		{
		System.out.println(type[i]);	
		}
		
		System.out.println("Please Enter Room Id you want to go with");
		int roomid=sc.nextInt();
		
		if(roomid==1) 
		{
			System.out.println("Cost of AC room = "+cost[roomid-1]);  //cost[0]
		}
		else if(roomid==2) 
		{
			System.out.println("Cost of AC room = "+cost[roomid-1]);  //cost[1]
		}
		else
		{
			System.out.println("Room type is not in list");
		}
		System.out.println("How much total people you have?");
		int noofPeople= sc.nextInt();
		System.out.println("How much childs are there whoes age is less than 12?");
		int child= sc.nextInt();
		int audlts= noofPeople-child;
		int pbill=0;
		System.out.println("How many days you Want to stay?");
		int day=sc.nextInt();
		if (noofPeople<=2)
		{
		   pbill= 0;
		}
		else if (noofPeople>2 && noofPeople<=4 )
		{
			audlts = 1000;
			child= 500;
			pbill= (((audlts-2)*1000)+(child*500))*day;
		}
		else
		{
			System.out.println("Please book another one room");
		}
		float bill= (day*cost[roomid-1])+pbill;
		System.out.println("Total bill of "+ day +" days is " + bill);
		
		sc.close();
	}
	
}
