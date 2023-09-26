/** CLASE COMPUTADOR **/
public class computador {

    /** ATRIBUTOS **/
    String CPU;
    String GPU;
    String RAM;
    String HDD_SSD_Usage;
    String PSU;

    /**
     * Constructor de la clase
     * @param CPU Nombre del animal
     * @param GPU Nombre de la grafica
     * @param RAM capacidad de la memoria RAM
     * @param HDD_SSD_Usage capacidad de memoria del disco duro/estado solido
     * @param PSU capacidad de voltaje de la fuente de poder
     * Complejidad temporal: O(1) Complejidad Constante
     **/

    computador(String CPU, String GPU,String RAM,String HDD_SSD_Usage,String PSU)
    {
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.HDD_SSD_Usage = HDD_SSD_Usage;
        this.PSU = PSU;
    }

    /**
     * Método que imprime al usuario los datos acerca de la informacion que tiene su computador
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    void infoComputador() {
        System.out.println("Su computador contiene un procesador " + CPU + " con una grafica de video " + GPU + "con una capacidad de la memoria ram de " + RAM +);
        System.out.println("Su computador contiene un HDD o un SSD con una capacidad de " + HDD_SSD_Usage + " con una potencia de " + PSU + " en su fuente de poder");
    }



}
