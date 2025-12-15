import processing.core.PApplet;

public class snowfall extends PApplet{
    float x1,y1,a1;
    float x2,y2,a2;

    public void settings(){
        size(800,800);
    }

    public void setup(){
        x1 = random(width);
        y1 = random(-height);
        a1 = random(TWO_PI);

        x2 = random(width);
        y2 = random(-height);
        a2 = random(TWO_PI);
    }

    public void draw(){
        background(0);

        drawSnowflake(x1,y1,a1);
        y1 += 5;
        a1 += 0.02;
        if(y1 > height) y1 = 0;

        drawSnowflake(x2,y2,a2);
        y2 += 7;
        a2 -= 0.015;
        if(y2 > height) y2 = 0;
    }
    void drawSnowflake(float x, float y, float a){
        pushMatrix();
        translate(x,y);
        rotate(a);
        stroke(255);
        strokeWeight(4);
        line(-20,0,20,0);
        line(0,-20,0,20);
        line(-14,-14,14,14);
        line(-14,14,14,-14);
        popMatrix();
    }
    public static void main(String[] args){
        PApplet.main("snowfall");
    }
}