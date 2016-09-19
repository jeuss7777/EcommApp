package jeusscoder.ecomm.service;

import java.util.List;

import jeusscoder.ecomm.dao.VendorDao;
import jeusscoder.ecomm.entity.Vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {

private VendorDao vendorDao;
	
	@Autowired
	public VendorService(VendorDao vendorDao){
		this.vendorDao = vendorDao;
	}
	
	public List<Vendor> getAllVendors(){
		return vendorDao.findAll();
	}
	
	public List<Vendor> findByveZipCodeLessThan(Integer zip){
		return vendorDao.findByveZipCodeLessThan(zip);
	}
	
	
	public void save(Vendor vendor){
		Vendor ifExistsv = vendorDao.findOne(vendor.getVeVendorNumber());
		
		if (ifExistsv == null){
			vendorDao.save(vendor);			
		} else{
			System.out.println("Vendor already exist, you cannot create it");
		}
	}

	public void update(Vendor vendor){
		Vendor ifExistsv = vendorDao.findOne(vendor.getVeVendorNumber());
		
		if (ifExistsv == null){
			System.out.println("Vendor does not exists, you cannot update it!!");
						
		} else{			
			vendorDao.save(vendor);
		}
	}
	
	
	public void delete(Integer veVendorNumber){
		Vendor ifExistsv = vendorDao.findOne(veVendorNumber);
		
		if (ifExistsv == null){
			System.out.println("Vendor does not exists, you cannot delete it!!");
						
		} else{			
			vendorDao.delete(veVendorNumber);
		}
		
			
		/*}
		catch(javax.persistence.NoResultException e)  {
			System.out.println("There is not a Vendor with number: " + veVendorNumber);
			System.out.println(e.getCause().getMessage());
		}*/
	}
	
	public List<Vendor> findByveZipCode(Integer zip){

		return vendorDao.findByveZipCode(zip);
	}
	
}
