// class oopp{
// 	void print(){
// 		System.out.println("santu jana");
// 	}
// }
//  class oop{
// 	public static void main(String[] args) {
		
	
// 	oopp op=new oopp();
//      op.print();
// }
// }

class oopp{
	void rect(int redious){
		int height=9;
		int width=1;
		int rect=redious*height*width;
		System.out.println("total ="+rect);


	}

	void sum(int x,int y){
		int z=(x+y);
		System.out.println("sum of two number ="+z);
	}
}

class oop{
	public static void main(String[] args) {
		oopp op=new oopp();
		op.rect(8);
		op.sum(7,6);
	}
}