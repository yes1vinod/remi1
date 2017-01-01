package com.vinsan.testing;

import org.hibernate.Session;

import com.vinsan.remi.vo.CustomerDetail;
import com.vinsan.util.HibernateUtil;

public class HibernateTest {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		CustomerDetail customerDetails = new CustomerDetail();
		customerDetails.setComments("Comments :new comment");

		customerDetails.setEmail("vinod1.s@Tcs.com");
		customerDetails.setFirstName("vinod");
		customerDetails.setLastName("santhanam");
		customerDetails.setId(1);
		session.save(customerDetails);

		session.getTransaction().commit();
		

	}

}
