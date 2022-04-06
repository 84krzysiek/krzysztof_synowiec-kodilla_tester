package LeapYear;


public class LeapYear{

            public static void main(String[] args) {
                int rok = 1600;
                System.out.println(rok);
                boolean rokPrzestepny;


                if (rok % 4 == 0  && rok % 100 == 0 && rok % 400 == 0 ) {
                    rokPrzestepny = true;
                } else  {
                    rokPrzestepny = false;}
                System.out.println(rokPrzestepny);
            }

        }















