using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Persistencia
{

     
         public class RepositorioSeguro:IRepositorioSeguro{
        private readonly AppContext _appContext;
        //CONSTRUCTOR
        public RepositorioSeguro(){

        }
        public RepositorioSeguro(AppContext appContext){
            this._appContext = appContext;
        }
        public Seguro AddSeguro(Seguro seguro){
            var seguroAdicionado = this._appContext.Seguros.Add(seguro );
            this._appContext.SaveChanges();
            return seguroAdicionado.Entity;
        }
        
        public IEnumerable<Seguro> GetAllSeguros(){
            return this._appContext.Seguros;
        }
        /*  public IEnumerable<Seguro>GetSeguroXPlaca(int placaImpresora){
            return _appContext.Seguros.Where(s => s.ImpresoraPlaca== placaImpresora);
        }  */
     }
}
