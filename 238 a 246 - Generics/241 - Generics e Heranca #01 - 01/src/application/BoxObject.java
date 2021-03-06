package application;

public class BoxObject<T> {
	private T thing;
	
	public void save(T thing) {
		this.thing = thing;
	}
	
	public T open() {
		return thing;
	}
}
