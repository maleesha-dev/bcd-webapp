package lk.novasphere;

import jakarta.ejb.Stateless;

@Stateless
public class CalImpl implements Cal{
    public void getResult(int i1, int i2) {
        System.out.println("CalImpl: getResult()");
    }
}