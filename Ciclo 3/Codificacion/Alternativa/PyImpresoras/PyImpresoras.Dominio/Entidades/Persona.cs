using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
namespace PyImpresoras.Dominio
{
    public class Persona{
        public int Id{get;set;}
        [Required(ErrorMessage ="el email es obligatorio")]
        public string Email{get;set;}
        [Required(ErrorMessage ="el login es obligatorio")]
        public string Login{get;set;}
        [Required(ErrorMessage ="el password es obligatorio")]
        public string Password{get;set;}
        [Required(ErrorMessage ="el nombre es obligatorio")]
        public string Nombre{get;set;}
        [Required(ErrorMessage ="el apellido es obligatorio")]
        public string Apellido{get;set;}
        [Required(ErrorMessage ="el numero de telefono es obligatorio")]
        public string NumeroTelefono{get;set;}
    }
}