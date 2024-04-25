package com.harbargerdev.planningpokerespresso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.harbargerdev.planningpokerespresso.models.Player;
import java.util.UUID;

public interface PlayerRepository extends JpaRepository<Player, UUID>{    
}