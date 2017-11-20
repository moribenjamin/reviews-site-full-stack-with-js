package reviewssitefullstack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private Long reviewId;
	private String name;
	private String imageUrl;

	@Lob
	private String content;

	private String date;

	@ManyToOne
	private Category category;

	@ManyToMany
	private Set<Tag> tags;

	protected Review() {

	}

	public Review(Category category, String name, String content, String date, String imageUrl, Tag... tags) {
		this.category = category;
		this.name = name;
		this.content = content;
		this.date = date;
		this.imageUrl = imageUrl;
		this.tags = new HashSet<>(Arrays.asList(tags));
	}

	public Long getReviewId() {
		return reviewId;
	}

	public String getName() {
		return name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getContent() {
		return content;
	}

	public String getDate() {
		return date;
	}

	public Category getCategory() {
		return category;
	}

	public Set<Tag> getTags() {
		return tags;

	}
}
