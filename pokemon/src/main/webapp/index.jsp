<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

	<script src="http://cdn.alloyui.com/2.5.0/aui/aui-min.js"></script>
	<script src="<c:url value="/resources/js/util.js" />"></script>
	<link href="http://cdn.alloyui.com/2.5.0/aui-css/css/bootstrap.min.css" rel="stylesheet"></link>
	<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet"></link>
</head>
<body>
<div id="container">
	<div id="appContainer">
		<span id="appTitle">Pokemon</span><br>
			<div id=addPokemonContainer>
				<form id="addPokemonForm" action="add" method="POST">
				
					ID:<input type="text" name="id"><br>
					Name:<input type="text" name="name"><br>
					Type:<input type="text" name="type"><br>
					<input type="submit" class="btn btn-primary" id="searchButton" value="Add">
				</form>
			</div>
			<div id="searchPokemonContainer">
				<form id="searchPokemonForm" action="search" method="GET">
					Name:<input type="text" name="pokemon_name"><br>
					Number:<input type="text" name="pokemon_id"><br>
					<input type="submit" class="btn btn-primary" id="searchButton" value="Search">
				</form>
			</div>
			<div id="searchResultsContainer">
			${message}
			</div>
	</div>
</div>
</body>
</html>