public class EULE implements Audio
{
    int alter;
    int gewicht;
    
    EULE()
    {
        gewicht = 2;
        alter = 20;
    }
    
    EULE(int alterNeu, int gewichtNeu)
    {
        gewicht = gewichtNeu;
        alter = alterNeu;
    }
    
    public String lautGeben() {
        return "SchuHu";
    }
    
    public void setAlter(int nAlter) {
        alter = nAlter;
    }
}
