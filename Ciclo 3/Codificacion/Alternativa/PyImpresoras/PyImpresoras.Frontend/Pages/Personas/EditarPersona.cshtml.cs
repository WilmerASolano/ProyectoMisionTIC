using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;

namespace PyImpresoras.Frontend.Pages
{
    public class EditarPersonaModel : PageModel
    {
        private static IRepositorioPersona _repoPersona = new RepositorioPersona(new PyImpresoras.Persistencia.AppContext());
        [BindProperty]
        public Persona Persona{get;set;}
        public EditarPersonaModel(){

        }
        
        public ActionResult OnGet(int id)
        {
            Persona = _repoPersona.GetPersona(id);
            return Page();
        }
        public ActionResult OnPost(){
            try{
            Persona personaActualizada = _repoPersona.UpdatePersona(this.Persona);
            return RedirectToPage("ListadoPersona");
            }catch(System.Exception e){
             ViewData["Error"] = e.Message;
              return Page();
            }
        }
    }
}
