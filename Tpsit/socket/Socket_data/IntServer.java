package Socket_data;

//import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.time.format.DateTimeFormatter;
//import java.net.Socket;
import java.time.LocalDate;

class IntServer{
    public static void main(String[] args) {
        System.out.println("Server in avvio...");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try(java.net.ServerSocket ss = new ServerSocket(9999)){
            System.out.println("Server avviato. In attesa di connessione sulla porta "+ss.getLocalPort());

            while(true){
                try(java.net.Socket s = ss.accept()){
                    System.out.println("Connessione accettata da: "+s.getInetAddress());

                    BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    String ricevuto = in.readLine();
                    LocalDate date = LocalDate.parse(ricevuto, formatter);

                        // Calcola la data successiva (il giorno successivo)
                        LocalDate nextDay = date.plusDays(1);

                        // Restituisce la nuova data formattata al client
                        String nextDayFormatted = nextDay.format(formatter);
                        PrintWriter writer = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);

                        writer.println("Data successiva: " + nextDay.format(formatter));
                        System.out.println("Data successiva inviata al client: " + nextDayFormatted);

                }catch (Exception e){
                    System.err.println("Errore nella comunicazione con il client: " + e.getMessage());
                }
                
            }
        }catch(Exception e){
            System.err.println("Errore nella comunicazione con il client: " + e.getMessage());
        }
    }
}
