class RIESENFAULTIER implements Audio
{
    int alter;
    int gewicht;
    
    RIESENFAULTIER()
    {
        gewicht = 250;
        alter = 6;
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
