package es_socket;

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


                PrintWriter writer = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
                operazioni = operazioni+" "+Math.random();
                writer.println(operazioni);




                String messaggio = "Ciao, ecco il tuo numero random: "+Math.random();
                out.println(messaggio);
            } catch(UnknownHostException e){ // gestisce server qualora non trovasse il server
                System.err.println("Impossibile trovare il server: "+e.getMessage());
            }
            // chiude il socket al termine del blocco try-catch
        } catch(IOException e){
            System.out.println("Errore di comunicazione con il server: "+e.getMessage());
        }
    }
}
