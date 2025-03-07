public class Main {
        public static void main(String[] args) {
            HumanIMB human = new HumanIMB(60, 1.68);
            System.out.println("BMI: " + human.getBmi());
            System.out.println("Category: " + human.getBmiCategory());
        }
}
