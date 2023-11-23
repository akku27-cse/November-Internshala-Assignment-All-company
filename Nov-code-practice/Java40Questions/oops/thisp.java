class first{
	int x=9;
	int y=98;
	void display(){
		int t,r;
		t=this.x;
		r=this.y;
		int z;
           z=r+t;
           System.out.println(z);
			}

			void second(){
				System.out.println("this is second position operation "+this.x+this.y);
				this.display();
			}
}
class thisp{
	public static void main(String[] args) {
		

		first f=new first();
		f.second();
		f.display();
	}
}