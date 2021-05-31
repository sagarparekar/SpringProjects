package com.csi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import com.csi.model.Customer;

@Component
public class CustomerDaoImpl implements CustomerDao {
	private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();

	@Override
	public List<Customer> getAllCustomerData() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		List<Customer> custList = session.createQuery("from Customer").list();
		return custList;
	}

	@Override
	public Customer getCustomerDataById(int customerId) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		List<Customer> custList = session.createQuery("from Customer").list();
		Customer cc = new Customer();
		for (Customer cust : custList) {
			if (cust.getCustId() == customerId) {
				cc.setCustId(cust.getCustId());
				cc.setCustName(cust.getCustName());
				cc.setCustSalary(cust.getCustSalary());
				cc.setCustomerLaunchDate(cust.getCustomerLaunchDate());

			}

		}

		return cc;
	}

	@Override
	public void saveCustomerData(Customer customer) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();

	}

	@Override
	public void saveCustomerBulkData(List<Customer> customers) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();

		for (Customer cust : customers) {
			Transaction transaction = session.beginTransaction();
			session.save(cust);
			transaction.commit();

		}

	}

	@Override
	public void updateCustomerData(int customerId, Customer customer) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		List<Customer> custList = session.createQuery("from Customer").list();
		Transaction transaction = session.beginTransaction();

		for (Customer c : custList) {
			if (c.getCustId() == customerId) {
				customer.setCustName(c.getCustName());
				customer.setCustSalary(c.getCustSalary());
				customer.setCustomerLaunchDate(c.getCustomerLaunchDate());
				session.update(customer);
				transaction.commit();
			}

		}

	}

	@Override
	public void deleteCustomerDataById(int customerId) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		List<Customer> custList = session.createQuery("from Customer").list();
		Transaction transaction = session.beginTransaction();
		for (Customer cust : custList) {
			if (cust.getCustId() == customerId) {

				session.delete(cust);
				transaction.commit();
			}

		}

	}

	@Override
	public void deleteAllCustomerData() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		List<Customer> custList = session.createQuery("from Customer").list();

		for (Customer cust : custList) {
			Transaction transaction = session.beginTransaction();
			session.delete(cust);
			transaction.commit();

		}

	}

}
