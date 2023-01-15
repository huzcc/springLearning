package org.example;

import org.example.fangdong.FangProxy;
import org.example.fangdong.FangService;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void ProxyTest(){
        FangService fangService = new FangProxy();
        fangService.zuFang();

    }
}
