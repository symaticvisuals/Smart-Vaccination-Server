package com.project.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.project.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		// TODO Auto-generated method stub
		System.out.println("inside the print method of formatter class");
		return phone.getCode() + "-" + phone.getUsernumber();

	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		System.out.println("Inside the parse method of PhoneNumberFormatter");

		Phone phone = new Phone();

		String[] phoneNumberArray = completePhoneNumber.split("-");

		// whether the number consists of "-"
		int index = completePhoneNumber.indexOf('-');
		if (index == -1) {
			// if "-" not found ,then add 91 as default countrycode

			phone.setCode("91");
			phone.setUsernumber(phoneNumberArray[0]);

		}

		//
		// split the string received from the user
		else {

			// extract the countrycode and set it to the phone class countrycode

			phone.setCode(phoneNumberArray[0]);
			phone.setUsernumber(phoneNumberArray[1]);

		}
		return phone;
	}
}
