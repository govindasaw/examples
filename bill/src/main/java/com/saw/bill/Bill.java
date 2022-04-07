/**
 * 
 */
package com.saw.bill;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Govin
 *
 */

@Entity
@Table(name="bill")
public class Bill {
	
	@Id
	private Long billNumber;
	private String To;
	private Date date;
	private Date dueDate;
	private Long price;
	private Long tax;
	private Long totalPrice;
	/**
	 * @return the billNumber
	 */
	public long getBillNumber() {
		return billNumber;
	}
	/**
	 * @param billNumber the billNumber to set
	 */
	public void setBillNumber(long billNumber) {
		this.billNumber = billNumber;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return To;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		To = to;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
	}
	/**
	 * @return the tax
	 */
	public long getTax() {
		return tax;
	}
	/**
	 * @param tax the tax to set
	 */
	public void setTax(long tax) {
		this.tax = tax;
	}
	/**
	 * @return the totalPrice
	 */
	public long getTotalPrice() {
		return totalPrice;
	}
	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}
	/**
	 * @return the dueDate
	 */
	public Date getDueDate() {
		return dueDate;
	}
	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	
}
