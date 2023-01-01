public class Armstrong {
    public static void main(String[] args)
    {
        int num=153,sum=0,num1=num,temp;
        while(num!=0)
        {
            temp=num%10;
            sum=sum+(temp*temp*temp);
            num=num/10;
        }
        if(sum==num1)
            System.out.println(num1+" : yes");
    }
}