namespace Impresoras.App.Dominio{
    public class TipoSeguro{
        public int Id{get;set;}
        public string TipoDeSeguro{get;set;}
        public int SeguroId{get;set;}
        public Seguro Seguro{get;set;}
    }
}