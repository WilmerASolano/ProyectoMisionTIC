using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
    public class RepositorioSocio:IRepositorioSocio{
        public RepositorioSocio(){

        }
        private readonly AppContext _appContext;
         public RepositorioSocio(AppContext appContext){
             this._appContext = appContext;
        }
        public Socio AddSocio(Socio socio){
            //VARIABLE GENERICO
            //OSEA PUEDE SER DE CUALQUIER TIPO DE DATO
            //SIN ESPECIFICAR
            var socioAdicionado = this._appContext.Socios.Add(socio);
            this._appContext.SaveChanges();
            return socioAdicionado.Entity;
        }
    }
}