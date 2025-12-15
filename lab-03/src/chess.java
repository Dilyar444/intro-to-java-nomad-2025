import javax.swing.JOptionPane;
import processing.core.PApplet;

public class chess extends PApplet{
    int width, height;

    public void settings(){
        size(900,900);

    }

    public void setup(){
        width = Integer.parseInt(JOptionPane.showInputDialog("Вводи ширину доски"));
        height = Integer.parseInt(JOptionPane.showInputDialog("Вводи высоту доски"));
    }

    public void draw(){
        int x = 900 /3, y = 900/3;

        for(int i =0; i < height; i++){
            for(int j = 0; j < width; j ++){
                int x1 = x + j * 50, y1 = y + i * 50;

                fill((i + j)%2 ==0 ? color(34,139,34):255);
                square(x1,y1,50);

                if(mouseX >= x1 && mouseX <= x1 + 50 && mouseY >= y1 && mouseY <= y1 + 50){
                    noFill();
                    stroke(255,0,0);
                    strokeWeight(4);
                    rect(x1,y1,50,50);
                    noStroke();
                }
            }
        }
    }
    public static void main(String[] args){
        PApplet.main("chess");
    }
}