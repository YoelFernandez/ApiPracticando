package yoel.fernandez.ApiRest.entity;

import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // lo que hace es generar los getter y setter 
@AllArgsConstructor // genera el constructor con todos los argumentos y parametros
@NoArgsConstructor// constructor que no resive ningun parametro
@Entity
public class Person {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) // genera el identificador
    @Column(name = "id_person")
    private Integer idPerson;

    @Basic
    private String firstName;
    private String lastName; 
    private String email;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Assistance> assistances;

}
