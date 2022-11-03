package com.pankaj.onlinecv.api.event;

public class MessageEvent<K, V> {
    private final MessageEventType type;
    private final K key;
    private final V value;

    public MessageEvent(MessageEventType eventType, K key, V value) {
        this.type = eventType;
        this.key = key;
        this.value = value;
    }

    public enum MessageEventType {
        CREATE, DELETE
    }

    public MessageEventType getType() {
        return type;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
