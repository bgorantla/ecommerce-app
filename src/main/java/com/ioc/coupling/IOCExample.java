package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLocLooseCouplingExample.xml");
        //UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        //UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = (UserManager) context.getBean("userManagerWithWebServiceProvider");
        System.out.println(userManagerWithWS.getUserInfo());

        //UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        //UserManager userManagerWithNewDB = new UserManager(newDatabaseProvider);
        UserManager userManagerWithNewDB = (UserManager) context.getBean("userManagerWithNewDatabaseProvider");
        System.out.println(userManagerWithNewDB.getUserInfo());



    }
}
