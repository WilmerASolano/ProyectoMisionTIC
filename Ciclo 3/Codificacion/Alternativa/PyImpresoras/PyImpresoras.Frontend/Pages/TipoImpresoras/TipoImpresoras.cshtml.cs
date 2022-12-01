using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Frontend.Pages
{
    public class TipoImpresorasModel : PageModel
    {
        private static RepositorioTipoImpresora _repoTipoImpresora = new RepositorioTipoImpresora(new PyImpresoras.Persistencia.AppContext());
       public TipoImpresorasModel(){

       }
       [BindProperty]
       public TipoImpresora TipoImpresora{get;set;}
        public ActionResult OnGet()
        {
            return Page();
        }
         public ActionResult OnPost(){
            try{
                TipoImpresora tipoImpresoraAdicionada = _repoTipoImpresora.AddTipoImpresora(TipoImpresora);
                 return RedirectToPage("../Personas/ListadoPersona");
            }catch (System.Exception e)
            {
            ViewData["Error"] = e.Message;
              return Page();
            }
         }
    }
}
