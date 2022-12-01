using System;
namespace Impresoras.App.Dominio{
    public class JefeOperaciones:Persona{
        public int Id{get;set;}
        public List<Seguro> ListaSeguros{get;set;}
        public List<Impresora> ListaImpresoras{get;set;}
        public List<HistorialRevision> HistorialRevisiones{get;set;}
    }
}