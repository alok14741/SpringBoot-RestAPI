package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import model.Bank;

@Service
public class BankService {

	ArrayList<Bank> banks = new ArrayList<Bank>();

	@SuppressWarnings("resource")
	public BankService() throws IOException {

		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(new File("src/main/resources/bank_branches.csv")));
		String line;
		while ((line = br.readLine()) != null) {

			String[] entries = line.split(",");
			Bank banksDetails = new Bank(entries[0], entries[1], entries[2], entries[3], entries[4], entries[5],
					entries[6], entries[7]);
			banks.add(banksDetails);
		}
	}

	public Bank getBank(String ifsc) {
		boolean flag = false;
		int index = -1;
		for (int i = 0; i < banks.size(); i++) {
			if (banks.get(i).getIfsc().equalsIgnoreCase(ifsc)) {
				flag = true;
				index = i;
			}
		}
		if (flag == true) {
			return banks.get(index);
		} else {
			return null;
		}
	}
	
	public ArrayList<Bank> getBankDetails(String bankName, String city) {
		ArrayList<Bank> bankDetails = new ArrayList<Bank>();
		for (int i = 0; i < banks.size(); i++) {
			if(banks.get(i).getBank_Name().equalsIgnoreCase(bankName) && banks.get(i).getCity().equalsIgnoreCase(city)) {
				bankDetails.add(banks.get(i));
			}
		}
		return bankDetails;
	}

}
