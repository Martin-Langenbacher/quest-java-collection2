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
        Collections.sort(heroes, Comparator.comparing(Hero::getName));
        
        
        /* Hat nicht funktioniert: (1)
        ============================================================
        Comparator<Hero> com =new Comparator<Hero>() {
        	@Override
        	public int compare(Hero h1, Hero h2) {
        		return h1.getName().compareTo(h2.getName());
        	}
        };
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
        	*/
        	
        System.out.println("\nOrder by name:");
        showList(heroes);
        
        
        
        // TODO 2: Add a Comparator and sort by age (descending)
        Collections.sort(heroes); 
        
        System.out.println("\nOrder by age:");
        showList(heroes);
    }
    
    private static void showList(List<Hero> heroes) {
        for (Hero heroList : heroes) {
            System.out.println(heroList.getName() + ", " + heroList.getAge());
        }
    }
 
}

