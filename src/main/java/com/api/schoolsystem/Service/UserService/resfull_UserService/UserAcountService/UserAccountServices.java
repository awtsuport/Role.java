package com.api.schoolsystem.Service.UserService.resfull_UserService.UserAcountService;

import com.api.schoolsystem.Model.UserAccount.UserAcount.UserAccount;

import java.util.List;

public interface UserAccountServices
{
    // TODO : get All UserAccount From DataBase
    List<UserAccount>GetAllUserAccount();
    // TODO : get UserUserAccount By UserGenerator From DataBase
    String GetUserAccountByUserGenerator(String generator);
    // TODO : delete UserAccount Into DataBase
    String DeleteUserAccount(String generator);
    // TODO : update UserAccount Into  DataBase
    String UpdateUserAccount(UserAccount userAccount);
    // TODO : Create Data UserAccount Into DataBase
    String InsertUserAccount(UserAccount userAccount);


}
