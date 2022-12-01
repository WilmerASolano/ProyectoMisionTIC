namespace PyImpresoras.Persistencia;
using PyImpresoras.Dominio;

    public class RepositorioTecnico:IRepositorioTecnico{
        public RepositorioTecnico(){

        }
        private readonly AppContext _appContext;
         public RepositorioTecnico(AppContext appContext){
             this._appContext = appContext;
        }
         public Tecnico AddTecnico(Tecnico tecnico){
            //VARIABLE GENERICO
            //OSEA PUEDE SER DE CUALQUIER TIPO DE DATO
            //SIN ESPECIFICAR
            var tecnicoAdicionado = this._appContext.Tecnicos.Add(tecnico);
            this._appContext.SaveChanges();
            return tecnicoAdicionado.Entity;
        }
         public IEnumerable<Tecnico>GetTecnicos(){
            return _appContext.Tecnicos;
        }
    }
