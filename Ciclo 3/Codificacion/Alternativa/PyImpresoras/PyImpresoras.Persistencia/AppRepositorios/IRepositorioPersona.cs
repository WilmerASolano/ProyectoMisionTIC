using PyImpresoras.Dominio;
namespace PyImpresoras.Persistencia
{
 public interface  IRepositorioPersona{
     public Persona AddPersona(Persona persona);
        public void DeletePersona(int idPersona);
        public IEnumerable<Persona>  GetAllPersonas();
        public Persona UpdatePersona(Persona persona);
        public Persona GetPersona(int idPersona);
 } 
}