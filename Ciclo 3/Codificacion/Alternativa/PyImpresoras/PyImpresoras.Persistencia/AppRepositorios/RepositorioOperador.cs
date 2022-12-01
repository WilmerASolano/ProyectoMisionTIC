using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
     public class RepositorioOperador:IRepositorioOperador{
         private readonly AppContext _appContext;
         public RepositorioOperador(){

         }
         public RepositorioOperador(AppContext appContext){
            this._appContext = appContext;
         }
         public Operador AddOperador(Operador operador){
            var operadorAdicionado = this._appContext.Operadores.Add(operador);
            this._appContext.SaveChanges();
            return operadorAdicionado.Entity;
        }
         public IEnumerable<Operador>GetOperadores(){
            return _appContext.Operadores;
        }
    } 
}