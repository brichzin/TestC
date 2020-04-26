import java.util.ArrayList;
/**
 * Sammlung verschiedener Objekte, die einen Ton von sich geben koennen.
 * 
 * @author (Zirbnich) 
 * @version (Version 1)
 */
public class SoundCollection
{
    //Audio[] soundCollection;
    ArrayList<Audio> soundElemente;

    /**
     * Konstruktor für Objekte der Klasse SoundCollection
     */
    public SoundCollection()
    {
        // Instanzvariable initialisieren
    soundElemente = new ArrayList<Audio>();
    soundElemente.add(new LOEWE());     
    
    }

    ArrayList<Audio> getSoundElemente()
    {
        return soundElemente;
    }
    
    String getInfo1()
    {
        return "Lion";
    }
}
