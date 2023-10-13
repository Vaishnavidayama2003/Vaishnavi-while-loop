class WhileLoop{
	public static void main(String[] args){
		int N=2332;
		int rev=0;
		int temp=N;
		while(N!=0){
			int rem=N%10;
			rev=rev*10+rem;
			N=N/10;
		}
		if(rev==temp)
			System.out.println(temp+" is a palindrome");
		else
			System.out.println(temp+" is not a palindrome");
	}
}



/*class Table{
	public static void main(String[] args){
		int rev=0;
		int N=2332;
		int temp=N;
		for(;N!=0;N=N/10){
			int rem=N%10;
			rev=rev*10+rem;
		}
		if(rev==temp)
			System.out.println(temp+" is a palindrome");
		else
			System.out.println(temp+" is not a palindrome");
	}
}*/
