public class Main {


    public static void main(String[] args) {

        Procesador procesador = new Procesador();
             System.out.println(" PROCESADOR ");
        procesador.setMarca("intel");
         procesador.setModelo("core i5 11400F");
          procesador.setPrecio("989,27€");

        MemRAM memRAM = new MemRAM();
             System.out.println(" Memoria RAM ");
        memRAM.setMarca("");
         memRAM.setModelo("");
          memRAM.setPrecio("");
           memRAM.setCapacidad("");
            memRAM.setVelocidad("");

        DiscoDuro discoDuro = new DiscoDuro();
             System.out.println(" Disco Duro");
        discoDuro.setMarca("");
         discoDuro.setModelo("");
          discoDuro.setPrecio("");
           discoDuro.setCapacidad("");

        GPU gpu = new GPU();
            System.out.println(" TARJETA GRAFICA");
        gpu.setMarca("");
         gpu.setModelo("");
          gpu.setPrecio("");
           gpu.setCapacidad("");
            gpu.setPotencia("");
             gpu.setTamanno("");

        Ventilador ventilador = new Ventilador();
             System.out.println(" VENTILADOR ");
         ventilador.setMarca("");
          ventilador.setModelo("");
           ventilador.setPrecio("");
            ventilador.setVelocidad("");
             ventilador.setTamanno("");

        FuenteAlimentacion fuenteAlimentacion = new FuenteAlimentacion();
        System.out.println("FUENTE DE ALIMENTACIÓN ");
        fuenteAlimentacion.setMarca("");
        fuenteAlimentacion.setModelo("");
        fuenteAlimentacion.setPrecio("");
        fuenteAlimentacion.setTamanno("");
        fuenteAlimentacion.setVoltaje("");

        PlacaBase placaBase = new PlacaBase();
        System.out.println(" PLACA BASE ");
        placaBase.setMarca("");
        placaBase.setModelo("");
        placaBase.setPrecio("");
        placaBase.setCapacidad("");
        placaBase.setPotencia("");

        Torre torre = new Torre();
        torre.setMarca("");
        torre.setModelo("");
        torre.setPrecio("");
        torre.setTamanno("");



    }
}