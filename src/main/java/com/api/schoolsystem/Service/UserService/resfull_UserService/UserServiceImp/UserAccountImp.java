package com.api.schoolsystem.Service.UserService.resfull_UserService.UserServiceImp;

import com.api.schoolsystem.Model.UserAccount.UserAcount.UserAccount;
import com.api.schoolsystem.Repository.UserAccountRepository;
import com.api.schoolsystem.Service.UserService.resfull_UserService.UserAcountService.UserAccountServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserAccountImp implements UserAccountServices
{

    // TODO :: UUID generator Not Duplicate Data Into Data Base
    String generator = UUID.randomUUID().toString();
     // TODO : Injection UserRepository And Create Constructor
     //  In Repository Or Autowire The Same
    private  final UserAccountRepository userAccountRepository;
    public UserAccountImp(UserAccountRepository userAccountRepository)
    {
        this.userAccountRepository = userAccountRepository;
    }


    @Override
    public List<UserAccount> GetAllUserAccount()
    {
        //TODO: Call Methode From UserAccountRepository
         return userAccountRepository.GetAllUserAccount();
    }

    @Override
    public String GetUserAccountByUserGenerator(String generator)
    {
         return  userAccountRepository.GetUserAccountGenerator(generator);

    }

    @Override
    public String DeleteUserAccount(String generator)
    {
        return userAccountRepository.DeleteAccountUser(generator);

    }

    @Override
    public String UpdateUserAccount(UserAccount userAccount) {
        userAccount.setUser_generator(generator);
        String CallData = userAccountRepository.UpdateAccountUsers(userAccount);
        return  CallData;
    }

    public void setGenerator(String generator)
    {
        this.generator = generator;
    }

    @Override
    public String InsertUserAccount(UserAccount userAccount)
    {

                return ("Success\n" +userAccountRepository.SaveUserAccount(new UserAccount()));
    }
}
