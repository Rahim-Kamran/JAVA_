public class enumday {
    enum Day{
        Monday, Tuesday, Wednesday
    }
    class EnumDemo{
        public static void main(String[] args) {
            Day day = Day.Tuesday;
            switch(day){
                case Monday:
                    System.out.println("Today is Monday");
                    break;
                case Tuesday:
                    System.out.println("Today is Tuesday");
                    break;
                case Wednesday:
                    System.out.println("Today is Wednesday");
                    break;
            }
        }
    }
    
}
