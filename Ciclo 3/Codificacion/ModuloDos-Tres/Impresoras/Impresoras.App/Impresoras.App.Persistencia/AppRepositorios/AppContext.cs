using Microsoft.EntityFrameworkCore;
using Impresoras.App.Dominio;
namespace Impresoras.App.Persistencia{
    public class AppContext: DbContext{
       public DbSet<Persona> Personas{get;set;}
        // public DbSet<Socio> Socios{get;set;}
         public DbSet<Seguro> Seguros{get;set;}
         public DbSet<Impresora> Impresoras{get;set;}
         public DbSet<TipoImpresora> TipoImpresoras {get;set;}
         public DbSet<TipoSeguro> TipoSeguros{get;set;}
         public DbSet<Asignacion> Asignaciones{get;set;}
        //public DbSet<Auxiliar> Auxiliares{get;set;}
        public DbSet<HistorialRevision> HistorialRevisiones{get;set;}
        public DbSet<JefeOperaciones> JefeOperaciones{get;set;}
        //public DbSet<Operario> Operarios{get;set;}
        
        public DbSet<Revision> Revisiones{get;set;}
        public DbSet<TipoRevision> TipoRevisiones{get;set;}
         protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder){
            if(!optionsBuilder.IsConfigured){
                optionsBuilder.UseSqlServer("Data Source=(localdb)\\MSSQLLocalDb; Initial Catalog = ImpresoraData");
            }
         }

    }
}