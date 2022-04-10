package pt.smokeshop;

import pt.smokeshop.model.Product;
import pt.smokeshop.repository.ProductsRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SmokeShopApp {
	public static void main(String[] args) {
		SpringApplication.run(SmokeShopApp.class, args);
	}
	@Bean
	CommandLineRunner initDatabase(ProductsRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Product shirtRaw = new Product();
			shirtRaw.setName("RAW Beanie");
			shirtRaw.setCategory("hats");
			shirtRaw.setDescription("The RAW Soft Beanie makes cold days and nights a little more bearable. This simple but elegant hat has the iconic RAW logo patched and sewn across the front so it looks clean and is washing machine friendly. Made extra soft and comfy, the all-black RAW Beanie will keep you warm and toasty all winter long. Show your love for the most RAWESOME rolling papers in the world with the RAW Beanie!");
			shirtRaw.setPrice(20.00);
			shirtRaw.setPhoto("https://rawpaper-media.s3.us-west-2.amazonaws.com/wp-content/uploads/2021/02/26194039/beanie-1.png");
			courseRepository.save(shirtRaw);

			Product blueHat = new Product();
			blueHat.setName("RAWlife Blue Trucker Hat");
			blueHat.setCategory("hats");
			blueHat.setDescription("Show the world how you RAW’k with the RAWlife Brazil Blue Trucker Hat! This snapback trucker hat has a 3D RAW logo embossed on the front, a black & tan RAW patch on the back and a custom RAW lining under the front panel. This special edition RAW Brazil hat also has a convenient cone sleeve above the right ear, so you can put your pre-roll on your hat instead of behind your ear!");
			blueHat.setPrice(20.00);
			blueHat.setPhoto("https://rawpaper-media.s3.us-west-2.amazonaws.com/wp-content/uploads/2021/02/26193804/RAWlife-Brazil-Blue-Trucker-Hat.png");
			courseRepository.save(blueHat);
		};
	}
}
