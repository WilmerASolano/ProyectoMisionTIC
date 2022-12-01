using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace Hotel.App.Frontend.Pages
{
    public class LoginModel : PageModel
    {
        public void OnGet()
        {
        }
        public ActionResult OnPost()
        {
            Console.WriteLine("Usuario: " + this.UserName);
            //ir a validar en la tabla de usuario las credenciales
            TempData["Persona"] = this.UserName;
            TempData.Keep();
            if (this.UserName.Equals("michaelj"))
                return RedirectToPage("../Personas/ListadoPersona");
            
            return Page();
        }
    }
}
