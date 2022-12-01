using System;
namespace Impresoras.App.Dominio{
    public class Operario:Persona{
        public List<Seguro> ListaSeguros{get;set;}
        public int PersonaId{get;set;}
        public Persona Persona {get;set;}
    }
}