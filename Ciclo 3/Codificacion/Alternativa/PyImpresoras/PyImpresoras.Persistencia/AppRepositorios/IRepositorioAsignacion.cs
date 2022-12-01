using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
    public interface IRepositorioAsignacion{
        public Asignacion AddAsignacion(Asignacion asignacion);
         public IEnumerable<Asignacion>GetAsignaciones();
    }
}