namespace Impresoras.App.Dominio{
    public class Seguro{
        public int Id{get;set;}
        public Impresora PlacaImpresora{get;set;}
        public List<TipoSeguro> TipoSeguro{get;set;}
        public DateTime FechaCompra{get;set;}
        public DateTime FechaVencimiento{get;set;}
        public int SocioId{get;set;}
        public Socio Socio{get;set;}

    }
}