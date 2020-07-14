package com.observerpattern;

public interface Subject {
    public void registerObserver(Observable o);
    public void removeObserver(Observable o);
    public void notifyObservers();
}
