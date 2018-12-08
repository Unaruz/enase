//Classe pour définir une unité 
class Unite {
    String nom;
    double siren;
    double ca;

    public Unite(String nom, double siren, double ca) {
        this.nom = nom;
        this.siren = siren;
        this.ca = ca;
    }
    public void modifierCa(double nouveauCA) {
        this.ca = nouveauCA;
    }

}
