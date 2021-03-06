/**
 * Copyright (c) 2017 Far Eastone Telecommunications Co., Ltd.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of 
 * Far Eastone Telecommunications Co., Ltd. ("Confidential Information"). 
 * 
 * You shall not disclose such Confidential Information and shall use it 
 * only in accordance with the terms of license agreement you entered
 * into with Far Eastone Telecommunications Co., Ltd.
 */

package com.web.service.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.tempuri.CalculatorLocator;
import org.tempuri.CalculatorSoap;
import org.tempuri.CalculatorSoapProxy;

import com.web.service.client.demo.hello.HelloWorldService;
import com.web.service.client.demo.hello.HelloWorldServiceProxy;

/**
 * 
 * @author Adam
 */
public class ServiceTest {
	
	public static void main(String[] args) throws RemoteException, ServiceException {
		HelloWorldService helloWorldServiceProxy = new HelloWorldServiceProxy();
		Object result = (String) helloWorldServiceProxy.sayHelloWorld("hello");
		System.out.println(result);

		CalculatorSoapProxy calculatorSoapProxy = new CalculatorSoapProxy();
		result = (Integer) calculatorSoapProxy.add(15, 15);
		System.out.println(result);

		CalculatorSoap service = new CalculatorLocator().getCalculatorSoap();
		result = (Integer) service.add(15, 15);
		System.out.println(result);
	}
	
}
