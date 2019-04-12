public class MessageData {
	
		public int value;
		
	MessageData(int x){		
		this.value = x;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MessageData other = (MessageData) obj;
		if (value != other.value)
			return false;
		return true;
	}

	
	
}
