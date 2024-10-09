package srp;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float billTotal;

// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		Deducer d = new Deducer();
		VATcalculator v = new VATcalculator();
// Totala kalkulatzen dugu
		float deduce = d.deduceBill(billAmount);
		float vat = 0;
		if (code != "0") {
			vat = v.kalkulatuVAT(billAmount);
		}
		billTotal = (billAmount - deduce) + vat;
	}
}