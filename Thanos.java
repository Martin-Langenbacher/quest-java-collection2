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

/*
1.

Modify the Hero class by using the Comparable class. The default sort order should be alphabetically by the name attribute.
2.

In the Thanos class, ensure that the list of heroes is sorted alphabetically.
3.

In the Thanos class, add a Comparator to sort the list of heroes by the age attribute in descending order.

Run Thanos. The expected result is as follows:

Order by name:
Black Widow, 34
Captain America, 100
Hulk, 49
Thor, 1501
$ 
Order by age:
Thor, 1501
Captain America, 100
Hulk, 49
Black Widow, 34




*/
