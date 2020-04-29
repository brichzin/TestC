public class EULE implements Audio
{
    int alter;
    int gewicht;
    
    EULE()
    {
        gewicht = 23;
        alter = 42;
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
