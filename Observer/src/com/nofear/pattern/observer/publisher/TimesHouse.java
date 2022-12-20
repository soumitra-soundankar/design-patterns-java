package com.nofear.pattern.observer.publisher;

import com.nofear.pattern.observer.model.Observer;

import java.util.ArrayList;
import java.util.List;

public class TimesHouse implements NewsPaperSubscriber {

    private final List<Observer> observers;

    private Integer publishedEdition;

    public TimesHouse() {
        observers = new ArrayList<>();
    }

    public void setPublishedEdition(Integer publishedEdition) {
        this.publishedEdition = publishedEdition;
        notifyNewEdition();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyNewEdition() {
        observers.forEach(observer -> observer.update(publishedEdition));
    }
}
