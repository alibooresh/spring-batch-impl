package com.hugsy.springbatchimpl.batchwriter;

import org.springframework.batch.core.ItemWriteListener;
import org.springframework.batch.item.Chunk;
import org.springframework.stereotype.Component;

@Component
public class BatchWriteListener<S> implements ItemWriteListener<S> {
    @Override
    public void beforeWrite(Chunk<? extends S> items) {
        System.out.println("ReaderListener::beforeWrite() -> " + items);
    }

    @Override
    public void afterWrite(Chunk<? extends S> items) {
        System.out.println("ReaderListener::afterWrite() -> " + items);
    }

    @Override
    public void onWriteError(Exception exception, Chunk<? extends S> items) {
        System.out.println("ReaderListener::onWriteError() -> " + exception + ", " + items);
    }
}