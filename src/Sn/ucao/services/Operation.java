package Sn.ucao.services;

public class Operation implements IOperation {

    @Override
    public int addicion(int a, int b) {
        return a+b;
    }

    @Override
    public int soubstration(int a, int b) {
        return a-b;
    }

    @Override
    public int division(int a, int b) {
        return a/b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }
}
