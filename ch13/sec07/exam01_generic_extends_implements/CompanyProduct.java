package sec07.exam01_generic_extends_implements;

public class CompanyProduct<T, M, C> extends Product<T, M> {
	   private C company;
	   public C getCompany() { return this.company; }
	   public void setCompany(C company) { this.company = company; }
	   
	   @Override
	   public String toString() {
		   var sb = new StringBuilder("회사: ");
		   sb.append(this.company);
		   sb.append(", 제품군: ");
		   sb.append(this.getKind());
		   sb.append(", 모델명: ");
		   sb.append(this.getModel());
		   return sb.toString();
	   }
}

