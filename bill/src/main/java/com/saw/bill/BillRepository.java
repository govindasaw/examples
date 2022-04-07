/**
 * 
 */
package com.saw.bill;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author Govin
 *
 */
@Repository
public interface BillRepository extends JpaRepository<Bill, Long>{
	
	@Query(value = "SELECT * FROM bill WHERE date = ?", nativeQuery = true)
	public List<Bill> getBillByDate(Date dueDate);

}
