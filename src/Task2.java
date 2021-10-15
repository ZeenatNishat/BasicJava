
public class Task2 {
    public static void main(String[] args ) {
        Scanner input = new Scanner (System.in);
        int array[]= new int [10];
        int p1=0,p2=0;
        for(int i=0; i<10; i++)
        {
            array[i]=input.nextInt();
        }
        for(int i=0; i<10; i++)
        {
            if(array[i]<0) p1++;
            else p2++;
        }
        System.out.printf("Negative Numbers are : %d\n",p1);
        System.out.printf("Positive Numbers are : %d\n",p2);
    }
}

