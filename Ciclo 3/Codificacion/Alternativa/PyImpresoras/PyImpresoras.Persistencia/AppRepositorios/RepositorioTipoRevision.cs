
using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia{
    
    public class RepositorioTipoRevision:IRepositorioTipoRevision{
         private readonly AppContext _appContext;
        public RepositorioTipoRevision(){

        }
        public RepositorioTipoRevision(AppContext appContext){
            this._appContext = appContext;
        }
        public TipoRevision AddTipoRevision(TipoRevision tipoRevision){
            var tipoRevisionAdicionado = this._appContext.TipoRevisiones.Add(tipoRevision);
            this._appContext.SaveChanges();
            return tipoRevisionAdicionado.Entity;
        } 
         public IEnumerable<TipoRevision> GetAllTipoRevision(){
            return this._appContext.TipoRevisiones;
        }
    }
}