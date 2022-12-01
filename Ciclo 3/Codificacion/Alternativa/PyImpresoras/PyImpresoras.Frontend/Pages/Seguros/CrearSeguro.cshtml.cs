using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
using System;
namespace PyImpresoras.Frontend.Pages
{
    public class CrearSeguroModel : PageModel
    {
        private  IRepositorioPersona _repoPersona = new RepositorioPersona(new PyImpresoras.Persistencia.AppContext());
        private  IRepositorioSeguro _repoSeguro = new RepositorioSeguro(new PyImpresoras.Persistencia.AppContext());
        private  IRepositorioTipoSeguro _repoTipoSeguro = new RepositorioTipoSeguro(new PyImpresoras.Persistencia.AppContext());
        public CrearSeguroModel(){

        }
        [BindProperty]
        public Seguro Seguro {get;set;}
         [BindProperty]
        public IEnumerable<TipoSeguro> TipoSeguro{get;set;}
         [BindProperty]
        public Persona Persona{get;set;}
        public void OnGet(int id)
        {
            this.Persona = this._repoPersona.GetPersona(id);
            this.TipoSeguro = this._repoTipoSeguro.GetAllTipoSeguro();
        }
        public ActionResult OnPost(){
            try
            {
                //Usuario.FechaAlta = System.DateTime.Now;
                //Usuario.UltimoAcceso = System.DateTime.Now;
                //ADICIONANDO A LA BD
                Seguro seguroAdicionado = _repoSeguro.AddSeguro(Seguro);
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