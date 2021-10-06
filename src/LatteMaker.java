public class LatteMaker extends DrinkMaker {
    @Override
    public void getName() {
        System.out.println("Делаем латте");
        System.out.println();

    }
    @Override
    public void getRightCup() {
        System.out.println("Берем чашку для латте");

    }

    @Override
    public void putIngredient() {
        System.out.println("Добавляем кофе");

    }

    @Override
    public void pour() {
        System.out.println("Заливаем молоком с пенкой");

    }
}