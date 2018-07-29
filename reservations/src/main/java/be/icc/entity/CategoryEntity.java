package be.icc.entity;

import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;
@Entity
@Table(name = "category", schema = "category", catalog = "")
public class CategoryEntity {
    private Long id;
    private String nom;
    private Collection<ShowsEntity> shows;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nom", nullable = false, length = 10)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @OneToMany(cascade = {}, mappedBy = "category")
    public Collection<ShowsEntity> getShows() {
        return shows;
    }

    public void setShows(Collection<ShowsEntity> shows) {
        this.shows = shows;
    }
}
