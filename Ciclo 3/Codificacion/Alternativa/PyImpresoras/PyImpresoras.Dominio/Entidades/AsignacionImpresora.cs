namespace PyImpresoras.Dominio
{
    public class AsignacionImpresora{
        public int Id{get;set;}
        public int AsignacionId{get;set;}
        public int ImpresoraId{get;set;}
        public Asignacion Asignacion{get;set;}
        public Impresora Impresora{get;set;}
    }
    
}