package com.banking.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banking.Entity.AccountDetails;


@Repository
public interface BankRepo extends CrudRepository <AccountDetails,Long>
{

}
