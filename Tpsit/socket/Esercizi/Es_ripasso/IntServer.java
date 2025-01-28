package Es_ripasso;

//import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
//import java.net.Socket;

class IntServer{
    public static void main(String[] args) {
        System.out.println("Server in avvio...");
        try(java.net.ServerSocket ss = new ServerSocket(9999)){
            System.out.println("Server avviato. In attesa di connessione sulla porta "+ss.getLocalPort());

            while(true){
                try(java.net.Socket s = ss.accept()){
                    System.out.println("Connessione accettata da: "+s.getInetAddress());

                    BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    String ricevuto = in.readLine();
                    if(ricevuto !=null){
                        System.out.println("Il server riceve "+ricevuto);
                    }
                    else{
                        System.out.println("Connessione chiusa senza inviare dati");
                    }
                }catch (Exception e){
                    System.err.println("Errore nella comunicazione con il client: " + e.getMessage());
                }
                
            }
        }catch(Exception e){
            System.err.println("Errore nella comunicazione con il client: " + e.getMessage());
        }
    }
}
