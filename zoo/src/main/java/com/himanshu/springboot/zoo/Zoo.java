package com.himanshu.springboot.zoo;

import com.himanshu.springboot.animal.Animal;
import com.himanshu.springboot.birds.Bird;
import java.util.List;

public record Zoo(List<Animal> animals, List<Bird> birds) {}
