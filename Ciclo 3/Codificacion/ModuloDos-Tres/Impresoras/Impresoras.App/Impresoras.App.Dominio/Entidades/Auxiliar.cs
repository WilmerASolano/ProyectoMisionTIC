
namespace Impresoras.App.Dominio{
    public class Auxiliar:Persona{
        public List<Impresora>ListaImpresoras{get;set;}
        public List<Tecnico> ListaTecnicos{get;set;}
        public List<Operario> ListaOperarios{get;set;}
        public List<Asignacion> ListaAsignaciones{get;set;}
        public List<Socio> ListaSocios{get;set;}
    }
}