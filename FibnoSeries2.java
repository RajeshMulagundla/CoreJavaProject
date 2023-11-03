class FibnoSeries2
{
public void fibno()
{
int n=10;
int fibresult[]=new int[n];
fibresult[0] = 0;
fibresult[1] = 1;
for(int i=2;i<n;i++)
{
fibresult[i] = fibresult[i-1] + fibresult[i-2];

}
for(int a:fibresult)
{
System.out.print(a+" ");
}
}
public static void main(String[] args)
{
FibnoSeries2 f=new FibnoSeries2();
f.fibno();


}
}