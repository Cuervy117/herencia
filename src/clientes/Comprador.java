package clientes;

import dispositivos.DispositivoElectronico;
import inventario.Inventario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public abstract class Comprador {
    protected HashMap<Integer, DispositivoElectronico> productos = new HashMap<>();
    private String nombre;
    protected ArrayList<DispositivoElectronico> carrito;
    private int saldo;
    protected double descuentoDeTemporada = 0.1;

    public Comprador(String nombre, int saldo){
        this.nombre = nombre;
        this.saldo = saldo;
        this.carrito = new ArrayList<>();
    }
    
    public Comprador(String nombre){
        this.nombre = nombre;
        this.carrito = new ArrayList<>();
    }

    protected HashMap<Integer, DispositivoElectronico> getProductos(){
        return productos;
    }
    
    public String getNombre(){
        return nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void agregarAlCarrito(DispositivoElectronico e){
        carrito.getProductos().add(e);
    }

    public void agregarAlCarrito(DispositivoElectronico e, int descuento){
        carrito.getTablaPrecios().put(e, descuento);
    }

    public void comprar(){
       System.out.println("Felicidades por su compra!!"); 
       System.out.println();
       carrito.clear();
    }
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public static void imprimirTiposDeProductos(){
        System.out.println("1   --- Camaras digitales");
        System.out.println("2   --- Computadoras");
        System.out.println("3   --- Consolas");
        System.out.println("4   --- Consolas portatiles");
        System.out.println("5   --- Impresoras");
        System.out.println("6   --- Laptop's");
        System.out.println("7   --- Reproductores de video");
        System.out.println("8   --- Sistemas de audio");
        System.out.println("9   --- Smartphone's");
        System.out.println("10   --- Tablet's");
        System.out.println("11   --- Televisiones");
        System.out.println("12   --- Relojes inteligentes");
        System.out.println("13   --- Salir");
    }
    public static void menuDeProductos(Scanner sc, String nomCliente, String tipoCliente){
        Comprador cliente;
        System.out.println(tipoCliente);
        switch (tipoCliente) {
            case "Estudiante" -> cliente = new Estudiante(nomCliente);
            case "Regular" -> cliente = new Regular(nomCliente);
            case "VIP" -> cliente = new VIP(nomCliente);
            default -> cliente = new Regular(nomCliente);
        }
        System.out.println(cliente);
        int opcion;
        do{
            imprimirTiposDeProductos();
            opcion = Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1 -> {
                    Inventario.getInventario().getCamarasDigitales().forEach((id, producto) -> System.out.println("ID: " + id + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio()));
                }
                case 2 -> {
                    Inventario.getInventario().getComputadoras().forEach((id, producto) -> System.out.println("ID: " + id + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio()));
                    
                }
                case 3 -> {
                    Inventario.getInventario().getConsolas().forEach((id, producto) -> System.out.println("ID: " + id + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio()));
                
                }
                case 4 -> {
                    Inventario.getInventario().getConsolaPortables().forEach((id, producto) -> System.out.println("ID: " + id + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio()));

                }
                case 5 -> {
                    Inventario.getInventario().getImpresoras().forEach((id, producto) -> System.out.println("ID: " + id + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio()));
    
                }
                case 6 -> {
                    Inventario.getInventario().getLaptops().forEach((id, producto) -> System.out.println("ID: " + id + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio()));

                }
                case 7 -> {
                    Inventario.getInventario().getReproductoresDeVideo().forEach((id, producto) -> System.out.println("ID: " + id + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio()));

                }
                case 8 -> {
                    Inventario.getInventario().getSistemasDeAudio().forEach((id, producto) -> System.out.println("ID: " + id + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio()));

                }
                case 9 -> {
                    Inventario.getInventario().getSmartphones().forEach((id, producto) -> System.out.println("ID: " + id + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio()));

                }
                case 10 -> {
                    Inventario.getInventario().getTablets().forEach((id, producto) -> System.out.println("ID: " + id + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio()));

                }
                case 11 -> {
                    Inventario.getInventario().getTelevisiones().forEach((id, producto) -> System.out.println("ID: " + id + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio()));
 
                }
                case 12 -> {
                    Inventario.getInventario().getSmartwatchs().forEach((id, producto) -> System.out.println("ID: " + id + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio()));

                }
                case 13 -> {
                    System.out.println("Saliendo del menu de productos...");
                }
                default ->{
                    if(!Inventario.getInventario().getProductos().containsKey(opcion)) {
                        System.out.println("Articulo invalido");
                        continue;
                    }
                    cliente.agregarAlCarrito(opcion);
                }
            }
        }while(opcion != 13);
        if(cliente instanceof VIP){
            System.out.println("Antes de que termine, vea nuestros productos exclusivos para usted");
                    System.out.println("Ingrese No si desea terminar su compra");
                    String vip;
                    boolean condicion = true;
                    do{
                        Inventario.getInventario().getProductosVIP().forEach((id, producto) -> System.out.println("ID: " + producto.getID() + " Nombre: " + producto.getNombre() + "   Precio: " + producto.getPrecio()));
                        vip = sc.nextLine();
                        if(vip.equals("No") || vip.equals("no") || vip.equals("NO")){
                            
                            condicion = false;
                            break;
                        }
                        if(Inventario.getInventario().getProductosVIP().containsKey(Integer.valueOf(vip))) {
                            cliente.agregarAlCarrito(Integer.valueOf(vip));
                        }
                    }while(condicion);
        }
        cliente.comprar();
    }

}
