package Template;

public class Main {
    public static void main(String[] args) {
        PreparaCafe cafe = new PreparaCafe();
        PreparaCha cha = new PreparaCha();

        cafe.preparaBebida();
        System.out.println("---------------------------------");
        cha.preparaBebida();
    }
}
