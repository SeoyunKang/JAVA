package MultiType;

public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<Tv,String> product1 = new Product<Tv,String>();
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		//더 간단하게 작성가능
		Product<Tv,String> product2 = new Product<>();
		
		System.out.println(product1.getModel());
		System.out.println(product1.getKind());
		

	}

}
