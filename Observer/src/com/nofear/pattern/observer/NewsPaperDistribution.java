package com.nofear.pattern.observer;

import com.nofear.pattern.observer.model.AirIndia;
import com.nofear.pattern.observer.model.NoFearTechnology;
import com.nofear.pattern.observer.model.RitzHotel;
import com.nofear.pattern.observer.publisher.TimesHouse;

public class NewsPaperDistribution {

    public static void main(String[] args) {

        TimesHouse timesHouse = new TimesHouse();
        NoFearTechnology nft = new NoFearTechnology();
        timesHouse.subscribe(nft);
        timesHouse.subscribe(new RitzHotel());
        timesHouse.subscribe(new AirIndia());
        timesHouse.setPublishedEdition(1);

        System.out.println("-----------------------------");
        timesHouse.unsubscribe(nft);
        System.out.println(nft);
        timesHouse.setPublishedEdition(3);

    }

}
