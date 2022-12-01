using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Persistencia
{
    public interface IRepositorioRevision{
        public Revision AddRevision(Revision revision);
        public IEnumerable<Revision> GetAllRevisiones();
    }
}