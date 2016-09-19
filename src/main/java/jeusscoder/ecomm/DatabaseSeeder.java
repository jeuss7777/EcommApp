package jeusscoder.ecomm;

import java.util.ArrayList;
import java.util.List;

import jeusscoder.ecomm.dao.VendorDao;
import jeusscoder.ecomm.entity.Vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner{
	
	private VendorDao vendorDao;
	
	@Autowired
	public DatabaseSeeder (VendorDao vendorDao) {
		this.vendorDao = vendorDao;
		
	}
	@Override
	public void run(String... strings) throws Exception {
		List<Vendor> vendors = new ArrayList<>();
		
		vendors.add(new Vendor(612368,"ACDelco", "Calle del Arbol Seco","Lyon","TX", 69000,"(33)6823-43-23"));
		vendors.add(new Vendor(663823,"NGK", "Villa Verder 9734","Chihuahua","GA", 38456,"(828)882563-123"));
		vendors.add(new Vendor(683728,"Bosh", "1101 Natchez Point","Memphis","TN", 38103,"(901)123456-789"));
		
		vendorDao.save(vendors);
	}
	

}
