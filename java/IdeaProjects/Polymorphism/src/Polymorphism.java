/**
 * Created by Tim on 8/6/2017.
 */
public class Polymorphism {

    // You can create multiple classes *inside* a single piece of source code.
    // There are only a small number of circumstances in which this is
    // preferable; in this instance it is merely to save time.

    // First we are creating a basic class 'Movie'. It will have a constructor that
    // will populate the single field, 'name'.

    static class Movie {
        private String name;                // field

        public Movie(String name) {         // constructor
            this.name = name;
        }

        public String plot() {              // method
            return "No plot here.";
        }

        public String getName() {
            return name;
        }
    }


    // Now we're going to create five classes that extend Movie. Each will
    // have a unique title, and most will override the 'plot()' method.

    static class Jaws extends Movie {

        public Jaws() {                     // constructor
            super("Jaws");             // calls the constructor in the superclass
        }

        @Override
        public String plot() {
            return "A shark eats lots of people, gets blown to bits.";
        }
    }


    static class IndependenceDay extends Movie {

        public IndependenceDay() {           // constructor
            super("Independence Day");  // calls the constructor in the superclass
        }

        @Override
        public String plot() {
            return "Aliens attack earth, but Will Smith saves the day.";
        }
    }


    static class StarWars extends Movie {

        public StarWars() {                  // constructor
            super("Star Wars");        // calls the constructor in the superclass
        }

        @Override
        public String plot() {
            return "Imperial forces get what's coming to them.";
        }
    }


    static class CloseEncounters extends Movie {

        public CloseEncounters() {                              // constructor
            super("Close Encounters of the Third Kind");   // calls the constructor in the superclass
        }

        @Override
        public String plot() {
            return "We get every answer we ever wanted about alien visits.";
        }
    }


    static class Forgettable extends Movie {

        public Forgettable() {               // constructor
            super("Forgettable");       // calls the constructor in the superclass
        }

        // No plot method
    }


    // So what the HELL is going on here?
    // When these individual classes are instantiated, they become a hybrid of
    // their class, and the parent Movie class that they extend. Each of them has
    // a name field, each of them has a getter for that name field, and EACH of
    // them has a plot() method -- four have their own, one inherits from the
    // parent class. The key thing to notice is, they are all considered
    // by Java to be a 'Movie' object.

    public static void main(String[] args) {

        // This loop will request 10 movies to be returned to it one at a time.
        // It will then print out information about the movies.

        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ":  " + movie.getName());
            System.out.println("Plot:  " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {

        // This method will return the movies based on the result of a random
        // number generation process. Notice that the objects being returned
        // are of object 'Movie', yet they are actually classes that are
        // subclasses, or children, of the Movie class.

        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                return new Jaws();                  // returned as Movie class!
            case 2:
                return new IndependenceDay();       // returned as Movie class!
            case 3:
                return new StarWars();              // returned as Movie class!
            case 4:
                return new CloseEncounters();       // returned as Movie class!
            case 5:
                return new Forgettable();           // returned as Movie class!
        }

        return null;
    }


}
