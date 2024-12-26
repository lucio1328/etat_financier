package com.etat_financier.repository;

import com.etat_financier.models.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCompteRepository extends JpaRepository<TypeCompte, Integer> {
}
