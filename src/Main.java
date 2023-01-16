public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();

    }

    public static void task1() {
        System.out.println("Task 1");
        int moneyPerMonth = 15000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total = total + total/100;
            total = total + moneyPerMonth;
            System.out.println("Month = " + month + ", money = " + total);
            month ++;
        }

    }

    public static void task2() {
        System.out.println("Task 2");
        byte number = 0;
        while (number < 10) {
            number ++;
            System.out.print(number + " ");
        }

        System.out.println();

        for (; number > 0; number --) {
            System.out.print(number + " ");
        }
    }

    public static void task3() {
        System.out.println("Task 3");
        int population = 12_000_000;
        float birthRate = 0.017f; // 17 people for each 1000 is equal to 0.017%
        float deathRate = 0.008f;
        byte year = 1;

        while (year <= 10) {
            float numberOfDeath = population * deathRate;
            float numberOfBirth = population * birthRate;
            population = population - (int) numberOfDeath + (int) numberOfBirth;
            System.out.println(year + " year, population is equal to " + population);
            year++;

        }
    }

    public static void task4() {
        System.out.println("Task 4");
        int total = 15_000;
        float interestOnTheDeposit = 0.07f;
        int month = 0;

        while(total < 12_000_000) {
            month++;
            total = total + (int) (total*interestOnTheDeposit);
            System.out.println("Month = " + month + ", money on the deposit = " + total);
        }

    }

    public static void task5() {
        System.out.println("Task 5");
        int total = 15_000;
        float interestOnTheDeposit = 0.07f;
        int month = 0;

        while(total < 12_000_000) {
            month++;
            total = total + (int) (total*interestOnTheDeposit);

            if (month % 6 == 0 || total >= 12_000_000){  //Final month is not evenly divisible, therefore double condition
                System.out.println("Month = " + month + ", money on the deposit = " + total);
            }
        }

    }

    public static void task6() {
        System.out.println("Task 5");
        int investTime = 9 * 12; //9 years in months
        int deposit = 15_000;
        float interestOnTheDeposit = 0.07f;
        int currentMonth = 0;
        
        while (currentMonth != investTime) {
            currentMonth++;
            deposit = deposit + (int) (deposit*interestOnTheDeposit);
            
            if(currentMonth % 6 == 0) {
                System.out.println("currentMonth = " + currentMonth + ", money on the deposit = " + deposit);
            }
        }


    }

    public static void task7() {
        System.out.println("Task 7");
        int firstFriday = 5;
        int date = 1;
        int dayInMonth = 31;


        while (date <= dayInMonth) {
            boolean isFriday = date == firstFriday || ((date - firstFriday) % 7 == 0);

            if (isFriday) {
                System.out.println("Today is Friday, " + date + "day. Don't forget to make a report!");
            }

            date ++;
        }

    }

    public static void task8() {
        System.out.println("Task 8");
        int currentYear = 2023;
        int periodBeforeCurrentYear = 200;
        int periodAfterCurrentYear = 100;
        int asteroidInterval = 79;
        int asteroidYear = 0;

        while (asteroidYear <= (currentYear + periodAfterCurrentYear) ) {
            if (asteroidYear >= (currentYear - periodBeforeCurrentYear)) {
                System.out.println(asteroidYear);
            }
            asteroidYear += asteroidInterval;
        }



    }
}