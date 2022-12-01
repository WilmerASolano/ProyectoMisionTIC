namespace PyImpresoras.Dominio
{
    public class HistorialRevision{
        public int Id{get;set;}
        
        public int Valor{get;set;}
        public DateTime FechaHora{get;set;}
        public int RevisionId{get;set;}
        public Revision Revision{get;set;}
    }
}