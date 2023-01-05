package org.example;

import org.junit.Test;

public class ProxyTest {

    @Test
    public void ProxyTest(){
        FangService fangService = new FangProxy();
        fangService.zuFang();

    }
}
