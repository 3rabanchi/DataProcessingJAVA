import java.util.*;

public class DataInput {
			
		List<MessageData> lista;
		
		public DataInput(List<Integer> list)
		{	
			this.lista = new LinkedList<MessageData>();
			for (int item: list)
			{
				this.lista.add(new MessageData(item));
			}
		}
}
