package movies;

public class Movie  implements Entertains {
    protected String name;
    protected String director;

    public Movie( String name, String director){
        this.name = name;
        this.director = director;
    }

    public Movie(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String audienceReaction() {
        return "ooooooh " + getName() + " was so awesome ";
    }
}

// 4. Create a class called movies.Movie. The class should define two instance variables of type String named name and director. Add a constructor that takes two strings and sets the name and director properties based on the passed arguments. Make it so the instance variables are not accessible from outside the movies.Movie class. Write getters and setters for the instance variables.
// Bonus: if the passed name or director arguments are null or empty, the constructor should throw an IllegalArgumentException