using PyImpresoras.Dominio;

namespace PyImpresoras.Persistencia
{
     public interface IRepositorioTipoEstudio{
        public TipoEstudio AddTipoEstudio(TipoEstudio tipoEstudio);
         public IEnumerable<TipoEstudio> GetAllTipoEstudio();
       
    }
}