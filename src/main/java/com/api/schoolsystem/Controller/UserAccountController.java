package com.api.schoolsystem.Controller;

import com.api.schoolsystem.Model.UserAccount.UserAcount.UserAccount;
import com.api.schoolsystem.Service.UserService.resfull_UserService.UserAcountService.UserAccountServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserAccountController
{
    /**
     * Inject From UserService Interface
     * Create Constructor And Been
     */

    private final UserAccountServices userAccountServices;
    public UserAccountController(UserAccountServices userAccountServices)
    {
        this.userAccountServices = userAccountServices;
    }

    /**
     * TODO : Get ALL Data  User Account From Data Base
     * @return
     */

    @GetMapping("/")
    public String ListUserAccount()
    {
        return ("Success Fully DisplayUserAccount"+"\n" + userAccountServices.GetAllUserAccount() );
    }

    /**
     * TODO : Display Get User Account By Generator
     * @param user_generator
     * @return
     */
    @GetMapping("/generator/{user_generator}")
    public String GetByUserAccountUsGenerator(@PathVariable String user_generator)
    {
        return userAccountServices.GetUserAccountByUserGenerator(user_generator);
    }

    /**
     *   TODO : Display Delete User From Data Base
     *
     */

    @DeleteMapping("/delete/{user_generator}")
    public String DeleteUserAccount(@PathVariable String user_generator)
    {
        return (" Get Data Success Fully \n" + userAccountServices.GetUserAccountByUserGenerator(user_generator));
    }

    /**
     *   TODO : Display Create  UserAccount From Data Base
     * @param userAccount
     */

    @PostMapping("/adduser")
    public String AddNewUserAccount(@PathVariable UserAccount userAccount)
    {


        return
        (
                "Add Data Success Fully \n" +userAccountServices.InsertUserAccount(userAccount=new UserAccount())
        );
    }

    /**
     *   TODO : Display Update UserAccount From Data Base
     * @param userAccount
     */

    public String UpdateUserAccount(@PathVariable UserAccount userAccount)
    {

        return
        (
                "Update Success Fully \n "+
                 userAccountServices.UpdateUserAccount(new UserAccount())
        );
    }

}