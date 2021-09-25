package com.sda.spring.data.jpa.association;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AssociationConfig {

    @Autowired
    private FatherRepository fatherRepository;

    @Bean
    public CommandLineRunner associationData() {
        return (strings) -> testAssociations();
    }

    private void testAssociations(){
        Son alex = new Son("Alex");
        Son brian = new Son("Brian");
        Father father = new Father("Ion");

        father.addSon(alex);
        father.addSon(brian);
        fatherRepository.save(father);


    }
}
