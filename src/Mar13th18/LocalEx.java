package Mar13th18;

public class LocalEx {
public static void main(String[] args) {
	System.out.println(taxPaid("NA",100000));
	System.out.println(taxPaid("SI",100000));
	System.out.println(taxPaid("MFJ",100000));
	System.out.println(taxPaid("HH",100000));
	System.out.println(taxPaid("QW",100000));
	
}
static float taxPaid(String code,float yearlySalary){
	float tax=0.0f;
	if(code.equals("NA")){
		tax = 0.4f;
	}

	if(code.equals("SI")){
		if(yearlySalary<=9325)
		{
			tax=0.1f;
		}
		if(yearlySalary>=9326 && yearlySalary<=37950)
		{
			tax=0.15f;
		}
		if(yearlySalary>=37951 && yearlySalary<=91900)
		{
			tax=0.25f;
		}
		if(yearlySalary>=91901 && yearlySalary<=191650)
		{
			tax=0.25f;
		}
		if(yearlySalary>=191651 && yearlySalary<=416700)
		{
			tax=0.33f;
		}
		if(yearlySalary>=416701 && yearlySalary<=418400)
		{
			tax=0.35f;
		}
		if(yearlySalary>418400)
		{
			tax=0.39f;
		}
	}

if(code.equals("MFJ")){
		if(yearlySalary<=18650)
		{
			tax=0.1f;
		}
		if(yearlySalary>=18651 && yearlySalary<=75900)
		{
			tax=0.15f;
		}
		if(yearlySalary>=75901 && yearlySalary<=153100)
		{
			tax=0.25f;
		}
		if(yearlySalary>=153101 && yearlySalary<=233350)
		{
			tax=0.25f;
		}
		if(yearlySalary>=233351 && yearlySalary<=416700)
		{
			tax=0.33f;
		}
		if(yearlySalary>=416701 && yearlySalary<=470700)
		{
			tax=0.35f;
		}
		if(yearlySalary>470700)
		{
			tax=0.39f;
		}
	}
	if(code.equals("HH")){
		if(yearlySalary<=13350)
		{
			tax=0.1f;
		}
		if(yearlySalary>=13351 && yearlySalary<=50800)
		{
			tax=0.15f;
		}
		if(yearlySalary>=50801 && yearlySalary<=131200)
		{
			tax=0.25f;
		}
		if(yearlySalary>=131201 && yearlySalary<=212500)
		{
			tax=0.25f;
		}
		if(yearlySalary>=212501 && yearlySalary<=416700)
		{
			tax=0.33f;
		}
		if(yearlySalary>=416701 && yearlySalary<=444550)
		{
			tax=0.35f;
		}
		if(yearlySalary>444550)
		{
			tax=0.39f;
		}
	}
	if(code.equals("QW")){
		if(yearlySalary<=9325)
		{
			tax=0.1f;
		}
		if(yearlySalary>=9326 && yearlySalary<=37950)
		{
			tax=0.15f;
		}
		if(yearlySalary>=37951 && yearlySalary<=76550)
		{
			tax=0.25f;
		}
		if(yearlySalary>=76551 && yearlySalary<=116675)
		{
			tax=0.25f;
		}
		if(yearlySalary>=116676 && yearlySalary<=208350)
		{
			tax=0.33f;
		}
		if(yearlySalary>=208351 && yearlySalary<=235350)
		{
			tax=0.35f;
		}
		if(yearlySalary>235350)
		{
			tax=0.39f;
		}
	}
	return tax;
}

}
