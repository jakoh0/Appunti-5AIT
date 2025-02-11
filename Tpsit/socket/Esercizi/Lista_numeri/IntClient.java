package Lista_numeri;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;             // inviare dati(testo) al server in maniera semplificata
import java.net.Socket;
import java.net.UnknownHostException;   //gestisce l'eventualità in cui il server non sia raggiungibile 
import java.util.Scanner;

public class IntClient{
    public static void main(String[] args){
        try{
            //gestire eccezzioni relative a problemi di connessione o di comunicazione
            System.out.println("Tentativo di connessione al server ...");
            try(Socket s = new Socket("localhost",9999)){
                System.out.println("Connessione stabilita con il server");

                PrintWriter out = new PrintWriter(s.getOutputStream(),true);
                
                Scanner in = new Scanner(System.in);
                System.out.println("Inserisci la parola da inviare :  ");
                String operazioni = in.nextLine();

                out.println(operazioni);
            } catch(UnknownHostException e){ // gestisce server qualora non trovasse il server
                System.err.println("Impossibile trovare il server: "+e.getMessage());
            }
            // chiude il socket al termine del blocco try-catch
        } catch(IOException e){
            System.out.println("Errore di comunicazione con il server: "+e.getMessage());
        }
    }
}
