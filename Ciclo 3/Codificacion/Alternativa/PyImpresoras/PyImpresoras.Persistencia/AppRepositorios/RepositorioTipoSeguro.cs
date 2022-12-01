using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
    public class RepositorioTipoSeguro:IRepositorioTipoSeguro{
        private readonly AppContext _appContext;
        public RepositorioTipoSeguro(){

        }
        public RepositorioTipoSeguro(AppContext appContext){
            this._appContext = appContext;
        }
        public TipoSeguro AddTipoSeguro(TipoSeguro tipoSeguro){
            //VARIABLE GENERICO
            //OSEA PUEDE SER DE CUALQUIER TIPO DE DATO
            //SIN ESPECIFICAR
            var tipoSeguroAdicionado = this._appContext.TiposSeguros.Add(tipoSeguro);
            this._appContext.SaveChanges();
            return tipoSeguroAdicionado.Entity;
        }
        public IEnumerable<TipoSeguro> GetAllTipoSeguro(){
            return this._appContext.TiposSeguros;
        }
          
    }
}