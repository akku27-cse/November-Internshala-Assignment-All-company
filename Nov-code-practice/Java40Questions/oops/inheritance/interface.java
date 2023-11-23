interface car{
	void rect(int h,int w);
}
class vichale implements car{
	public void rect(int h,int w){

		h=3;
		w=9;
		System.out.println("heigt="+h);
		System.out.println("weiht="+w);
	}
}

class interface1 {
	public static void main(String[] args) {
		vichale v=new vichale();
		v.rect(7,2);
	}
}  