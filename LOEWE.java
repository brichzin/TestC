public class LOEWE implements Audio
{
    int alter;
    int gewicht;
    
    LOEWE()
    {
        gewicht = 5;
        alter = 2;
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
