
namespace PyImpresoras.Dominio

{
    public class Seguro{
         public int Id{get;set;}
        public List<TipoSeguro> ListaTipoSeguro{get;set;}
        public DateTime FechaCompra{get;set;}
        public DateTime FechaVencimiento{get;set;}
      
    }
}