package com.hugsy.springbatchimpl.batchwriter;

import com.hugsy.springbatchimpl.model.Payment;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

public class BatchItemWriter implements ItemWriter<Payment> {

    private Payment payment = new Payment();

    @Override
    public void write(Chunk<? extends Payment> chunk) throws Exception {
        payment.setAmount(125000L);
        payment.setSourceAccount("IR12505215452");
        payment.setDestinationAccount("IR56985854758");
        System.out.println("Batch Item Writer => payment:" + payment.toString());
    }

    public Payment getOutput(){
        return payment;
    }
}
