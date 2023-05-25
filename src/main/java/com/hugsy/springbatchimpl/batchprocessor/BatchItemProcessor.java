package com.hugsy.springbatchimpl.batchprocessor;

import com.hugsy.springbatchimpl.model.Payment;
import org.springframework.batch.item.ItemProcessor;

public class BatchItemProcessor implements ItemProcessor<Payment, Payment> {

    @Override
    public Payment process(Payment item) throws Exception {
        System.out.println("Payment is processing");
        Payment payment = new Payment();
        payment.setId(item.getId());
        payment.setAmount(item.getAmount());
        payment.setSourceAccount(item.getSourceAccount());
        payment.setDestinationAccount(item.getDestinationAccount());
        return payment;
    }
}
