package ventasInventario.BD.Modelo;

public class ProductoCarrito {
	private Producto producto;
	private Integer cantidad;
	private Double monto;
	
	public ProductoCarrito(Producto producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
		this.monto = calcularMonto() ;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "ProductoCarrito [producto=" + producto + ", cantidad=" + cantidad + ", monto=" + monto + "]";
	}
	
	public Double calcularMonto() {
		if(producto.getOfertado()) {
			return producto.getOferta().getPrecioOferta() * cantidad;
		}
		return producto.getPrecio() * cantidad;
	}
	
	
	
	
	
	
	
	
}
