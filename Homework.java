import java.util.Scanner;

public class Homework {
    public static void main(String[] args){
        int arr[]={11,15,18,23,28};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要添加的数字：");
        int insertNum=scanner.nextInt();

        int index=-1;

        for (int i=0;i<arr.length;i++){
            if(insertNum<=arr[i]){
                index=i;
                break;
            }
        }
        if(index==-1){
            index=arr.length;
        }
        //扩容
        int arrNew[]=new int[arr.length+1];
        for (int i=0,j=0;i<arrNew.length;i++){
            if (i!=index){
                arrNew[i]=arr[j];
                j++;
            }else {
                arrNew[i]=insertNum;
            }

        }
//        更新数组应用引用
        arr=arrNew;
        System.out.println("添加后的数组为：");
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+"\t");
        }
    }


}




