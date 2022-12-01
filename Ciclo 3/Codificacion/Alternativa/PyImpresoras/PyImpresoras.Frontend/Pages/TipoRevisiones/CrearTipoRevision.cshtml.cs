using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Frontend.Pages
{
    public class CrearTipoRevisionModel : PageModel
    {
        private static IRepositorioTipoRevision _repoTipoRevision = new RepositorioTipoRevision(new PyImpresoras.Persistencia.AppContext());
        public CrearTipoRevisionModel(){

        }
        [BindProperty]
        public TipoRevision TipoRevision{get;set;}
        public ActionResult OnGet()
        {
            return Page();
        }
         public ActionResult OnPost(){
            try{
                TipoRevision tipoRevisionAdicionada = _repoTipoRevision.AddTipoRevision(TipoRevision);
                 return RedirectToPage("../Personas/ListadoPersona");
            }catch (System.Exception e)
            {
            ViewData["Error"] = e.Message;
              return Page();
            }
         }

    }
}
