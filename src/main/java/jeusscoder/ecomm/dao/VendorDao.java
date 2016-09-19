package jeusscoder.ecomm.dao;

import java.util.List;

import jeusscoder.ecomm.entity.Vendor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorDao extends JpaRepository<Vendor, Integer> {

	public List<Vendor> findByveZipCodeLessThan(Integer zip);
	
	public List<Vendor> findByveZipCode(Integer zip);
	

	
	
}
