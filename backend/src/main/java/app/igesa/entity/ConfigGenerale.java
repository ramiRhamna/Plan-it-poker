package app.igesa.entity;

import javax.persistence.*;
import app.igesa.translation.ConfigurationTranslation;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * @author Tarchoun Abir
 **/

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name =" Configuration")
@EqualsAndHashCode(callSuper= true)
@EntityListeners(AuditingEntityListener.class)
public class ConfigGenerale extends Auditable{

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id ;
	@Column(name="Facebook")
	private String facebook ;
	@Column(name="Twitter")
	private String twitter ;
	@Column(name="Youtube")
	private String youtube ;
	@Column(name="Logo")
	private String image ;
	@Column(name="Favicon")
	private String favicon ;
	@Column(name="Adresse")
	private String adresse ;
	@Column(name="Email")
	private String email ;
	@Column(name="Phone")
	private String phone ;
	@Column(name="Fax")
	private String fax ;
	@Column(name="CopyRight")
	private String copyright ;
	@Column(name="title")
	private String title ;
	@Column(name="Newslettertitle")
	private String newslettertitle;
	private String newslettersubtitle ;
	private String tagline ;
	//private RobotsTags robotsTags;

	/**
	 * Entreprise
	 */
	@ManyToOne
	private Entreprise entreprise;


	@OneToMany(mappedBy="configGenerale",cascade = CascadeType.ALL)
	private List<ConfigurationTranslation> configurationTranslations;
}
