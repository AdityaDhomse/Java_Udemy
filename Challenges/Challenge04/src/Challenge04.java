public class Challenge04 {
    public static void main(String[] args) throws Exception {

        System.out.println("68 inch = " + convertToCentimeters(68) + " cm");
        System.out.println("5 ft 8 inch = " + convertToCentimeters(5, 8) + " cm");

    }

    public static double convertToCentimeters(int heightInInches) {

        double heightInCentimeters = heightInInches * 2.54;
        return heightInCentimeters;

    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {

        int heightInInches = (heightInFeet * 12) + remainingHeightInInches;
        return convertToCentimeters(heightInInches); 

    }
}
