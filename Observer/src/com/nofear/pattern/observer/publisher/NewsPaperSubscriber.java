package com.nofear.pattern.observer.publisher;

import com.nofear.pattern.observer.model.Observer;

public interface NewsPaperSubscriber {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyNewEdition();
}
