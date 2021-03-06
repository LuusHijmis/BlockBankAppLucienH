package com.blockbank.service;

import com.blockbank.database.domain.*;
import com.blockbank.database.repository.RootRepository;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import static org.assertj.core.api.Assertions.*;



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PortfolioServiceTest {

    private PortfolioService portfolioServiceUnderTest;
    private RootRepository mockRepo;


    private final Logger logger = LoggerFactory.getLogger(ExchangeRateUpdateServiceTest.class);

    @BeforeAll
    public void setUp() {
        mockRepo = Mockito.mock(RootRepository.class);
        portfolioServiceUnderTest = new PortfolioService(mockRepo);

        List<Transaction> transactions = new ArrayList<>();
        Asset bitcoin = new Asset("1", "Bitcoin", "BTC", "BITCOIN", 47000.00);
        double exchangeRateBit = 48000.00;
        Asset ethereum = new Asset("52", "Ethereum", "ETH", "ETH", 48.00);
        double exchangeRateETH = 50.00;
        Asset nextLevelCrypto = new Asset("1000", "NextLevelCrypto", "NLC", "NLC", 0.005);
        double exchangeRateNLC = 0.005;

        //static transactionRate
        double transactionRate = 0.5;

        // Clients
        ClientDetails clientDetails = new ClientDetails("Harold", "", "Stevens",
                LocalDate.parse("1973-09-25"), 123456007, "info@hjstevens.nl");

        Address address = new Address("Pieter Woutersstraat", 26, null, "2215MC",
                "Voorhout", "");
        UserDetails client1 = new UserDetails("Harold", "dlorah", "123", clientDetails, address);

        ClientDetails clientDetails1 = new ClientDetails("Harold", "", "Stevens",
                LocalDate.parse("1973-09-25"), 123456007, "info@hjstevens.nl");

        Address address1 = new Address("BlockBank Street", 12, null, "2215MC",
                "Hilly", "");
        UserDetails client2 = new UserDetails("Harold", "dlorah", "123", clientDetails1, address1);

        // Beheerder Blockbank
        UserDetails blockbank = new UserDetails("admin", "admin", "123", clientDetails, address);
        //

        // Transacties tussen client en Bank
        // Ethereum transacties:
        Transaction transaction2 = new Transaction(client1, blockbank, ethereum, LocalDateTime.now(),
                "Buy", 2.00, 50.00, transactionRate);
        Transaction transaction6 = new Transaction(client1, blockbank, ethereum, LocalDateTime.now(),
                "Buy", 5.00, 58.00, transactionRate);
        Transaction transaction7 = new Transaction(client1, blockbank, ethereum, LocalDateTime.now(),
                "Sell", 3.00, 57.00, transactionRate);
        Transaction transaction14 = new Transaction(client2, blockbank, ethereum, LocalDateTime.now(),
                "Buy", 5.00, 57.00, transactionRate);

        // Bitcoin transacties:
        Transaction transaction9 = new Transaction(client1, blockbank, bitcoin, LocalDateTime.now(),
                "Buy", 0.05, 30000.00, transactionRate);
        Transaction transaction10 = new Transaction(client1, blockbank, bitcoin, LocalDateTime.now(),
                "Buy", 0.04, 35000.00, transactionRate);
        Transaction transaction1 = new Transaction(client1, blockbank, bitcoin, LocalDateTime.now(),
                "Buy", 10.00, 40000.00, transactionRate);
        Transaction transaction3 = new Transaction(client1, blockbank, bitcoin, LocalDateTime.now(),
                "Sell", 1.00, 45000.00, transactionRate);
        Transaction transaction4 = new Transaction(client1, blockbank, bitcoin, LocalDateTime.now(),
                "Buy", 2.00, 40000.00, transactionRate);
        Transaction transaction5 = new Transaction(client1, blockbank, bitcoin, LocalDateTime.now(),
                "Sell", 5.00, 44000.00, transactionRate);

        // NextLevelCrypto transacties:
        Transaction transaction8 = new Transaction(client1, blockbank, nextLevelCrypto, LocalDateTime.now(),
                "Buy", 1000.00, exchangeRateBit, transactionRate);
        Transaction transaction11 = new Transaction(client1, blockbank, nextLevelCrypto, LocalDateTime.now(),
                "Sell", 500.00, exchangeRateBit, transactionRate);

//  transacties tussen clienten
        Transaction transaction12 = new Transaction(client1, client2, ethereum, LocalDateTime.now(),
                "Buy", 3.00, exchangeRateBit, transactionRate);
        Transaction transaction13 = new Transaction(client1, client2, nextLevelCrypto, LocalDateTime.now(),
                "Sell", 200.00, exchangeRateBit, transactionRate);
        //
//  transacties verdelen over meerdere lijsten en findTransactionByOpposingUserID mocken
//        List<Transactions> transactionsUserID1 = new Arraylist();
//         List<Transactions> transactionsOppossingUserID1 = new Arraylist();
        //        List<Transactions> transactionsUserBlockBank = new Arraylist();
//         List<Transactions> transactionsBlockbankOppossingUser = new Arraylist();
        //        List<Transactions> transactionsUserID2 = new Arraylist();
//         List<Transactions> transactionsOppossingUserID2 = new Arraylist();


        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        transactions.add(transaction4);
        transactions.add(transaction5);
        transactions.add(transaction6);
        transactions.add(transaction7);
        transactions.add(transaction8);
        transactions.add(transaction9);
        transactions.add(transaction10);
        transactions.add(transaction11);
        transactions.add(transaction12);
        transactions.add(transaction13);

        Mockito.when(mockRepo.findTransactionsByUserID(1)).thenReturn(transactions);

        Mockito.when(mockRepo.findAssetById("1")).thenReturn(bitcoin);
        Mockito.when(mockRepo.findAssetById("52")).thenReturn(ethereum);
        Mockito.when(mockRepo.findAssetById("1000")).thenReturn(nextLevelCrypto);

    }

    @AfterAll
    public void tearDown() {
        mockRepo = null;
        portfolioServiceUnderTest = null;
    }

    @Test
    void portfolioOverzichtNotNullTest() {
        assertThat(portfolioServiceUnderTest).isNotNull();
    }

    @Test
    void portfolioOverzichtTest() {

        Asset bitcoin = new Asset("1", "Bitcoin", "BTC", "BITCOIN", 47000.00);
        double exchangeRateBit = 48000.00;
        Asset ethereum = new Asset("52", "Ethereum", "ETH", "ETH", 48.00);
        double exchangeRateETH = 50.00;
        Asset nextLevelCrypto = new Asset("1000", "NextLevelCrypto", "NLC", "NLC", 0.005);
        double exchangeRateNLC = 0.005;

        Map<Asset, Double> tempMap = portfolioServiceUnderTest.getAssetsTotal(1);
        for (Map.Entry<Asset, Double> entry : tempMap.entrySet()) {
            Asset asset = entry.getKey();
            double amount = entry.getValue();
            System.out.println(asset.getName() + " " + amount);
        }

        assertThat(tempMap.get(bitcoin)).isCloseTo(6.0, Percentage.withPercentage(5));
        assertThat(tempMap.get(ethereum)).isEqualTo(4.0);
        assertThat(tempMap.get(nextLevelCrypto)).isEqualTo(500.0);
        assertThat(portfolioServiceUnderTest.currentValuePortfolio(1)).isEqualTo(286424.50);

        System.out.println(portfolioServiceUnderTest.currentValuePortfolio(1));

    }

    @Test
    public void currentValuePortfolioTEst() {

        System.out.println(portfolioServiceUnderTest.currentValuePortfolio(1));
        assertThat(portfolioServiceUnderTest.currentValuePortfolio(1)).isEqualTo(286424.50);
    }


    @Test
    public void generatePortfolioListTest() {

        List<PortfolioDTO> portfolioDTOS = portfolioServiceUnderTest.generatePortfolioList(1);
        assertThat(portfolioDTOS.get(1).getAssetAmount()).isCloseTo(6.0, Percentage.withPercentage(5));
        assertThat(portfolioDTOS.get(2).getAssetAmount()).isEqualTo(500.0);
        assertThat(portfolioDTOS.get(0).getAssetAmount()).isEqualTo(4.0);

        for (PortfolioDTO portfolioDTO : portfolioDTOS) {
            System.out.println(portfolioDTO);
        }

        String expected = "52 Ethereum ETH 48.0 4.0";
        String expected1 = "1 Bitcoin BTC 47000.0 6.09";
        String expected2 = "1000 NextLevelCrypto NLC 0.005 500.0";
        assertThat(portfolioServiceUnderTest.generatePortfolioList(1).get(0).toString()).isEqualTo(expected);
        assertThat(portfolioServiceUnderTest.generatePortfolioList(1).get(1).toString()).isEqualTo(expected1);
        assertThat(portfolioServiceUnderTest.generatePortfolioList(1).get(2).toString()).isEqualTo(expected2);

    }

    @Test
    public void generatePortfolioListTest2() {
        System.out.println(portfolioServiceUnderTest.getAssetsTotal(1));
        assertThat(portfolioServiceUnderTest.getAssetsTotal(1)).isNotNull();
    }

}
