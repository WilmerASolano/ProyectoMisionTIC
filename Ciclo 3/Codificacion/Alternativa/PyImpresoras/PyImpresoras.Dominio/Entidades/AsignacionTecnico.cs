namespace PyImpresoras.Dominio
{
    public class AsignacionTecnico{
        public int Id{get;set;}
        public int AsignacionId{get;set;}
        public int TecnicoId{get;set;}
        public Asignacion Asignacion{get;set;}
        public Tecnico Tecnico{get;set;}
    }
}