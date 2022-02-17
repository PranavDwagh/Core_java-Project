package collection;

public class Invoice implements Comparable<Invoice> {
	
	Mydate3 dateOfInvoice;
	private double amount;
	private String invoiceGivenBy;
	private String invoiceGivenTo;
	
	public Invoice()
	{
		
	}

	public Invoice(Mydate3 dateOfInvoice, double amount, String invoiceGivenBy, String invoiceGivenTo) {
		
		this.dateOfInvoice = dateOfInvoice;
		this.amount = amount;
		this.invoiceGivenBy = invoiceGivenBy;
		this.invoiceGivenTo = invoiceGivenTo;
	}
	
	@Override
	public int compareTo(Invoice o) {

		return this.dateOfInvoice.compareTo(o.dateOfInvoice);
	}


	public String toString()
	{
		String str;
		
		str = "Invoice Date:"+dateOfInvoice+" Amount :"+amount+ " Invoice Given By :"+invoiceGivenBy+" Invoice Given To :"+invoiceGivenTo;
		return str;
	}

	public Mydate3 getDateOfInvoice() {
		return dateOfInvoice;
	}

	public void setDateOfInvoice(Mydate3 dateOfInvoice) {
		this.dateOfInvoice = dateOfInvoice;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getInvoiceGivenBy() {
		return invoiceGivenBy;
	}

	public void setInvoiceGivenBy(String invoiceGivenBy) {
		this.invoiceGivenBy = invoiceGivenBy;
	}

	public String getInvoiceGivenTo() {
		return invoiceGivenTo;
	}

	public void setInvoiceGivenTo(String invoiceGivenTo) {
		this.invoiceGivenTo = invoiceGivenTo;
	}

	
	
	
	
	
	
}
