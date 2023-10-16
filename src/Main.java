import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respond = 0;
        // Використовуємо цикл, поки respond не дорівнює 1 або 2
        while (respond != 1 && respond != 2) {
            System.out.print("Яке завдання бажаєте переглянути? (1/2) ");
            respond = scanner.nextInt();
            if (respond == 1) {
                // Виконуємо завдання 1
                Product product = new Product(1034, "Сухарики", "4 841900 001034", "YAW!", 13.45, 365, 2);
                product.show();

                product.setQuantity(123);
                product.show();
                System.out.println("Загальна вартість сухариків: " + product.calculateTotalPrice() + " грн.");
            } else if (respond == 2) {
                // Виконуємо завдання 2
                System.out.print("Введіть кількість дробів: ");
                int k = scanner.nextInt();
                if (k > 0) {
                    Fraction[] fractions = new Fraction[k];
                    for (int i = 0; i < k; i++) {
                        System.out.print("Дріб №" + (i + 1));
                        fractions[i] = new Fraction();
                    }

                    System.out.println("Введені дроби:");
                    for (int i = 0; i < k; i++) {
                        if (fractions[i].getNumerator() > fractions[i].getDenominator()) {
                            int a = fractions[i].getNumerator() / fractions[i].getDenominator(); // Ціла частина
                            int b = fractions[i].getNumerator() - fractions[i].getDenominator() * a; // Остаток чисельника
                            if (b == 0) // Повністю ціла частина
                                System.out.println("Дріб №" + (i + 1) + ": " + fractions[i] + " (Зводиться до " + a + ")");
                            else // Мішаний дріб
                                System.out.println("Дріб №" + (i + 1) + ": " + a + "+(" + b + "/" + fractions[i].getDenominator() + ")");
                        } else // Правильний дріб
                        {
                            System.out.println("Дріб №" + (i + 1) + ": " + fractions[i]);
                        }
                    }
                }
            }
        }
    }
}
