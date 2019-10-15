
 public class Test{
	 public static void main(String[] args){
		 int a = 10;
		 int b = 20;
		 int c = 30;
		 int max = 0;
		 int min = 0;
		 if(a>b){
			 max = a;
			 min = b;
		 }
		 else{
			 max = b;
			 min = a;
			 if(b<c){
				 max = c;
			 }
			 else{
				 max = b;
				 if(a<c){
					 min = a;
				 }
				 else{
					 min = c;
				 }
			 }
		 }
		 System.out.println(max);
		 System.out.println(min);
	 }
	 
	 
	 
	 public static void main1(String[] args){
		int a = 10;
		int b = 20;
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}
}