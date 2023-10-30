package Template;

public class PreparaCafe extends PreparaBebida {
    public PreparaCafe() {
        super();
    }

    @Override
    public void passo1() {
        System.out.println("Esquentar água");
    }

    @Override
    public void passo2() {
        System.out.println("Moer e coar o café");
    }

    @Override
    public void passo3() {
        System.out.println("Servir em um copo");
    }

    @Override
    public void passo4() {
        System.out.println("Adicionar leite e açúcar");
    }
}
