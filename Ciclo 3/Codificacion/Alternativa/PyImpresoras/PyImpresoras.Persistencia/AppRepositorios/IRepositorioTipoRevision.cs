using PyImpresoras.Dominio;

namespace PyImpresoras.Persistencia
{
     public interface IRepositorioTipoRevision{
        public TipoRevision AddTipoRevision(TipoRevision tipoRevision);
       public IEnumerable<TipoRevision> GetAllTipoRevision();
    }
}