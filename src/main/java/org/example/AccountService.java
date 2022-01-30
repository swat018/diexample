package org.example;

import me.swat018.di.Inject;

public class AccountService {

    @Inject
    AccountRepository accountRepository;

    public void join() {
        System.out.println("Service.join");
        accountRepository.save();
    }
}
