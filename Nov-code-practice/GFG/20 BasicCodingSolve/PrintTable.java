class  PrintTable{
    public static void main(String[] args) {
        int n=3;
        //output 33322211
        for(int i=0;i<n;i++){
            for(int j=n;j>0;j--){
                for (int k = 0; k < n - i; k++) {
                    System.out.println(j);
                   
                }
            }
        }


    }
}