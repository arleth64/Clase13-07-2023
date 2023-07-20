package switch1;

public class Switch1 {
    public int option;

    public String showOption(){
        switch (option){
            case 1:{
               return "Su premio es una Gorra..";
            }
            case 2: {
                return "Su premio es bombom";
            }
            default:{
                return "opcion incorrecta";
            }
        }
    }
}
