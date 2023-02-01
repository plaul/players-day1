package dat3.fullstack.entity;

import jakarta.persistence.*;

@Entity(name = "spiller")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="spiller_navn",nullable = false)
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public Player() { }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
