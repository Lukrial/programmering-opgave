import processing.core.PApplet;

public class Main extends PApplet {

    processing.core.PImage img;
    Julelys julelys;
    Julegave julegave;

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    @Override
    public void settings() {
        super.settings();
        size(800, 800);
    }

    public void setup(){
        img = loadImage("christmas-2990482_1280.png");
        julelys = new Julelys(this);
        julegave = new Julegave(this);
    }

    public void draw(){
        clear();
        background(200,200,200);
        image(img,150,0,500,750);
        julelys.tegnJulelys();
        julegave.tegnJulegave();
    }

    public void mousePressed(){
        julelys.registrerKlik();
    }
}
