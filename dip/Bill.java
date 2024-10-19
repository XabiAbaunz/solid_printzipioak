package dip;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float VATAmount;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	
	public Deduction deduction;
	public VAT vat;
	
	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc(Deduction deduction, VAT vat) {
		// Dedukzioa kalkulatu
		this.deduction = deduction;
		billDeduction = deduction.calcDeduction(billAmount ,deductionPercentage);
		// VAT kalkulatzen dugu
		this.vat=vat;
		VATAmount = vat.calcVAT(billAmount);
		// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction) + VATAmount;
	}
}
