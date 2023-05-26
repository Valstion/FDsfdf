import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        System.out.println("_______________________1111____________________________________");
        Random random = new Random();
        int countGreaterThan150 = 0;
        for (int i = 0; i < 300; i++) {
            int randomNumber = random.nextInt(301);
            System.out.print((randomNumber > 275) ? "[" + randomNumber + "] " : randomNumber + " ");
            if (randomNumber > 150) {
                countGreaterThan150++;
            }
        }
        System.out.println("\nCount of numbers greater than 150: " + countGreaterThan150);


        System.out.println("___________2222_____________________________________________");
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 3000; i++) {
            if (i % 77 == 0) {
                result.append(i).append(", ");
            }
        }
        // Pašaliname paskutinį kablelį ir tarpą
        if (result.length() > 0) {
            result.delete(result.length() - 2, result.length());
        }
        System.out.println(result.toString());


        System.out.println("___________3333_____________________________________________");
        for (int y = 1; y <= 25; y++) {
            for (int x = 1; x <= 25; x++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("___________4444_____________________________________________");
        int size = 25; // Kraštinių dydis
        char squareSymbol = '*'; // Kvadrato simbolis
        char diagonalSymbol = '/'; // Istrižainių simbolis
        // Piešiamas kvadratas
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print(squareSymbol + " ");
                } else {
                    System.out.print("  "); // Tarpas viduje
                }
            }
            System.out.println();
        }
        System.out.println();
        // Piešiamos istrižainės zaigzdute
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i == size - 1 - j) {
                    System.out.print(diagonalSymbol + " ");
                } else {
                    System.out.print(squareSymbol + " "); // Kvadrato simbolis viduje
                }
            }
            System.out.println();
        }
        System.out.println("___________5555_a____________________________________________");
        int herbCount = 0;
        while (true) {
            int result1 = (int) (Math.random() * 2);
            if (result1 == 0) {
                System.out.println("H");
                break;
            } else {
                System.out.println("S");
            }
        }
        System.out.println("___________5555___b__________________________________________");
        Random random6 = new Random();
        int herbCount6 = 0;
        while (herbCount6 < 3) {
            int result6 = random.nextInt(2);
            if (result6 == 0) {
                System.out.println("H"); // herbas
                herbCount6++;
            } else {
                System.out.println("S"); // skaičius
            }
        }
        System.out.println("___________5555____c_________________________________________");
        int consecutiveHerbCount = 0;
        while (consecutiveHerbCount < 3) {
            int result3 = (int) (Math.random() * 2);
            if (result3 == 0) {
                System.out.println("H");
                consecutiveHerbCount++;
            } else {
                System.out.println("S");
                consecutiveHerbCount = 0;
            }
        }

        System.out.println("___________6666_____________________________________________");
        int kazysScore = 0;
        int petrasScore = 0;
        Random random4 = new Random();

        while (kazysScore < 222 && petrasScore < 222) {
            int kazysPoints = random4.nextInt(21) + 5;
            int petrasPoints = random4.nextInt(11) + 10;

            kazysScore += kazysPoints;
            petrasScore += petrasPoints;
        }

        if (kazysScore >= 222 && petrasScore >= 222) {
            System.out.println("Partija baigėsi lygiosiomis.");
        } else if (kazysScore >= 222) {
            System.out.println("Kazys surinko " + kazysScore + " taškų. Partiją laimėjo: Kazys");
        } else {
            System.out.println("Petras surinko " + petrasScore + " taškų. Partiją laimėjo: Petras");
        }
        System.out.println("______7777_____________________________________________________");
        int height = 21;
        for (int i = 1; i <= height / 2 + 1; i++) {
            for (int j = 1; j <= height / 2 + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = height / 2; i >= 1; i--) {
            for (int j = 1; j <= height / 2 + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("______8888_____________________________________________________");

        // Vinies ilgis 8.5cm (pilnai sulenda į lentą)
        double vinis = 8.5;
        // Įkalimo gylį sumodeliuokite pasinaudodami Math.random() funkcija
        double gylis = Math.random() * vinis;

        // “Įkalkite” 5 vinis mažais smūgiais. Vienas smūgis vinį įkala 5-20 mm. Suskaičiuokite kiek reikia smūgių.
        int smugiai1 = 0; // smūgių skaičius
        for (int i = 0; i < 5; i++) { // ciklas per 5 vinis
            double likutis = gylis; // likęs įkalimo gylis
            while (likutis > 0) { // kol vinis neįkaltas
                double smugis = Math.random() * (20 - 5) + 5; // vieno smūgio įkalimo gylis (5-20 mm)
                likutis -= smugis / 10; // atimti nuo likučio smūgio gylį (mm -> cm)
                smugiai1++; // padidinti smūgių skaičių
            }
        }
        System.out.println("Mažais smūgiais reikia " + smugiai1 + " smūgių.");

        // “Įkalkite” 5 vinis dideliais smūgiais. Vienas smūgis vinį įkala 20-30 mm, bet yra 50% tikimybė, kad smūgis nepataikys į vinį. Suskaičiuokite kiek reikia smūgių.
        int smugiai2 = 0; // smūgių skaičius
        for (int i = 0; i < 5; i++) { // ciklas per 5 vinis
            double likutis = gylis; // likęs įkalimo gylis
            while (likutis > 0) { // kol vinis neįkaltas
                double tikimybe = Math.random(); // tikimybė pataikyti į vinį
                if (tikimybe < 0.5) { // jei pataikyta
                    double smugis = Math.random() * (30 - 20) + 20; // vieno smūgio įkalimo gylis (20-30 mm)
                    likutis -= smugis / 10; // atimti nuo likučio smūgio gylį (mm -> cm)
                }
                smugiai2++; // padidinti smūgių skaičių
            }
        }
        System.out.println("Dideliais smūgiais reikia " + smugiai2 + " smūgių.");


        System.out.println("_____9999______________________________________________________");
        // Generuojame string'ą su 50 unikalių atsitiktinių skaičių
        String numbersString = generateUniqueNumbersString(50, 1, 200);
        System.out.println("Visi skaičiai: " + numbersString);
        // Atrenkame ir surikiuojame pirminius skaičius iš pirmo string'o
        String primeNumbersString = getSortedPrimeNumbers(numbersString);
        System.out.println("Pirminiai skaičiai: " + primeNumbersString);
    }

    private static String generateUniqueNumbersString(int count, int min, int max) {
        if (count > (max - min + 1)) {
            throw new IllegalArgumentException("Reikiamas unikalių skaičių kiekis viršija intervalo dydį.");
        }
        StringBuilder numbers = new StringBuilder();
        Set<Integer> uniqueNumbers = new HashSet<>();
        Random random = new Random();
        while (uniqueNumbers.size() < count) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            uniqueNumbers.add(randomNumber);
        }
        for (int number : uniqueNumbers) {
            numbers.append(number).append(" ");
        }
        return numbers.toString().trim();
    }

    private static String getSortedPrimeNumbers(String numbersString) {
        String[] numbersArray = numbersString.split(" ");
        int[] numbers = new int[numbersArray.length];
        int primeCount = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            numbers[i] = Integer.parseInt(numbersArray[i]);
        }

        StringBuilder primeNumbers = new StringBuilder();
        for (int number : numbers) {
            if (isPrime(number)) {
                primeNumbers.append(number).append(" ");
                primeCount++;
            }
        }
        // Rikiuojame pirminius skaičius
        int[] nums = Arrays.stream(primeNumbers.toString().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(nums, 0, primeCount);
        StringBuilder sortedPrimeNumbers = new StringBuilder();
        for (int i = 0; i < primeCount; i++) {
            sortedPrimeNumbers.append(nums[i]).append(" ");
        }
        return sortedPrimeNumbers.toString().trim();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}


            



