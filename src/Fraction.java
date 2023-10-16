import java.util.Scanner;
class Fraction // Звичайний дріб
{
    private int numerator; // Чисельник
    private int denominator; // Знаменник

    // Конструктор для створення об'єкта дробу
    public Fraction()
    {
        System.out.print("\nВведіть чисельник: ");
        Scanner scanner = new Scanner(System.in);
        this.numerator = scanner.nextInt();

        System.out.print("Введіть знаменник: ");
        int denom = scanner.nextInt();
        if (denom != 0)
        {
            this.denominator = denom;
        }
        else
        {
            throw new IllegalArgumentException("Знаменник не може дорівнювати нулю");
        }
    }

    // Гетер для отримання чисельника
    public int getNumerator()
    {
        return numerator;
    }

    // Гетер для отримання знаменника
    public int getDenominator()
    {
        return denominator;
    }

    // Метод для обчислення значення дробу у десятковому форматі
    public double calculateValue()
    {
        return (double)numerator / denominator;
    }

    // Перевизначення методу toString для представлення дробу у вигляді рядка
    public String toString()
    {
        return getNumerator() + "/" + getDenominator();
    }
}
