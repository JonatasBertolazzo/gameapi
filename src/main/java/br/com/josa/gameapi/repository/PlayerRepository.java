package br.com.josa.gameapi.repository;

import br.com.josa.gameapi.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String> {



}
