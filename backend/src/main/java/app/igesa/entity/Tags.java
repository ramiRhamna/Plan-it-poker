package app.igesa.entity;

import javax.persistence.*;
import app.igesa.translation.TagsTranslation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 *
 * @author Tarchoun Abir
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Tags")
public class Tags extends Auditable {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id ;
	@Column(columnDefinition="text")
	private String description ;
	/**
	 * Entreprise
	 */
       @ManyToOne
	   private Entreprise entreprise ;


	/**
	 * post list
	 */
	@OneToMany(mappedBy="tags",cascade = CascadeType.ALL)
	private List<Post>posts ;

	/**
	 * product List
	 */
	@OneToMany(mappedBy="tags",cascade = CascadeType.ALL)
	private List<Product>products;

	@OneToMany(mappedBy="tags",cascade = CascadeType.ALL)
	private List<TagsTranslation>tagsTranslations;
}
