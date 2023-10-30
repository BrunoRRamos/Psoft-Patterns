package Template;

public class PreparaCha extends PreparaBebida {
    public PreparaCha() {
        super();
    }

    @Override
    public void passo1() {
        System.out.println("Esquentar água");
    }

    @Override
    public void passo2() {
        System.out.println("Mergulhar o saquinho de chá");
    }

    @Override
    public void passo3() {
        System.out.println("Servir em um copo");
    }

    @Override
    public void passo4() {
        System.out.println("Adicionar limão");
    }
}
