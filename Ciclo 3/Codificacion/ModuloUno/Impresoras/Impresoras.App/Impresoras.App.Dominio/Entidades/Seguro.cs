namespace Impresoras.App.Dominio{
    public class Seguro{
        public int ID{get;set;}
        public Impresora PlacaImpresora{get;set;}
        public TipoSeguro Tipo{get;set;}
        public string FechaCompra{get;set;}
        public string FechaVencimiento{get;set;}
    }
}