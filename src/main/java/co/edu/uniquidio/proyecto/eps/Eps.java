package co.edu.uniquidio.proyecto.eps;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Eps implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private String id_eps;
    private String nombre;


}