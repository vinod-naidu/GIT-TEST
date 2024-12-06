class Inheritence
{
    public void main(int a,int b)
    {
        int c=a+b;
        System.out.println("add="+c);
    }
    public void sub(int a, int b)
    {
        int c=a-b;
        System.out.println("sub="+c);
    }
    public class ChildInheritence extends Inheritence
    {
        public void mul(int a,int b)
        {
            int c=a*b;
            System.out.println("mul="+c);
        }
        public void div(int a,int b)
        {
            int c=a/b;
            System.out.println("div="+c);
        }
        public static void main(String args[])
        {
            ChildIhheritence cd=new ChildInheritence();
            cd.main(10,20);
            cd.sub(10,20);
            cd.mul(10,20);
            cd.div(10,20);
        }
    }
}