package com.knowitive.ontogov.controller;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.springframework.web.bind.annotation.*;

import de.uni_stuttgart.vis.vowl.owl2vowl.Owl2Vowl;

/**
* Simple Test Class
*  
* @author Luis Escobar
* @date 20160217
* @version 1.0
*/
@RestController
@RequestMapping("/test")
public class Test {

	
	@RequestMapping(value = "/{name}", method = RequestMethod.POST, produces ="text/plain;charset=utf-8")
	public String test(@PathVariable String name) {
		IRI oaIri = IRI.create(name); // "http://www.w3.org/ns/oa.rdf")
		Owl2Vowl owl = new Owl2Vowl((OWLOntology) oaIri);
		
		return (owl.getJsonAsString());

	}
	

}
