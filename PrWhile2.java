class WhileLoop{
	public static void main(String[] args){
		int N=6;
		int i=1;
		int fact=1;
		while(i<=N){
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+N+" is "+fact);
	}
}
/*class Table{
	public static void main(String[] args){
		int N=6;
		int fact=1;
		for(int i=1;i<=N;i++){
			fact=fact*i;
		}
		System.out.println("Factorial of "+N+" is "+fact);
	}
}*/
