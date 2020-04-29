public class ALPAKA implements Audio
{
    int alter;
    int gewicht;
    
    ALPAKA()
    {
        gewicht = 54;
        alter = 3;
    }
    
    ALPAKA(int alterNeu, int gewichtNeu)
    {
        gewicht = gewichtNeu;
        alter = alterNeu;
    }
    
    public String lautGeben() {
        return "KCHSCH";
    }
    
    public int AlterGeben(){
        return alter;
    }
    
    public int GewichtGeben(){
        return gewicht;
    }
    
    void setGewicht(int gewichtNeu)
    {
        gewicht = gewichtNeu;
    }
}