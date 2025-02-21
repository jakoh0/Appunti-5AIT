	<?php 
	$connection = mysqli_connect('localhost', 'root', '', '5ait_automobili');
	$currentFileName = basename($_SERVER['PHP_SELF']);
	$my_date = date("Y-m-d H:i:s");
	$myUser = get_current_user();
	$sql = "INSERT INTO log (Data,NomePagina,Descrizione,Utente)
			VALUES ('$my_date','$currentFileName','Accesso pagina','$myUser')";
	
	mysqli_query($connection,$sql)
	or die("ERROR: " . mysqli_error($connection) . " (query was $sql)");
	
	mysqli_close($connection);
	
	?>