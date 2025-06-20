<!doctype HTML>
<html>
	<head>
		<title>Esercizio 005.01 - Pag 1</title>
	</head>
	<body>
		<?php 
			include("../000/000_Log.php");
		?>
		<p>
			Lettura dati da Database.
		</p>
		<?PHP
			// apertura conessione
			$connection = mysqli_connect('localhost', 'root', '', '5ait_automobili')
			or die ("ERROR: Cannot connect");
			
			// crea ed esegue una query di INSERT
			$nomepag = basename($_SERVER['PHP_SELF']);
			
			
			// crea ed esegue una query diSELECT
			#$sql = "SELECT * FROM marchi";
			
			$sql = "SELECT Data,NomePagina,ID,Utente
					FROM log
					ORDER BY ID DESC
					LIMIT 5";
			

			$result = mysqli_query($connection, $sql) or die ("ERROR: " . mysqli_error($connection) . " (query was $sql)");
			
			//verifica le righe restituite
			if (mysqli_num_rows($result) > 0) {
				echo "<TABLE border = 2>";
				echo "<TR><TH>Data</TH><TH>Pagina</TH><TH>Id</TH><TH>Utente</TH></TR>";
				while ($row = mysqli_fetch_row($result)) {
					echo "<TR><TD>$row[0]</TD><TD>$row[1]</TD><TD>$row[2]</TD><TD>$row[3]</TD></TR>";
					#echo "Data = ".$row[0] ." Pagina = " . $row[1] . " ID = ". $row[2] . "<BR><BR>";
					
				}
				echo "</TABLE>";
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
