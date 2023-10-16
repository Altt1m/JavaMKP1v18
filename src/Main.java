import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int respond = 0;
        // Використовуємо цикл, поки respond не дорівнює 1 або 2
        while (respond != 1 && respond != 2)
        {
            System.out.print("Яке завдання бажаєте переглянути? (1/2) ");
            respond = scanner.nextInt();
            if (respond == 1)
            {
                // Виконуємо завдання 1
                Product product1 = new Product(1034, "Сухарики", "4 841900 001034", "YAW!", 13.45, 365, 2);
                product1.show();

                product1.setQuantity(123);
                product1.show();
                System.out.println("Загальна вартість сухариків: " + product1.calculateTotalPrice() + " грн.\n");

                Product product2 = new Product(1034, "Чипси", "0 123467 891011", "Lay's", 36.55, 365, 20);
                Product product3 = new Product(1034, "Газировка", "0 123467 891012", "Coca-Cola", 18.20, 365, 30);
                Product product4 = new Product(1034, "Печиво", "0 123467 891013", "Есмеральда", 59.90, 365, 15);

                System.out.println();
                List<Product> products = new ArrayList<>();
                products.add(product1);
                products.add(product2);
                products.add(product3);
                products.add(product4);
                for (Product product : products)
                {
                    if (product.getPrice() < 20)
                        System.out.println(product.getName() + ": " + product.getPrice() + " грн.");
                }

            }
            else if (respond == 2)
            {
                // Виконуємо завдання 2
                System.out.print("Введіть кількість дробів: ");
                int k = scanner.nextInt();
                if (k > 0)
                {
                    Fraction[] fractions = new Fraction[k];
                    for (int i = 0; i < k; i++)
                    {
                        System.out.print("Дріб №" + (i + 1));
                        fractions[i] = new Fraction();
                    }

                    System.out.println("Введені дроби:");
                    for (int i = 0; i < k; i++)
                    {
                        if (fractions[i].getNumerator() > fractions[i].getDenominator())
                        {
                            int a = fractions[i].getNumerator() / fractions[i].getDenominator(); // Ціла частина
                            int b = fractions[i].getNumerator() - fractions[i].getDenominator() * a; // Остаток чисельника
                            if (b == 0) // Повністю ціла частина
                                System.out.println("Дріб №" + (i + 1) + ": " + fractions[i] + " (Зводиться до " + a + ")");
                            else // Мішаний дріб
                                System.out.println("Дріб №" + (i + 1) + ": " + a + "+(" + b + "/" + fractions[i].getDenominator() + ")");
                        }
                        else // Правильний дріб
                        {
                            System.out.println("Дріб №" + (i + 1) + ": " + fractions[i]);
                        }
                    }
                }
            }
        }
    }
}
