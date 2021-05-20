package basicAlgorithmsPractice;

public class IntElement extends DataElement {
	protected int num;

	
	public IntElement() {
		num = 0;
	}

	public IntElement(int x) {
		num = x;
	}

	public IntElement(IntElement otherElement) {
		num = otherElement.num;
	}

	@Override
	public boolean equals(DataElement otherElement) {
		IntElement copy = (IntElement) otherElement;
		return (num == copy.num);
	}

	@Override
	public int compareTo(DataElement otherElement) {
		IntElement copy = (IntElement) otherElement;
		return (num - copy.num);
	}

	@Override
	public void makeCopy(DataElement otherElement) {
		IntElement copy = (IntElement) otherElement;
		num = copy.num;

	}

	@Override
	public DataElement getCopy() {
		IntElement copy = new IntElement(num);
		return copy;
	}

	public int getInt() {
		return num;
	}

	public void setInt(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "IntElement [num=" + num + "]";
	}

}
