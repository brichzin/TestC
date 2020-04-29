public class KATZE implements Audio
{
    int alter;
    int gewicht;
    
    KATZE()
    {
        gewicht = 4;
        alter = 7;
    }
    
    KATZE(int alterNeu, int gewichtNeu)
    {
        gewicht = gewichtNeu;
        alter = alterNeu;
    }
    
    public String lautGeben() {
        return "Miau";
    }
}
