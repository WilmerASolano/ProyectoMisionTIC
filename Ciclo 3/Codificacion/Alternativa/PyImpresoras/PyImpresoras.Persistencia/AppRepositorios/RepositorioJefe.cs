using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
    public class RepositorioJefe:IRepositorioJefe{
        public RepositorioJefe(){

        }
        private readonly AppContext _appContext;
        public RepositorioJefe(AppContext appContext){
            this._appContext = appContext;
        }
        public JefeOperacion AddJefe(JefeOperacion jefe){
            //VARIABLE GENERICO
            //OSEA PUEDE SER DE CUALQUIER TIPO DE DATO
            //SIN ESPECIFICAR
            var jefeAdicionado = this._appContext.JefeOperariones.Add(jefe);
            this._appContext.SaveChanges();
            return jefeAdicionado.Entity;
        }
    }
}