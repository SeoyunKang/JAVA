package Method;

public class Pair<K, V> {
	
	private K key;
	private V value;
	
	public Pair(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
}
