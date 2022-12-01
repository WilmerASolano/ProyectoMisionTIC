using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
   
    public class RepositorioAsignacion:IRepositorioAsignacion{
         private readonly AppContext _appContext;
         public RepositorioAsignacion(){

         }
         public RepositorioAsignacion(AppContext appContext){
            this._appContext = appContext;
         }
         public Asignacion AddAsignacion(Asignacion asignacion){
            var asignacionAdicionado = this._appContext.Asignaciones.Add(asignacion);
            this._appContext.SaveChanges();
            return asignacionAdicionado.Entity;
        }
         public IEnumerable<Asignacion>GetAsignaciones(){
            return _appContext.Asignaciones;
        }
    } 
}
