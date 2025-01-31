<!doctype HTML>
<html>
	<head>
		<title>Esercizio 005.01 - Pag 1</title>
	</head>
	<body>
		<p>
			Lettura dati da Database.
		</p>
		<?PHP
			// apertura conessione
			$connection = mysqli_connect('localhost', 'root', '', 'macchine')
			or die ("ERROR: Cannot connect");
			
			// crea ed esegue una query di INSERT
			$nomepag = basename($_SERVER['PHP_SELF']);
			// crea ed esegue una query diSELECT
			$sql = "SELECT * FROM marchi";
			/*$sql = "INSERT INTO marchi(idMarchio,Marchio,Ceo_nome,Ceo_Cognome,NumTelefono,Annofondazione)
					VALUES ('BBBB','Porsche','Thomas','Campigotto','127','2006-09-19')";*/
			
			$sql = "INSERT INTO log(Data,Descrizione,Utente,NomePagina)
					VALUES ('2025-01-28','Ciao la mia prima descrizione','Thomas','$nomepag')";
			

			$result = mysqli_query($connection, $sql) or die ("ERROR: " . mysqli_error($connection) . " (query was $sql)");
			
			//verifica le righe restituite
			if (mysqli_num_rows($result) > 0) {
				while ($row = mysqli_fetch_row($result)) {
					echo $row[0] . " = " . $row[1] . "<BR>";
				}
			} else {
				echo "No records found!";
			}
			
			// chiude la connessione
			mysqli_close($connection);
		?>
		<br>
		<?PHP
			include("../000/000_NavigationMenu.php")
		?>
	</body>
</html>
