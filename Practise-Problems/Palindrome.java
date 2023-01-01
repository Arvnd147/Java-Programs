/*
        int num=1234321;//my code
        int num1=num,num_rev=0,temp,i=1;
        while(num!=0)
        {
            temp=num%10;
            num_rev=(temp*i)+num_rev;
            num=num/10;
            i=i*10;
        }
        if(num1==num_rev)
            System.out.println("yes");
*/

public class Palindrome {
    public static void main(String[] args) 
    {
        int n = 121, pal, r, rev = 0;
        pal = n; //pdf code
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if (rev == pal) {
            System.out.println(rev);
        } else {
            System.out.println("The given no is not palindrome " + rev);
        }

    }
}