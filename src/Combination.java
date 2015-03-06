
public class Combination {
    public static void main(String args[])
    {
        int n=3;       
        int ReadTillPosition=0;
        int NumberOfElements=(int)Math.pow(2,n);
        String combination[]=new String[NumberOfElements];
        int CurrentAscii=97;    
        int CurrentArrayPosition=1;
        combination[0]="";
        for(int i=1;i<=n;i++)
        {
            ReadTillPosition=CurrentArrayPosition-1;
            for(int j=0;j<=ReadTillPosition;j++)
            {
                combination[CurrentArrayPosition]=combination[j]
                		+Character.toString((char)CurrentAscii);
                CurrentArrayPosition++;    
            }
            CurrentAscii++;
        }
        System.out.print("{ ");
        for(int i=0;i<NumberOfElements-1;i++)
        {
            System.out.print("{"+combination[i]+"},"+" ");
        }
        System.out.print("{"+combination[NumberOfElements-1]+"}"); 
        System.out.print(" }");
    }
    
}