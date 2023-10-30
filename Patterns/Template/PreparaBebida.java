package Template;

public abstract class PreparaBebida {

    public final void preparaBebida() {
        passo1();
        passo2();
        passo3();
        passo4();
    }

    public abstract void passo1();
    public abstract void passo2();
    public abstract void passo3();
    public abstract void passo4();
}
