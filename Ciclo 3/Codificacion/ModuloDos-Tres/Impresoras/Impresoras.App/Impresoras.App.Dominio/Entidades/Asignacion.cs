using System;
namespace Impresoras.App.Dominio{
    public class Asignacion{
        public int Id{get;set;}
        public int PersonaId{get;set;}
        public Persona Persona{get;set;}
    }
}