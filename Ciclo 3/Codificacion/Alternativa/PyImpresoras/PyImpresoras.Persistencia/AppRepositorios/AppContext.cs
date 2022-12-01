using Microsoft.EntityFrameworkCore;
using PyImpresoras.Dominio;
using System;
namespace PyImpresoras.Persistencia
{
    public class AppContext : DbContext
    {
        public DbSet<Persona> Personas { get; set; }
        public DbSet<Auxiliar> Auxiliares{get;set;}
        public DbSet<Tecnico> Tecnicos { get; set; } 
        public DbSet<Impresora> Impresoras { get; set; }
         public DbSet<TipoRevision> TipoRevisiones{get;set;}
        public DbSet<TipoImpresora> TiposImpresoras { get; set; }
        public DbSet<TipoSeguro> TiposSeguros { get; set; }
        public DbSet<Seguro> Seguros { get; set; }
         public DbSet<Socio> Socios { get; set; }
        public DbSet<Asignacion> Asignaciones{ get; set; }
        public DbSet<Operador> Operadores { get; set; }
        public DbSet<JefeOperacion> JefeOperariones { get; set; }
        public DbSet<HistorialRevision> HistorialRevisiones{ get; set; }
        public DbSet<Revision> Revisiones{ get; set; }
         public DbSet<TipoEstudio> TiposEstudios{ get; set; }
        public DbSet<AsignacionTecnico> AsignacionesTecnicos{ get; set; }
        public DbSet<AsignacionOperador> AsignacionesOperadores{ get; set; }
        public DbSet<AsignacionImpresora> AsignacionesImpresoras{ get; set; } 


        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            if (!optionsBuilder.IsConfigured)
            {
                optionsBuilder.UseSqlServer("Data Source=(localdb)\\MSSQLLocalDb; Initial Catalog = BDImpresora");
            }
        }
        /* protected override void OnModelCreating(ModelBuilder modelBuilder){

                //EVITA EL BORRADO EN CASCADA EN UNA RELACION 1..N
                modelBuilder.Entity<Persona>()
                .HasMany(p => p.TipoSeguro)
                .WithOne(s => s.Persona)
                .OnDelete(DeleteBehavior.Restrict);
            } 
            protected override void OnModelCreating(ModelBuilder modelBuilder){
            modelBuilder.Entity<AsignacionPersona>().HasKey(ap=> new{ap.AsignacionId,ap.PersonaId});
                modelBuilder.Entity<Asignacion>()
                .HasMany(ap => ap.AsignacionPersona)
                .WithOne(a=>a.Asignacion)
                .OnDelete(DeleteBehavion.Restrict);
                modelBuilder.Entity<Persona>()
                .HasMany(ap => ap.AsignacionPersona)
                .WithOne(p=> p.Persona)
                .OnDelete(DeleteBehavion.Restrict);
            }
            */
    }
}