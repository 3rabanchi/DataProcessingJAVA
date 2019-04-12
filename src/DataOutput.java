import java.io.IOException;
import java.util.*;

public class DataOutput{
	
	public void print(List<MessageData> list) {
		for(MessageData item: list)
		{
			System.out.println(String.valueOf(item.value));
		}
	}
}
