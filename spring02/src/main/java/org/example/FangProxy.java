package org.example;

public class FangProxy implements FangService{

    private FangService fangService = new FangServiceImpl();

//    public FangService getFangService() {
//        return fangService;
//    }
//
//    public void setFangService(FangService fangService) {
//        this.fangService = fangService;
//    }

    @Override
    public void zuFang() {
        //辅助功能、额外功能
        System.out.println("发布租房信息");
        System.out.println("带租客看房");

        fangService.zuFang();
    }
}
