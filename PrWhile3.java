class WhileLoop{
	public static void main(String[] args){
		int N=942111423;
		int count=0;
		while(N!=0){
			count++;
			N=N/10;
		}
		System.out.println("Count of digits="+count);
	}
}

/*class Table{
	public static void main(String[] args){
		int N=942111423;
		int count=0;
		for(int N;N!=0;N=N/10){
			count++;
		}
		System.out.println("Count of digits="+count);
	}
}*/
