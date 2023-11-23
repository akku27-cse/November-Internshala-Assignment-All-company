class car{
	void property(){
		int wheel=4;
		int seat=8;

	}
	void display(){
		System.out.println("car  has "+this.wheel);
	}
}
class vichale extends car{
	//System.out.println(super.seat);
}
class simple{
	public static void main(String[] args) {
		vichale v=new vichale();
		v.display();
	}
}