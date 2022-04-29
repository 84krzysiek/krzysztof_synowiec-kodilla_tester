public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2010);
        //System.out.println(notebook.weight);
        //System.out.println(notebook.price);
        System.out.println();
        System.out.println( notebook.price + " euro " + notebook.year + " year " + notebook.weight + " grams" );
        notebook.checkPrice();
        notebook.checkWeight();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2021 );
        //System.out.println(heavyNotebook.weight + weight + "g");
        //System.out.println(heavyNotebook.price);
        System.out.println();
        System.out.println( heavyNotebook.price + " euro " + heavyNotebook.year + " year " + heavyNotebook.weight + " grams");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();


        Notebook oldNotebook = new Notebook(1200, 500, 2000);
        //System.out.println(oldNotebook.weight);
        //System.out.println(oldNotebook.price);
        System.out.println();
        System.out.println(oldNotebook.price + " euro " + oldNotebook.year + " year " + oldNotebook.weight + " grams");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();









    }
}


