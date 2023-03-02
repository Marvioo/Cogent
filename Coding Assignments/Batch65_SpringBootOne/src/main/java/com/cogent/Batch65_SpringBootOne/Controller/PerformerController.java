package com.cogent.Batch65_SpringBootOne.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.Batch65_SpringBootOne.Entity.Performer;
import com.cogent.Batch65_SpringBootOne.repo.PerformerRepository;

@RestController
public class PerformerController {
	@Autowired
	public PerformerRepository performerRepository;
	
	@PostMapping("/addPerformer")
	public Performer addPerformer(@RequestBody Performer performer) {
		System.out.println("Add performer");
		return performerRepository.save(performer);
	}
	
	@GetMapping("/getPerformer")
	public List<Performer> getPerformer() {
		return performerRepository.findAll();
	}
	
	@DeleteMapping("/deletePerformer/{id}")
	public void deletePerformer(@PathVariable("id") int id) {
		performerRepository.deleteById(id);
	}
	
	@PutMapping("/updatePerformer")
	public String updatePerformer() {
		return "Update successfull";
	}
}
