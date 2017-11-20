package reviewssitefullstackwithjs;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewSiteController {

	@Resource
	CategoryRepository categoryRepo;

	@Resource
	ReviewRepository reviewRepo;

	@Resource
	TagRepository tagRepo;

	// @RequestMapping("/")
	// public String redirectToReviews(Model model) {
	// return "redirect:/reviews";
	// }

	@RequestMapping("/categories")
	public String showAllCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories";
	}

	@RequestMapping("/category")
	public String showCategory(@RequestParam Long id, Model model) {
		model.addAttribute("category", categoryRepo.findOne(id));
		return "category";
	}

	@RequestMapping("/reviews")
	public String showAllReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@RequestMapping("/review")
	public String showReview(@RequestParam Long id, Model model) {
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review";
	}

	@RequestMapping("/tags")
	public String ahowAllTags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tags";
	}

	@RequestMapping("/tag")
	public String showOneTag(@RequestParam Long id, Model model) {
		model.addAttribute("tag", tagRepo.findOne(id));
		return "tag";
	}

	@RequestMapping("/add-tag")
	public String addTag(@RequestParam(value = "id") Long tagId, String tagName) {
		Tag newTag = new Tag(tagName);
		tagRepo.save(newTag);
		Review review = reviewRepo.findOne(tagId);
		review.addTagName(newTag);
		reviewRepo.save(review);
		return "redirect:/review?id=" + tagId;
	}

	@RequestMapping("/remove-tag")
	public String removeTag(@RequestParam(value = "id") Long id, String tagName, Model model) {
		Tag deleteTag = tagRepo.findByTagName(tagName);
		if (deleteTag != null) {
			Review review = reviewRepo.findOne(id);
			Set<Tag> removeTag = review.getTags();
			if (removeTag.contains(deleteTag)) {
				review.removeTag(deleteTag);
			}
			reviewRepo.save(review);
		}
		return "redirect:/review?id=" + id;
	}
}