public class atividade //Onde ficam as classes.
{
    //public static void main(String[] args) 
    //{
        //for (int i = 1; i <= 10; i++) 
        //{
            //System.out.println("\nTabuada do " +i);
            
            //for (var j = 1; j <= 10; j++)
            //{
                //System.out.println(i+" X "+j+" = " +i*j);
            //}
        //}
    //}

    public static void main(String[] args) // Onde é codado.
    {
        for(int i = 1; i <= 10; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }    
    }
}