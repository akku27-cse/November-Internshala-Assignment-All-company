class first {
	 int x=10;
	 void display(){
	System.out.println(this.x);
}
}
class second extends first{
//super.display();
void dsiplay1(){
System.out.println(super.x);
super.display();
}
}
class superp{
	public static void main(String[] args) {
		second s=new second();
		s.display();
		s.dsiplay1();
	}
}