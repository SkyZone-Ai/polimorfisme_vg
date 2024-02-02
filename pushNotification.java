
package Notifikasi;


public class pushNotification implements interfaceNotifikasi{
    
    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim push notif ke : " + receiver + "dengan isi :");
        System.out.println(content);
    }
}
