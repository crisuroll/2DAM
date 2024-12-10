
abstract public class A {
	protected int x;
	A() {
		this.x = 0;	
	}
	
	A(int xx) {
		this.x = xx;
	}
	
	public int getX() {
		return this.x;
	}
	
	abstract public void increment();
}
