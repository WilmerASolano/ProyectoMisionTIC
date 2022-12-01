using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Persistencia
{
    public interface IRepositorioImpresora{

        public Impresora AddImpresora(Impresora impresora);
        public IEnumerable<Impresora> GetAllImpresoras();
        
    }
}