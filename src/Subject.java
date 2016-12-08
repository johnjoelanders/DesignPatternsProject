interface Subject {
    void registerObserver(Observer observer);

    void notifyObservers();
}
