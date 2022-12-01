namespace PyImpresoras.Persistencia;
using PyImpresoras.Dominio;
  
    public class RepositorioPersona:IRepositorioPersona{
          //implementar metodo de solo lectura del AppContext
        //APPCONTEXT PERMITE INTERACTUAR CON LA BASE DE DATOS
        private readonly AppContext _appContext;
        //CONSTRUCTOR
        public RepositorioPersona(){

        }
        public RepositorioPersona(AppContext appContext){
            this._appContext = appContext;
        }
        public Persona AddPersona(Persona persona){
            //VARIABLE GENERICO
            //OSEA PUEDE SER DE CUALQUIER TIPO DE DATO
            //SIN ESPECIFICAR
            var personaAdicionada = this._appContext.Personas.Add(persona);
            this._appContext.SaveChanges();
            return personaAdicionada.Entity;
        }
        public void DeletePersona(int idPersona){
            var persona = this._appContext.Personas.FirstOrDefault(p=>p.Id == idPersona);
            if(persona != null)
            {
                this._appContext.Personas.Remove(persona);
                this._appContext.SaveChanges();
            }
        
        }
        public Persona GetPersona(int idPersona){
            return this._appContext.Personas.FirstOrDefault(p=>p.Id== idPersona);
        }
        public IEnumerable<Persona> GetAllPersonas(){
            return this._appContext.Personas;
        }
        public Persona UpdatePersona(Persona persona){
            var personaEncontrada = this._appContext.Personas.FirstOrDefault(p => p.Id == persona.Id);
            if(personaEncontrada != null){
                personaEncontrada.Email = persona.Email;
                personaEncontrada.Login = persona.Login;
                personaEncontrada.Password = persona.Password;
                personaEncontrada.Nombre = persona.Nombre;
                personaEncontrada.Apellido = persona.Apellido;
                personaEncontrada.NumeroTelefono = persona. NumeroTelefono;
            this._appContext.SaveChanges();
            }
            return personaEncontrada;
        } 
    }
