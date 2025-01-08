package Socket_data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;             // inviare dati(testo) al server in maniera semplificata
import java.net.Socket;
import java.net.UnknownHostException;   //gestisce l'eventualità in cui il server non sia raggiungibile 

public class IntClient{
    public static void main(String[] args){
        try{
            //gestire eccezzioni relative a problemi di connessione o di comunicazione
            System.out.println("Tentativo di connessione al server ...");
            try(Socket s = new Socket("localhost",9999)){
                System.out.println("Connessione stabilita con il server");

                BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                PrintWriter output = new PrintWriter(s.getOutputStream(), true);
                BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
   
               // Chiede all'utente di inserire una data
               System.out.print("Inserisci una data nel formato GG/MM/AAAA: ");
               String dateInput = consoleInput.readLine();
   
               // Invia la data al server
               output.println(dateInput);
   
               // Riceve la data successiva dal server
               String nextDay = input.readLine();
               System.out.println("La data successiva è: " + nextDay);
                
            } catch(UnknownHostException e){ // gestisce server qualora non trovasse il server
                System.err.println("Impossibile trovare il server: "+e.getMessage());
            }
            // chiude il socket al termine del blocco try-catch
        } catch(IOException e){
            System.out.println("Errore di comunicazione con il server: "+e.getMessage());
        }
    }
}
