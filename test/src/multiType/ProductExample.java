package MultiType;

public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<Tv,String> product1 = new Product<Tv,String>();
		product1.setKind(new Tv());
		product1.setModel("����ƮTV");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		//�� �����ϰ� �ۼ�����
		Product<Tv,String> product2 = new Product<>();
		
		System.out.println(product1.getModel());
		System.out.println(product1.getKind());
		

	}

}
