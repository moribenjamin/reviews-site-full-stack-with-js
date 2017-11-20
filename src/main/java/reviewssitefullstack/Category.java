package reviewssitefullstack;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long categoryId;

	private String categoryName;

	@OneToMany(mappedBy = "category")
	private Set<Review> reviewsInCategory = new HashSet<Review>();

	protected Category() {

	}

	public Category(String categoryName) {
		this.categoryName = categoryName;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public Set<Review> getReviewsInCategory() {
		return reviewsInCategory;
	}

	@Override
	public String toString() {
		return "Category: " + categoryName;
	}
}
