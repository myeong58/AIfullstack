package ex04;

public class Product<K,M> {
	private K kind;
	private M model;
	
	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}

	public void setKind(K kind) {
		this.kind = kind;
	}

	public K getKind() {
		return kind;
	}

}
