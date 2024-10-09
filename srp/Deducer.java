package srp;

public class Deducer {

	public int deductionPercentage;

	public float deduceBill(float billAmount) {
		if (billAmount >50000)
			 return  (billAmount * deductionPercentage +5) / 100;
			 else  return (billAmount * deductionPercentage) / 100;
	}
}
