package javaplus.designPattern.structure.facade;
/*
복잡한 로그인 과정이 있음
DB접속 -> 유저 id,pw가져오기-> 입력된 값을 비교-> 로그인 결과-> 디비접속 끊기
 */
public class LoginProcess {
    public LoginProcess(){}
    public void login(String id,String pw){
        this.getDBConnection();
        this.getUserIdfromDB();
        this.getUserPWfromDB();
        this.checkUser(id,pw);
        this.closeDBConnection();
    }
    private void getDBConnection(){
        System.out.println("Connect DB sucess");
    }
    private void getUserIdfromDB(){
        System.out.println("User Id is xxx");
    }
    private void getUserPWfromDB(){
        System.out.println("User PW is XXXXXXX");
    }
    private void checkUser(String id,String pw){
        System.out.println("Check id success");
        System.out.println("Check pw success");
        System.out.println("success login");
    }
    private void closeDBConnection(){
        System.out.println("Disconnect DB Success");
    }
}
