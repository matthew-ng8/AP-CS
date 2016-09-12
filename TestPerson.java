import java.text.DecimalFormat;
/**
 * Write a description of class TestPerson here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestPerson
{
    public static void main()
    {
        DecimalFormat bob = new DecimalFormat("0.0");
        Person[] roster = new Person[5];
        int i, j, sum = 0, total = 0;
        char g = 'F';
        double avg;
        
        roster[0] = new Person("Pfeiffer, Chris", 1, 'M');
        roster[1] = new Person("Pfeiffer, Patrick", 21, 'M');
        roster[2] = new Person("Leon, Neal", 61, 'M');
        roster[3] = new Person("Llanes, Chris", 16, 'M');
        roster[4] = new Person("Meme, Harambe", 1, 'F');
        
        
        
        for(i = 0; i < 5; i++)
        {
            System.out.println(roster[i]);
        }
        
        for(j = 0; j < 5; j++)
        {
            if(roster[j].getGen() == g)
            {
               total+=roster[j].getAge();
               sum++;
            }
        }
        
        avg = (double) total/sum;
        
        System.out.println("The average age of females is: " + bob.format(avg) + " years");
    }
}
