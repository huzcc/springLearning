package org.example.fangdong;

public class FangProxy implements FangService{

    private FangService fangService = new FangServiceImpl();

    @Override
    public void zuFang() {
        //辅助功能、额外功能
        System.out.println("发布租房信息");
        System.out.println("带租客看房");

        fangService.zuFang();
    }
}
