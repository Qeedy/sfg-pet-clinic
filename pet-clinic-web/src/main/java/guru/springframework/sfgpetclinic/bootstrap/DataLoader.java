package guru.springframework.sfgpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.services.map.PetServiceMap;
import guru.springframework.sfgpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {
	
	@Autowired
	OwnerService ownerService; 
	@Autowired
	VetService vetService;
	@Autowired
	PetService petService;
	
	/*public DataLoader(OwnerService ownerService, VetService vetService, PetService petService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petService = petService;
	}
*/
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Owner owner1 = new Owner();
		owner1.setFirstName("Umar");
		owner1.setLastName("Syarif");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Imam");
		owner2.setLastName("Khomeini");
		
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners....");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Syarifah");
		vet1.setLastName("Muzenah");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();	
		vet2.setFirstName("Sultan");
		vet2.setLastName("Hasan");
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets.....");
		
	}
}
