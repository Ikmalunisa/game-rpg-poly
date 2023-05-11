
public class Hero extends Character {
    @Override
    public void move() {
        System.out.println("Seorang Hero mulai bergerak");
    }

    public void move(String direction) {
        System.out.println("Seorang Hero mulai bergerak dan menghadap ke arah "+direction);
    }
    
    
    
}