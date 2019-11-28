package edu.progmatic.transfermoney;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simulator {

    public static void main(String[] args) throws InterruptedException {
        Account aladar = new Account("Aladár", 100);
        Account dalara = new Account("Dalára", 0);
        Map<String, Account> map = new HashMap<>();
        map.put(aladar.getName(), aladar);
        map.put(dalara.getName(), dalara);
        Bank b = new Bank(map);
        b.tranferMoney("Aladár", "Dalára", 100);
        b.tranferMoney("Aladár", "Dalára", 100);
        b.tranferMoney("Aladár", "Dalára", 100);

        b.printAccounts();
        b.printTransactionHistory();

    }
}
