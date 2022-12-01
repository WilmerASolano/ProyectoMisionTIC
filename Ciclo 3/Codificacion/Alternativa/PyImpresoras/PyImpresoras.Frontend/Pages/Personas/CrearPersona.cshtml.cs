using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;

namespace PyImpresoras.Frontend.Pages
{
    public class CrearPersonaModel : PageModel
    {
        
        private static IRepositorioPersona _repoPersona = new RepositorioPersona(new PyImpresoras.Persistencia.AppContext());
        public CrearPersonaModel(){

        }
        //esta propiedad sirve para  ejecutar el objeto usuario 
        [BindProperty]
        public Persona Persona{get;set;}
        //este metodo ACTION RESULT nos devuelve la informacion digitada en el form
        public ActionResult OnGet()
        {
            return Page();
        }
        public ActionResult OnPost(){
            try
            {
                //Usuario.FechaAlta = System.DateTime.Now;
                //Usuario.UltimoAcceso = System.DateTime.Now;
                //ADICIONANDO A LA BD
                Persona personaAdicionada = _repoPersona.AddPersona(Persona);
                return RedirectToPage("./ListadoImpresoras");
            }
            catch (System.Exception e)
            {
            ViewData["Error"] = e.Message;
              return Page();
            }
        }
    }
}
