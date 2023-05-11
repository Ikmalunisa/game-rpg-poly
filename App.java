public class App {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("Nama : Ikmalunisa Annora");
        System.out.println("NIM  : 225150601111015");
        System.out.println("===========================");
        System.out.println("");
        //Static polymorphism pada class Hero dan static polymorphism pada class Enemy
        Hero pahlawan = new Hero();
        pahlawan.move();
        pahlawan.move("Kanan");
        System.out.println("");
        Enemy penjahat = new Enemy();
        penjahat.move();
        penjahat.move(20);
        System.out.println("");
        System.out.println("===========================");
        System.out.println("");
        
        
        
        //Dynamic polymorphism sebuah referensi dari class Character ke objek class: Hero, Enemy, Witch, dan Fighter
        Character ch = new Character();
        ch.move();
        ch = new Hero();
        ch.move();
        ch = new Enemy();
        ch.move();
        ch = new Witch();
        ch.move();
        ch = new Fighter();
        ch.move();
        System.out.println("");
        System.out.println("===========================");
        System.out.println("");

        
        
        //Dynamic polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter
        ch = new Witch();
        ch.move();
        Character fg = (Fighter)ch;
        fg.move();
        
        
        

        
    }
}
