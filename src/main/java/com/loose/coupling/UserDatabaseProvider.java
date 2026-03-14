package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        //Directly acess database
        return "User Details From Database";
    }
}
