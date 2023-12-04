package ventasInventario.BD.Modelo;

public interface EstadoPedido {
	final static String confirmado = "ESPERA PAGO";
	final static String cancelado = "CANCELADO";
	final static String pagado = "PAGADO A ENTREGAR";
	final static String entregado = "FINALIZADO";
}
