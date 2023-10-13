class WhileLoop{
	public static void main(String[] args){
		int N=7;
		int i=1;
		if(N%2==0){
			while(N>=i){
				System.out.print(N+" ");
				N--;
			}
		}else{
			while(N>=i){
				System.out.print(N+" ");
				N=N-2;
			}
		}
		
	}
}

/*class Table{
	public static void main(String[] args){
		int i=1;
		int N=6;
		if(N%2==0){
			for(;N>=i;N--){
				System.out.print(N+" ");
			}
		}else{
			for(;N>=i;N=N-2){
				System.out.print(N+" ");
			}
		}
	}
}*/
