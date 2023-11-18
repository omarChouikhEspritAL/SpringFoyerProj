package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String idReservation;
    Date anneeUniversitaire;
    boolean estValide;
    @ManyToMany(mappedBy = "reservations", cascade = CascadeType.ALL)
    List<Etudiant>etudiants = new ArrayList<>();
}
