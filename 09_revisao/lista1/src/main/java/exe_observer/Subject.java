package exe_observer;

import exe_strategy2.Status;

public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void removeObserver(int pos);
    public void notifyObservers();
    public void changeState(Status status);


}
