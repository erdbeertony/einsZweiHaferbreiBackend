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

        Trip t6  =new Trip(
                "Panzerfahren",
                "Beschuss inkl.",
                "https://assets.deutschlandfunk.de/0b222cb2-f10b-4dc9-a6f4-8436509e75d4/1920x1080.jpg?t=1647878364881"
        );

        Trip t7  =new Trip(
                "Workshop Granaten selbst basteln",
                "Für ein Feuerwerk nach eigenem Gusto",
                "https://www.mega-waffen-softair-shop.de/media/image/2f/6b/7d/SoftairGranaten.jpg"
        );

        Trip t8 = new Trip(
                "Free Solo",
                "Für den ultimativen Kick klettern wir heute mal ohne lästige Sicherheitsgurte",
                "https://www.globetrotter.de/magazin/wp-content/uploads/sites/2/2020/03/FreeSolo_11_wm.jpg"
        );

        Trip t9 = new Trip(
                "Stierkampf",
                "Lust, einmal ein Held zu sein?",
                "https://www.rnd.de/resizer/wKHQ4yUanU39oMOel0GYbvy33rw=/894x503/filters:quality(70):format(webp)/cloudfront-eu-central-1.images.arcpublishing.com/madsack/LHKXJZN3YNGA7A2I4YDFWXKPSQ.jpg"
        );

        Trip t10 = new Trip(
                "Bore-Out",
                "Überstehen Sie die mentale Belastung eines Tags des absoluten Nichtstuns? Dem einen oder anderen gruselt's dabei...",
                "https://oeffentlichespersonal.ch/wp-content/uploads/Mann-gelangweilt-zvinfo-juni-2019-1-1024x576.jpg"
        );

        return List.of(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }
}
