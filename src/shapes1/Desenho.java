public class Desenho{
    public static void main(String[] args){
        
        Circle sun = new Circle();
        Triangle roof = new Triangle();
        Square home = new Square();
        Square window = new Square();
        Square door = new Square();
        Square door2 = new Square();

        //sol
        sun.makeVisible();
        sun.changeColor("yellow");
        sun.changeSize(55);
        sun.moveRight();

        //casa
        home.makeVisible();
        home.changeColor("blue");
        home.changeSize(100);
        home.moveDown();
        home.moveDown();
        home.moveDown();
        home.moveDown();
        home.moveDown();
        home.moveDown();
        home.moveDown();
        home.moveDown();
        home.moveRight();
        home.moveRight();

        //teto
        roof.makeVisible();
        roof.changeSize(55,150);
        roof.changeColor("black");
        roof.moveDown();
        roof.moveDown();
        roof.moveDown();
        roof.moveDown();
        roof.moveDown();
        roof.moveDown();
        roof.moveDown();
        roof.moveRight();
        roof.moveRight();
        roof.moveRight();
        roof.moveRight();
        roof.moveRight();
        
        //janela
        window.makeVisible();
        window.changeColor("white");
        window.changeSize(20);
        window.moveDown();
        window.moveDown();
        window.moveDown();
        window.moveDown();
        window.moveDown();
        window.moveDown();
        window.moveDown();
        window.moveDown();
        window.moveDown();
        window.moveRight();
        window.moveRight();
        window.moveRight();
        
        //porta
        door.makeVisible();
        door.changeSize(20);
        door.changeColor("black");
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveRight();
        door.moveRight();
        door.moveRight();
        door.moveRight();
        
        door2.makeVisible();
        door2.changeSize(20);
        door2.changeColor("black");
        door2.moveDown();
        door2.moveDown();
        door2.moveDown();
        door2.moveDown();
        door2.moveDown();
        door2.moveDown();
        door2.moveDown();
        door2.moveDown();
        door2.moveDown();
        door2.moveDown();
        door2.moveDown();
        door2.moveRight();
        door2.moveRight();
        door2.moveRight();
        door2.moveRight();
    }
}