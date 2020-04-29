public class ALPAKA implements Audio
{
    int alter;
    int gewicht;
    
    ALPAKA()
    {
        gewicht = 3123123;
        alter = 312312312;

    }
    
    ALPAKA(int alterNeu, int gewichtNeu)
    {
        gewicht = gewichtNeu;
        alter = alterNeu;
    }
    
    public void SetAlter(int alterNeu)
    {
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