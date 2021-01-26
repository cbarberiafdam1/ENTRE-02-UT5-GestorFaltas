
/**
 * Enumeration class TipoApercibimiento - write a description of the enum class here
 * 
 * @author Carla Barberia
 * @version (version number or date here)
 */
public enum TipoApercibimiento
{
    DIEZ(10), 
    VEINTE(20), 
    TREINTA(30);
    private int apercibimientos;    
    
    private TipoApercibimiento(int apercibimientos){
        this.apercibimientos = apercibimientos;
    }
    
    public int getApercibimientos(){
        return apercibimientos;
    }   
}
