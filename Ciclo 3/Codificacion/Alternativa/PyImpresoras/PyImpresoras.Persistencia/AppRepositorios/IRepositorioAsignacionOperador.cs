using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
    
    public interface IRepositorioAsignacionOperador{
        public AsignacionOperador AddAsignacionOperador(AsignacionOperador asignacionOperador);
        public IEnumerable<AsignacionOperador>GetAllAsignacionOperador();
    }
}