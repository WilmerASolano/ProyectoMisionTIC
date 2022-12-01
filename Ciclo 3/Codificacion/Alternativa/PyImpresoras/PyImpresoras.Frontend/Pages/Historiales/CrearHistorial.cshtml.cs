using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Frontend.Pages
{
    public class CrearHistorialModel : PageModel
    {
        private IRepositorioHistorialRevision _repoHistorial = new RepositorioHistorialRevision(new PyImpresoras.Persistencia.AppContext());
        public CrearHistorialModel(){

        }
        [BindProperty]
        public HistorialRevision HistorialRevision{get;set;}
        
        public void OnGet(int id)
        
        {
            // this.Persona = this._repoPersona.GetPersona(id);
        }
        public ActionResult OnPost(){
            try
            {
                //Usuario.FechaAlta = System.DateTime.Now;
                //Usuario.UltimoAcceso = System.DateTime.Now;
                //ADICIONANDO A LA BD
                HistorialRevision historialAdicionado = _repoHistorial.AddHistorial(HistorialRevision);
                return RedirectToPage("../Personas/ListadoPersona");
            }
            catch (System.Exception e)
            {
            ViewData["Error"] = e.Message;
              return Page();
            }
        }
    }
}
