public class Hero implements Comparable<Hero>{
	
    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        super();
    	this.name = name;
        this.age = age;
    }


	// accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

	
    // "toString came from the video":
    @Override
	public String toString() {
		return "Hero [name=" + name + ", age=" + age + "]";
	}

    public int compareTo(Hero anotherHero) {
    	// Es wird nach dem Namen des Hero aufsteigend sortiert
    			return this.getName().compareTo(anotherHero.getName());
    		}
    
    /*
	@Override 
	public int compareTo(Hero hero2) {
    	
    	// this > arg0 = +
    	// this < arg0 = -
    	// == arg0 = 0
    	
    	if(this.getAge() > hero2.getAge())
    		return -1;
    	else if (this.getAge() < hero2.getAge())
    		return 1;
    	else {
    		return 0;
    	}
	}

*/
}

