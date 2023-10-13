class WhileLoop{
	public static void main(String[] args){
		int N=942111423;
		int count=0;
		while(N!=0){
			int rem=N%10;
			if(rem%2!=0){
				count++;
			}
			N=N/10;
		}
		System.out.println("Count of odd digits="+count);
	}
}

/*class Table{
	public static void main(String[] args){
		int N=942111423;
		int count=0;
		for(;N!=0;N=N/10){
			int rem=N%10;
			if(rem%2!=0){
				count++;
			}
		}
		System.out.println("Count of odd digits="+count);
	}
}*/
