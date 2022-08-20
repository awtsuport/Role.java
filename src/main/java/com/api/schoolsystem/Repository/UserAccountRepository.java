package com.api.schoolsystem.Repository;

import com.api.schoolsystem.Model.UserAccount.UserAcount.UserAccount;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface UserAccountRepository
{
    /**
     * TODO : Script Get Data By User Generator UserAccount From Database
     * @param generator
     */
      @Select(
                  "SELECT " +
                  "user_id, user_name, user_email, " +
                  "user_password, user_gender, " +
                  "user_generator, user_image, " +
                  "date_creat " +
                  "FROM user_account" +
                  "WHERE user_generator =#{generator}"
              )
    String GetUserAccountGenerator(@Param("generator") String generator);
      @Result(property = "generator",column = "user_generator")

    /**
     * TODO : Script Get All Data UserAccount From Database
     * @return
     */
      @Select
              (
                  "SELECT " +
                  "user_id, user_name, user_email, " +
                  "user_password, user_gender, " +
                  "user_generator, user_image, " +
                  "date_creat " +
                  "FROM user_account"
              )
      List<UserAccount> GetAllUserAccount();

    /**
     * TODO : Script Delete  Data UserAccount From Database
     * @param generator
     */
      @Delete(
                  "DELETE FROM" +
                  " user_account " +
                  "WHERE user_generator=#{generator}"
             )
    String DeleteAccountUser(@Param("generator") String generator);

    /**
     * TODO : Script Update  Data From UserAccount Into Database
     * @param userAccount
     */
       @Update("UPDATE FROM user_account  SET "  +
                " user_name = #{user_name}, " +
                "user_email = #{user_email}, " +
                "user_password = #{user_password}," +
                " user_gender = #{user_gender}, " +
                "user_image =#{user_image}, " +
                "date_creat = #{date_creat} " +
               "WHERE user_generator = #{user_generator}"
              )

    String UpdateAccountUsers(@Param("userAccount") UserAccount userAccount);

    /**
     * TODO : Script Create  Data From UserAccount Into Database
     */
       @Insert("INSERT INTO user_account( "  +
               "user_id, user_name, user_email, " +
               "user_password, user_gender, " +
               "user_generator, user_image, " +
               "date_creat )" +
               "VALUES(#{user_id},#{user_name}," +
               "#{user_email},#{user_password}," +
               "#{user_gender},#{user_generator}," +
               "#{user_image},#{date_creat}) "
               )
    String SaveUserAccount(@Param("user") UserAccount user);
}
