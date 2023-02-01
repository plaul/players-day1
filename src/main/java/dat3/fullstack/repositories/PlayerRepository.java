package dat3.fullstack.repositories;

import dat3.fullstack.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
    Player findPlayerByName(String name);
}

