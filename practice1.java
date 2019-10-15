public class Test{
	public static void main(String[] args){
	
	}
	
	public static void main9(String[] args){
		int num = 0;
		int a = 1;
		int b = 1;
		int c = 1;
		int temp = 1;
		for(num=0;num<=999;num++){
			temp = num;
			a=temp%10;
			temp=temp/10;
			b=temp%10;
			temp=temp/10;
			c=temp%10;
			if((a*a*a+b*b*b+c*c*c) == num){
				System.out.println(num+"是一个水仙花数");
			}
		}
	}
	
	public static void main8(String[] args){
		int num = 1;
		int count = 0;
		for(num=1;num<=100;num++){
			if(num%10==9){
				count++;
			}
			if(num/10==9){
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main7(String[] args){
		double i = -1.0;
		double n = 1;
		double sum = 0.0;
		for(n=1;n<=100;n++){
			i = -i;
			sum += (1/n)*i;
		}
		System.out.println(sum);
	}
	
	public static void main6(String[] args){
		int num1 = 36;
		int num2 = 39;
		int i = 0;
		int j = 0;
		if(num1<=num2){
			i=num1;
		}
		else{
			i=num2;
		}
		for(j=i;j>=1;j--){
			if(num1%j==0 && num2%j==0){
				System.out.println("最大公约数为："+j);
				break;
			}
		}
	}
	
	public static void main5(String[] args){
		int i = 1;
		int j = 1;
		int k = 9;
		int ret = 0;
		for(i=1;i<=k;i++){
			for(j=1;j<=i;j++){
				ret = i * j;
				System.out.print(j+"*"+i+"="+ret+"  ");
			}
		}
	}
	
	public static void main4(String[] args){
		int year =1000;
		for(year=1000;year<=2000;year++){
			if(year%4==0 && year%100!=0 || year%400==0){
				System.out.println(year);
			}
		}
	}
	
	public static void main3(String[] args){
		int i = 2;
		int j = 2;
		System.out.println("1");
		for(i=2;i<=100;i++){
			for(j=2;j*j<=i;j++){
				if(i%j==0){
					break;
				}
			}
			if(i%j!=0){
				System.out.println(i);
			}
		}
	}
				
		
	public static void main2(String[] args){
		int num = 13;
		int i = 2;
		for (i = 2; i <= num/2; i++){
			if(num%i==0){
				System.out.println("不是素数");
				break;
			}
		}
		if(num%i != 0){
			System.out.println("是素数");
		}
	}
	

	public static void main1(String[] args){
		int age = 54;
		if(age<=18){
			System.out.println("少年");
		}
		else{
			if(age<=28){
				System.out.println("青年");
			}
			else{
				if(age<=55){
					System.out.println("中年");
				}
				else{
					System.out.println("老年");
				}
			}
		}
	}
}