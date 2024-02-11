package proyecto1programacion2;
public class registro {
   String user; 
   String password;
   private static final String usuario="admin";
   private static final String contra="supersecreto";

   public registro(String username, String password) {
        this.user=username;
        this.password=password;
        int nada=0;
    }
    public String getUser() {
        return user;
    }
    public String getPassword() {
        return password;
    }
    public boolean login() {
        return this.user.equals(usuario) && this.password.equals(contra);
    }
 public static boolean Usuarios(String user,String password){
    if(user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("supersecreto"  )){
         return true;
        }else {
        return false;  
    }
   
 }

 
 
 
 
 
 
 
 
 
}
