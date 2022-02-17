package study.practice;

public class ExpenseDetails {
		private String desc;
		private double amount;
		private Date expDate;
		
		@Override
		public boolean equals(Object obj) {

			ExpenseDetails d =(ExpenseDetails)obj;
			if(this.getDesc().equals(d.getDesc()))
			{
				if(this.getAmount() == d.getAmount())
				{
					if (this.getExpDate().equals(d.getExpDate()))
					{
						return true;
					}
					else
						return false;
				}
				else
					return false;
			}
			else
				return false;
		}
		
		
		
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public Date getExpDate() {
			return expDate;
		}
		public void setExpDate(Date expDate) {
			this.expDate = expDate;
		}
		public ExpenseDetails()
		{
			
		}
		public ExpenseDetails(String desc, double amount, Date expDate) {
		
			this.desc = desc;
			this.amount = amount;
			this.expDate = expDate;
		}
		
		@Override
		public String toString() {
			return "ExpenseDetails [Description=" + desc + ", Amount=" + amount + ", Expence Date=" + expDate + "]";
		}
		
		
		
		
		
}
