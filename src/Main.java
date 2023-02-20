public class Main {
    public static void main(String[] args) {


        PersonOfFamily personOfFamily = new PersonOfFamily("Sadyk Sadyrov", "dad", 35);
        PersonOfFamily personOfFamily1 = new PersonOfFamily("Sabira Sadykova", "mom", 33);
        PersonOfFamily personOfFamily2 = new PersonOfFamily("Samat Sadyrov ", "son", 15);
        PersonOfFamily personOfFamily3 = new PersonOfFamily("Salamat Sadyrov", "dad", 13);
        PersonOfFamily personOfFamily4 = new PersonOfFamily("Saikal Sadyrova", "dad", 10);

        PersonOfFamily[] familyWhoLivesInHome = {personOfFamily, personOfFamily1, personOfFamily2, personOfFamily3, personOfFamily4};

        Home home = new Home(familyWhoLivesInHome);
        System.out.println(home.toString());
        PersonOfFamily personOfFamily5 = new PersonOfFamily("Marat Mararatov ", "dad", 40);
        PersonOfFamily personOfFamily6 = new PersonOfFamily("Meerim  Maratova ", "mom", 38);
        PersonOfFamily personOfFamily7 = new PersonOfFamily("Minura  Maratova ", "son", 17);
        PersonOfFamily[] familyWhoLivesInApartmant = {personOfFamily5, personOfFamily6, personOfFamily7};
        ApartmentAndMotel apartmentAndMotel = new ApartmentAndMotel(familyWhoLivesInApartmant);
        System.out.println(apartmentAndMotel.toString());

        PersonOfFamily personOfFamily8 = new PersonOfFamily("Bob Bob", "dad", 30);
        PersonOfFamily personOfFamily9 = new PersonOfFamily("Julia julia", "mom", 29);
        PersonOfFamily[] familyWholivesInHotel = {personOfFamily8, personOfFamily9};


        Hotel hotel = new Hotel(familyWholivesInHotel);

        System.out.println(hotel.toString());


    }
}