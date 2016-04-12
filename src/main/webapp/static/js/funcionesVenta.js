$(document).ready(function () {
    $("#codigo_articulo").focusout(function () {
        $("#codigo_articulo").val();
        $.ajax({
            url: "buscar/" + $("#codigo_articulo").val(),
            //type:"POST",
            dataType: "json",
            success: function (data) {
                 console.log(data);
                 var nombre=data.prodNombre; 
                 var precio= data.prodPrecio;
                 var codigo= data.prodCod;
                 $("#venta").html("<table class='table'><tr><th>Codigo</th><th>Nombre</th><th>Precio</th></tr>"+
                         "<tr><td>"+codigo+"</td><td>"+nombre+"</td><td>"+precio+"</td></tr></table>");
            },
            error: function (jqXHR) {
                alert(jqXHR);
            }
        });
    });
});

