namespace PyImpresoras.Dominio
{
    public class Impresora{
        public int Id{get;set;}
        public int PlacaImpresora{get;set;}
        public List<TipoImpresora> TipoImpresoras{get;set;}
        public string Marca{get;set;}
        public string Anio{get;set;}
        public double VelocidadImpresion{get;set;}
        public string PaisOrigen{get;set;}
        public int SeguroId{get;set;}
        public Seguro Seguro{get;set;}
    
         public List<AsignacionImpresora> AsignacionesImpresoras{get;set;}
    }
}