public class Main {
    public static void main(String[] args) {
        int driverAge = 19;

        if (driverAge >= 18)
        {
            System.out.println("Поздравляем вы совершеннолетний"); }

            if (driverAge < 18)
            {
                System.out.println("К сожалению вы еще не достигли совершеннолетия и вам придется немного подождать");
            }


            int educationAge = 50;

            if (educationAge >= 7)
                if (educationAge < 18) {
                System.out.println("Школьник");
            }
            if (educationAge >= 18)
            if (educationAge < 24){
                System.out.println("Студент");
            }
            if (educationAge >= 24) {
                System.out.println("Уже работает");
            }


            int totalSpace = 102;
            int seatPlace = 60;
            int standPlace = totalSpace - seatPlace;
            int humans = 101;

            if (humans <= seatPlace) {
                System.out.println("Сидячих мест осталось " + (seatPlace - humans));
            }
            if (humans > seatPlace) {
                System.out.println("Сидячих мест не осталось");
            }
            if (humans < seatPlace)
                if (humans < totalSpace) {
                    System.out.println("Стоячих мест осталось " + standPlace);
                }
            if (humans > seatPlace)
                if (humans < totalSpace) {
                System.out.println("Стоячих мест занаято " + (humans - seatPlace) + " из 42");
            }
            if (humans >= totalSpace) {
                System.out.println("Стоячих мест не осталось");
                System.out.println("Вагон заполнен");
            }

        }
}