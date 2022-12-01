namespace PyImpresoras.Dominio
{
    public class Operador:Persona{
        public List<Seguro> ListaSeguros{get;set;}
        public List<AsignacionOperador> AsignacionesOperadores{get;set;}
    }
}