using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
     public class RepositorioAsignacionImpresora:IRepositorioAsignacionImpresora{
         private readonly AppContext _appContext;
         public RepositorioAsignacionImpresora(){

         }
         public RepositorioAsignacionImpresora(AppContext appContext){
            this._appContext = appContext;
         }
         public AsignacionImpresora AddAsignacionImpresora(AsignacionImpresora asignacionImpresora){
            var asignacionAdicionada = this._appContext.AsignacionesImpresoras.Add(asignacionImpresora);
            this._appContext.SaveChanges();
            return asignacionAdicionada.Entity;

        }
        public IEnumerable<AsignacionImpresora>GetAllAsignacionImpresora(){
            return this._appContext.AsignacionesImpresoras;
        } 
           }
}