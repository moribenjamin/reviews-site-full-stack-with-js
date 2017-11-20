package reviewssitefullstack;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewSitePopulator implements CommandLineRunner {

	@Resource
	private CategoryRepository categoryRepo;

	@Resource
	private ReviewRepository reviewRepo;

	@Resource
	private TagRepository tagRepo;

	@Override
	public void run(String... args) throws Exception {

		Category dress = new Category("Dress");
		categoryRepo.save(dress);
		Category casual = new Category("Casual");
		categoryRepo.save(casual);

		Tag expensive = new Tag("Expensive");
		tagRepo.save(expensive);
		Tag reasonable = new Tag("Reasonable");
		tagRepo.save(reasonable);
		Tag dope = new Tag("Dope");
		tagRepo.save(dope);
		Tag wack = new Tag("Wack");
		tagRepo.save(wack);
		Tag oldSchool = new Tag("Old School");
		tagRepo.save(oldSchool);
		Tag newSchool = new Tag("New School");
		tagRepo.save(newSchool);
		Tag lit = new Tag("Lit");
		tagRepo.save(lit);

		Review review1 = new Review(dress, "The Electric Slides",
				"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et "
						+ "magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, "
						+ "fringilla vel,aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. "
						+ "Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. "
						+ "Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a",
				"November13, 2017", "/images/electricslides.jpg", expensive, newSchool, dope);
		reviewRepo.save(review1);
		Review review2 = new Review(dress, "The Hop Scotts",
				"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et "
						+ "magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, "
						+ "fringilla vel,aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. "
						+ "Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. "
						+ "Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a",
				"November13, 2017", "/images/hopscotts.jpg", reasonable, oldSchool);
		reviewRepo.save(review2);
		Review review3 = new Review(casual, "The Moon Walkers",
				"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et "
						+ "magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, "
						+ "fringilla vel,aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. "
						+ "Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. "
						+ "Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a",
				"November13, 2017", "/images/moonwalkers.jpg", reasonable, lit, newSchool);
		reviewRepo.save(review3);
		Review review4 = new Review(casual, "The Street Beats",
				"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et "
						+ "magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, "
						+ "fringilla vel,aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. "
						+ "Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. "
						+ "Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a",
				"November13, 2017", "/images/streetbeats.jpg", expensive, newSchool);
		reviewRepo.save(review4);
		Review review5 = new Review(casual, "The Stride Rites",
				"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et "
						+ "magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, "
						+ "fringilla vel,aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. "
						+ "Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. "
						+ "Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a",
				"November13, 2017", "/images/striderites.jpg", reasonable, oldSchool, wack);
		reviewRepo.save(review5);
		Review review6 = new Review(dress, "The Chaunceys",
				"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et "
						+ "magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, "
						+ "fringilla vel,aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. "
						+ "Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. "
						+ "Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a",
				"November13, 2017", "/images/thechaunceys.jpg", expensive, oldSchool);
		reviewRepo.save(review6);
		Review review7 = new Review(casual, "The Sohos",
				"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et "
						+ "magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, "
						+ "fringilla vel,aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. "
						+ "Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. "
						+ "Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a",
				"November13, 2017", "/images/thesohos.jpg", expensive, newSchool);
		reviewRepo.save(review7);
	}

	public ReviewSitePopulator() {

	}
}
