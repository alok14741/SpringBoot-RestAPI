package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Bank;
import service.BankService;

@RestController
@RequestMapping("/bank/search")
public class BankController {

	@Autowired
	BankService ps;

	@RequestMapping("/byIFSC/{ifsc}")
	public Bank getByIFSC(@PathVariable("ifsc") String id) {
		return ps.getBank(id);
	}
	
	@RequestMapping("/byBankNameAndCity/{bankName}/{city}")
	public ArrayList<Bank> getByBankDetails(@PathVariable("bankName") String bankName, @PathVariable("city") String city) {
		return ps.getBankDetails(bankName, city);
	}
}

