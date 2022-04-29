public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("The price is good");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        }
        if (this.year <= 2000 || this.year < 2009 || this.price < 900) {
            System.out.println("This is low price notebooks from old days");
        } else if (this.year >= 2010 && this.year <= 2018 && this.price >= 1000 && this.price <= 1400) {
            System.out.println("This is mid price notebooks  ");
        } else if (this.year >= 2019 && this.year < 2022 && this.price >= 1500 && this.price <= 2500) {
            System.out.println("This high price notebook from last couple years");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("light stuff");
        } else if (this.weight > 1000 && this.weight < 1900) {
            System.out.println("quite heavy ");
        } else if (this.weight <= 2000) {
            System.out.println("This is heavy stuff");
        }
    }
}




















