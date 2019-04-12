import java.util.*;

public class DataProcessor  {
	
	List<MessageData> lista;
	public DataProcessor(List<MessageData> list) {
		
		this.lista = new LinkedList<MessageData>();
		for(MessageData item: list)
		{		
		if(!this.lista.contains(item))
			this.lista.add(item);
		}
		ListIterator<MessageData> iter = this.lista.listIterator();
		int sum = 0;
		for(MessageData item: this.lista) {
		sum= sum+ item.value;
		}
	
		this.lista.add(new MessageData(sum));
		Collections.sort(this.lista, new SortMessageData());
	}

}
