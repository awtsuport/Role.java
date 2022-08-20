package com.api.schoolsystem.Model.UserAccount.UserAcount;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data                 //SetValue Variable And GetValue Variable
@NoArgsConstructor    // Default Constructor
@AllArgsConstructor   // Constructor Have Parameter
                      // Class UserCreate Account And Variable
public class UserAccount
{
  private int user_id;
  private String user_name;
  private String user_email;
  private String user_password;
  private String user_gender;
  private String user_generator;
  private String user_image ;
  private int date_creat;
}
