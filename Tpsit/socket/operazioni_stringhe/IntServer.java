package operazioni_stringhe;

import java.io.BufferedReader; //Importa la classe BufferedReader per leggere dati da un flusso di input in modo efficiente.
import java.io.IOException; //Importa la classe IOException per gestire eventuali errori di input/output.
import java.io.InputStreamReader; //Importa la classe InputStreamReader per convertire il flusso di byte in caratteri leggibili.
import java.net.ServerSocket; //Importa la classe ServerSocket per creare un server che ascolta le connessioni.
import java.net.Socket; //Importa la classe Socket per rappresentare la connessione tra il client e il server.


public class IntServer { //Dichiarazione della classe IntServer che contiene il programma principale.
    public static void main(String[] args) { //Dichiarazione del metodo main, punto di ingresso dell'applicazione.
        System.out.println("Server in avvio..."); //Stampa un messaggio per indicare che il server sta per essere avviato.
        try (ServerSocket ss = new ServerSocket(9999)) { //Crea un ServerSocket che ascolta sulla porta 9999.
            System.out.println("Server avviato. In attesa di connessioni sulla porta " + ss.getLocalPort() + "..."); 
            //Stampa un messaggio per indicare che il server è pronto a ricevere connessioni.
            //Usa getLocalPort() per ottenere e stampare il numero della porta
            while (true) { //Ciclo infinito per mantenere il server in esecuzione e accettare nuove connessioni.
                try (Socket s = ss.accept()) { //Aspetta una connessione da parte di un client e la accetta. Il metodo è bloccante.
                    System.out.println("Connessione accettata da: " + s.getInetAddress()); //Stampa l'indirizzo IP del client che si è connesso.

                    BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream())); //Crea un BufferedReader per leggere i dati inviati dal client.
                    
                    String operazione = in.readLine();
                    System.out.println("Il client ha inviato: " + operazione);

                    // Calcola il risultato dell'operazione
                    String risultato = calcolaOperazione(operazione);

                    // Manda il risultato al client
                    System.out.println("Risultato: " + risultato);
                    
                } catch (IOException e) { //Gestisce eventuali errori durante la comunicazione con il client.
                    System.err.println("Errore nella comunicazione con il client: " + e.getMessage()); //Stampa un messaggio di errore con i dettagli dell'eccezione.
                }
            }
        } catch (IOException e) { //Gestisce eventuali errori durante l'avvio del server.
            System.err.println("Errore nell'avvio del server: " + e.getMessage()); //Stampa un messaggio di errore con i dettagli dell'eccezione.
        }
    }


 // Funzione per calcolare il risultato dell'operazione
    public static String calcolaOperazione(String operazione) {
        try {
            // Rimuove gli spazi e divide la stringa in base all'operatore
            operazione = operazione.replaceAll("\\s+", "");
            String[] parts = operazione.split("[-+*/]");
            if (parts.length != 2) {
                return "Operazione non valida.";
            }

            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[1]);
            char operatore = operazione.charAt(parts[0].length());

            // Esegui il calcolo in base all'operatore
            switch (operatore) {
                case '+':
                    return String.valueOf(num1 + num2);
                case '-':
                    return String.valueOf(num1 - num2);
                case '*':
                    return String.valueOf(num1 * num2);
                case '/':
                    if (num2 != 0) {
                        return String.valueOf(num1 / num2);
                    } else {
                        return "Errore: Divisione per zero.";
                    }
                default:
                    return "Operazione non supportata.";
            }
        } catch (Exception e) {
            return "Errore nell'elaborazione dell'operazione.";
        }
    }
}