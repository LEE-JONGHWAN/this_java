package verify.exam17;

public class ShopService {
	private static ShopService shopService = null;
	private ShopService() {}
	public static ShopService getInstance() {
		if(shopService == null) {
			shopService = new ShopService();
		}
		return shopService;
	}
	public void askSomeService() {
		System.out.println("물건/서비스 판매...");
	}
	
}
