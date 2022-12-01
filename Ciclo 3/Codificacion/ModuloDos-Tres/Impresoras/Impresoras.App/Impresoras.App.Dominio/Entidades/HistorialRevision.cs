using System;
namespace Impresoras.App.Dominio{
    public class HistorialRevision{
        public int Id{get;set;}
        public List<TipoRevision> TipoRevision{get;set;}
        public int Valor{get;set;}
        public DateTime FechaHora{get;set;}
        public int JefeId{get;set;}
        public JefeOperaciones JefeOperaciones{get;set;}
    }
}