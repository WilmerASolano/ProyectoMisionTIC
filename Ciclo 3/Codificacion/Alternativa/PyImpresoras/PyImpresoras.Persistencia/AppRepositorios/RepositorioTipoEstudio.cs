using PyImpresoras.Persistencia;
using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{

    public class RepositorioTipoEstudio:IRepositorioTipoEstudio{
         private readonly AppContext _appContext;
        public RepositorioTipoEstudio(){

        }
        public RepositorioTipoEstudio(AppContext appContext){
            this._appContext = appContext;
        }
        public TipoEstudio AddTipoEstudio(TipoEstudio tipoEstudio){
            var estudioAdicionado = this._appContext.TiposEstudios.Add(tipoEstudio);
            this._appContext.SaveChanges();
            return estudioAdicionado.Entity;
        }  
         public IEnumerable<TipoEstudio> GetAllTipoEstudio(){
            return this._appContext.TiposEstudios;
        }
    }
}