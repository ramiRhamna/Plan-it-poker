package app.igesa.entity;
import lombok.*;
import javax.persistence.*;

/**
 * @author Tarchoun Abir
 *
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Page2")
public class Page2 extends  Auditable {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long id ;
        @Column(columnDefinition="text")
        private String title ;
        @Column(columnDefinition="text")
        private String htmlContent ;
        @ManyToOne
        private Entreprise entreprise;

}
