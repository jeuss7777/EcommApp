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
	
	
	
	public List<Vendor> create(Vendor vendor){
		vendorDao.save(vendor);
		return vendorDao.findAll();
	}

	public List<Vendor> findByveZipCode(Integer zip){

		return vendorDao.findByveZipCode(zip);
	}
	
	
	public void update(Vendor vendor){
		Vendor v = vendorDao.getOne(vendor.getVeVendorNumber());
		
		v.setVeVendorName(vendor.getVeVendorName());
		v.setVeAddress(vendor.getVeAddress());
		v.setVeCity(vendor.getVeCity());
		v.setVeState(vendor.getVeState());
		v.setVeZipCode(vendor.getVeZipCode());
		v.setVeTelephone(vendor.getVeTelephone());
	
		vendorDao.save(v);
	}
	
	public void delete(Integer veVendorNumber){
		try{
			vendorDao.delete(veVendorNumber);
		}
		catch(javax.persistence.NoResultException e)  {
			System.out.println("There is not a Vendor with number: " + veVendorNumber);
			System.out.println(e.getCause().getMessage());
		}
	}
	
}
