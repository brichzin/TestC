public class BIENE implements Audio
{
    int alter;
    int gewicht;
    
    BIENE()
    {
        gewicht = 15;
        alter = 15;
    }
    
    BIENE(int alterNeu, int gewichtNeu)
    {
        gewicht = gewichtNeu;
        alter = alterNeu;
    }
    
    public String lautGeben() {
        return "Summ-Summ";
    }
}
