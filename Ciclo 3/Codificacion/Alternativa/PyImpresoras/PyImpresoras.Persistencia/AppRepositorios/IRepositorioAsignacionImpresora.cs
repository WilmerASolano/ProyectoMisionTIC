using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
    public interface IRepositorioAsignacionImpresora{
      public AsignacionImpresora AddAsignacionImpresora(AsignacionImpresora asignacionImpresora);
     public IEnumerable<AsignacionImpresora>GetAllAsignacionImpresora();
    }
}