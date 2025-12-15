import processing.core.PApplet;

public class snowfall_3 extends PApplet {

    int count = 100;           // количество снежинок
    float[] xs = new float[count];
    float[] ys = new float[count];
    float[] angles = new float[count];
    float speed = 2f;

    public void settings() {
        size(800, 800);
    }

    public void setup() {

        // Инициализируем снежинки
        for (int i = 0; i < count; i++) {
            xs[i] = random(width);
            ys[i] = random(-height, 0);
            angles[i] = random(TWO_PI);
        }

        stroke(255);
        strokeWeight(2);
    }

    public void draw() {
        background(0);

        for (int i = 0; i < count; i++) {
            drawSnowflake(xs[i], ys[i], angles[i]);

            angles[i] += 0.01f;
            ys[i] += speed;

            // Перезагрузка снежинки
            if (ys[i] > height + 20) {
                ys[i] = -20;
                xs[i] = random(width);
            }
        }
    }

    void drawSnowflake(float x, float y, float a) {
        pushMatrix();
        translate(x, y);
        rotate(a);

        for (int i = 0; i < 3; i++) {
            rotate(PI / 3);
            line(-15, 0, 15, 0);
        }
        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("snowfall_3");
    }
}
