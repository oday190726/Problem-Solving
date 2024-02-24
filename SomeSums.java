import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        int val1= scanner.nextInt();
        int val2= scanner.nextInt();
        int sum =0;
        for (int i =1;i<=num;i++){
            if(i/10==0){
                if(i>=val1 && i<=val2){
                    sum+=i;
                }

            }else {
                int mysum =0;
                int number = i;
                while (number!=0){
                    int mynum=number%10;
                    mysum +=mynum;
                    number/=10;

                }
                if (mysum>=val1 && mysum<=val2){
                    sum+=i;}
            }
        }
        System.out.println(sum);

    }
}
