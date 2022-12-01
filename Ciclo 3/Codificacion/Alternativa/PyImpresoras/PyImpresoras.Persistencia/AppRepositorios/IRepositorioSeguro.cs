using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia{
    public interface IRepositorioSeguro{
    public Seguro AddSeguro(Seguro seguro);
    // public IEnumerable<Seguro>GetSeguroXPlaca(int placaImpresora);
     public IEnumerable<Seguro>  GetAllSeguros();

    }
}