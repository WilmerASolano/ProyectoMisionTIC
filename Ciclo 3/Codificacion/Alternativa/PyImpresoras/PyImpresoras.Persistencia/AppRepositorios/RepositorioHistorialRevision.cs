using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
    public class RepositorioHistorialRevision:IRepositorioHistorialRevision{
     public RepositorioHistorialRevision(){

     }
     private readonly AppContext _appContext;
     public RepositorioHistorialRevision(AppContext appContext){
           this._appContext = appContext;
     }
     public HistorialRevision AddHistorial(HistorialRevision historial){
            var historialAdicionada = this._appContext.HistorialRevisiones.Add(historial);
            this._appContext.SaveChanges();
            return historialAdicionada.Entity;
        }
         public IEnumerable<HistorialRevision> GetAllHistoriales(){
            return this._appContext.HistorialRevisiones;
        }
    }
}