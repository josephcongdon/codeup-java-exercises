package movies;

public class Movie  implements Entertains {
    protected String name;
    protected String category;

    public Movie( String name, String category){
        this.name = name;
        this.category = category;
    }

    public Movie(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String audienceReaction() {
        return "ooooooh " + getName() + " was so awesome ";
    }
}

// 4. Create a class called movies.Movie. The class should define two instance variables of type String named name and category. Add a constructor that takes two strings and sets the name and category properties based on the passed arguments. Make it so the instance variables are not accessible from outside the movies.Movie class. Write getters and setters for the instance variables.
// Bonus: if the passed name or category arguments are null or empty, the constructor should throw an IllegalArgumentException