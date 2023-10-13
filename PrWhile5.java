class WhileLoop{
	public static void main(String[] args){
		int N=942111423;
		while(N!=0){
			int rem=N%10;
			if(rem%2==0){
				System.out.print(rem*rem+" ");
			}
			N=N/10;
		}
	}
}

/*class Table{
	public static void main(String[] args){
		int N=942111423;
		for(;N!=0;N=N/10){
			int rem=N%10;
			if(rem%2==0){
				System.out.print(rem*rem+" ");
			}
		}
	}
}*/
