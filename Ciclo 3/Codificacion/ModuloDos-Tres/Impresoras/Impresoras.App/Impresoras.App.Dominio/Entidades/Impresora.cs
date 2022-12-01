namespace Impresoras.App.Dominio{
    public class Impresora{
        public int Id{get;set;}
        public int PlacaImpresora{get;set;}
        public List<TipoImpresora> TipoImpresoras{get;set;}
        public string Marca{get;set;}
        public string Anio{get;set;}
        public double VelocidadImpresion{get;set;}
        public string PaisOrigen{get;set;}
       public int PersonaId{get;set;}
        public Persona Persona{get;set;}
        }
    }
