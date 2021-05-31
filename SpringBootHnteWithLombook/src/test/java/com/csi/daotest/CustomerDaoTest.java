package com.csi.daotest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import com.csi.dao.CustomerDaoImpl;
import com.csi.model.Customer;
import com.csi.service.CustomerServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerDaoTest {

	@Autowired
	CustomerDaoImpl customerDaoImpl;
	
	@MockBean
	CustomerServiceImpl customerServiceImpl;
	
	/*@Test
	public void updateUserTest(){
		System.out.println("Updated test running");
		Integer custId=1;
		Customer customer=new Customer(111, "SAGAR",111.99,11121993);
		
	}*/
}
