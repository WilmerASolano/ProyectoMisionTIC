// See https://aka.ms/new-console-template for more information
using System;
using PyImpresoras.Dominio;
using PyImpresoras.Persistencia;
public class Program{
 private static IRepositorioPersona _repositorioPersona = new RepositorioPersona(new PyImpresoras.Persistencia.AppContext());
 private static IRepositorioSeguro _repositorioSeguro = new RepositorioSeguro(new PyImpresoras.Persistencia.AppContext());  
 private static IRepositorioTipoImpresora _repositorioTipoImpresora = new RepositorioTipoImpresora(new PyImpresoras.Persistencia.AppContext());    
  private static IRepositorioTipoEstudio _repositorioTipoEstudio = new RepositorioTipoEstudio(new PyImpresoras.Persistencia.AppContext());       
 private static IRepositorioTipoRevision _repositorioTipoRevision = new RepositorioTipoRevision(new PyImpresoras.Persistencia.AppContext());       

 private static IRepositorioTipoSeguro _repositorioTipoSeguro = new RepositorioTipoSeguro(new PyImpresoras.Persistencia.AppContext()); 
 private static IRepositorioImpresora _repoImpresora = new RepositorioImpresora(new PyImpresoras.Persistencia.AppContext());
 private static IRepositorioTecnico _repoTecnico = new RepositorioTecnico(new PyImpresoras.Persistencia.AppContext());   
 private static IRepositorioAuxiliar _repoAuxiliar = new RepositorioAuxiliar(new PyImpresoras.Persistencia.AppContext());
 private static IRepositorioSocio _repoSocio = new RepositorioSocio(new PyImpresoras.Persistencia.AppContext());  
 private static IRepositorioJefe _repoJefe = new RepositorioJefe(new PyImpresoras.Persistencia.AppContext()); 
 private static IRepositorioAsignacion _repoAsignacion = new RepositorioAsignacion(new PyImpresoras.Persistencia.AppContext()); 
 private static IRepositorioRevision _repoRevision = new RepositorioRevision(new PyImpresoras.Persistencia.AppContext()); 
 private static IRepositorioHistorialRevision _repoHistorial = new RepositorioHistorialRevision(new PyImpresoras.Persistencia.AppContext());  
 private static IRepositorioOperador _repoOperador = new RepositorioOperador(new PyImpresoras.Persistencia.AppContext());  
   private static void Main(string[] args){
        Console.WriteLine("Hello, World!");
       //AgregarPersona();
       //BuscarPersona();
      // VerListadoPersonas();
      //AgregarSeguro();
     //AgregarTipoImpresora();
     // AgregarTipoEstudio();
      //AgregarTipoRevision();
     //AgregarTipoSeguro();
      //AgregarImpresora();
     //AgregarTecnico();
     //AgregarAuxiliar();
     //AgregarSocio();
   // AgregarJefe();
    //AgregarAsignacion();
   // AgregarHistorial();
    AgregarRevision();
   //AgregarOperador();
   }
   /* private static void AgregarAsignacion(){
    var asignacion = new Asignacion();
    asignacion.AsignacionesTecnicos = 1;
    asignacion.AsignacionesOperadores = 1;
    asignacion.AsignacionesImpresoras=1;
   } */

    private static void AgregarHistorial(){
        var historial = new HistorialRevision();
        historial.Valor=3456;
        historial.FechaHora = DateTime.Now;
        historial.RevisionId=1;
         Console.WriteLine("historial adicionada");
    }
    private static void AgregarRevision(){
        var revision = new Revision();
        revision.EstadoCabezal= "bueno";
        revision.EstadoExtrusor="regular";
        revision.Voltaje="123hz";
        revision.Alineacion="horizontal";
        revision.FechaHora=DateTime.Now;
        revision.ImpresoraId=4;
         Console.WriteLine("revision adicionada");
    }
    private static void AgregarJefe(){
        var jefe = new JefeOperacion();
        jefe.Email="jefelimes@gmail.com";
        jefe.Login="jefelizandro";
        jefe.Password="jefeliza";
        jefe.Nombre="lizandro";
        jefe.Apellido="mesa";
        jefe.NumeroTelefono="3223456781";
        Console.WriteLine("jefe adicionado");
    }
    private static void AgregarSocio(){
       var socio = new Socio();
       socio.Email="sociotwo@hotmail.com";
       socio.Login="sociodos";
       socio.Password="segundosocio567";
       socio.Nombre="alejandra";
       socio.Apellido="ordoñez";
       socio.NumeroTelefono="35783129";
       Console.WriteLine("socio adicionado");
    }
    private static void AgregarAuxiliar(){
        var auxiliar = new Auxiliar();
        auxiliar.Email="auxiliartw@hotmail";
        auxiliar.Login="auxiliardos";
        auxiliar.Password="otroAuxiliar";
        auxiliar.Nombre="ricardo";
        auxiliar.Apellido="salcedo";
        auxiliar.NumeroTelefono="3214567";
        Console.WriteLine("auxiliar adicionada");
    }
    private static void AgregarOperador(){
        var operador = new Operador();
        operador.Email="operador4@gmail.com";
        operador.Login="operadortec";
        operador.Password="operadorprimero";
        operador.Nombre="jose";
        operador.Apellido="fernandez";
        operador.NumeroTelefono="7642356";
         Console.WriteLine("operador adicionada");

    }
    private static void AgregarTecnico(){
        var tecnico = new Tecnico();
        tecnico.Email="tecnico34@gmail.com";
        tecnico.Login="tecnicoter";
        tecnico.Password="tercertecnico";
        tecnico.Nombre="luis";
        tecnico.Apellido="molina";
        tecnico.NumeroTelefono="456321";
        tecnico.Direccion="calle34#45-32";
        tecnico.Ciudad="bogota";
         Console.WriteLine("tecnico adicionada");

    }
     private static void AgregarImpresora(){
        var impresora = new Impresora(); 
        impresora.PlacaImpresora = 12345;
        impresora.Marca = "epson";
        impresora.Anio = "2014";
        impresora.VelocidadImpresion = 20.9;
        impresora.PaisOrigen = "corea";
        impresora.SeguroId = 1;
        _repoImpresora.AddImpresora(impresora);
        Console.WriteLine("impresora adicionada");

    }
    private static void AgregarTipoSeguro(){
     var tipoSeguro = new TipoSeguro();
     tipoSeguro.TipoDeSeguro = "todo riesgo";
     _repositorioTipoSeguro.AddTipoSeguro(tipoSeguro);
       Console.WriteLine("tipo de seguro adicionado!"); 
    }
     
    private static void AgregarTipoRevision(){
        var tipoRevision = new TipoRevision();
        tipoRevision.TipoDeRevision = "Revision preventiva";
        _repositorioTipoRevision.AddTipoRevision(tipoRevision);
        Console.WriteLine("tipo de revision adicionado!");
    }
    private static void AgregarTipoEstudio(){
        var tipoEstudio = new TipoEstudio();
        tipoEstudio.TipoDeEstudio = "tecnico";
        _repositorioTipoEstudio.AddTipoEstudio(tipoEstudio);
         Console.WriteLine("tipo de estudio adicionado!");
    }
    private static void AgregarTipoImpresora(){
        var tipoImpresora = new TipoImpresora();
        tipoImpresora.Tipo = "laser";
        _repositorioTipoImpresora.AddTipoImpresora(tipoImpresora);
         Console.WriteLine("impresora adicionado!");
    } 
    private static void AgregarSeguro(){
        var seguro = new Seguro();
       
        seguro.FechaCompra = DateTime.Now;
        seguro.FechaVencimiento = DateTime.Now;
        _repositorioSeguro.AddSeguro(seguro);

        Console.WriteLine("Seguro adicionado!");
    }
   
     private static void AgregarPersona(){
        //se instancia la clase usuario 
        var persona = new Persona();
        persona.Email = "michaelauu@gmail.com";
        persona.Login = "michaelj";
        persona.Password ="soymichael";
        persona.Nombre = "michael";
       persona.Apellido = "jackson";
       persona.NumeroTelefono = "12345";
        _repositorioPersona.AddPersona(persona);
        Console.WriteLine("Usuario adicionado!");
    }
    private static void BuscarPersona(){
        Console.WriteLine("*******************");
        Console.WriteLine("Buscando usuario con id 1");
        var persona = _repositorioPersona.GetPersona(1);
        Console.WriteLine("Login" + persona.Login);
        Console.WriteLine("Email" + persona.Email);
    }
    private static void VerListadoPersonas(){
        var VerListadoPersonas = _repositorioPersona.GetAllPersonas();
        foreach(var per in VerListadoPersonas){
            Console.WriteLine("Email: " + per.Email);
        }
    }  
    }
