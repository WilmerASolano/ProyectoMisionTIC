using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Persistencia
{
    public class RepositorioAsignacionOperador:IRepositorioAsignacionOperador{
         private readonly AppContext _appContext;
         public RepositorioAsignacionOperador(){

         }
         public  RepositorioAsignacionOperador(AppContext appContext){
            this._appContext = appContext;
         }
          public AsignacionOperador AddAsignacionOperador(AsignacionOperador asignacionOperador){
            var operadorAdicionado = this._appContext.AsignacionesOperadores.Add(asignacionOperador);
            this._appContext.SaveChanges();
            return operadorAdicionado.Entity;

        }
        public IEnumerable<AsignacionOperador>GetAllAsignacionOperador(){
            return _appContext.AsignacionesOperadores;
        }
    }
}