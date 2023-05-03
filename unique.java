import java.util.Scanner;
public class unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 7 number");
        int []a=new int[7];
        for (int i=0;i< a.length;i++){
            a[i]= sc.nextInt();
        }
        int count=0;
        for (int j=0;j<7;j++){
            for (int k=0;k<7;k++){
                for (int f=0;f<7;f++){
                    if(a[j]!=a[k]&&a[k]!=a[f]&&a[j]!=a[f]){
                        System.out.println(a[j]+""+a[k]+""+a[f]);
                    }
                    count++;
                }
            }
        }
        System.out.println("number count="+count);
    }
}
