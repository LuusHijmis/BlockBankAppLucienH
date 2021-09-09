package com.blockbank.database.repository;

import com.blockbank.database.domain.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


@SpringBootTest
@ActiveProfiles("test")
class JdbcTransactionDaoTest {

    TransactionDao transactionDaoTest;

    private final Logger logger = LoggerFactory.getLogger(JdbcTransactionDaoTest.class);

    @Autowired
    public JdbcTransactionDaoTest(TransactionDao transactionDaoTest) {
        super();
        this.transactionDaoTest = transactionDaoTest;
        logger.info("New JdbcTransactionDaoTest");
    }
    @Test
    public void transactionDaoNotNullTest(){
        assertThat(transactionDaoTest).isNotNull();
    }

    @Test
    void save() {
        Asset bitcoin =  new Asset("1","Bitcoin", "BTC","BITCOIN",1.00);
        double exchangeRateBit = 48000.00;

        ClientDetails clientDetails = new ClientDetails("Harold", "","Stevens",
                LocalDate.parse("1973-09-25"),123456007,"info@hjstevens.nl");
        Address address = new Address("Pieter Woutersstraat",26,null,"2215MC",
                "Voorhout","");

        UserDetails userDetails = new UserDetails("Harold","dlorah","123",clientDetails,address);
        userDetails.setUserID(1);
        //

        Transaction transaction = new Transaction(userDetails,userDetails,bitcoin, LocalDateTime.now(),
                "Buy",1.00,exchangeRateBit,10.00);
        System.out.println(transaction);

        var actual = transactionDaoTest.save(transaction);
        var found = transactionDaoTest.findTransactionByID(4);
//        Assertions.assertThat(found.toString()).contains(actual.toString()); // welofnietkomofga1234523

    }

    @Test
    void findTransactionByUserId() {

        var found = transactionDaoTest.findTransactionByUserId(1);
        for(TransactionDTO transactionDTO:found) {
            System.out.println(transactionDTO);
        }
    }
}