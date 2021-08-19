package sec07.exam01_generic_extends_implements;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		var product = new CompanyProduct<Tv, String, String>();
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("Samsung");
		
		var storage = new StorageImpl<CompanyProduct<Tv, String, String>>(100);
		storage.add(product, 0);
		
		var compProd = storage.get(0);
		System.out.println(compProd.toString());
	}
}
