import processing.core.PApplet;

public class chess2 extends PApplet {

    int x;
    int y;
    int customWidth;
    int customHeight;

    @Override
    public void settings() {
        customWidth = 900;
        customHeight = 900;
        size(customWidth, customHeight);
    }

    @Override
    public void setup() {
        x = customHeight / 3;
        y = customWidth / 3;
        noStroke(); // по умолчанию без обводки
    }

    @Override
    public void draw() {
        int tempX = x;
        int tempY = y;

        background(200); // просто фон

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                // Обычная шахматная раскраска
                if ((i + j) % 2 == 0) {
                    fill(255);   // белая клетка
                } else {
                    fill(0);     // черная клетка
                }

                // Проверяем наведение мыши
                if (mouseX >= tempX && mouseX < tempX + 50 &&
                        mouseY >= tempY && mouseY < tempY + 50)
                {
                    stroke(255, 0, 0); // красная обводка (можно заменить)
                    strokeWeight(3);
                } else {
                    noStroke();
                }

                square(tempX, tempY, 50);

                tempX += 50;
            }
            tempX = x;
            tempY += 50;
        }
    }

    public static void main(String[] args) {
        PApplet.main("chess2");
    }
}
