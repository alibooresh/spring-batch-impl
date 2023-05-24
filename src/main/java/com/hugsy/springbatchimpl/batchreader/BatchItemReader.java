package com.hugsy.springbatchimpl.batchreader;

import com.hugsy.springbatchimpl.model.Payment;
import org.springframework.batch.item.ItemReader;

public class BatchItemReader implements ItemReader<Payment> {

    private Payment payment;

    public BatchItemReader(Payment payment) {
        this.payment = payment;
    }

    @Override
    public Payment read() throws Exception {
        return this.payment;
    }
}
