import java.util.Comparator;

public class SortMessageData implements Comparator<MessageData> {

	@Override
	public int compare(MessageData o1, MessageData o2) {

		return o1.value - o2.value;
	}

}
