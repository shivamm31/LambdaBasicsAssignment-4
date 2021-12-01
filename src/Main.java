public class Main {
    public static void main(String[] args) {
        Lambda lambda=(x,y) -> {
            long result = x;
            for(long i = x + 1; i <= y; i++){
                result *= i;
            }
            return result;
        };
        System.out.println(lambda.result(4,7));
    }
}
