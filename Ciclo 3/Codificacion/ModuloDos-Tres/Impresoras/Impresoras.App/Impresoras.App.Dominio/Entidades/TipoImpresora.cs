namespace Impresoras.App.Dominio{
    public class TipoImpresora{
        public int Id{get;set;}
        public string Tipo{get;set;}
        public int ImpresoraId{get;set;}
        public Impresora Impresora {get;set;}
    }
}