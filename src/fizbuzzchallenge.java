public class fizbuzzchallenge {
    public static void main(String[] args) {
        fizzbuzz(100);
    }

    public static void fizzbuzz(int i) {
        for(int n=0;n <= 100;n++){
            if (n%5 == 0 && n%7 == 0){
                System.out.println("fizzBuzz");
            }else if (n%7 == 0){
                System.out.println("Buzz");
            }else if (n%5 == 0 ){
                System.out.println("fizz");
            }else {
                System.out.println(n);
            }

        }
    }

}
