/**
 * 
 */
package com.graph.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author euro
 *
 */
@RestController
public class ReadController {
	
	@RequestMapping(value="/getAllNodes",method=RequestMethod.GET)
	public @ResponseBody String getAllNodes(@RequestParam String searchTerm){
		return searchTerm;
	}

}
