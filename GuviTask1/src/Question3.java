public class Question3 {
    public static void main(String[] args) {
        int num=876;
        System.out.println("Number=" + num);
        int revNum=0;
        //loop will execute until number equal to 0
        while (num!=0){
            int digit= num%10;
            //reverse the string
            revNum=revNum*10+digit;
            num=(num/10);
        }
        System.out.println("Reversed Number="+revNum);
    }
}
