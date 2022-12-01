using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Frontend.Pages
{
    public class CrearRevisionModel : PageModel
    {
       private IRepositorioRevision _repoRevision = new RepositorioRevision(new PyImpresoras.Persistencia.AppContext());
       private IRepositorioTipoRevision _repoTipoRevision = new RepositorioTipoRevision(new PyImpresoras.Persistencia.AppContext());
        public CrearRevisionModel(){

        }
         [BindProperty]
         public Revision Revision{get;set;}
         [BindProperty]
         public IEnumerable<TipoRevision> TipoRevision{get;set;}
        public void OnGet()
        {
            this.TipoRevision = this._repoTipoRevision.GetAllTipoRevision();
        }
        public ActionResult OnPost(){
             try
            {
                //Usuario.FechaAlta = System.DateTime.Now;
                //Usuario.UltimoAcceso = System.DateTime.Now;
                //ADICIONANDO A LA BD
                Revision revisionAdicionado = _repoRevision.AddRevision(Revision);
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
