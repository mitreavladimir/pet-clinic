package springframework.pet.clinic.petclinic.services;

import springframework.pet.clinic.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> saveAll();
}
