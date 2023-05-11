public class Enemy extends Character {
    @Override
    public void move() {
        System.out.println("Seorang Enemy mulai bergerak !!!");
    }
    public void move(int step) {
        System.out.println("Seorang Enemy mulai bergerak sejauh "+step+" langkah");
    }

}
