using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
public interface IRepositorioTipoSeguro{
     public TipoSeguro AddTipoSeguro(TipoSeguro tipoSeguro);
   
    public IEnumerable<TipoSeguro> GetAllTipoSeguro();
}
}