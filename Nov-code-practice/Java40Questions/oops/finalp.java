//  final class finalp{
//  	public static void main(String[] args) {
 		
 	
// 	 final int w=10;
// 	System.out.println(w);
// }
// }
class file{
	final void add(){
		System.out.println("hello this is an a final keyword");
	}
}
class file2 extends file{
      void display(){
	 System.out.println("this  is file 2");}
}
class finalp{
	public static void main(String[] args) {
		file2 f=new file2();
		f.add();
		f.display(); 
	}
}
