
namespace PyImpresoras.Dominio{
    public class Tecnico:Persona{
        public string Direccion{get;set;}
        public string Ciudad{get;set;}
        public List<AsignacionTecnico> AsignacionesTecnicos{get;set;}
        public List<TipoEstudio> ListaTipoEstudio{get;set;}
        //public int PersonaId{get;set;}
        //public Persona Persona{get;set;}
    }
}