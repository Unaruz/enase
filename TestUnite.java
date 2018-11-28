/*
 * Entete du la classe test
 */
class TestUnite {
    public static void main(String[] args) {
    	
        Unite u1 = new Unite("Amazon", 123456789, 4324);
        Unite u2 = new Unite("Free", 198765432, 7865);
        System.out.println("\nInformation sur Amazon\n");
        System.out.println(u1.nom + " / " + u1.ca);
        System.out.println(")\nInformation sur Free\n");
        System.out.println(u2.nom + " / " + u2.ca);
        
    }
}
