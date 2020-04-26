import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Controller.
 * 
 * @author (Zirbnich) 
 * @version (Version 1)
 */
public class Controller 
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private SoundCollection soundcollection;
    ArrayList<Audio> soundElemente;


    /**
     * Konstruktor für Objekte der Klasse Controller
     */
    public Controller()
    {
        soundcollection = new SoundCollection();
    }

    void Ausgeben()
    {
        soundElemente = soundcollection.getSoundElemente();

        for( Audio element : soundElemente )
        {
            System.out.println(element.getClass() + ": " + element.lautGeben());
        }
    }

}

