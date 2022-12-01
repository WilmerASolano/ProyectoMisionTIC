using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;

namespace PyImpresoras.Frontend.Pages
{
    public class ListadoPersonaModel : PageModel
    {
        private static IRepositorioPersona _repoPersona = new RepositorioPersona(new PyImpresoras.Persistencia.AppContext());
        public ListadoPersonaModel(){
            
        }
        public IEnumerable<Persona> Personas{get;set;}
        public void OnGet()
        {
            Personas = _repoPersona.GetAllPersonas();
        }
    }
}
