package th.co.sunteen.sunteenfriend.utility;

public class MyConstant {

    private String hostFTP="ftp.androidthai.in.th";
    private String userFTP="sun@androidthai.in.th";
    private String passwordFTP="Abc12345";
    private int portFTP=21;
    private String urlImage="http://androidthai.in.th/sun/aomsalapao";

    private String urladdUser="http://androidthai.in.th/sun/addDataaom.php";

    public String getUrladdUser() {
        return urladdUser;
    }

    private String getUrlImage(){

        return urlImage;
    }


    public String getHostFTP() {
        return hostFTP;
    }

    public String getUserFTP() {
        return userFTP;
    }

    public String getPasswordFTP() {
        return passwordFTP;
    }

    public int getPortFTP() {
        return portFTP;
    }
}
