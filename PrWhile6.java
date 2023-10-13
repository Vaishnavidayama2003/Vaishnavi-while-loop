class WhileLoop{
	public static void main(String[] args){
		int N=10;
		int i=1;
		int sum=0;
		int mult=1;
		while(i<=N){
			if(i%2==0){
				sum=sum+i;
			}else{
				mult=mult*i;
			}
			i++;
		}
		System.out.println("The sum of even numbers is "+sum);
		System.out.println("The multiplication of odd numbers is "+mult);
	}
}

/*class Table{
	public static void main(String[] args){
		int N=10;
		int sum=0;
		int mult=1;
		
		for(int i=1;i<=N;i++){
			if(i%2==0){
				sum=sum+i;
			}else{
				mult=mult*i;
			}
		}
		System.out.println("The sum of even numbers is "+sum);
		System.out.println("The multiplication of odd numbers is "+mult);
	}
}*/
