

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LocationSelector {
    private static Map<String, String[]> DistrictsMap = new HashMap<>();
    private static Map<String, String[]> CityMap = new HashMap<>();

    LocationSelector() {
        String[] weston = {"Colombo", "Gampaha", "Kaluthara"};
        String[] central = {"Kandy", "Matale", "Nuwara Eliya"};
        String[] eastern = {"Ampara", "Batticaloa", "Trincomalee"};
        String[] northCentral = {"Anuradhapura", "Polonnaruwa"};
        String[] northWesternProvince = {"Kurunegala", "Puttalam"};
        String[] northernProvince = {"Jaffna", "Kilinochche", "Mannar", "Mullaitivu", "Vavuniya"};
        String[] sabaragamuwaProvince = {"Ratnapura", "Kegalle"};
        String[] southernProvince = {"Galle", "Hambantota", "Matara"};
        String[] uvaProvince = {"Badulla", "Moneragala"};

        DistrictsMap.put("Western Province", weston);
        DistrictsMap.put("Central Province", central);
        DistrictsMap.put("Eastern Province", eastern);
        DistrictsMap.put("North Central Province", northCentral);
        DistrictsMap.put("North Western Province", northWesternProvince);
        DistrictsMap.put("Northern Province", northernProvince);
        DistrictsMap.put("Sabaragamuwa Province", sabaragamuwaProvince);
        DistrictsMap.put("Southern Province", southernProvince);
        DistrictsMap.put("Uva Province", uvaProvince);
// Western Province
        String[] colombo = {"Colombo", "Dehiwala", "Homagama", "Kaduwela", "Kesbewa", "Kolonnawa", "Maharagama", "Moratuwa", "Padukka", "Ratmalana", "Avissawella", "Sri Jayawardenepura Kotte", "Thimbirigasyaya"};
        String[] gampaha = {"Attanagalla", "Biyagama", "Divulapitiya", "Dompe", "Gampaha", "Ja-Ela", "Katana", "Kelaniya", "Mahara", "Minuwangoda", "Mirigama", "Negombo", "Wattala"};
        String[] kaluthara = {"Agalawatta", "Bandaragama", "Beruwala", "Bulathsinhala", "Dodangoda", "Horana", "Ingiriya", "Kalutara", "Madurawela", "Matugama", "Millaniya", "Palindanuwara", "Panadura", "Walallavita"};
        CityMap.put("Colombo", colombo);
        CityMap.put("Gampaha", gampaha);
        CityMap.put("Kaluthara", kaluthara);
// Central Province
        String[] kandy = {"Akurana", "Delthota", "Doluwa", "Ganga Ihala Korale", "Harispattuwa", "Hatharaliyadda", "Gangawatakorale", "Kundasale", "Medadumbara - Teldeniya", "Minipe", "Panvila", "Pasbage Korale", "Pathadumbara", "Pathahewaheta", "Poojapitiya", "Thumpane", "Udapalatha", "Ududumbara", "Udunuwara", "Yatinuwara"};
        String[] mathale = {"Ambanganga Korale", "Dambulla", "Galewela", "Laggala-Pallegama", "Matale", "Naula", "Pallepola", "Rattota", "Ukuwela", "Wilgamuwa", "Yatawatta"};
        String[] nuwaraEliya = {"Ambagamuwa", "Hanguranketha", "Kothmale", "Nuwara Eliya", "Walapane"};
        CityMap.put("Kandy", kandy);
        CityMap.put("Matale", mathale);
        CityMap.put("Nuwara Eliya", nuwaraEliya);
//Eastern Province
        String[] ampara = {"Addalachchenai", "Akkaraipattu", "Alayadiwembu", "Ampara", "Damana", "Dehiattakandiya", "Eragama", "Kalmunai Muslim", "Kalmunai Tamil", "Karaitivu", "Lahugala", "Mahaoya", "Navithanveli", "Ninthavur", "Padiyathalawa", "Pothuvil", "Sainthamarathu", "Samanthurai", "Thirukkovil", "Uhana"};
        String[] batticaloa = {"Eravur Pattu", "Eravur Town", "Kattankudy", "Koralai Pattu", "Koralai Pattu Central", "Koralai Pattu North", "Koralai Pattu South", "Koralai Pattu West", "Manmunai North", "Manmunai Pattu", "Manmunai South West", "Manmunai West", "Porativu Pattu", ""};
        String[] trincomalee = {"Gomarankadawala", "Kantalai", "Kinniya", "Kuchchaveli", "Morawewa", "Muttur", "Padavi Sri Pura", "Seruvila", "Thambalagamuwa", "Trincomalee", "Verugal"};
        CityMap.put("Ampara", ampara);
        CityMap.put("Batticaloa", batticaloa);
        CityMap.put("Trincomalee", trincomalee);
//North Central Province
        String[] anuradhapura = {"Galnewa", "Galenbindunuwewa ", "Horowpothana", "Ipalogama", "Kahatagasdigiliya", "Kebithigollewa", "Kekirawa", "Mahavilachchiya", "Medawachchiya", "Mihinthale", "Nachchadoowa", "Nochchiyagama ", "Nuwaragam Palatha C", "Nuwaragam Palatha E", "Padaviya", "Palagala ", "Palugaswewa ", "Rajanganaya", "Rambewa", "Thalawa ", "Thambuttegama", "Thirappane"};
        String[] polonnaruwa = {"Dimbulagala", "Elahera", "Hingurakgoda", "Lankapura", "Medirigiriya", "Thamankaduwa", "Welikanda"};
        CityMap.put("Anuradhapura", anuradhapura);
        CityMap.put("Polonnaruwa", polonnaruwa);
//North Western Province
        String[] kurunagala = {"Alawwa", "Ambanpola", "Bamunakotuwa", "Bingiriya", "Ehetuwewa", "Galgamuwa", "Ganewatta", "Giribawa", "Ibbagamuwa", "Katupotha", "Kobeigane", "Kotavehera", "Kuliyapitiya E", "Kuliyapitiya W", "Kurunegala", "Mahawa", "Mallawapitiya", "Maspotha", "Mawathagama", "Narammala", "Nikaweratiya", "Panduwasnuwara", "Pannala", "Polgahawela", "Polpithigama", "Rasnayakapura", "Rideegama", "Udubaddawa", "Wariyapola", "Weerambugedara"};
        String[] puttalam = {"Anamaduwa", "Arachchikattuwa", "Chilaw", "Dankotuwa", "Kalpitiya", "Karuwalagaswewa", "Madampe", "Mahakumbukkadawala", "Mahawewa", "Mundalama", "Pallama", "Puttalam", "Vanathavilluwa", "Wennappuwa"};
        CityMap.put("Kurunegala", kurunagala);
        CityMap.put("Puttalam", puttalam);
//Northern Province
        String[] jaffna = {"Delft", "Island North", "Island South", "Jaffna", "Karainagar", "Nallur", "Thenmaradchi", "Vadamaradchi East", "Vadamaradchi North", "Vadamaradchi South-West", "Valikamam East", "Valikamam North", "Valikamam South", "Valikamam South-West", "Valikamam West"};
        String[] kilinochche = {"Kandavalai", "Karachchi", "Pachchilaipalli", "Poonakary"};
        String[] mannar = {"Madhu", "Mannar", "Manthai West", "Musalai", "Nanaddan"};
        String[] mullaitivu = {"Manthai East", "Maritimepattu", "Oddusuddan", "Puthukudiyiruppu", "Thunukkai", "Welioya"};
        String[] vavuniya = {"Vavuniya", "Vavuniya North", "Vavuniya South", "Vengalacheddikulam"};
        CityMap.put("Jaffna", jaffna);
        CityMap.put("Kilinochche", kilinochche);
        CityMap.put("Mannar", mannar);
        CityMap.put("Mullaitivu", mullaitivu);
        CityMap.put("Vavuniya", vavuniya);
//Sabaragamuwa Province
        String[] kegalle = {"Aranayaka", "Bulathkohupitiya", "Dehiovita", "Deraniyagala", "Galigamuwa", "Kegalle", "Mawanella", "Rambukkana", "Ruwanwella", "Warakapola", "Yatiyantho"};
        String[] ratnapura = {"Ayagama", "Balangoda", "Eheliyagoda", "Elapattha", "Embilipitiya", "Godakawela", "Imbulpe", "Kahawatta", "Kalawana", "Kiriella", "Kolonna", "Kuruvita", "Nivithigala", "Opanayaka", "Pelmadulla", "Ratnapura", "Weligepola"};
        CityMap.put("Ratnapura", ratnapura);
        CityMap.put("Kegalle", kegalle);
//Southern Province
        String[] galle = {"Akmeemana", "Ambalangoda", "Baddegama", "Balapitiya", "Benthota", "Bope-Poddala", "Elpitiya", "Galle", "Gonapinuwala", "Habaraduwa", "Hikkaduwa", "Imaduwa", "Karandeniya", "Nagoda", "Neluwa", "Niyagama", "Thawalama", "Welivitiya-Divithura", "Yakkalamulla"};
        String[] hambantota = {"Ambalantota", "Angunakolapelessa", "Beliatta", "Hambantota", "Katuwana", "Lunugamvehera", "Okewela", "Sooriyawewa", "Tangalle", "Thissamaharama", "Walasmulla", "Weeraketiya"};
        String[] matara = {"Akuressa", "Athuraliya", "Devinuwara", "Dickwella", "Hakmana", "Kamburupitiya", "Kirinda Puhulwella", "Kotapola", "Malimbada", "Matara", "Mulatiyana", "Pasgoda", "Pitabeddara", "Thihagoda", "Weligama", "Welipitiya"};
        CityMap.put("Galle", galle);
        CityMap.put("Hambantota", hambantota);
        CityMap.put("Matara", matara);

//Uva Province

        String[] badulla = {"Badulla", "Bandarawela", "Ella", "Haldummulla", "Hali-Ela", "Haputale", "Kandaketiya", "Lunugala", "Mahiyanganaya", "Meegahakivula", "Passara", "Rideemaliyadda", "Soranathota", "Uva-Paranagama", "Welimada"};
        String[] moneragala = {"Badalkumbura", "Bibile", "Buttala", "Katharagama", "Madulla", "Medagama", "Moneragala", "Sevanagala", "Siyambalanduwa", "Thanamalvila", "Wellawaya"};
        CityMap.put("Moneragala", moneragala);

    }

    public ArrayList<String> getAllProvince() {
        Set<String> strings = DistrictsMap.keySet();
        return new ArrayList<>(strings);
//        return ProvinceList;
    }

    public ArrayList<String> getDistrictByProvince(String province) {
        ArrayList<String> districtList = new ArrayList<>();
        String[] district = DistrictsMap.get(province);
        assert district != null;
        if (district.length != 0) {
            districtList.addAll(Arrays.asList(district));
        }
        return districtList;
    }

    public ArrayList<String> getCityByDistrict(String district) {
        ArrayList<String> citys = new ArrayList<>();
        String[] strings = CityMap.get(district);
        citys.addAll(Arrays.asList(strings));

        return citys;
    }
}
