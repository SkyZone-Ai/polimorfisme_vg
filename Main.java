
package Notifikasi;


public class Main {
    public static void main(String[] args) {
        String emailPenerima = "mikey@tokrev.com";
        String nomerHP = "081223812681";
        String mobileID = "android-286936";
        
        emailNotification emailNotif = new emailNotification();
        smsNotification smsNotif = new smsNotification();
        pushNotification pushNotif = new pushNotification();
        
        String message = "Nothing last forever, We can change the future";
        
        emailNotif.sendMessage(emailPenerima,message);
        smsNotif.sendMessage (nomerHP,message);
        pushNotif.sendMessage (mobileID,message);
                
    }
}
