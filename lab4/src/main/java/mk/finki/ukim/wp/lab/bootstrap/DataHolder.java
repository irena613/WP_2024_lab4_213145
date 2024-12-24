//package mk.finki.ukim.wp.lab.bootstrap;
//
//import jakarta.annotation.PostConstruct;
//import mk.finki.ukim.wp.lab.model.User;
//import mk.finki.ukim.wp.lab.model.enumeration.Role;
//import mk.finki.ukim.wp.lab.repository.jpa.UserRepository;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class DataHolder {
//
//    public static List<User> users = null;
//
//
//    private final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;
//
//
//    public DataHolder(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//
//    @PostConstruct
//    public void init() {
//        users = new ArrayList<>();
//        if (this.userRepository.count() == 0) {
//            users.add(new User("irena", passwordEncoder.encode("bts"), "Irena", "Latinovska", Role.ROLE_USER));
//            users.add(new User("admin", passwordEncoder.encode("admin"), "admin", "admin", Role.ROLE_ADMIN));
//            this.userRepository.saveAll(users);
//        }
//    }
//
//};
//
//
////    public static List<Artist> artistList;
////    public static List<Song> songs;
////    public static List<Album> albums;
////
////    private final SongRepository songRepository;
////    private final ArtistRepository artistRepository;
////    private final AlbumRepository albumRepository;
////
////    public DataHolder(SongRepository songRepository, ArtistRepository artistRepository, AlbumRepository albumRepository) {
////        this.songRepository = songRepository;
////        this.artistRepository = artistRepository;
////        this.albumRepository = albumRepository;
////    }
////
////
////    @PostConstruct
////    public void init() {
////        artistList = new ArrayList<>();
////        artistList.add(new Artist("Namjoon", "Kim", "returning in 219 days"));
////        artistList.add(new Artist("Seokjin", "Kim", "ALREADY BACK!!"));
////        artistList.add(new Artist("Yoongi", "Min", "returning in 230 days"));
////        artistList.add(new Artist("Hoseok", "Jung", "ALREADY BACK!!"));
////        artistList.add(new Artist("Jimin", "Park", "returning in 220 days"));
////        artistList.add(new Artist("Taehyung", "Kim", "returning in 219 days"));
////        artistList.add(new Artist("Jungkook", "Jeon", "returning in 220 days"));
////
////        if (this.artistRepository.count() == 0) {
////            this.artistRepository.saveAll(artistList);
////        }
////
////        List<Artist> performer1 = new ArrayList<>();
////        performer1.add(artistList.get(0));
////
////        List<Artist> performer2 = new ArrayList<>();
////        performer2.add(artistList.get(1));
////
////        List<Artist> performer3 = new ArrayList<>();
////        performer3.add(artistList.get(2));
////
////        List<Artist> performer4 = new ArrayList<>();
////        performer4.add(artistList.get(3));
////
////        List<Artist> performer5 = new ArrayList<>();
////        performer5.add(artistList.get(4));
////
////        List<Artist> performer6 = new ArrayList<>();
////        performer6.add(artistList.get(5));
////
////        List<Artist> performer7 = new ArrayList<>();
////        performer7.add(artistList.get(6));
////
////        songs = new ArrayList<>();
////        songs.add(new Song("LOST", "HipHop", 2024, performer1));
////        songs.add(new Song("I'll be there", "Pop", 2024, performer2));
////        songs.add(new Song("Haegeum", "Rap", 2023, performer3));
////        songs.add(new Song("Neuron", "HipHop", 2024, performer4));
////        songs.add(new Song("Who", "Pop", 2024, performer5));
////        songs.add(new Song("Rainy Days", "R&B", 2023, performer6));
////        songs.add(new Song("Standing next to you", "Pop", 2023, performer7));
////
////
////        albums=new ArrayList<>();
////
////        albums.add(new Album("Right Place, Wrong Person", "HipHop", "2024"));
////        albums.add(new Album("Happy", "Pop", "2024"));
////        albums.add(new Album("D-Day", "Rap", "2023"));
////        albums.add(new Album("Hope On The Street", "HipHop", "2023"));
////        albums.add(new Album("Muse", "Park", "2024"));
////        albums.add(new Album("Layover", "R&B", "2023"));
////        albums.add(new Album("Golden", "Pop", "2023"));
////
////        if (this.albumRepository.count() == 0) {
////            this.albumRepository.saveAll(albums);
////        }
////
////
////        for (int i = 0; i < songs.size(); i++) {
////            songs.get(i).setAlbum(albums.get(i));
////        }
////
////
////        if (this.songRepository.count() == 0) {
////            this.songRepository.saveAll(songs);
////        }
////    }
//
////};
