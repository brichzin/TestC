
public class Hund implements Audio
{
    int alter;
    String name;

    public Hund()
    {
<<<<<<< HEAD
        name = "Lassie";
        alter = 3;
=======
        name = "Mia";
        alter = 5;
>>>>>>> faff4d3688c054ad150006c5c975030e42bb12ae
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
