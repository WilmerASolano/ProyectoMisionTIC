using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Persistencia
{
    public class RepositorioRevision:IRepositorioRevision{
         private readonly AppContext _appContext;
         public  RepositorioRevision(){

         }
         public RepositorioRevision(AppContext appContext){
            this._appContext = appContext;
         }
          public Revision AddRevision(Revision revision){
            var revisionAdicionada = this._appContext.Revisiones.Add(revision);
            this._appContext.SaveChanges();
            return revisionAdicionada.Entity;
        }
         public IEnumerable<Revision> GetAllRevisiones(){
            return this._appContext.Revisiones;
        }
    }
}