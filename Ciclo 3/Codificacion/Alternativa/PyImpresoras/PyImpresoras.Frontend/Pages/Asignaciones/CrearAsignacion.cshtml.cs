using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
namespace PyImpresoras.Frontend.Pages
{
    public class CrearAsignacionModel : PageModel
    {
        private IRepositorioAsignacionImpresora _repoAsigImpresora = new RepositorioAsignacionImpresora(new PyImpresoras.Persistencia.AppContext());
        private IRepositorioAsignacion _repoAsignacion = new RepositorioAsignacion(new PyImpresoras.Persistencia.AppContext());
        private IRepositorioAsignacionOperador _repoAsignacionOperador = new RepositorioAsignacionOperador(new PyImpresoras.Persistencia.AppContext());
        private IRepositorioAsignacionTecnico _repoAsignacionTecnico = new RepositorioAsignacionTecnico(new PyImpresoras.Persistencia.AppContext());
        private IRepositorioOperador _repoOperador = new RepositorioOperador(new PyImpresoras.Persistencia.AppContext());
        private IRepositorioTecnico _repoTecnico =  new RepositorioTecnico(new PyImpresoras.Persistencia.AppContext());
        private IRepositorioImpresora _repoImpresora = new RepositorioImpresora(new PyImpresoras.Persistencia.AppContext());
        [BindProperty]
        public Asignacion Asignacion {get; set;}
        [BindProperty]
        public Tecnico Tecnico {get; set;}
        [BindProperty]
        public Operador Operador {get; set;}
        [BindProperty]
        public Impresora Impresora{get; set;}
        [BindProperty]
        public IEnumerable<Operador> Operadores {get; set;}
        [BindProperty]
        public IEnumerable<Impresora> Impresoras {get; set;}
        [BindProperty]
        public IEnumerable<Tecnico> Tecnicos{get; set;}

        public void OnGet()
        {
            //this.Habitaciones = this._repositorioHabitacion.GetHabitaciones();
            this.Impresoras = this._repoImpresora.GetAllImpresoras();
            this.Tecnicos = this._repoTecnico.GetTecnicos();
            this.Operadores = this._repoOperador.GetOperadores();
           
          
        }
         public ActionResult OnPost()
        {
            
            AsignacionImpresora ai = new AsignacionImpresora();
            ai.AsignacionId = this.Asignacion.Id;
            ai.ImpresoraId = this.Impresora.Id;
            this._repoAsigImpresora.AddAsignacionImpresora(ai);
            //Relacionar reserva con el usuario
            AsignacionOperador ao = new AsignacionOperador();
            ao.AsignacionId = this.Asignacion.Id;
            ao.OperadorId = this.Operador.Id;
            this._repoAsignacionOperador.AddAsignacionOperador(ao);
            AsignacionTecnico at = new AsignacionTecnico();
            at.AsignacionId = this.Asignacion.Id;
            at.TecnicoId = this.Asignacion.Id;
            this._repoAsignacionTecnico.AddAsignacionTecnico(at);
                
            
           

            return RedirectToPage("../Personas/ListadoPersona");

        }
    }
}
