package com.junhyupa.springboot.learnjpahibernate.course;

import com.junhyupa.springboot.learnjpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CouresCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS", "in28minutes"));
        repository.save(new Course(2, "Learn JAVA", "in28minutes"));
        repository.save(new Course(3, "Learn JS", "in28minutes"));
        repository.save(new Course(4, "Learn C++", "in28minutes"));

        repository.deleteById(1L);

        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(2L));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByAuthor("in28minutes"));

        System.out.println(repository.findByName("Learn JAVA"));
    }
}
