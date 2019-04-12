import java.util.*;

public class Start {
	
	public static void main(String[] args) {
		
		List<Integer> arraylist = new LinkedList<Integer>();	
		arraylist.add(10);
		arraylist.add(3);
		arraylist.add(10);
		arraylist.add(2);
		arraylist.add(6);
		arraylist.add(6);
		arraylist.add(8);
		//System.out.println(arraylist);
		DataInput di = new DataInput(arraylist);
		DataProcessor dp = new DataProcessor(di.lista);
		for(MessageData item: dp.lista)
		{
			System.out.println(item.value);
		}
	}
}
