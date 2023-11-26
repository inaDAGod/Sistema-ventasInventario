package ventanasCliente;

public class Pedido {
	 private int numeroCompra;
	    private String fecha;
	    private String estado;
	    private String rutaImagen;
		/**
		 * @return the numeroCompra
		 */
		public int getNumeroCompra() {
			return numeroCompra;
		}
		/**
		 * @param numeroCompra the numeroCompra to set
		 */
		public void setNumeroCompra(int numeroCompra) {
			this.numeroCompra = numeroCompra;
		}
		/**
		 * @return the fecha
		 */
		public String getFecha() {
			return fecha;
		}
		/**
		 * @param fecha the fecha to set
		 */
		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
		/**
		 * @return the estado
		 */
		public String getEstado() {
			return estado;
		}
		/**
		 * @param estado the estado to set
		 */
		public void setEstado(String estado) {
			this.estado = estado;
		}
		/**
		 * @return the rutaImagen
		 */
		public String getRutaImagen() {
			return rutaImagen;
		}
		/**
		 * @param rutaImagen the rutaImagen to set
		 */
		public void setRutaImagen(String rutaImagen) {
			this.rutaImagen = rutaImagen;
		}
		public Pedido(int numeroCompra, String fecha, String estado, String rutaImagen) {
			super();
			this.numeroCompra = numeroCompra;
			this.fecha = fecha;
			this.estado = estado;
			this.rutaImagen = rutaImagen;
		}
}
