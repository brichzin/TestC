public class BIENE implements Audio
{
    int alter;
    int gewicht;
    
    BIENE()
    {
        gewicht = 0;
        alter = 0;
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
