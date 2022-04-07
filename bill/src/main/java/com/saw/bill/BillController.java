/**
 * 
 */
package com.saw.bill;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Govin
 *
 */
@RestController
@RequestMapping("/bills")
public class BillController {

	@Autowired
	BillService billService;

	@GetMapping
	public ResponseEntity<List<Bill>> getAllEmployees() {

		List<Bill> list = billService.getAllBills();

		return new ResponseEntity<List<Bill>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Bill> getBillById(@PathVariable("id") Long id) {
		Bill entity = billService.getBillById(id);

		return new ResponseEntity<Bill>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/due/{date}")
	public ResponseEntity<List<Bill>> getBillByDueDate(@PathVariable("date") Date dueDate) {
		List<Bill> entity = billService.getBillByDueDate(dueDate);

		return new ResponseEntity<List<Bill>>(entity, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Bill> createBill(@RequestBody Bill bill) {
		Bill entity = billService.saveBill(bill);
		return new ResponseEntity<Bill>(entity, new HttpHeaders(), HttpStatus.OK);
	}

}
