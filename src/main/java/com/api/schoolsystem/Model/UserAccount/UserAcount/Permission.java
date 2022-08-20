package com.api.schoolsystem.Model.UserAccount.UserAcount;

    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;
@Data                   //SetValue Variable And GetValue Variable
@NoArgsConstructor      // Default Constructor
@AllArgsConstructor     // Constructor Have Parameter
                        // Class Permission And Variable
public class Permission
{
    private com.api.schoolsystem.Model.UserAccount.UserAcount.Role Role;
    private com.api.schoolsystem.Model.UserAccount.UserAcount.UserAccount UserAccount;
    private int Add;
    private int Edit;
    private int Delete;
    private int Search;
    private int Report;
}
