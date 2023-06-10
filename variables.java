public class Curso_Java {
    public static void main(String[] args) {
      var usuario = "Diglas";
      var titulo = "Programador";
      var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j);
        System.out.println(i + j + usuario);
        System.out.println(usuario + i + j);
        System.out.println(usuario + (i+j));
    }
    
}
