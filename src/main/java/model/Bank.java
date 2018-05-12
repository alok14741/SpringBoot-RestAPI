package model;

/**
 * Bank Details Model
 * 
 * @author Alok
 *
 */
public class Bank {
	public Bank(String ifsc, String bank_id, String branch, String address, String city, String district, String state,
			String bank_name) {
		this.ifsc = ifsc;
		this.bank_Id = bank_id;
		this.branch = branch;
		this.address = address;
		this.city = city;
		this.district = district;
		this.state = state;
		this.bank_Name = bank_name;
	}

	private String ifsc;
	private String bank_Id;
	private String branch;
	private String address;
	private String city;
	private String district;
	private String state;
	private String bank_Name;

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBank_Id() {
		return bank_Id;
	}

	public void setBank_Id(String bank_Id) {
		this.bank_Id = bank_Id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBank_Name() {
		return bank_Name;
	}

	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}

}
