
public class Hund implements Audio
{
    int alter;
    String name;

    public Hund()
    {
        name = "Bello";
        alter = 7;
    }

    public String lautGeben()
    {
        return "Wuff";
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAlter()
    {
        return alter;
    }
    
    public void setName(String nameNeu)
    {
        name = nameNeu;
    }
    
    public void setAlter(int alterNeu)
    {
        alter = alterNeu;
    }

}
