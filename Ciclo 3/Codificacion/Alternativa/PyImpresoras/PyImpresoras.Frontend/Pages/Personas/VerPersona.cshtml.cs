using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Frontend.Pages
{
    public class VerPersonaModel : PageModel
    {
    private static IRepositorioPersona _repoPersona = new RepositorioPersona(new PyImpresoras.Persistencia.AppContext());
         [BindProperty]
        public Persona Persona{get;set;}
        public ActionResult OnGet(int id )
        {
            Persona = _repoPersona.GetPersona(id);
            return Page();
        }
    }
}
