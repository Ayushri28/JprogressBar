public class Main{

System.out.println("Enter range");
Scanner input=new Scanner(System.in);
int n=input.nextInt();

for(int i=0; i<n; i++)
{
  String str=input.next();
  System.out.println(i+1);
  System.out.println(str);  
}

}
