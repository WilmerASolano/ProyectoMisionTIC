namespace PyImpresoras.Dominio
{
    public class JefeOperacion:Persona{
        public int Id{get;set;}
        public List<Seguro> ListaSeguros{get;set;}
        public List<Impresora> ListaImpresoras{get;set;}
        public List<HistorialRevision> HistorialRevisiones{get;set;}
    }
}