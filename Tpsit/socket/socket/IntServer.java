package socket;

import java.io.IOException;
// gestisco gli errori di input e output

import java.net.ServerSocket;
//creare server che ascolta

import java.net.Socket;
//rappresenta la connessione C. e S.

public class IntServer{
    public static void main(String[] args) {
        try(ServerSocket ss = new ServerSocket(9999)){
            // Creo serverSocket che ascolta

            System.out.println("Server avviato e in attesa di connessioni");
            //Server attivo

            while(true){
                //ciclo infinito per accettare nuove connessioni dai client
                try(Socket s = ss.accept()){
                    // accettazione connessione da un Client
                    System.out.println("Connessione accettata da: "+s.getInetAddress());
                    //Stampa indirizzo Ip del client che si è connesso

                    int numero = s.getInputStream().read();
                    // leggendo un byte inviato da cient attraverso il flusso 
                    // se non arriva valore -1
                    if(numero==-1){
                        System.out.println("Non gho ricevuto nessun dato");
                    }else{
                        System.out.println("Il server ha ricevuto: "+numero*numero); 
                    }
                
                }catch(IOException e){
                    // gestire errori eventuali durante la comunicazione con il client
                    System.err.println("Errore nella comunicazione con il client: "+ e.getMessage());
                    // Stampa messaggio di errore con la descrizione del problema
                }
            }
        }catch(IOException e){
            // Gestione errori di creazione del ServerSocket
            e.printStackTrace();
            // individuo errore nel debugging
        }
    }
}