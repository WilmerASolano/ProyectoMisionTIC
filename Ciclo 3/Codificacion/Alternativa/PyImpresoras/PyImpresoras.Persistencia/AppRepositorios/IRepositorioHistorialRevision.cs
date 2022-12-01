using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Persistencia{
    public interface IRepositorioHistorialRevision{
        public HistorialRevision AddHistorial(HistorialRevision historial);
        public IEnumerable<HistorialRevision> GetAllHistoriales();
    }
}