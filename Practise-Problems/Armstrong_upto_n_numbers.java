public class Armstrong_upto_n_numbers {
    public static void main(String[] args) {
        int n=1000,sum,temp,num,i;
        System.out.println("Armstrong Number upto "+n);
        for(i=1;i<n;i++){
            num=i;
            sum=0;temp=0;
            while(num!=0)
            {
                temp=num%10;
                sum=sum+(temp*temp*temp);
                num=num/10;
            }
            if(sum==i)
            {
                System.out.print(i+" ");
            }
        }
    }
}