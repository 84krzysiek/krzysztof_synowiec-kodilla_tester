public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g", 1000, 2010);
        //System.out.println(notebook.weight);
        //System.out.println(notebook.price);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year );
        notebook.checkPrice();




        Notebook heavyNotebook = new Notebook("2000g", 1500, 2021 );
        //System.out.println(heavyNotebook.weight);
        //System.out.println(heavyNotebook.price);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();




        Notebook oldNotebook = new Notebook("1200g", 500, 2000);
        //System.out.println(oldNotebook.weight);
        //System.out.println(oldNotebook.price);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year );
        oldNotebook.checkPrice();







    }
}


