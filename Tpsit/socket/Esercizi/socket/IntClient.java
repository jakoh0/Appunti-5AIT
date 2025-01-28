package socket;

import java.io.IOException;

import java.net.Socket;

public class IntClient{
    public static void main(String[] args){
        try(Socket s = new Socket("localhost", 9999)){
            //Creo oggetto socket per la connessione

            System.out.println("Connessione al server stabilita");


            int numero = (int)(Math.random()*10);
            // genera numero da 0 a 9

            s.getOutputStream().write(numero);
            // scriviamo il  numero generato nel flusso di output dal socket, inviandolo al server

            System.out.println("Il client ha inviato: "+numero);
            // stampiamo il numero inviato al server
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}