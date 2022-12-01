namespace Impresoras.App.Dominio{
    public class Socio: Usuario{
        public string Nombre{get;set;}
        public string Apellido{get;set;}
        public string RazonSocial{get;set;}
        public Seguro  Seguro{get;set;}
    }
}