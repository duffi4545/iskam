package upce.cz.iskam.entity;


import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;


@Data
@NoArgsConstructor
@Entity
public class AppUser {
    @Id
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private Boolean active;

    @Column
    private LocalDateTime creationDate;

    @Column
    private LocalDateTime updateDate;

    @ManyToMany(mappedBy = "users")
    private List<Role> roles = Collections.emptyList();
}
