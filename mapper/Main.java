package tractive.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static Collection<ProductOutput> listAggregatedOfProducts(List<String> listProduct,
			Map<String, ProductInfo> mapProducts) {

		Map<String, ProductOutput> listOfProducts = new HashMap<String, ProductOutput>();

		for (String product : listProduct) {
			if (mapProducts.get(product) != null) {
				ProductOutput currentProduct = listOfProducts.get(product);
				if (currentProduct != null) {
					currentProduct.incrementQuantity();
				} else {
					ProductOutput newProduct = new ProductOutput();
					ProductInfo productInfo = mapProducts.get(product);
					if (productInfo.getEdition() != null) {
						newProduct.setEdition(productInfo.getEdition());
					}
					if (productInfo.getVersion() != null) {
						newProduct.setVersion(productInfo.getVersion());
					}
					listOfProducts.put(product,newProduct);
				}
			}

		}
		return listOfProducts.values();
	}

	public static void main(String[] args) {

		List<String> listProduct = new ArrayList<String>();
		listProduct.add("CVCD");
		listProduct.add("SDFD");
		listProduct.add("DDDF");
		listProduct.add("SDFD");
		Map<String, ProductInfo> mapProducts = new HashMap<String, ProductInfo>();
		mapProducts.put("CVCD", new ProductInfo(1, "X"));
		mapProducts.put("SDFD", new ProductInfo(2, "Z"));
		mapProducts.put("DDDF", new ProductInfo(1));
		Collection<ProductOutput> result = listAggregatedOfProducts(listProduct, mapProducts);
		System.out.println(result);

	}

}
