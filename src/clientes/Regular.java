package clientes;

import inventario.Inventario;

public class Regular extends Comprador{
    public Regular(int saldo){
        super(saldo);
    }

    @Override
    public void mostrarExclusivos(Inventario inventario) {
        super.mostrarExclusivos(inventario);
        System.out.println("6) Camaras Digitales");
        System.out.println("7) Consolas Portables");
        System.out.println("8) Reproductores de video");
        System.out.println("9) Sistemas de audio");
        System.out.println("10) Smar Watches");
        System.out.println("11) Televisiones");
        System.out.println("Presione 0 para salir");
    }
}
