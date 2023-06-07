package Lesen16;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       Peson pesonFromApi = PesonApi.getPesonFromApi();
        System.out.println(pesonFromApi);
        System.out.println(System.getProperty("java.home"));
    }
}
//       List<Peson> pesonsFromApi = PesonApi.getPersonFroApi(5);
//
//
//       for (Peson peson:pesonsFromApi){
//        System.out.println(peson);
//    }
//
//
//    }
//}
