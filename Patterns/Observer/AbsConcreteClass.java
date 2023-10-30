package Observer;

public abstract class AbsConcreteClass implements ListenerEvent{
    @Override
    public String notifyEvent() {
        return "pego concrete Class";
    }
}
