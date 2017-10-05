/**
 * Created by Tim on 9/3/2017.
 */
public class BurgerAdditions {

    static class Addition {

        private String name;
        private double price;

        public Addition(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

    }


    static class Cheese extends Addition {

        public Cheese() {
            super("Cheese", 0.75);
        }
    }

    static class Lettuce extends Addition {

        public Lettuce() {
            super("Lettuce", 0.50)
        }
    }

    static class Tomato extends Addition {

        public Tomato() {
            super("Tomato", 0.50);
        }
    }

    static class Mushrooms extends Addition {

        public Mushrooms() {
            super("Mushrooms", 1.00)
        }
    }

    static class Bacon extends Addition {

        public Bacon() {
            super("Bacon", 1.50);
        }
    }

    static class Mayo extends Addition {

        public Mayo() {
            super("Mayo", 0.50)
        }
    }


}
