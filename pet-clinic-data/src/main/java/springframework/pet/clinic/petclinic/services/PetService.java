package springframework.pet.clinic.petclinic.services;

import springframework.pet.clinic.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> saveAll();
}
