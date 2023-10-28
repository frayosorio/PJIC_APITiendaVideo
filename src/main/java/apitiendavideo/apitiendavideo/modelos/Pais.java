package apitiendavideo.apitiendavideo.modelos;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;

@Entity
@Table(name = "pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_pais")
    @GenericGenerator(name = "secuencia_pais", strategy = "increment")
    @Column(name = "id")
    private Long id;

    @Column(name = "pais", length = 100, unique = true)
    private String nombre;

    @Column(name = "codigoalfa2", length = 5, nullable = true)
    private String codigoAlfa2;

    @Column(name = "codigoalfa3", length = 5, nullable = true)
    private String codigoAlfa3;

    public Long getId() {
        return id;
    }

    public Pais() {
    }

    public Pais(Long id, String nombre, String codigoAlfa2, String codigoAlfa3) {
        this.id = id;
        this.nombre = nombre;
        this.codigoAlfa2 = codigoAlfa2;
        this.codigoAlfa3 = codigoAlfa3;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoAlfa2() {
        return codigoAlfa2;
    }

    public void setCodigoAlfa2(String codigoAlfa2) {
        this.codigoAlfa2 = codigoAlfa2;
    }

    public String getCodigoAlfa3() {
        return codigoAlfa3;
    }

    public void setCodigoAlfa3(String codigoAlfa3) {
        this.codigoAlfa3 = codigoAlfa3;
    }

}
