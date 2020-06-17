import processing.core.PApplet;

public class Julelys extends Main{

    boolean julelysTrykket;
    int positionX = 425; int positionX2 = 375; int positionX3 = 350;
    int positionY = 325; int positionY2 = 150; int positionY3 = 550;
    int farve = 255; int farve2 = 255; int farve3 = 255;
    int bredde = 15;
    int hoejde = 25;

    PApplet p;

    public Julelys(PApplet PA1){
        p = PA1;
    }

    void tegnJulelys() {
        p.fill(farve, 0, 0);
        p.ellipse(positionX,positionY,bredde,hoejde);
        p.fill(0, farve2, 0);
        p.ellipse(positionX2,positionY2,bredde,hoejde);
        p.fill(0, 0, farve3);
        p.ellipse(positionX3,positionY3,bredde,hoejde);

    }

    void registrerKlik() {
        if ((p.mouseX >= positionX) && (p.mouseX <= positionX + bredde) && (p.mouseY >= positionY) && (p.mouseY <= positionY + hoejde) && (p.mousePressed==true)) {
            farve = 50;
        } else {
            farve = 255;
        }
        if ((p.mouseX >= positionX2) && (p.mouseX <= positionX2 + bredde) && (p.mouseY >= positionY2) && (p.mouseY <= positionY2 + hoejde) && (p.mousePressed==true)) {
            farve2 = 50;
        } else {
            farve2 = 255;
        }
        if ((p.mouseX >= positionX3) && (p.mouseX <= positionX3 + bredde) && (p.mouseY >= positionY3) && (p.mouseY <= positionY3 + hoejde) && (p.mousePressed==true)) {
            farve3 = 50;
        } else {
            farve3 = 255;
        }
    }
}