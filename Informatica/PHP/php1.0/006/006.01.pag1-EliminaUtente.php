<?PHP
	if (!isset($_POST["InvioCredenziali"])) {
?>
<!doctype HTML>
<html>
	<head>
		<title>Esercizi 006 - Eliminazione utente</title>
	</head>
	<body>
		<p>
			Eliminazione utente
		</p>
		<form method="POST" action="<?php echo $_SERVER['PHP_SELF'];?>">
			Utente: <input type="text" name="utente"><br>
			Password: <input type="password" name="password"><br>
			<input type="submit" name ="InvioCredenziali" value="invia POST" />
			
			
			<label for="utente"> Utente : </label>
		<select id="utente" name="utente" onchange="document.getElementById('selected_text').value=this.options[this.selectedIndex].text">
			 <option value="0">Selezione utente</option>
			 <?PHP 
				$connection = mysqli_connect('localhost', 'root', '', '5ait_vacanze')
					or die ("ERROR: Cannot connect");
				$sql = "SELECT ID, user FROM utenti";
		
				$result = mysqli_query($connection, $sql)
					or die ("ERROR: " . mysqli_error($connection) . " (query was $sql)");
				
				if (mysqli_num_rows($result) > 0) {
					while ($row = mysqli_fetch_row($result)) {
						echo "<option value="  . $row[0] . ">" . $row[1] . "</option>";
					}
				}
				mysqli_close($connection); 
			?>		 
		</select><br> 
		<input type="hidden" name="selected_text" id="selected_text" value="" />
		<input type="submit" name="InvioCredenziali" value="Elimina"/>
			
			
			
			
			
		</form>
	</body>
</html>
<?PHP
	} else {
		if (!isset($_POST["utente"]) || trim($_POST["utente"]) == ""){
			die ("Devi inserire un nome utente!");
		} 
		if (!isset($_POST["password"]) || trim($_POST["password"]) == ""){
			die ("Devi inserire una password!");
		} 
		$inputUtente = ($_POST["utente"]);
		$inputPass = ($_POST["password"]);
		
		#$pwd = password_hash('$inputPass', PASSWORD_DEFAULT);
		$pwd = md5($inputPass);
		
		$connection = mysqli_connect('localhost', 'root', '', '5ait_vacanze')
			or die ("ERROR: Cannot connect");
		$sql = "SELECT ID FROM utenti WHERE user = '$inputUtente'";
		
		$result = mysqli_query($connection, $sql)
		or die ("ERROR: " . mysqli_error($connection) . " (query was $sql)");
		//echo $result;
		if (mysqli_num_rows($result) != 0) {
			//header("Location: 006.01.pag0-CreazioneUtente.php");
			$sql= "DELETE FROM utenti WHERE user = '$inputUtente' AND password = '$pwd'";
			$result1 = mysqli_query($connection, $sql)
			or die ("ERROR: " . mysqli_error($connection) . " (query was $sql)");
			//echo $result;
			/*$sql= "SELECT ID FROM utenti WHERE user = '$inputUtente' AND password='$pwd'";
			$result1 = mysqli_query($connection, $sql)
			or die ("ERROR: " . mysqli_error($connection) . " (query was $sql)");
			if (mysqli_num_rows($result1) > 0){*/
			echo "Eliminato con successo";
			echo var_dump($result1);
			
			
			
			/*$myfile = fopen("password.txt", "a+") or die("Unable to open file!");
			$testo = "Nome = ". $inputUtente. " password  = ".$inputPass. " utente = ".$_SERVER['SERVER_NAME'];
			fwrite($myfile, $testo);
			fwrite($myfile, "\r\n");
			fclose($myfile);*/
			
			
			
			
			
			
			//}
			//else{
				//echo "Qualcosa è andato storto";
			//}
		}
		else{
			//echo var_dump($result1);
			echo "Nome utente non esistente o password sbagliata";
		}
		mysqli_close($connection);
	}
?>
<?PHP
	include("../000/000_NavigationMenu.php")
?>