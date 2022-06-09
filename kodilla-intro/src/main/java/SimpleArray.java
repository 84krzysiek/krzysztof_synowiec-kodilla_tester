public class SimpleArray {
    public static void main(String[] args) {//metoda main
        String[] znajomi = new String[5];//utworzenie tablicy o rozmiarze 5 indeksów
        znajomi[0] = "Paula";//wypełnienie indeksów tablicy danymi
        znajomi[1] = "Aneta";
        znajomi[2] = "Pawel";
        znajomi[3] = "Andrzej";
        znajomi[4] = "Marta";


        int numberOfElements = znajomi.length;// polecenie sprawdzające rozmiar tablicy
        System.out.println("Moja tabl zawiera el:" + numberOfElements);// wyświetlenie Stringa "Moja tabl" + inta numberOfelements z linii 11

        System.out.println(znajomi[3]);//wyświetlenie konkretnego elementu z tablicy,indeks [3]




    }

}
