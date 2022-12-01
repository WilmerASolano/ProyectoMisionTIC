using Impresoras.App.Dominio;
namespace Impresoras.App.Persistencia{
    public class RepositorioTipoSeguro:IRepositorioTipoSeguro{
        //SE IMPLEMENTA EL APPCONTEXT QUE ES LA BASE DE DATOS
        //EN UN CONSTRUCTOR PARA EL CRUD
        private readonly AppContext _appContext;
        public RepositorioTipoSeguro(){

        }
        public RepositorioTipoSeguro(AppContext appContext){
            this._appContext = appContext;
        }
        public IEnumerable<TipoSeguro>GetAllTipoSeguros(){
            return null;

        }
        public TipoSeguro AddTipoSeguro(TipoSeguro tipoSeguro){
            return null;
        } 
        public void DeleteTipoSeguro(int idTipoSeguro){

        }
        public TipoSeguro GetTipoSeguro(int idTipoSeguro){
            return null;
        }
        public TipoSeguro UpdateTipoSeguro(TipoSeguro tipoSeguro){
            return null;
        }
        public IEnumerable<TipoSeguro>GetAllTipoSeguro(){
            return null;
        }

    }
}