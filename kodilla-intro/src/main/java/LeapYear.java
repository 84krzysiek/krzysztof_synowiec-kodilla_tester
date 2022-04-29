public class LeapYear {

    public static void main(String[] args) {
        int rok = 2022;
        System.out.println(rok);
        boolean rokPrzestepny;
        if (rok % 4 == 0) {
            if (rok % 100 == 0) {
                if (rok % 400 == 0) {
                    rokPrzestepny = true;
                } else {
                    rokPrzestepny = false;
                }
            } else {
                rokPrzestepny = true;
            }
        } else {
            rokPrzestepny = false;
        }
        System.out.println(rokPrzestepny);

    }

}















