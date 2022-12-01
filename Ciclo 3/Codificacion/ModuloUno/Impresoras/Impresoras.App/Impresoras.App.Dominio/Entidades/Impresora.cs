namespace Impresoras.App.Dominio{
    public class Impresora{
        public int ID{get;set;}
        public Impresora PlacaImpresora{get;set;}
        public TipoImpresora TipoImpresora{get;set;}
        public string Marca{get;set;}
        public string Anio{get;set;}
        public double VelocidadImpresion{get;set;}
        public string PaisOrigen{get;set;}
        
        }
    }
