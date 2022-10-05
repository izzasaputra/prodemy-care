package com.app.dao;

import java.util.List;

import com.app.model.Payment;

public interface PaymentDao {
	public Payment findById(String id) throws Exception;
	public void deleteById(String id) throws Exception;
	public void insert(Payment pay) throws Exception;
	public void update(Payment pay) throws Exception;
	public List<Payment> findAll() throws Exception;

}
