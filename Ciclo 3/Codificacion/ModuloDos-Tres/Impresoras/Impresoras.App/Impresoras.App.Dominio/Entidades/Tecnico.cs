using System;
namespace Impresoras.App.Dominio{
    public class Tecnico:Persona{
        public string Direccion{get;set;}
        public string Ciudad{get;set;}
        //public List<Tecnico> ListaTecnicos{get;set;}
        public int PersonaId{get;set;}
        public Persona Persona{get;set;}
    }
}