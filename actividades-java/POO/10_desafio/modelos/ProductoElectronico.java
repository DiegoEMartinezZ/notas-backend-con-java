package modelos;public class ProductoElectronico extends Producto {	private String tipo;	public ProductoElectronico(String nombre, Integer precio, Integer stock, String descripcion,  String tipo) {		super(nombre, precio, stock, descripcion);		this.tipo = tipo;	}}