public class DeBugTest {
    public static void main(String[] args) {
        int a[]={1,2,3};
        m(a);
       for (int i=0;i<a.length;i++)
       {
           System.out.println(a[i]);
       }
    }
    public  static void  m(int a[])
    {
        a[2]=88;
    }
}
