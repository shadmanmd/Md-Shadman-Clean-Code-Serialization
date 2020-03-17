class SiCi {

	
	public double compoundInterest(double amount,double time,double rate)
	{
		double com;
		com=amount * Math.pow(1.0+rate/100.0,time) -amount;
		return com;
	}
	public double simpleInterest(double amount,double time,double rate)
	{
		double sim ;
		sim=(amount * time * rate)/100;
		return sim;
	}
}
class client
{
	public void main(String[] args) {
		SiCi c_s=new SiCi();
		double amount=1000;
		double time=2;
		double rate=1.5;
		double com,sim;
		com=c_s.compoundInterest(amount,time,rate);
		sim=c_s.simpleInterest(amount,time,rate);
	}
}