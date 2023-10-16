public class Product // Товар
{
    private int id; // Унікальний ідентифікатор товару (ID)
    private String name; // Назва товару
    private String upc; // Універсальний товарний код (UPC)
    private String manufacturer; // Виробник товару
    private double price; // Ціна товару
    private int storagePeriod; // Строк зберігання товару (у днях)
    private int quantity; // Кількість товару на складі

    // Конструктор з параметрами для ініціалізації властивостей товару
    public Product(int id, String name, String upc, String manufacturer, double price, int storagePeriod, int quantity)
    {
        this.id = id;
        this.name = name;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.storagePeriod = storagePeriod;
        this.quantity = quantity;
        System.out.println("Продукт додано.");
    }

    // Сетери і гетери для доступу до властивостей товару
    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setUpc(String upc)
    {
        this.upc = upc;
    }

    public String getUpc()
    {
        return upc;
    }

    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public void setStoragePeriod(int storagePeriod)
    {
        this.storagePeriod = storagePeriod;
    }

    public int getStoragePeriod()
    {
        return storagePeriod;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getQuantity()
    {
        return quantity;
    }

    // Метод для виведення інформації про товар
    public void show()
    {
        System.out.println("\nID: " + id);
        System.out.println("Найменування: " + name);
        System.out.println("UPC: " + upc);
        System.out.println("Виробник: " + manufacturer);
        System.out.println("Ціна: " + price + " грн.");
        System.out.println("Термін зберігання: " + storagePeriod + " днів");
        System.out.println("Кількість: " + quantity);
    }

    // Метод для підрахунку загальної вартості товару
    public double calculateTotalPrice()
    {
        return price * quantity;
    }
}
