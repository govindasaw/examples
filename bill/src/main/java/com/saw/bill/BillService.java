/**
 * 
 */
package com.saw.bill;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Govin
 *
 */
@Service
public class BillService {

	@Autowired
	BillRepository billRepository;

	public List<Bill> getAllBills() {

		List<Bill> allBill = billRepository.findAll();
		return allBill;

	}

	public Bill getBillById(Long billId) {
		Optional<Bill> bill = billRepository.findById(billId);
		if (bill.isPresent()) {
			return bill.get();
		} else {
			return null;
		}
	}

	public List<Bill> getBillByDueDate(Date dueDate) {
		List<Bill> bill = billRepository.getBillByDate(dueDate);
		return bill;
	}
	
	public Bill saveBill(Bill bill) {
		Bill b = billRepository.save(bill);
		return b;
	}

}
