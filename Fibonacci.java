public class Fibonacci {
    public static void main(String[] args ){
        T t1=new T();
        int n=3;
        int i=t1.fibonacci(n);
        if (i!=-1){
            System.out.println("当n="+n+"对应的斐波那契数为："+i);
        }else {
            System.out.println("请输入>=1的数！！");
        }


    }
}

class T{
    public int fibonacci(int n){
        if (n>=1){
            if (n==1||n==2){
                return 1;
            }else {
                return fibonacci(n-1)+fibonacci(n-2);
            }

        }else {

            return -1;
        }
    }
}


