<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Catalogo Prodotti</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>
<body>
    <h1>Catalogo Prodotti</h1>
    <br>
    <br>
    <h2>Nuovo Prodotto</h2>
    <div style=120px;>
    	<form method="post" action="add" id="datiProdotto" >
    		
	    		<div > 
		    		<label for="nome" style="padding-right:43px;"><b>nome</b></label>
		    		<input type="text" name="nome" id="nome" value="">
	    	    </div>
	    	    <div> 
		    		<label for="descrizione"><b>descrizione</b></label>
		    		<input type="text" name="descrizione" id="descrizione" value="">
	    	    </div>
	    	    <div> 
		    		<label for="prezzo" style="padding-right:35px;"><b>prezzo</b></label>
		    		<input type="text" name="prezzo" id="prezzo" value="">
	    	    </div> 
	    	    <div> 
		    		<input type="SUBMIT" name="INVIA" value="INVIA">
	    	    </div>
    	    </table>
    	</form>
    	
    </div>
    <br>
    <br>
    <br>
    <h2>Lista prodotti</h2>
    <div>
    	Tabella dei prodotti
    </div>
    
</body>
</html>
