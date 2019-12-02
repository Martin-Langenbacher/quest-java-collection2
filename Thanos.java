import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Thanos {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<Hero>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending) 
        //Collections.sort(heroes, Comparator.comparing(Hero::getName));
        // Comperator; nachschlagen: Interface List <E>: 
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html
        
        //Collections.sort(heroes, com); Collections.sort(heroes, new AgeAscendingComparator());
        
        Collections.sort(heroes);
        /* Hat nicht funktioniert, da die Methode com nicht aufgerufen wurde: (1)
        ========================================================================== */
        
        
        /*
        ============================================================
        Hat nicht funktioniert: (2)
        ============================================================
        Comparator<Hero> com = new Comparator<Hero>()
        {
        	public int compare(Hero h1, Hero h2)
        	{
        		if(h1.getHeroName() > h2.getHeroName())
        			return 1;
        		else
        			return -1;
        	}
        };
        ============================================================	
        Darum geht 2 nicht:
        a) die Methode Hero.getHeroName() gibt es nicht, und
        b) mit '>' kannst Du keine Strings vergleichen. Evtl. hast Du hier an Hero.getAge()
        gedacht und wolltest das Alter vergleichen?        
        	*/
        	
        System.out.println("\nOrder by name (aufsteigend):");
        showList(heroes);
        
        
        
        // TODO 2: Add a Comparator and sort by age (descending)
        // anonymen Comparator erzeugen, der einen Vergleich für absteigende Sortierung implementiert
        

        Comparator<Hero> ageDescendingComparator =new Comparator<Hero>() {
        	
        	@Override
        	public int compare(Hero h1, Hero h2) {
        		return Integer.valueOf(h2.getAge()).compareTo(Integer.valueOf(h2.getAge()));
        	}
        };
        
        
     // Ausgabe von ArrayList mit dem erzeugten Comparator (absteigend sortieren):

     		Collections.sort(heroes, ageDescendingComparator);
     		System.out.println("\nOrder by age (absteigend):");
     		showList(heroes); 
        
    }
    
    
    private static void showList(List<Hero> heroes) {
        for (Hero heroList : heroes) {
            System.out.println(heroList.getName() + ", " + heroList.getAge());
        }
    }
 
}

