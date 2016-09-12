
/**
 * Write a description of class Person here.
 * 
 * Chris Pfeifffer, P.7 AP
 */
public class Person
{
    private String name;
    private int age;
    private char gender;

    public Person()
    {
        name = "";
        age = 0;
        gender = ' ';
    }
    
    public Person(String n, int a, char g)
    {
        name = n;
        age = a;
        gender = g;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public char getGen()
    {
        return gender;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public String toString()
    {
        int pos = name.indexOf(","), len = name.length();
        String newname = name.substring(pos + 2, len) + " " + name.substring(0, pos);
        
        return String.format("%-20s%10d%5s", newname, age, gender);
    }
    
    
}
