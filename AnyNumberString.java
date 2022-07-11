/*
此題可以輸入任意個數且可重複之數字
去除重複數字後，將數字從小到大排序
ex:
int[] a={1,2,3,3,2,1,9,9,8,7};
            轉
            成
int[] b={1,2,3,7,8,9};
因程式需求，不能輸入0            
*/

import java.util.Scanner;
import java.io.*;

class AnyNumberString{
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        String s;
        String[] ss;
        int[] data;
        int temp;

        while(true){
            System.out.print("請輸入數字陣列：");
            s=sc.nextLine(); //用nextLine將輸入字串連同空格儲存起來
            ss=s.split("\\s+"); //以空格為界限 分割數字
            data=new int[ss.length]; //用data陣列儲存ss的資料

            //把ss字串轉成數字存進data
            for(int i=0;i<data.length;i++)
                data[i]=Integer.parseInt(ss[i]);

            //去除重複數字  補0
            for(int i=0;i<data.length;i++){
                if(data[i]==0)
                    continue;
                for(int j=(i+1);j<data.length;j++){
                    if(data[i]==data[j])
                        data[j]=0;
                }
            }

            //BubbleSort 小-->大
            for(int i=0;i<data.length-1;i++){
                for(int j=0;j<data.length-1-i;j++){
                    if(data[j]>data[j+1]){
                        temp=data[j];
                        data[j]=data[j+1];
                        data[j+1]=temp;
                    }
                }
            }

            //輸出數字
            for(int i=0;i<data.length;i++){
                if(data[i]==0)
                    continue;
                System.out.print(data[i]+"  ");
            }

            System.out.println();
            System.out.println();
        }
    }
}