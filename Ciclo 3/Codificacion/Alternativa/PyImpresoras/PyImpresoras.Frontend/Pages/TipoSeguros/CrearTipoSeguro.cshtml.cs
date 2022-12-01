using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Frontend.Pages
{
    public class CrearTipoSeguroModel : PageModel
    {
        private static IRepositorioTipoSeguro _repoTipoSeguro = new RepositorioTipoSeguro(new PyImpresoras.Persistencia.AppContext());
        public CrearTipoSeguroModel(){

        }
        public TipoSeguro TipoSeguro{get;set;} 
        public ActionResult OnGet()
        {
            return Page();
        }
        public ActionResult OnPost(){
            try{
                TipoSeguro tipoSeguroAdicionada = _repoTipoSeguro.AddTipoSeguro(TipoSeguro);
                 return RedirectToPage("../TipoImpresoras/ListadoImpresoras");
            }catch (System.Exception e)
            {
            ViewData["Error"] = e.Message;
              return Page();
            }
         }
    }
}
