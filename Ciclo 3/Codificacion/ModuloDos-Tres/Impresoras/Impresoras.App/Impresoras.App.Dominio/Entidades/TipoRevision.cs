using System;
namespace Impresoras.App.Dominio{
    public class TipoRevision{
        public int Id{get;set;}
        public string TipoDeRevision{get;set;}
        public int HistorialId{get;set;}
        public HistorialRevision HistorialRevision {get;set;}
    }
}