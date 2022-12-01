using System;
namespace Impresoras.App.Dominio{
    public class Revision{
        public int Id{get;set;}
        public string EstadoCabezal{get;set;}
        public string EstadoExtrusor{get;set;}
        public string Voltaje{get;set;}
        public string Alineacion{get;set;}
        public DateTime FechaHora{get;set;}
        public List<HistorialRevision> HistorialRevision{get;set;}

    }
}