namespace PyImpresoras.Dominio
{
    public class AsignacionOperador{
        public int Id{get;set;}
         public int AsignacionId{get;set;}
        public int OperadorId{get;set;}
        public Asignacion Asignacion{get;set;}
        public Operador Operador{get;set;}
    }
}