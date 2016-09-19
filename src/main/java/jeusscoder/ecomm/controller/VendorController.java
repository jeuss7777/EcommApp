package jeusscoder.ecomm.controller;

import java.util.List;

import jeusscoder.ecomm.entity.Vendor;
import jeusscoder.ecomm.service.VendorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/vendors")
public class VendorController {
	
	private VendorService vendorService;
	
	@Autowired
	public VendorController(VendorService vendorService){
		this.vendorService = vendorService;
	}
	
	@RequestMapping(value="/all", method= RequestMethod.GET)
	public List<Vendor> getAllVendors(){
		return vendorService.getAllVendors();
	}
	
	@RequestMapping(value="/zipless/{zip}", method=RequestMethod.GET)
	public List<Vendor> findByveZipCodeLessThan(@PathVariable Integer zip){
		return vendorService.findByveZipCodeLessThan(zip);
	}
	
	@RequestMapping(value="/zip/{zip}", method=RequestMethod.GET)
	public List<Vendor> findByveZipCode(@PathVariable Integer zip){
		return vendorService.findByveZipCode(zip);
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public List<Vendor> create(@RequestBody Vendor vendor){
		vendorService.save(vendor);
		return vendorService.getAllVendors();
	}
	
	@RequestMapping(value="/delete/{veVendorNumber}", method=RequestMethod.DELETE)
	public List<Vendor> delete(@PathVariable Integer veVendorNumber){
		vendorService.delete(veVendorNumber);
		return vendorService.getAllVendors();
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public List<Vendor> update(@RequestBody Vendor vendor){
		vendorService.update(vendor);
		return vendorService.getAllVendors();
	}
}


