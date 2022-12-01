
using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
    public class RepositorioAuxiliar:IRepositorioAuxiliar{
        public RepositorioAuxiliar(){

        }
        private readonly AppContext _appContext;
        public RepositorioAuxiliar(AppContext appContext){
            this._appContext = appContext;
        }
        public Auxiliar AddAuxiliar(Auxiliar auxiliar){
            //VARIABLE GENERICO
            //OSEA PUEDE SER DE CUALQUIER TIPO DE DATO
            //SIN ESPECIFICAR
            var auxiliarAdicionado = this._appContext.Auxiliares.Add(auxiliar);
            this._appContext.SaveChanges();
            return auxiliarAdicionado.Entity;
        }
    }
}