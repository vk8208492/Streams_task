package app;

import app.UserHadler.UserHadler;
import app.UserOperator.UserOperator;
import app.UserRepository.UserRepository;

public class Main {

    public static void main(String[] args){

        UserRepository provider = new UserRepository();
        UserHadler handler = new UserHadler();
        UserOperator userOperator = new UserOperator();
        userOperator.getOutPut(handler.handleData(provider.getData()));


    }
}
