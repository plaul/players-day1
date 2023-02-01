package dat3.fullstack.config;

import dat3.fullstack.entity.Player;
import dat3.fullstack.repositories.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class SetupPlayers implements CommandLineRunner {

    final PlayerRepository playerRepository;
    public SetupPlayers(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<String> players = new ArrayList<>(Arrays.asList(
                "Lionel Messi", "Cristiano Ronaldo", "Neymar Jr.", "Kylian Mbappé", "Kevin De Bruyne", "Virgil van Dijk", "Robert Lewandowski", "Jan Oblak", "Kalidou Koulibaly", "Sergio Ramos", "Luka Modrić", "Paulo Dybala", "Antoine Griezmann", "Raheem Sterling", "Bernardo Silva", "Frenkie de Jong", "Joshua Kimmich", "Hugo Lloris", "Sergio Aguero", "Paulo Dybala", "Luis Alberto", "Thomas Muller", "Thomas Partey", "Riyad Mahrez", "Mohamed Salah"
        ));

        List<Player> playerEntities = players.stream().map(p->new Player(p)).collect(Collectors.toList());

        playerRepository.saveAll(playerEntities);    }
}

