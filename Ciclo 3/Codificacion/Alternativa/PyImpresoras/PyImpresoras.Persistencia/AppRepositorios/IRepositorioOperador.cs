using PyImpresoras.Persistencia;
using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
    public interface IRepositorioOperador{
        public Operador AddOperador(Operador operador);
         public IEnumerable<Operador>GetOperadores();
    }
}