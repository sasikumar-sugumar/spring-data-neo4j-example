/**
 * 
 */
package com.graph.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author euro
 *
 */
@RestController
public class WriteController {

	@RequestMapping(value = "/createNode", method = RequestMethod.POST)
	public @ResponseBody String cerateNode() {
		return "Node Created";
	}

}
