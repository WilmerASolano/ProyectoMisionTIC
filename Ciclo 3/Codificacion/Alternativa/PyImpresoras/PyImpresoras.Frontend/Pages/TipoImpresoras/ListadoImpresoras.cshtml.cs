using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;

namespace PyImpresoras.Frontend.Pages
{
    public class ListadoImpresorasModel : PageModel
    {
        private static IRepositorioTipoImpresora _repoTipoImpre = new RepositorioTipoImpresora(new PyImpresoras.Persistencia.AppContext());
        public ListadoImpresorasModel(){

        } 
        public IEnumerable<TipoImpresora> TipoImpresora{get;set;}

       public void OnGet()
        {
            TipoImpresora = _repoTipoImpre.GetAllTipoImpresora();
        }
    }
}
