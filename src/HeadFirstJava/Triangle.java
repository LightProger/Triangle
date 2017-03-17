package HeadFirstJava;

/*
Создать 4 треугольника через массив, определить площадь треугольников через основание и высоту.
Пятый треугольник равен второму. Площадь пятого треугольника равна 343.
 */

public class Triangle {

    // Переменные
    static double area;
    static int height;
    static int length;

    public static void main(String[] args) {

	// Создаем массив треугольников
        Triangle[] ta = new Triangle[4];

        // С помощью цикла создаем объекты - треугольники и задаем высоту и длину сторон,
        // отправляем в метод рассчета площади
        int x = 0;
        while (x < 4){
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();

            // Выводим созданные треуголники и их площадь на экран
            System.out.print("Треугольник " + x + ", площадь ");
            System.out.println(" = " + ta[x].area);
            x += 1;
        }

        // Создание и определение площади четвертого треугольника
        int y = x;
        Triangle t5 = ta[2];
        t5.area = 343;
        System.out.print("y = " + y);
        System.out.println(", площадь t5 = " + t5.area);
    }

    // Расчитываем плоащадь теугольника через основание и высоту
    private void setArea() {
        area = (height * length) / 2;
    }
}
