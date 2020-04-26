public class LOEWE implements Audio
{
    int alter;
    int gewicht;
    
    LOEWE()
    {
        gewicht = 10;
        alter = 1;
    }
    
    LOEWE(int alterNeu, int gewichtNeu)
    {
        gewicht = gewichtNeu;
        alter = alterNeu;
    }
    
    public String lautGeben() {
        return "RRRRRooooaaaRRRR";
    }
}
