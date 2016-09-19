package jeusscoder.ecomm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendor {

	@Id
	private Integer veVendorNumber;
	
	private String veVendorName;
	private String veAddress;
	private String veCity;
	private String veState;
	private Integer veZipCode;
	private String veTelephone;
	
	public Vendor(Integer veVendorNumber, String veVendorName,
			String veAddress, String veCity, String veState, Integer veZipCode,
			String veTelephone) {
		this.veVendorNumber = veVendorNumber;
		this.veVendorName = veVendorName;
		this.veAddress = veAddress;
		this.veCity = veCity;
		this.veState = veState;
		this.veZipCode = veZipCode;
		this.veTelephone = veTelephone;
	}
	
	public Vendor() {
	}

	public Integer getVeVendorNumber() {
		return veVendorNumber;
	}

	public void setVeVendorNumber(Integer veVendorNumber) {
		this.veVendorNumber = veVendorNumber;
	}

	public String getVeVendorName() {
		return veVendorName;
	}

	public void setVeVendorName(String veVendorName) {
		this.veVendorName = veVendorName;
	}

	public String getVeAddress() {
		return veAddress;
	}

	public void setVeAddress(String veAddress) {
		this.veAddress = veAddress;
	}

	public String getVeCity() {
		return veCity;
	}

	public void setVeCity(String veCity) {
		this.veCity = veCity;
	}

	public String getVeState() {
		return veState;
	}

	public void setVeState(String veState) {
		this.veState = veState;
	}

	public Integer getVeZipCode() {
		return veZipCode;
	}

	public void setVeZipCode(Integer veZipCode) {
		this.veZipCode = veZipCode;
	}

	public String getVeTelephone() {
		return veTelephone;
	}

	public void setVeTelephone(String veTelephone) {
		this.veTelephone = veTelephone;
	}
	
	
}
