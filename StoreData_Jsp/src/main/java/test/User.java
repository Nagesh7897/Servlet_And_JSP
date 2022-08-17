package test;
import java.util.LinkedList;
import java.util.List;

public class User {

	static List listmatch=new LinkedList();
	
	public static void adddata(List list) {
		listmatch=list;
		System.out.println(list);
	}
	
	public static List returnData()
	{
	
		System.out.println("Data "+ listmatch);
		return listmatch;
	}
	
	
	
}
