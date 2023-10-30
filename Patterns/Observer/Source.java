package Observer;

import java.util.ArrayList;
import java.util.List;

public class Source {
    private List<AbsConcreteClass> listeners;

    public Source() {
        this.listeners = new ArrayList<>();
    }

    public void addListener(AbsConcreteClass listener) {
        this.listeners.add(listener);
    }

    public void removeListener(AbsConcreteClass listener) {
        this.listeners.remove(listener);
    }

    public String eventTrigger() {
        this.listeners.forEach(listener -> listener.notifyEvent());
        return "event disparado";
    }
}
