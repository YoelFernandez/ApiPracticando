package yoel.fernandez.ApiRest.entity;
     
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Assistance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAssistance;

    private LocalDateTime dateTime; // Fecha y hora de asistencia

    @ManyToOne
    @JoinColumn(name = "id_person") // Esta es la clave foránea
    private Person person;
}