using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
    public interface IRepositorioTipoImpresora{
        public TipoImpresora AddTipoImpresora(TipoImpresora tipoImpresora);
        public IEnumerable<TipoImpresora> GetAllTipoImpresora();
    }
}