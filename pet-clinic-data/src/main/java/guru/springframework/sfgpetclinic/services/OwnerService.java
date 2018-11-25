package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService {

	Owner findByLastName(String LastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();

}
