package org.sbgrt.einszweihaferbrei.service;

import org.sbgrt.einszweihaferbrei.model.Trip;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {
    public List<Trip> getAllTrips() {
        Trip t1 = new Trip(
                "Bungee-Jumping",
                "Ein unvergessliches Event mit Nervenkitzel",
                "https://www.urlaubstracker.de/wp-content/uploads/2017/07/bungee-jump-ausblick.jpg"
        );

        Trip t2 = new Trip(
                "Protest in China mitmachen",
                "Tauchen Sie ein in eine Abenteuerwelt ohne Rückkehrgarantie",
                "https://media1.faz.net/ppmedia/aktuell/feuilleton/1220981924/1.8493717/format_top1_breit/demonstranten-in-peking.jpg"
        );

        Trip t3  =new Trip(
                "SpaceX Economy Light Trip",
                "Weltraumtrip zu ALDI-Preisen dank Reduzierung auf minimale Sicherheitsstandards",
                "https://www.golem.de/2001/146124-219790-219789_rc.jpg"
        );

        Trip t4  =new Trip(
                "Houserunning",
                "Heute schon kalte Füße bekommen?",
                "https://ais.badische-zeitung.de/piece/05/34/7c/5b/87325787-h-720.jpg"
        );

        Trip t5  =new Trip(
                "Fillschirmsprung no-tandem",
                "Sie haben Lust auf einen Fallschirmsprung, aber keine Lust auf die Sicherung durch einen Tandemmaster?",
                "https://funsport.pro/images/luftsport/skydive3.jpg"
        );

//        Trip t5  =new Trip(
//                "",
//                "",
//                ""
//        );
//
//        Trip t5  =new Trip(
//                "",
//                "",
//                ""
//        );
//
//        Trip t5  =new Trip(
//                "",
//                "",
//                ""
//        );
//
//        Trip t5  =new Trip(
//                "",
//                "",
//                ""
//        );
//
//        Trip t5  =new Trip(
//                "",
//                "",
//                ""
//        );

        return List.of(t1, t2, t3, t4, t5);
    }
}
