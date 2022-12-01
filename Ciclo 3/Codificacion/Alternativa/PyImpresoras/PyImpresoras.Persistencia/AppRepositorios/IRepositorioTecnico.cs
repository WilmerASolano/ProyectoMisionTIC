using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
    public interface IRepositorioTecnico{
        public Tecnico AddTecnico(Tecnico tecnico);
        public IEnumerable<Tecnico>GetTecnicos();
    }
}