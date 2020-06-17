import processing.core.PApplet;

public class Julegave extends Main {

    int positionX = 280;
    int positionY = 666;
    int bredde = 50;
    int hoejde = 50;
    int v = 1;
    boolean stinko;

    PApplet p;

    public Julegave(PApplet PA2) {
        p = PA2;
    }

    void tegnJulegave() {
        p.fill(255, 0, 0);
        p.rect(positionX, positionY, bredde, hoejde);
        p.fill(0,255,0);
        p.rect(positionX+20, positionY, 10,hoejde);
        p.rect(positionX,positionY+20,bredde,10);
        if((p.mouseX >= positionX) && (p.mouseX <= positionX + bredde) && (p.mouseY >= positionY) && (p.mouseY <= positionY + hoejde) && (p.mousePressed==true)){
            stinko = true;
            v++;
            if ((v < 50) && (stinko == true) && (p.mouseX >= positionX) && (p.mouseX <= positionX + bredde) && (p.mouseY >= positionY) && (p.mouseY <= positionY + hoejde) && (p.mousePressed==true)) {
                p.fill(255, 0, 0);
                p.rect(330, 640, 5, 25);
                p.fill(255, 0, 0);
                p.rect(275, 640, 5, 25);
            }
            if ((v >= 50) && (v < 100) && (stinko == true) && (p.mouseX >= positionX) && (p.mouseX <= positionX + bredde) && (p.mouseY >= positionY) && (p.mouseY <= positionY + hoejde) && (p.mousePressed==true)) {
                p.fill(255, 0, 0);
                p.rect(330, 660, 25, 5);
                p.fill(255, 0, 0);
                p.rect(280, 660, -25, 5);
            }
            if (v >= 100 && (stinko == true) && (p.mouseX >= positionX) && (p.mouseX <= positionX + bredde) && (p.mouseY >= positionY) && (p.mouseY <= positionY + hoejde) && (p.mousePressed==true)) {
                p.fill(255, 0, 0);
                p.rect(330, 666, 5, 25);
                p.fill(255, 0, 0);
                p.rect(275, 666, 5, 25);
            }
        }
    }
}
