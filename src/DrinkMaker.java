public abstract class DrinkMaker {
        public abstract void getName ();
        public abstract void getRightCup ();
        public abstract void putIngredient ();
        public abstract void pour ();
        public void makeDrink () {
            getName();
            getRightCup();
            putIngredient();
            pour();
        }
    }