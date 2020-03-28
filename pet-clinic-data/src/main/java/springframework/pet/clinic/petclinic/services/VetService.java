package springframework.pet.clinic.petclinic.services;

import springframework.pet.clinic.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> saveAll();
}
