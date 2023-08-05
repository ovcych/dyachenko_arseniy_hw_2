import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(getResult(25, 5));
        System.out.println(getResult(18, 20));
        System.out.println(getResult(50, -5));
        System.out.println(getResult(30, 35));
        System.out.println(getResult(15, 10));

        test(23, 10);
        test(generateRandomAge(), 10);
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int minAge = 1;
        int maxAge = 100;
        return random.nextInt(maxAge - minAge + 1) + minAge;
    }

    public static void test(int age, int temperature) {
        String result = getResult(age, temperature);
        System.out.println("Возраст: " + age + ", температура: " + temperature + " -> " + result);
    }

    public static String getResult(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}
