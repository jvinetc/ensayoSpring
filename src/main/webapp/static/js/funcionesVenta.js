$(document).ready(function(){
    $("#codigo_articulo").focusout(function(){
         $("#codigo_articulo").val();
         $.ajax({
             url: "buscar/"+$("#codigo_articulo").val(),
             //type:"POST",
             dataType:"xml",
             success: function (data) {
                 var nombre = $(data).find('prodNombre').text();
                 var precio = $(data).find('prodPrecio').text();
                 var codigo = $(data).find('prodCod').text();
                 $("#venta").html("<table border='1'><tr><td>codigo</td><td>nombre</td><td>precio</td></tr>"+
                         "<tr><td>"+codigo+"</td><td>"+nombre+"</td><td>"+precio+"</td></tr></table>");
            },
            error: function (jqXHR) {
                alert(jqXHR);
            }
         });
    });
});

