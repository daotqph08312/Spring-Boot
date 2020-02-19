package com.example.Helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Girl {
@Autowired

OutFit outfit;
public Girl(OutFit outfit) {
	this.outfit = outfit;
}
}
