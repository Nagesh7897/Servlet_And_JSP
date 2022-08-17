package test;

import java.util.Scanner;

public class Shimla {

	public void shimlaHotel() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Welocome to Shimla Hotel");
		System.out.println("Types of rooms");
		
		int typesOfRoom=2;
		String type[]=new String[typesOfRoom];
		int cost[]=new int [typesOfRoom];
		
		type[0]="1-Ac with Sea View";
		type[1]="2-Non-Ac with Sea View";
		cost[0]=2000;
		cost[1]=1500;
		
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
		
		System.out.println("How much people you have?");
		int noofPeople= sc.nextInt();
		int pbill=0;
		System.out.println("How many days you Want to stay?");
		int day=sc.nextInt();
		if (noofPeople<=2)
		{
		   pbill= 0;
		}
		else if (noofPeople>2 && noofPeople<=4 )
		{
			pbill= day*1000;
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
