
public class A2 extends A1 {
	private int y;
	 public A2(int xx, int yy) {
		 super(xx);
		 this.y = yy;
	 }
	 
	 public void increment() {
		 this.y = this.y + this.x;
	 }
	 public int getY() {
		 return this.y;
	 }
}
