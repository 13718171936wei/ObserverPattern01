package com.bw.ddvs.observerpattern01.bean;

import java.util.Observable;

/**
 * Created by 行走的力量 on 2016/12/29.
 */

/**
 * 被观察者
 */
public class Teacher extends Observable {
    private Teacher() {

    }

    private static Teacher teacher = null;

    public static Teacher getInstance() {
        if (teacher == null) {
            synchronized (Teacher.class) {
                if (teacher == null) {
                    teacher = new Teacher();
                }
            }

        }
        return teacher;
    }

    public void postMessage(String eventtype) {

        setChanged();
        notifyObservers(eventtype);

    }
}
