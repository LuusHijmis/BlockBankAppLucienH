package com.blockbank.service;

import com.blockbank.contoller.AssetController;
import com.blockbank.database.domain.Asset;
import com.blockbank.database.domain.Transaction;
import com.blockbank.database.repository.RootRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

@Service
public class PortfolioService {

    private RootRepository rootRepository;
//    public ObjectMapper mapper;
    private final Logger logger = LoggerFactory.getLogger(PortfolioService.class);

    @Autowired
    public PortfolioService(RootRepository rootRepository) {
        this.rootRepository = rootRepository;
    }

    public List<Transaction> portfolioOverzicht(int userID) {
//        List<Transaction> transactions = rootRepository.findTransactionsByUSerID(userID);
//
//        List <Transaction> sellTransactions = transactions.stream()
//                .filter(transaction -> transaction.getTransactionDescription().equals("Sell"))
//                .collect(Collectors.toList());
//
//        List<Transaction> buyTransactions= transactions.stream()
//                .filter(transaction -> transaction.getTransactionDescription().equals("Buy"))
//                .collect(Collectors.toList());
//
//        List<Transaction> transactionSum =  null;
//        for(Transaction transaction:buyTransactions) {
//            String assetID = transaction.getAsset().getAssetID();
//
//        }
//        System.out.println(sellTransactions);
        return null;
//        String json = mapper.writeValueAsString(assetList);

//        return json;
    }

    public Map<Asset, Double> getAssetsTotal (int userID) {
        List<Transaction> transactions = rootRepository.findTransactionsByUSerID(userID);
        Map<Asset, Double> portfolio = new HashMap<>();
        for (Transaction transaction: transactions) {
            if (portfolio.get(transaction.getAsset()) == null) {
                Asset asset = transaction.getAsset();
                double amount = transaction.getAssetAmount();
                portfolio.put(asset, amount);
            } else {
                double currentAmount = portfolio.get(transaction.getAsset());
                if (transaction.getTransactionDescription().equals("Sell")) {
                    portfolio.replace(transaction.getAsset(), currentAmount - transaction.getAssetAmount());
                } else {
                    portfolio.replace(transaction.getAsset(), transaction.getAssetAmount() + currentAmount);
                }
            }
        }

//
//        for (Asset asset : rootRepository.showAllAssets()) {
//            if (portfolio.get(asset) == null) {
//                for (Transaction transaction : transactions) {
//                    portfolio.put(asset,transaction.getAssetAmount());
//                }
//            } else {
////                Map<Asset, Double> tempList= portfolio.get();
//                for (Transaction transaction : transactions) {
//                    double oldAssetmount = portfolio.get(transaction.getAssetAmount());
//                    portfolio.put(transaction.getAsset(), transaction.getAssetAmount() + oldAssetmount);
//                }
//            }
//        }
        return portfolio;
    }
}
