using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;

namespace PyImpresoras.Frontend.Pages
{
    public class CrearImpresoraModel : PageModel
    {
        private IRepositorioTipoImpresora _repoTipoImpresora = new RepositorioTipoImpresora(new PyImpresoras.Persistencia.AppContext());
        private IRepositorioImpresora _repoImpresora = new RepositorioImpresora(new PyImpresoras.Persistencia.AppContext());
        public CrearImpresoraModel(){

        }
        [BindProperty]
        public Impresora Impresora{get;set;}
         [BindProperty]
        public IEnumerable<TipoImpresora> TipoImpresora{get;set;}
        public ActionResult OnGet()
        {
            this.TipoImpresora = this._repoTipoImpresora.GetAllTipoImpresora();
            return Page();
        }
        public ActionResult OnPost(){
             try
            {
                //Usuario.FechaAlta = System.DateTime.Now;
                //Usuario.UltimoAcceso = System.DateTime.Now;
                //ADICIONANDO A LA BD
                Impresora impresoraAdicionada = _repoImpresora.AddImpresora(Impresora);
                return RedirectToPage("./Personas/ListadoPersona");
            }
            catch (System.Exception e)
            {
            ViewData["Error"] = e.Message;
              return Page();
            }
        }
    }
}
