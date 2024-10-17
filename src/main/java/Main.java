public class Main {
    public static void main(String[] args) throws NotFoundAnswerException {
        MathService mathService = new MathService();
        System.out.println(mathService.getAnswer(1,-6,9));
    }
}
