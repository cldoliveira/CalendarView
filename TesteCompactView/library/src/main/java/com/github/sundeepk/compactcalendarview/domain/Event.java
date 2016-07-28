package com.github.sundeepk.compactcalendarview.domain;

import android.support.annotation.Nullable;
import android.util.Log;

public class Event {

    private int color;
    private long timeInMillis;
    private Object data;
    private int eventType;

    public Event(int color, long timeInMillis) {
        this.color = color;
        this.timeInMillis = timeInMillis;
    }

    public Event(int color, long timeInMillis, Object data) {
        this(color, timeInMillis, data, 1);
    }

    public Event(int color, long timeInMillis, Object data, int eventType) {
        this.color = color;
        this.timeInMillis = timeInMillis;
        this.data = data;
        if(eventType>=1 && eventType<=3){
            this.eventType=eventType;
        } else {
            this.eventType=1;
        }

    }

    public int getColor() {
        return color;
    }

    public long getTimeInMillis() {
        return timeInMillis;
    }

    @Nullable
    public Object getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (color != event.color) return false;
        if (timeInMillis != event.timeInMillis) return false;
        if (data != null ? !data.equals(event.data) : event.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = color;
        result = 31 * result + (int) (timeInMillis ^ (timeInMillis >>> 32));
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Event{" +
                "color=" + color +
                ", timeInMillis=" + timeInMillis +
                ", data=" + data +
                '}';
    }


    public int getEventType() {
        return eventType;
    }


}
