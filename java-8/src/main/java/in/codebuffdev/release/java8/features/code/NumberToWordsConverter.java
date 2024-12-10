package in.codebuffdev.release.java8.features.code;

import java.text.DecimalFormat;

public class NumberToWordsConverter {

    private static final String[] tensNames = {
            "", " ten", " twenty", " thirty", " forty", " fifty",
            " sixty", " seventy", " eighty", " ninety"
    };

    private static final String[] numNames = {
            "", " one", " two", " three", " four", " five",
            " six", " seven", " eight", " nine", " ten",
            " eleven", " twelve", " thirteen", " fourteen",
            " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"
    };

    // Convert numbers less than 1000 to words
    private static String convertLessThanOneThousand(int number) {
        String current;

        if (number % 100 < 20) {
            current = numNames[number % 100];
            number /= 100;
        } else {
            current = numNames[number % 10];
            number /= 10;

            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return numNames[number] + " hundred" + current;
    }

    // Main function to convert any number
    public static String convert(long number) {
        if (number == 0) { return "zero"; }

        String snumber = Long.toString(number);

        // Pad with "0" for formatting purposes
        String mask = "000000000000";
        DecimalFormat df = new DecimalFormat(mask);
        snumber = df.format(number);

        // Splits the string into parts
        int billions = Integer.parseInt(snumber.substring(0, 3));
        int millions = Integer.parseInt(snumber.substring(3, 6));
        int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
        int thousands = Integer.parseInt(snumber.substring(9, 12));

        String tradBillions;
        switch (billions) {
            case 0: tradBillions = ""; break;
            case 1: tradBillions = "one billion "; break;
            default: tradBillions = convertLessThanOneThousand(billions) + " billion ";
        }
        String result = tradBillions;

        String tradMillions;
        switch (millions) {
            case 0: tradMillions = ""; break;
            case 1: tradMillions = "one million "; break;
            default: tradMillions = convertLessThanOneThousand(millions) + " million ";
        }
        result += tradMillions;

        String tradHundredThousands;
        switch (hundredThousands) {
            case 0: tradHundredThousands = ""; break;
            case 1: tradHundredThousands = "one thousand "; break;
            default: tradHundredThousands = convertLessThanOneThousand(hundredThousands) + " thousand ";
        }
        result += tradHundredThousands;

        String tradThousand;
        tradThousand = convertLessThanOneThousand(thousands);
        result += tradThousand;

        // Remove extra spaces and return
        return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
    }

    public static void main(String[] args) {
        System.out.println("*** " + NumberToWordsConverter.convert(123456789));
        System.out.println("*** " + NumberToWordsConverter.convert(1000));
        System.out.println("*** " + NumberToWordsConverter.convert(0));
    }
}
