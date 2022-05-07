package first.day;

public class Exercise7 {

    private Integer capOfMagazine;
    private Integer quantityInMagazine = 0;

    public Exercise7(Integer capOfMagazine){
        this.capOfMagazine = capOfMagazine;
    }

    public void loadBullet(String bullet){
        Integer bulletInInt = Integer.parseInt(bullet);
        if(bulletInInt + quantityInMagazine <= capOfMagazine){
            System.out.println("Bullet loaded successfully !");
            quantityInMagazine += bulletInInt;
        }
        else{
            Integer temp = capOfMagazine - quantityInMagazine;
            bulletInInt -= temp;
            System.out.println("Only " + temp + " are loaded successfully !");
            System.out.println(bulletInInt + " is not loaded, because the weapon is fully loaded !");
        }
    }

    public boolean isLoaded(){
        if(quantityInMagazine > 0){
            System.out.println("Weapon has at least one cartridge !");
            return true;
        }
        else{
            System.out.println("Weapon is not loaded !");
            return false;
        }
    }

    public void shot(){
        if(quantityInMagazine > 0){
            if(quantityInMagazine==1){
                System.out.println("This is the last bullet !");
            }
            else if (quantityInMagazine==2){
                System.out.println("You have one remaining bullet !");
            }
            quantityInMagazine--;
        }
        else
            System.out.println("Empty magazine !");
    }

    public static void main(String[] args) {
        Exercise7 weapon = new Exercise7(20);
        weapon.loadBullet("3");
        weapon.shot();
        weapon.shot();
        weapon.isLoaded();
        weapon.shot();
        weapon.shot();
        weapon.isLoaded();
    }
}
