class RIESENFAULTIER implements Audio
{
    int alter;
    int gewicht;
    
    RIESENFAULTIER()
    {
        gewicht = 333;
        alter = 2;
    }
    
    RIESENFAULTIER(int alterNeu, int gewichtNeu)
    {
        gewicht = gewichtNeu;
        alter = alterNeu;
    }
    
    public String lautGeben() {
        return "uuuuuuuuuuuuaaaaaa";
    }
    
    int getAlter()
    {
        return alter;
    }
    
    int getGewicht()
    {
        return gewicht;
    }
}
