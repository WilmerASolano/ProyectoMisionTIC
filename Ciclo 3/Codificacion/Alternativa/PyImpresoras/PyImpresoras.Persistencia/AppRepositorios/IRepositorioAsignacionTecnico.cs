using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
    public interface IRepositorioAsignacionTecnico{
        
        public AsignacionTecnico AddAsignacionTecnico(AsignacionTecnico asignacionTecnico);
        public IEnumerable<AsignacionTecnico>GetAllAsignacionTecnico();
    }
}