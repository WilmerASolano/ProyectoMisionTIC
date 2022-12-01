using Microsoft.EntityFrameworkCore;
using Impresoras.App.Dominio;
namespace Impresoras.App.Persistencia{
    public class AppContext: DbContext{
        public DbSet<Usuario> Usuarios{get;set;}
         public DbSet<Socio> Socios{get;set;}
         public DbSet<Seguro> Seguros{get;set;}
         public DbSet<Impresora> Impresoras{get;set;}
         public DbSet<TipoImpresora> TipoImpresoras {get;set;}
         public DbSet<TipoSeguro> TipoSeguros{get;set;}

         protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder){
            if(!optionsBuilder.IsConfigured){
                optionsBuilder.UseSqlServer("Data Source=(localdb)\\MSSQLLocalDb; Initial Catalog = ImpresoraData");
            }
         }

    }
}