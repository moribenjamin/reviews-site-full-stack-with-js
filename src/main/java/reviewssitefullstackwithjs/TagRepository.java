package reviewssitefullstackwithjs;

import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {

	Tag findByTagName(String tagName);

}
