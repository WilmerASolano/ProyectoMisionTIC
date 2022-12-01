
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Persistencia
{
    public class RepositorioTipoImpresora:IRepositorioTipoImpresora{
        private readonly AppContext _appContext;
         public RepositorioTipoImpresora(){

        }
         public RepositorioTipoImpresora(AppContext appContext){
            this._appContext = appContext;
        }
        public TipoImpresora AddTipoImpresora(TipoImpresora tipoImpresora){
            var tipoImpresoraAdicionada = this._appContext.TiposImpresoras.Add(tipoImpresora);
            this._appContext.SaveChanges();
            return tipoImpresoraAdicionada.Entity;
        }
         public IEnumerable<TipoImpresora> GetAllTipoImpresora(){
            return this._appContext.TiposImpresoras;
        }
    }
}