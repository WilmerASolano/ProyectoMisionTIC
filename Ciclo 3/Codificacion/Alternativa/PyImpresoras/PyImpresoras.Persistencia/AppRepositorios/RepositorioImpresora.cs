using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Persistencia
{
    public class RepositorioImpresora:IRepositorioImpresora{
        private readonly AppContext _appContext;
        public RepositorioImpresora(){

        }
        public RepositorioImpresora(AppContext appContext){
            this._appContext = appContext;
        }
        public Impresora AddImpresora(Impresora impresora){
            var ImpresoraAdicionada = this._appContext.Impresoras.Add(impresora);
            this._appContext.SaveChanges();
            return ImpresoraAdicionada.Entity;
        }
         public IEnumerable<Impresora> GetAllImpresoras(){
            return this._appContext.Impresoras;
        }
        
    }
}