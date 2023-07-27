import java.util.Scanner;
interface calci{
int sum(int a,int b,int c);
}
public class imp implements calci{
int sum(int a,int b,int c){
return a+b+c;
}

}
class calcidriver{
public static void main(String [] agrs ){
Scanner s=new Scanner(System.in);
System.out.println("enter 3 numbers to find the sum");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
calcidriver c=new calcidriver();
int sum=c.getSum(a,b,c);
System.out.println(sum);
}
}



