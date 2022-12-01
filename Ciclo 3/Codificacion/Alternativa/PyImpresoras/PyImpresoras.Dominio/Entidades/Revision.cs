namespace PyImpresoras.Dominio
{
    public class Revision{
        public int Id{get;set;}
        public string EstadoCabezal{get;set;}
        public string EstadoExtrusor{get;set;}
        public string Voltaje{get;set;}
        public string Alineacion{get;set;}
        public DateTime FechaHora{get;set;}
        public int ImpresoraId{get;set;}
        public Impresora Impresora{get;set;}
        public List<TipoRevision> TipoRevision{get;set;}
    }
}