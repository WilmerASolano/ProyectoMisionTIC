using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Persistencia
{
 public class RepositorioAsignacionTecnico:IRepositorioAsignacionTecnico{
    private readonly AppContext _appContext;
         public RepositorioAsignacionTecnico(){

         }
         public  RepositorioAsignacionTecnico(AppContext appContext){
            this._appContext = appContext;
         }
         public AsignacionTecnico AddAsignacionTecnico(AsignacionTecnico asignacionTecnico){
            var tecnicoAdicionado = this._appContext.AsignacionesTecnicos.Add(asignacionTecnico);
            this._appContext.SaveChanges();
            return tecnicoAdicionado.Entity;

        }
        public IEnumerable<AsignacionTecnico>GetAllAsignacionTecnico(){
            return _appContext.AsignacionesTecnicos;
        }
 }
}