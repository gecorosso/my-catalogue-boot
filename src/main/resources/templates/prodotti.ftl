<!DOCTYPE html>
<html>
<head>
    <title>Pagina dei Prodotti</title>
</head>
<body>
<h1>Ciao a Tutti!!!</h1>
<p>Sono la pagina per la gestione dei prodotti</p>
<h2>Inserire tabella dei prodotti</h2>
    
<h2>Modifica Prodotto - ${prodottoDaModificare.get().nome}</h2>
<div style=120px;>

	
	<form method="post" action="add" id="datiProdotto" >
			<input type="text" name="hidden" id="id" value="${prodottoDaModificare.get().id}">
    		<div> 
	    		<label for="nome" style="padding-right:43px;"><b>nome</b></label>
	    		<input type="text" name="nome" id="nome" value="${prodottoDaModificare.get().nome}">
    	    </div>
    	    <div> 
	    		<label for="descrizione"><b>descrizione</b></label>
	    		<input type="text" name="descrizione" id="descrizione" value="${prodottoDaModificare.get().descrizione}">
    	    </div>
    	    <div> 
	    		<label for="prezzo" style="padding-right:35px;"><b>prezzo</b></label>
	    		<input type="text" name="prezzo" id="prezzo" value="${prodottoDaModificare.get().prezzo}">
    	    </div> 
    	    <div> 
	    		<input type="SUBMIT" name="MODIFICA" value="MODIFICA">
    	    </div>
	    </table>
	</form>
	
</div>
    

</body>
</html>
