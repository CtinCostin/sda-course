package com.sda.spring.data.jpa.repositories.pagination;


import com.sda.spring.data.jpa.repositories.crud.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.function.Consumer;

@Configuration
public class PagingAndSortingRepositoryConfig {

    private static final Logger log = LoggerFactory.getLogger(PagingAndSortingRepositoryConfig.class);

    @Autowired
    PersonPagingAndSortingRepository repository;

    @Bean
    public CommandLineRunner pagingAndSortingData() {
        //interface = implementation

        return args -> {
            loadData();
            paginate();
            sort();
            paginateAndSort();
        };

    }


    //load data
    public void loadData() {
        repository.save(new Person("Paul", 33));
        repository.save(new Person("alina", 28));
        repository.save(new Person("kazimir", 34));
        repository.save(new Person("lidia", 32));
        repository.save(new Person("violeta", 32));
    }

    //paginate
    //pageable - pagination info
    //PageRequest - implementation of AbstractPageRequest
    private void paginate() {
        Pageable firstPageWithTwoElements = PageRequest.of(2, 2);
        Page<Person> page = repository.findAll(firstPageWithTwoElements);
        // Consumer<Person> consumer = person -> log.info("Person: {}", person);
        printPageContent(page);
        Page<Person> peopleAge32Page = repository.findAllByAge(33, firstPageWithTwoElements);
        peopleAge32Page.getContent().forEach(person -> log.info("Person: {}", person));

    }

    private void sort() {
        Sort sortByName = Sort.by("name");
        Iterable<Person> sortedPeople = repository.findAll(sortByName);
        printPageContent(sortedPeople);

    }

    private void paginateAndSort() {
        Pageable sortByName = PageRequest.of(0, 5, Sort.by("name"));
        Page<Person> peopleSortedByName = repository.findAll(sortByName);
        printPageContent(peopleSortedByName);

        Pageable sortedByAgeDescending = PageRequest.of(0, 4, Sort.by("age").descending());
        Page<Person> peopleSortedByAgeDescending = repository.findAll(sortedByAgeDescending);
        printPageContent(peopleSortedByAgeDescending);


    }

    private void printPageContent(Iterable<Person> people) {
        people.forEach(person -> log.info("Person: {}", person));

    }

    private void printPageContent(Page<Person> page) {
        page.getContent().forEach(person -> log.info("Person: {}", person));

    }

}