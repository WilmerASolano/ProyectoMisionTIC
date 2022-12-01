using Impresoras.App.Dominio;
namespace Impresoras.App.Persistencia{
    public interface IRepositorioTipoSeguro{
        public TipoSeguro AddTipoSeguro(TipoSeguro tipoSeguro);
        public void DeleteTipoSeguro(int idTipoSeguro);
        public TipoSeguro GetTipoSeguro(int idTipoSeguro);
        public IEnumerable<TipoSeguro> GetAllTipoSeguro();
        public TipoSeguro UpdateTipoSeguro(TipoSeguro tipoSeguro);
    
    }
}