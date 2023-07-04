package com.exercices.exercice1;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exercices.exercice1.domain.ObjectA;
import com.exercices.exercice1.domain.ObjectB;

@SpringBootApplication
public class Exercice1Application {

	@Autowired
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Exercice1Application.class, args);
		Optional<ObjectA> optionalA = Optional.empty();
//		of(new ObjectA("Object A",1,"it's OBJ A "))
		System.out.println(TransformAToB(optionalA));

	}
	
	public static ObjectB TransformAToB(Optional<ObjectA> optionalA) throws Exception
	{
		return optionalA.map(Exercice1Application::mapAtoB).orElseThrow(()-> new Exception("object A is Empty"));
	}
	
	public static ObjectB mapAtoB(ObjectA a) {
		
		return (new ObjectB(a.getNameA(), a.getIdA(), a.getLabelA()+"transformed to B"));
	}

}
