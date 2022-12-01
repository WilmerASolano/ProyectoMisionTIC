using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;

namespace PyImpresoras.Frontend.Pages
{
    public class TipoEstudiosModel : PageModel
    {
        private static IRepositorioTipoEstudio _repoTipoEstudio = new RepositorioTipoEstudio(new PyImpresoras.Persistencia.AppContext());
        public TipoEstudiosModel(){

        }
        [BindProperty]
        TipoEstudio TipoEstudio{get;set;}
        public ActionResult OnGet()
        {
            return Page();
        }
        public ActionResult OnPost(){
            try{
                TipoEstudio tipoEstudio = _repoTipoEstudio.AddTipoEstudio(TipoEstudio);
                return RedirectToPage("../TipoImpresoras/ListadoImpresoras");
            }catch(System.Exception e){
                 ViewData["Error"] = e.Message;
              return Page();
            }
        }
    }
}
