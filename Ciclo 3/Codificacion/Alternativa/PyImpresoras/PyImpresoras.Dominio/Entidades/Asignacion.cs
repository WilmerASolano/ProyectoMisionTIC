namespace PyImpresoras.Dominio
{
    public class Asignacion{
        public int Id{get;set;}
        
        
        public List<AsignacionTecnico> AsignacionesTecnicos{get;set;}
        public List<AsignacionOperador> AsignacionesOperadores{get;set;}
        public List<AsignacionImpresora> AsignacionesImpresoras{get;set;}
        
    }
}