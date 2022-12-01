namespace Impresoras.App.Dominio{
    public class Socio:Persona{
        
        public string RazonSocial{get;set;}
        public List<Seguro>  ListaSeguros{get;set;}
        public int PersonaId{get;set;}
        public Persona Persona{get;set;}
    }
}