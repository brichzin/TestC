public class LOEWE implements Audio
{
    int alter;
    int gewicht;

    LOEWE()
    {
        gewicht = 100;
        alter = 4;
    }

    LOEWE(int alterNeu, int gewichtNeu)
    {
        gewicht = gewichtNeu;
        alter = alterNeu;
    }

    public String lautGeben() {
        return "RRRRRooooaaaRRRR";
    }

    public int alterGeben()
    { 
        return alter;
    }

    public int gewichtGeben()
    { 
        return gewicht;
    }

    public void alterSetzen(int alterNeu)
    {
        alter = alterNeu;
    }

    public void gewichtSetzen(int gewichtNeu)
    {
        gewicht = gewichtNeu;
    }
}
