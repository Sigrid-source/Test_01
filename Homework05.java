public class Homework05 {
    public static void main(String[] args){
        int arr[] = new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i] =(int)(Math.random()*100)+1;
        }
        System.out.println("数组为：");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        //倒序输出
        System.out.println("\n倒序数组为：");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+"\t");


        }


        //平均值，最大值，最大值下标
        int sum=0;
        int max=arr[0];
        int indexMax=-1;
        for (int j=0;j<arr.length;j++){
            sum+=arr[j];
        }
        System.out.println("\n平均值为:"+(sum/arr.length));
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
                indexMax=i;
            }
        }
        System.out.println("\n最大值为："+max+",最大值下标为："+indexMax);

    }








}
