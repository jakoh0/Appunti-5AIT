<!doctype html>
<html>
	<head>
		<title>Login</title>
	</head>
	
	<body>
		<h2>Register</h2>
		<p>Inserisci credenziali</p>
		<select id="utente" name="utente" onchange="document.getElementById('user').value=this.options[this.selectedIndex].text" >
			 <option value="0">Selezione utente</option>
		<?PHP 
		
				$connection = mysqli_connect('localhost', 'root', '', '5ait_bowling')
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
		</select>		
		<form method="post">
			
			<input type="hidden" name="user" id="user">
			<input type="text" name="pass" placeholder="password">
			<input type="submit" name="inviocredenziali" value="Invia">
		</form>
	</body>
</html>
<?php
	$conn = mysqli_connect('localhost', 'root', '', '5ait_bowling') or die("ERROR: Cannot connect");
	if(isset($_POST["inviocredenziali"])){
		$a = "Selezione utente";
		$b = $_POST["inviocredenziali"];
		if( $b != $a){
			$utente = $_POST["user"];
			$pass = $_POST["pass"];
			$pwd = md5($pass);
			$sql = "SELECT Id FROM utenti WHERE user = '$utente' && password='$pwd'";
			$result = mysqli_query($conn,$sql) or die ("ERROR: " . mysqli_error($connection) . " (query was $sql)");
			if(mysqli_num_rows($result) >0) {
			
				echo "utente trovato";
			}
			else{
				echo "utente non trovat";
			}
		}
	}
	mysqli_close($conn);
?>