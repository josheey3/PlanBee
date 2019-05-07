package com.scrum.plan.planbee;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.TimeZone;

public class EventCollection {


    private ArrayList<Event> events;

    public EventCollection() {
        events = new ArrayList<Event>();
    }

    public void generateEvents() {
                events.add(new Event("BPI Group Meeting",
                        "1pm May 3rd",
                        1556888400000L,
                        "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                        "Bob Green",
                        new Group(0, "BPI group"),
                        new Attendees(0, new String[]{"Daphne Guion", "Cher Dawney", "Nicoli Longmire", "Arlyne Itter", "Baily Lumly", "Bear Andrzejewski", "Sabra Please"}),
                        "The group meets",
                        R.drawable.chat_bpi,
                        0));
                events.add(new Event("Drinks with the bois",
                        "9pm May 3rd",
                        1556917200000L,
                        "Frankenstien Pub, Reading, R31 2XQ",
                        "Marry Shelley",
                        new Group(1, "Chat 5"),
                        new Attendees(1, new String[]{"Lian Knott", "Arlette Pringle", "Abdel McKintosh", "Bastien Harrison", "Alana Crosscombe", "Hazel Knee", "Ulrike Littleproud", "Nananne Dobby", "Leyla Brame", "Raye Mussared"}),
                        "Just trialing something out so bear with",
                        R.drawable.chat_default,
                        1));
                events.add(new Event("Band rehearsal",
                        "2pm May 4th",
                        1556978400000L,
                        "Music room, Middlesbrough University, Middlesbrough, TS4 3JS",
                        "Rachel Brown",
                        new Group(2, "The instruments"),
                        new Attendees(2, new String[]{"Rhonda O'Connor", "Cecilia Breslin", "Paolina Preedy", "Griz De Ruggero", "Lucina Paur", "Maryanna Edmondson", "Findley Huntar", "Latrina Greatland", "Jard Jura", "Gearalt Julyan"}),
                        "Marmelading at its best",
                        R.drawable.chat_trumpet,
                        2));
                events.add(new Event("Scrum 4 Due",
                        "12pm May 7th",
                        1557187200000L,
                        "Brightspace",
                        "Mitchell Covern",
                        new Group(3, "Scrummers"),
                        new Attendees(3, new String[]{"Sayre Prantoni", "Briggs Totton", "Cullie Handrock", "Tait Liddon", "Ruthi Rushbrook", "Werner Cowpertwait", "Krista Daltry", "Erinna Castille", "Gardner Cockburn", "Odilia Stolze"}),
                        "Things get real",
                        R.drawable.chat_scrum,
                        3));
                events.add(new Event("Cinema",
                        "7pm May 8th",
                        1557342000000L,
                        "Odean, 2 Manor Road, Leeds, LS18 4DX",
                        "Dave Powers",
                        new Group(4, "Cinema crew"),
                        new Attendees(4, new String[]{"Jeremie Malitrott", "Ezechiel McAndie", "Nanete Fenich", "Rochelle Fowgies", "Herrick Kipping", "Marcela Hessel"}),
                        "Bring popcorn - or don't because you're not allowed to.",
                        R.drawable.chat_cinema,
                        4));
                events.add(new Event("Climbing",
                        "5pm May 15th",
                        1557939600000L,
                        "The Project, 3 Cameron St, Glasgow, G52 4JH",
                        "Climber co",
                        new Group(5, "BU Climbing Club"),
                        new Attendees(5, new String[]{"Cris Malling", "Willyt Colston", "Kira Zanussii", "Ainslee Blundell", "Morgen Sarchwell", "Adrianne Whinray", "Dennie Tison", "Monti Walburn", "Maurise Chugg", "Kacy Lobe", "Angela Sidle", "Corrie Baggs", "Fraser Clemmett", "Panchito Cornwall", "Alica Waything", "Nefen Gouldstone", "Norby Beltzner", "Nissie Hollingshead", "Tamar Bednall", "Appolonia Pygott", "Datha De Beauchemp"}),
                        "We get high",
                        R.drawable.chat_climbing,
                        5));
                events.add(new Event("Paint balling",
                        "1pm May 22nd",
                        1558530000000L,
                        "BU Paintball,8 Burleigh Rd, Ringwood, BU2 4NH",
                        "BU Paintball",
                        new Group(6, "Paint balling"),
                        new Attendees(6, new String[]{"Derril Jan", "Trenton Livingstone", "Steve Collison", "Lilian Dennerly", "Eilis Pooley", "Roderich Rembrandt", "Carolina Hubbert", "Saxon Beamont", "Carey Tuffrey"}),
                        "We shoot people",
                        R.drawable.chat_paintballing,
                        6));
                events.add(new Event("D&D",
                        "8pm May 23rd",
                        1558641600000L,
                        "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                        "Jonno Clarke",
                        new Group(7, "Board game cafe"),
                        new Attendees(7, new String[]{"Alanah Eggleson", "Kally Faier", "Stephenie Blench", "Merl Doudney", "Goldie Paulus", "Vic Zanassi", "Car Reeks", "Guinevere Boots", "Hermie Trudgion", "Millicent Hanley", "Zorah Casson"}),
                        "Playing dungeons.",
                        R.drawable.chat_board_game,
                        7));
                events.add(new Event("BU Guest Lecture",
                        "11am May 25th",
                        1558782000000L,
                        "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                        "Gernut Leechen",
                        new Group(8, "Bournemouth University"),
                        new Attendees(8, new String[]{"Willdon Moncreiffe", "Edik Trevor", "Evaleen Matthieson", "Germaine Brislawn", "Virgie Dudbridge", "Zacherie Rawstron", "Belicia Casewell", "Fanya Poltone", "Bertrando Phant", "Margeaux Bridywater", "Ivor Eakle", "Minnie Josefovic", "Monro Sired", "Ann-marie Arrighi", "Arline Gregon", "Alexandra Budleigh", "Wendall Pheby", "Twila Keeffe", "Barbee Cheeseman", "Miltie Gehring", "Bruno Ducker", "Bridgette McGillecole", "Vern Fasset", "Brandi Crab", "Dara McGreal", "Clywd Pennell", "Lev Aughton"}),
                        "Someguy from somewhere is talking about something.",
                        R.drawable.chat_bu,
                        8));
                events.add(new Event("Team meeting",
                        "1:30pm March 29th",
                        1553866200000L,
                        "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                        "Jack Cleary",
                        new Group(9, "Neam Tame"),
                        new Attendees(9, new String[]{"Zeb Tremmil", "Cullan Berry", "Ramonda Cornfield", "Junina Copin", "Carleen Coite", "Albertina Willishire", "Conney Di Baudi", "Nanny Pither", "Silvanus Challender", "Tabor Bridgland"}),
                        "We meet, we eat, we greet, we take a seat, it's pretty neat.",
                        R.drawable.chat_11,
                        9));
                events.add(new Event("Toy Story 4",
                        "7pm March 29th",
                        155388600000L,
                        "Odean, 2 Manor Road, Leeds, LS18 4DX",
                        "Dave Powers",
                        new Group(4, "Cinema crew"),
                        new Attendees(10, new String[]{"Herrick Kipping", "Marcela Hessel", "Ezechiel McAndie", "Nanete Fenich"}),
                        "Toy story 3 ++",
                        R.drawable.toy_story_4_icon,
                        10));
                events.add(new Event("Reading Festival",
                        "2pm August 23rd",
                        1566568800000L,
                        "Richfield Avenue, Reading",
                        "Nick Rhymes",
                        new Group(10, "inFest"),
                        new Attendees(11, new String[]{"Sonni Kernes", "Christi Harses", "Helenka Durnian", "Brigitte Sandbatch", "Kylie Baigrie", "Izaak McIlenna", "Shelbi Kingsmill", "Ambur Haseley", "Oralee Dibden", "Anderea Azam", "Breanne Hodinton", "Abraham Freckelton", "Johnette Drayn", "Cordi Holbury", "Aldric Bonifant", "Pembroke Dunsmuir", "Tierney Tinniswood", "Tirrell Bruggeman", "Gisela Cluely", "Brock Auld", "Liva Langmaid"}),
                        "Drinking, smoking, drinking. It's gonna be lit!",
                        R.drawable.reading_festival_icon,
                        11));
                events.add(new Event("Bournemouth FC",
                        "7pm March 30th",
                        1553972400000L,
                        "Vitality Stadium, Bournemouth BH7 7AF",
                        "Andy Seb",
                        new Group(11, "The Lads"),
                        new Attendees(12, new String[]{"Andra Gartrell", "Alberik Lusher", "Bowie Gregolin", "Rouvin Andrejevic", "Peter Brumby", "Gavin Flight", "Eddie Colam", "Jedd De Pero", "Madelyn Stonary", "Trenton Ewestace", "Caleb O'Murtagh", "Morten Crump", "Lowrance Awde", "Faegan Corre", "Amal Paolicchi", "Neil McCready", "Danell Hainey", "Corin Nettleship", "Adam Macallam", "Jaspar Shoute", "Bill Logg", "Graham Paunton", "Adrienne Maffulli"}),
                        "Cherries destroy their bitter rivals - ants.",
                        R.drawable.bournemouth_fc_logo,
                        12));
                events.add(new Event("Basketball",
                        "7pm April 6th",
                        1554577200000L,
                        "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                        "Jace Mendez",
                        new Group(12, "BasketTroll"),
                        new Attendees(13, new String[]{"Rivi Georgi", "Elijah Fishley", "Cristobal Ahern", "Emelda Lyptrit", "Hercules Law", "Drew Featherston", "Dot Battill", "Berta Caress", "Guthrey Pilsworth", "Heath Lyes", "Briny Eggleson"}),
                        "An open game of basketball for anyone that's rad enough!",
                        R.drawable.basketball_icon,
                        13));
                events.add(new Event("Board game cafe",
                        "8pm April 7th",
                        1554667200000L,
                        "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                        "Jonno Clarke",
                        new Group(7, "Board game cafe"),
                        new Attendees(14, new String[]{"Alanah Eggleson", "Kally Faier", "Stephenie Blench", "Merl Doudney", "Goldie Paulus", "Vic Zanassi", "Car Reeks", "Guinevere Boots", "Hermie Trudgion", "Millicent Hanley", "Zorah Casson"}),
                        "We meet again.",
                        R.drawable.board_game_cafe_icon,
                        14));
                events.add(new Event("Sand sculpture festival",
                        "10am June 7th",
                        1557223200000L,
                        "Bournemouth Beach, Bournemouth, BH2 5AA",
                        "Jace Mendez",
                        new Group(13, "Sandtas"),
                        new Attendees(15, new String[]{"Birgit Wenger", "Anthe Peniello", "Heath Casbolt", "Cleavland Turbat", "Lindi Crosio", "Yvonne Kienle", "Josephine Adlington", "Pavlov Jonuzi", "Lynnett Balffye", "Aguste Obey", "Josiah Andreas", "Chrisse Van Niekerk", "Idelle Brazer", "Bev Challens", "Jeffy Joriot", "Estrella Walburn", "Sella Fritche", "Rodney Mountain", "Sheilah Larver", "Desiree Loyley", "Storm Arnold", "Saundra Djurdjevic", "Ari Barthelemy", "Melody Fateley", "Gertrudis Benn", "Madelina Hamill", "Karisa Baise", "Leese Force", "Lynelle Maryott", "Silvan Ducket", "Donna Scothern", "Kessia Lilion", "Whitman Gebby", "Correy Filippov", "Davin Holstein", "Shandra Thornally", "Vail Stangroom", "Horacio Adelman", "Archambault Clem", "Jayme Bertelmot", "Colas Lindholm", "Dory Stendall"}),
                        "An oppertunity for anyone to showcase their artistic brilliance. Bring out the inner child!",
                        R.drawable.sand_sculpture_logo,
                        15));
                events.add(new Event("Litter pick",
                        "12pm April 8th",
                        1555258016000L,
                        "Bournemouth Beach, Bournemouth, BH2 5AA",
                        "Ken Batchelder",
                        new Group(15, "Pick world"),
                        new Attendees(16, new String[]{"Ken Batchelder", "Murdock Malling", "Marion Cordoba", "Sid Matzeitis", "Crystal Cumberpatch", "Willette Blanche", "Dru Yanez", "Christy Gaggen", "Finley Hartin", "Baxie Caulcott", "Marve Azemar", "Shannah Weight", "Ranice Leslie", "Tomasine Vaughn", "Davey Fido", "Vasily Casebourne", "Jud Trow", "Janetta Meriet", "Kristin Sporle", "Friedrick Merrywether", "Kele Eastway", "Laurella Gilcrist", "Catharine Slocket", "Arel Dymond"}),
                        "We're gonna clean up this place!",
                        R.drawable.litter,
                        16));
                events.add(new Event("Avartar 2",
                        "7pm April 8th",
                        1554750000000L,
                        "Odean, 2 Manor Road, Leeds, LS18 4DX",
                        "Jeremie Malitrott",
                        new Group(4, "Cinema crew"),
                        new Attendees(17, new String[]{"Ezechiel McAndie", "Jeremie Malitrott", "Nanete Fenich"}),
                        "Bring popcorn - or don't because you're not allowed to.",
                        R.drawable.avatar,
                        17));
                events.add(new Event("Writing Club",
                        "8am April 12th",
                        1555056000000L,
                        "Library, Talbot Campus, Fern Barrow, Poole BH12 5BB",
                        "Melesa Walklott",
                        new Group(16, "Writing Club"),
                        new Attendees(18, new String[]{"Melesa Walklott", "Randal Scrigmour", "Anatole Thandi", "Tammara Blas", "Garret Rillstone", "Lianne Gorman"}),
                        "We write. We review. We dream.",
                        R.drawable.write,
                        18));
                events.add(new Event("TED Talk BU",
                        "11am April 12th",
                        1555066800000L,
                        "LEES, Talbot Campus, Fern Barrow, Poole BH12 5BB",
                        "Antony Cables",
                        new Group(17, "TED BU April 12th"),
                        new Attendees(19, new String[]{"Lindi Crosio", "Nanete Fenich", "Kessia Lilion", "Chrisse Van Niekerk", "Melody Fateley", "Shandra Thornally", "Janetta Meriet", "Lynnett Balffye", "Willette Blanche", "Estrella Walburn", "Arel Dymond", "Archambault Clem", "Finley Hartin", "Jeffy Joriot", "Kristin Sporle", "Marve Azemar", "Rochelle Fowgies", "Colas Lindholm", "Baxie Caulcott", "Marion Cordoba"}),
                        "Award winning researcher in apathetic philantropic particles discusses how advancements the mysterious midi-chlorians " +
                                "could lead to the harnessing of the Force in under two generations!.",
                        R.drawable.ted,
                        19));
                events.add(new Event("Cocktail making",
                        "9pm April 12th",
                        1555102800000L,
                        "Dylans, Talbot Campus, Fern Barrow, Poole BH12 5BB",
                        "Ashil Chant",
                        new Group(18, "Cocktail Concoctioners"),
                        new Attendees(20, new String[]{"Jessie Camps", "Biron Yashin", "Ashil Chant", "Tabb McMeanma", "Kaspar Josefsen", "Marlon Hutchcraft"}),
                        "Award winning researcher in apathetic philantropic particles discusses how advancements the mysterious midi-chlorians " +
                                "could lead to the harnessing of the Force in under two generations!.",
                        R.drawable.cocktail,
                        20));
                events.add(new Event("Pie eating contest",
                        "9pm April 12th",
                        1555102800000L,
                        "Dylans, Talbot Campus, Fern Barrow, Poole BH12 5BB",
                        "Park Pudner",
                        new Group(19, "Pie Contestants"),
                        new Attendees(21, new String[]{"Chaim Duchesne", "Park Pudner", "Leisha Gobolos", "Ebenezer Flacknoe", "Edith Croan", "Anabelle Challin", "Kele Eastway", "Salem Sprouls", "Nikolos Locksley", "Aarika Girvin", "Arni Poyzer", "Gonzales Poxson", "Dorice Kristoffersson", "Gregor Greatreax", "Beverley Galle"}),
                        "The winner pies everyone else off.",
                        R.drawable.pie,
                        21));
                events.add(new Event("BU Beach party",
                        "10am July 12th",
                        1562925600L,
                        "Bournemouth Beach, Bournemouth, BH2 5AA",
                        "Niki Janda",
                        new Group(20, "Bournemouth University"),
                        new Attendees(22, new String[]{"Fran Ricketts", "Marcie Izakson", "Celinka Silverthorne", "Adelina McFadden", "Ilyssa Novichenko", "Hedi Brimson", "Janeen Saward", "Cristabel Petschel", "Yvonne Lathwell", "Jamill McClay", "Madella Lesaunier", "Leicester Rustich", "Verina Leifer", "Kate Vincent", "Gertrudis Durn", "Laurena Joslin", "Corny Drennan", "Alexandre Struttman", "Brunhilde Werrilow", "Niki Janda", "Carlota Wheater", "Elysee Carpe", "Bendix Dixey", "Florie McArtan", "Amara Dishman", "Antonietta Brooking", "Noland Fowle", "Nico Coverdill", "Dylan Shetliff", "Nowell Cork", "Harrison Twentyman", "Dickie Castillon", "Curcio George", "Nicko Achrameev", "Matti Klement", "Arv Greensitt", "Perrine Wooff", "Bone Likely", "Peria Hallwood", "Bonni Presser", "Maddie Prickett", "Ailsun Wolford", "Sherri Deinhardt", "Cchaddie Ancell", "Dene Winson", "Laurella Gilcrist", "Marion Cordoba", "Katinka Libbie", "Hershel Bosket", "Constancy Summerlee", "Hadlee Jovic", "Sonnie Fooks", "Sheree Iacobetto", "Seumas Druhan", "Emmie Feander", "Bale Sprason", "Elwyn Sergison", "Melissa Evered", "Karil Elvin", "Ricardo Ambrozewicz", "Korey Dillingston", "Hymie Worner", "Margette Le Floch", "Spense Shercliff", "Dalenna Birch", "Charline Masham", "Nicolea Van der Hoeven", "Carmel Masterman", "Emelita Singleton", "Humbert Ruddiman", "Hiram Chamney", "Aundrea Scramage", "Sondra Brear", "Amabel Routham", "Leann Fernyhough", "Kent Comelini", "Cherin Bracken", "Jedediah Tyres", "Catherin Whiteland", "Alene Shorto", "Massimiliano Storey", "Therine Cornewell", "Angele Tippell", "Jerad Salter", "Biron Valens-Smith", "Griz Cuseick", "Catharine Slocket", "Sawyere Lusgdin", "Des Oran", "Elisabetta McJarrow", "Vance Marr", "Brianne Goadby", "Jojo Cleminshaw", "Drona Pedden", "Pauli Summerhayes", "Lettie Hocking", "Peta Faire", "Del Noell", "Joelie Mattia", "Kelcy Francklyn"}),
                        "An all day and all night beach party for the epic",
                        R.drawable.beach
                        , 22
                ));
                events.add(new Event("BU Church",
                        "9pm April 13th",
                        1555182000000L,
                        "Lansdowne Rd, Bournemouth BH1 1SB",
                        "Kaspar Josefsen",
                        new Group(21, "Christian Union BU"),
                        new Attendees(23, new String[]{"Sheree Iacobetto", "Hershel Bosket", "Rodd Hutt", "Dore Wrettum", "Torrence Bretherick", "Travis Estick", "Kaspar Josefsen", "Barbette Popworth", "Zelig Stockill", "Prescott Figliovanni", "Kean McGrane", "Salomi Gerriet", "Ruth Colliss", "Aurlie Tansly", "Arlen Brecher", "Winny Madge", "Ardyce Sarvar", "Humbert Ruddiman", "Kerrie McCarthy", "Hailey McGeechan", "Benedick Mechan", "Hermann Pattle", "Robbyn Mandeville", "Faun Ludee", "Alberto McGinty", "Loydie Maffione"}),
                        "The CU meet up at lansdowne for some worship and fellowship.",
                        R.drawable.church
                        , 23
                ));
                events.add(new Event("Library reading",
                        "5pm April 14th",
                        1555261200000L,
                        "Library, Talbot Campus, Fern Barrow, Poole BH12 5BB",
                        "Leann Fernyhough",
                        new Group(22, "BU Reading Society"),
                        new Attendees(24, new String[]{"Bentlee Bellchamber", "Leann Fernyhough", "Guglielma Quaintance", "Tim Trevna", "Chrotoem Bouette", "Keelby Rosenhaupt", "Tiffani Sollowaye", "Bernadene Coventry"}),
                        "We read aloud. Why? Because we're allowed.",
                        R.drawable.library
                        , 24
                ));
                events.add(new Event("Bloom",
                        "10am April 15th",
                        1555322400000L,
                        "Bournemouth Parks - Lower Gardens, Westover Road, Bournemouth BH2 5AH",
                        "Eolanda Hawkshaw",
                        new Group(23, "Bournemouth Gardeners"),
                        new Attendees(25, new String[]{"Georgianne Loudiane", "Jessica Blazek", "Vasily Casebourne", "Alon Duligal", "Eolanda Hawkshaw", "Ferdinand Espina", "Flory Lambersen", "Herbert Yellowlees", "Zenia Gritskov", "Hal De Miranda", "Juieta Tiptaft", "Meryl Westrey"}),
                        "Clematis's and Rohededemdroms bloom",
                        R.drawable.bloom
                        , 25
                ));
                events.add(new Event("BU Surf club",
                        "10am April 20th",
                        1555754400000L,
                        "Bournemouth Beach, Bournemouth, BH2 5AA",
                        "Dru Yanez",
                        new Group(24, "BU Surf club"),
                        new Attendees(26, new String[]{"Darryl Burnett", "Dru Yanez", "Hortense Billyard", "Mirabel Gavrielly", "Florie McArtan", "Ellen Louiset", "Caryl Beany", "Jobyna Vondrak", "Alejandro Bengal", "Arel Dymond", "Uriah Freebury", "Margarette Joannidi", "Sid Matzeitis", "Emilee Durman", "Alberto McGinty"}),
                        "Beginners welcome",
                        R.drawable.surf
                        , 26
                ));
                events.add(new Event("Red arrows",
                        "3pm April 20th",
                        1555772400000L,
                        "Bournemouth, BH1 3DU",
                        "Kathrine Dusting",
                        new Group(25, "Red Arrows Historical Group"),
                        new Attendees(27, new String[]{"Shermy Franck", "Maurise Potticary", "Kathrine Dusting", "Emilee Durman", "Patsy Ryall", "Ynes Greger", "Florance Rolley", "Eadmund Quartermaine", "Twyla Rioch", "Egan Jarlmann", "Zenia Gritskov", "Gretchen Cannaway", "Waylin Rayson", "Kris Nerney", "Giorgio Maybey", "Natasha Wibberley", "Ingemar Northleigh", "Riva Yitzowitz", "Alene Shorto", "Willette Busst", "Fransisco Overill", "Nanete Copin", "Marve Azemar", "Sylas Whorf", "Catharine Slocket", "Kele Eastway", "Lilli Cyples", "Farris Dutteridge", "Carmelina Igglesden", "Lyda Bendik"}),
                        "Fly over in memorial of the Red Arrows",
                        R.drawable.arrow
                        , 27
                ));
                events.add(new Event("AFC Bournemouth",
                        "2pm April 20th",
                        1555768800000L,
                        "Vitality Stadium, Bournemouth BH7 7AF",
                        "Eddie Colam",
                        new Group(11, "The Lads"),
                        new Attendees(28, new String[]{"Andra Gartrell", "Bowie Gregolin", "Peter Brumby", "Gavin Flight", "Eddie Colam", "Jedd De Pero", "Trenton Ewestace", "Caleb O'Murtagh", "Morten Crump", "Lowrance Awde", "Faegan Corre", "Amal Paolicchi", "Neil McCready", "Danell Hainey", "Corin Nettleship", "Adam Macallam", "Jaspar Shoute", "Bill Logg", "Graham Paunton", "Adrienne Maffulli"}),
                        "Cherries never fall.",
                        R.drawable.bournemouth_fc_logo
                        , 28
                ));

        }

    public void generateEvent(int eventID) {
        Boolean eventExists = false;
        for (Event event : events) {
            if (event.getEventID() == eventID) {
                eventExists = true;
            }
        }
        if (eventExists == false) {
            switch (eventID) {
                case 0:
                    events.add(new Event("BPI Group Meeting",
                            "1pm May 3rd",
                            1556888400L,
                            "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                            "Bob Green",
                            new Group(0, "BPI group"),
                            new Attendees(0, new String[]{"Daphne Guion", "Cher Dawney", "Nicoli Longmire", "Arlyne Itter", "Baily Lumly", "Bear Andrzejewski", "Sabra Please"}),
                            "The group meets",
                            R.drawable.chat_bpi,
                            0));
                    break;
                case 1:
                    events.add(new Event("Drinks with the bois",
                            "9pm May 3rd",
                            1556917200L,
                            "Frankenstien Pub, Reading, R31 2XQ",
                            "Marry Shelley",
                            new Group(1, "Chat 5"),
                            new Attendees(1, new String[]{"Lian Knott", "Arlette Pringle", "Abdel McKintosh", "Bastien Harrison", "Alana Crosscombe", "Hazel Knee", "Ulrike Littleproud", "Nananne Dobby", "Leyla Brame", "Raye Mussared"}),
                            "Just trialing something out so bear with",
                            R.drawable.chat_default,
                            1));
                    break;
                case 2:
                    events.add(new Event("Band rehearsal",
                            "2pm March 4th",
                            1551708000000L,
                            "Music room, Middlesbrough University, Middlesbrough, TS4 3JS",
                            "Rachel Brown",
                            new Group(2, "The instruments"),
                            new Attendees(2, new String[]{"Rhonda O'Connor", "Cecilia Breslin", "Paolina Preedy", "Griz De Ruggero", "Lucina Paur", "Maryanna Edmondson", "Findley Huntar", "Latrina Greatland", "Jard Jura", "Gearalt Julyan"}),
                            "Marmelading at its best",
                            R.drawable.chat_trumpet,
                            2));
                    break;
                case 3:
                    events.add(new Event("Scrum 4 Due",
                            "12pm March 7th",
                            1551960000000L,
                            "Brightspace",
                            "Mitchell Covern",
                            new Group(3, "Scrummers"),
                            new Attendees(3, new String[]{"Sayre Prantoni", "Briggs Totton", "Cullie Handrock", "Tait Liddon", "Ruthi Rushbrook", "Werner Cowpertwait", "Krista Daltry", "Erinna Castille", "Gardner Cockburn", "Odilia Stolze"}),
                            "Things get real",
                            R.drawable.chat_scrum,
                            3));
                    break;
                case 4:
                    events.add(new Event("Cinema",
                            "7pm March 8th",
                            1552071600000L,
                            "Odean, 2 Manor Road, Leeds, LS18 4DX",
                            "Dave Powers",
                            new Group(4, "Cinema crew"),
                            new Attendees(4, new String[]{"Jeremie Malitrott", "Ezechiel McAndie", "Nanete Fenich", "Rochelle Fowgies", "Herrick Kipping", "Marcela Hessel"}),
                            "Bring popcorn - or don't because you're not allowed to.",
                            R.drawable.chat_cinema,
                            4));
                    break;
                case 5:
                    events.add(new Event("Climbing",
                            "5pm March 15th",
                            1552669200000L,
                            "The Project, 3 Cameron St, Glasgow, G52 4JH",
                            "Climber co",
                            new Group(5, "BU Climbing Club"),
                            new Attendees(5, new String[]{"Cris Malling", "Willyt Colston", "Kira Zanussii", "Ainslee Blundell", "Morgen Sarchwell", "Adrianne Whinray", "Dennie Tison", "Monti Walburn", "Maurise Chugg", "Kacy Lobe", "Angela Sidle", "Corrie Baggs", "Fraser Clemmett", "Panchito Cornwall", "Alica Waything", "Nefen Gouldstone", "Norby Beltzner", "Nissie Hollingshead", "Tamar Bednall", "Appolonia Pygott", "Datha De Beauchemp"}),
                            "We get high",
                            R.drawable.chat_climbing,
                            5));
                    break;
                case 6:
                    events.add(new Event("Paint balling",
                            "1pm March 22nd",
                            1553259600000L,
                            "BU Paintball,8 Burleigh Rd, Ringwood, BU2 4NH",
                            "BU Paintball",
                            new Group(6, "Paint balling"),
                            new Attendees(6, new String[]{"Derril Jan", "Trenton Livingstone", "Steve Collison", "Lilian Dennerly", "Eilis Pooley", "Roderich Rembrandt", "Carolina Hubbert", "Saxon Beamont", "Carey Tuffrey"}),
                            "We shoot people",
                            R.drawable.chat_paintballing,
                            6));
                    break;
                case 7:
                    events.add(new Event("D&D",
                            "8pm March 23rd",
                            1553371200000L,
                            "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                            "Jonno Clarke",
                            new Group(7, "Board game cafe"),
                            new Attendees(7, new String[]{"Alanah Eggleson", "Kally Faier", "Stephenie Blench", "Merl Doudney", "Goldie Paulus", "Vic Zanassi", "Car Reeks", "Guinevere Boots", "Hermie Trudgion", "Millicent Hanley", "Zorah Casson"}),
                            "Playing dungeons.",
                            R.drawable.chat_board_game,
                            7));
                    break;
                case 8:
                    events.add(new Event("BU Guest Lecture",
                            "11am March 25th",
                            1553511600000L,
                            "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                            "Gernut Leechen",
                            new Group(8, "Bournemouth University"),
                            new Attendees(8, new String[]{"Willdon Moncreiffe", "Edik Trevor", "Evaleen Matthieson", "Germaine Brislawn", "Virgie Dudbridge", "Zacherie Rawstron", "Belicia Casewell", "Fanya Poltone", "Bertrando Phant", "Margeaux Bridywater", "Ivor Eakle", "Minnie Josefovic", "Monro Sired", "Ann-marie Arrighi", "Arline Gregon", "Alexandra Budleigh", "Wendall Pheby", "Twila Keeffe", "Barbee Cheeseman", "Miltie Gehring", "Bruno Ducker", "Bridgette McGillecole", "Vern Fasset", "Brandi Crab", "Dara McGreal", "Clywd Pennell", "Lev Aughton"}),
                            "Someguy from somewhere is talking about something.",
                            R.drawable.chat_bu,
                            8));
                    break;
                case 9:
                    events.add(new Event("Team meeting",
                            "1:30pm March 29th",
                            1553866200000L,
                            "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                            "Jack Cleary",
                            new Group(9, "Neam Tame"),
                            new Attendees(9, new String[]{"Zeb Tremmil", "Cullan Berry", "Ramonda Cornfield", "Junina Copin", "Carleen Coite", "Albertina Willishire", "Conney Di Baudi", "Nanny Pither", "Silvanus Challender", "Tabor Bridgland"}),
                            "We meet, we eat, we greet, we take a seat, it's pretty neat.",
                            R.drawable.chat_11,
                            9));
                    break;
                case 10:
                    events.add(new Event("Toy Story 4",
                            "7pm March 29th",
                            1553886000000L,
                            "Odean, 2 Manor Road, Leeds, LS18 4DX",
                            "Dave Powers",
                            new Group(4, "Cinema crew"),
                            new Attendees(10, new String[]{"Herrick Kipping", "Marcela Hessel", "Ezechiel McAndie", "Nanete Fenich"}),
                            "Toy story 3 ++",
                            R.drawable.toy_story_4_icon,
                            10));
                    break;
                case 11:
                    events.add(new Event("Reading Festival",
                            "2pm August 23rd",
                            1566568800000L,
                            "Richfield Avenue, Reading",
                            "Nick Rhymes",
                            new Group(10, "inFest"),
                            new Attendees(11, new String[]{"Sonni Kernes", "Christi Harses", "Helenka Durnian", "Brigitte Sandbatch", "Kylie Baigrie", "Izaak McIlenna", "Shelbi Kingsmill", "Ambur Haseley", "Oralee Dibden", "Anderea Azam", "Breanne Hodinton", "Abraham Freckelton", "Johnette Drayn", "Cordi Holbury", "Aldric Bonifant", "Pembroke Dunsmuir", "Tierney Tinniswood", "Tirrell Bruggeman", "Gisela Cluely", "Brock Auld", "Liva Langmaid"}),
                            "Drinking, smoking, drinking. It's gonna be lit!",
                            R.drawable.reading_festival_icon,
                            11));
                    break;
                case 12:
                    events.add(new Event("Bournemouth FC",
                            "7pm March 30th",
                            1553972400000L,
                            "Vitality Stadium, Bournemouth BH7 7AF",
                            "Andy Seb",
                            new Group(11, "The Lads"),
                            new Attendees(12, new String[]{"Andra Gartrell", "Alberik Lusher", "Bowie Gregolin", "Rouvin Andrejevic", "Peter Brumby", "Gavin Flight", "Eddie Colam", "Jedd De Pero", "Madelyn Stonary", "Trenton Ewestace", "Caleb O'Murtagh", "Morten Crump", "Lowrance Awde", "Faegan Corre", "Amal Paolicchi", "Neil McCready", "Danell Hainey", "Corin Nettleship", "Adam Macallam", "Jaspar Shoute", "Bill Logg", "Graham Paunton", "Adrienne Maffulli"}),
                            "Cherries destroy their bitter rivals - ants.",
                            R.drawable.bournemouth_fc_logo,
                            12));
                    break;
                case 13:
                    events.add(new Event("Basketball",
                            "7pm April 6th",
                            1554577200000L,
                            "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                            "Jace Mendez",
                            new Group(12, "BasketTroll"),
                            new Attendees(13, new String[]{"Rivi Georgi", "Elijah Fishley", "Cristobal Ahern", "Emelda Lyptrit", "Hercules Law", "Drew Featherston", "Dot Battill", "Berta Caress", "Guthrey Pilsworth", "Heath Lyes", "Briny Eggleson"}),
                            "An open game of basketball for anyone that's rad enough!",
                            R.drawable.basketball_icon,
                            13));
                    break;
                case 14:
                    events.add(new Event("Board game cafe",
                            "8pm April 7th",
                            1554667200000L,
                            "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                            "Jonno Clarke",
                            new Group(7, "Board game cafe"),
                            new Attendees(14, new String[]{"Alanah Eggleson", "Kally Faier", "Stephenie Blench", "Merl Doudney", "Goldie Paulus", "Vic Zanassi", "Car Reeks", "Guinevere Boots", "Hermie Trudgion", "Millicent Hanley", "Zorah Casson"}),
                            "We meet again.",
                            R.drawable.board_game_cafe_icon,
                            14));
                    break;
                case 15:
                    events.add(new Event("Sand sculpture festival",
                            "10am June 7th",
                            1557223200000L,
                            "Bournemouth Beach, Bournemouth, BH2 5AA",
                            "Jace Mendez",
                            new Group(13, "Sandtas"),
                            new Attendees(15, new String[]{"Birgit Wenger", "Anthe Peniello", "Heath Casbolt", "Cleavland Turbat", "Lindi Crosio", "Yvonne Kienle", "Josephine Adlington", "Pavlov Jonuzi", "Lynnett Balffye", "Aguste Obey", "Josiah Andreas", "Chrisse Van Niekerk", "Idelle Brazer", "Bev Challens", "Jeffy Joriot", "Estrella Walburn", "Sella Fritche", "Rodney Mountain", "Sheilah Larver", "Desiree Loyley", "Storm Arnold", "Saundra Djurdjevic", "Ari Barthelemy", "Melody Fateley", "Gertrudis Benn", "Madelina Hamill", "Karisa Baise", "Leese Force", "Lynelle Maryott", "Silvan Ducket", "Donna Scothern", "Kessia Lilion", "Whitman Gebby", "Correy Filippov", "Davin Holstein", "Shandra Thornally", "Vail Stangroom", "Horacio Adelman", "Archambault Clem", "Jayme Bertelmot", "Colas Lindholm", "Dory Stendall"}),
                            "An oppertunity for anyone to showcase their artistic brilliance. Bring out the inner child!",
                            R.drawable.sand_sculpture_logo,
                            15));
                    break;
                case 16:
                    events.add(new Event("Litter pick",
                            "12pm April 8th",
                            1555258016L,
                            "Bournemouth Beach, Bournemouth, BH2 5AA",
                            "Ken Batchelder",
                            new Group(15, "Pick world"),
                            new Attendees(16, new String[]{"Ken Batchelder", "Murdock Malling", "Marion Cordoba", "Sid Matzeitis", "Crystal Cumberpatch", "Willette Blanche", "Dru Yanez", "Christy Gaggen", "Finley Hartin", "Baxie Caulcott", "Marve Azemar", "Shannah Weight", "Ranice Leslie", "Tomasine Vaughn", "Davey Fido", "Vasily Casebourne", "Jud Trow", "Janetta Meriet", "Kristin Sporle", "Friedrick Merrywether", "Kele Eastway", "Laurella Gilcrist", "Catharine Slocket", "Arel Dymond"}),
                            "We're gonna clean up this place!",
                            R.drawable.litter,
                            16));
                    break;
                case 17:
                    events.add(new Event("Avartar 2",
                            "7pm April 8th",
                            1554750000L,
                            "Odean, 2 Manor Road, Leeds, LS18 4DX",
                            "Jeremie Malitrott",
                            new Group(4, "Cinema crew"),
                            new Attendees(17, new String[]{"Ezechiel McAndie", "Jeremie Malitrott", "Nanete Fenich"}),
                            "Bring popcorn - or don't because you're not allowed to.",
                            R.drawable.avatar,
                            17));
                    break;
                case 18:
                    events.add(new Event("Writing Club",
                            "8am April 12th",
                            1555056000L,
                            "Library, Talbot Campus, Fern Barrow, Poole BH12 5BB",
                            "Melesa Walklott",
                            new Group(16, "Writing Club"),
                            new Attendees(18, new String[]{"Melesa Walklott", "Randal Scrigmour", "Anatole Thandi", "Tammara Blas", "Garret Rillstone", "Lianne Gorman"}),
                            "We write. We review. We dream.",
                            R.drawable.write,
                            18));
                    break;
                case 19:
                    events.add(new Event("TED Talk BU",
                            "11am April 12th",
                            1555066800L,
                            "LEES, Talbot Campus, Fern Barrow, Poole BH12 5BB",
                            "Antony Cables",
                            new Group(17, "TED BU April 12th"),
                            new Attendees(19, new String[]{"Lindi Crosio", "Nanete Fenich", "Kessia Lilion", "Chrisse Van Niekerk", "Melody Fateley", "Shandra Thornally", "Janetta Meriet", "Lynnett Balffye", "Willette Blanche", "Estrella Walburn", "Arel Dymond", "Archambault Clem", "Finley Hartin", "Jeffy Joriot", "Kristin Sporle", "Marve Azemar", "Rochelle Fowgies", "Colas Lindholm", "Baxie Caulcott", "Marion Cordoba"}),
                            "Award winning researcher in apathetic philantropic particles discusses how advancements the mysterious midi-chlorians " +
                                    "could lead to the harnessing of the Force in under two generations!.",
                            R.drawable.ted,
                            19));
                    break;
                case 20:
                    events.add(new Event("Cocktail making",
                            "9pm April 12th",
                            1555102800L,
                            "Dylans, Talbot Campus, Fern Barrow, Poole BH12 5BB",
                            "Ashil Chant",
                            new Group(18, "Cocktail Concoctioners"),
                            new Attendees(20, new String[]{"Jessie Camps", "Biron Yashin", "Ashil Chant", "Tabb McMeanma", "Kaspar Josefsen", "Marlon Hutchcraft"}),
                            "Award winning researcher in apathetic philantropic particles discusses how advancements the mysterious midi-chlorians " +
                                    "could lead to the harnessing of the Force in under two generations!.",
                            R.drawable.cocktail,
                            20));
                    break;
                case 21:
                    events.add(new Event("Pie eating contest",
                            "9pm April 12th",
                            1555102800L,
                            "Dylans, Talbot Campus, Fern Barrow, Poole BH12 5BB",
                            "Park Pudner",
                            new Group(19, "Pie Contestants"),
                            new Attendees(21, new String[]{"Chaim Duchesne", "Park Pudner", "Leisha Gobolos", "Ebenezer Flacknoe", "Edith Croan", "Anabelle Challin", "Kele Eastway", "Salem Sprouls", "Nikolos Locksley", "Aarika Girvin", "Arni Poyzer", "Gonzales Poxson", "Dorice Kristoffersson", "Gregor Greatreax", "Beverley Galle"}),
                            "The winner pies everyone else off.",
                            R.drawable.pie,
                            21));
                    break;
                case 22:
                    events.add(new Event("BU Beach party",
                            "10am July 12th",
                            1562925600L,
                            "Bournemouth Beach, Bournemouth, BH2 5AA",
                            "Niki Janda",
                            new Group(20, "Bournemouth University"),
                            new Attendees(22, new String[]{"Fran Ricketts", "Marcie Izakson", "Celinka Silverthorne", "Adelina McFadden", "Ilyssa Novichenko", "Hedi Brimson", "Janeen Saward", "Cristabel Petschel", "Yvonne Lathwell", "Jamill McClay", "Madella Lesaunier", "Leicester Rustich", "Verina Leifer", "Kate Vincent", "Gertrudis Durn", "Laurena Joslin", "Corny Drennan", "Alexandre Struttman", "Brunhilde Werrilow", "Niki Janda", "Carlota Wheater", "Elysee Carpe", "Bendix Dixey", "Florie McArtan", "Amara Dishman", "Antonietta Brooking", "Noland Fowle", "Nico Coverdill", "Dylan Shetliff", "Nowell Cork", "Harrison Twentyman", "Dickie Castillon", "Curcio George", "Nicko Achrameev", "Matti Klement", "Arv Greensitt", "Perrine Wooff", "Bone Likely", "Peria Hallwood", "Bonni Presser", "Maddie Prickett", "Ailsun Wolford", "Sherri Deinhardt", "Cchaddie Ancell", "Dene Winson", "Laurella Gilcrist", "Marion Cordoba", "Katinka Libbie", "Hershel Bosket", "Constancy Summerlee", "Hadlee Jovic", "Sonnie Fooks", "Sheree Iacobetto", "Seumas Druhan", "Emmie Feander", "Bale Sprason", "Elwyn Sergison", "Melissa Evered", "Karil Elvin", "Ricardo Ambrozewicz", "Korey Dillingston", "Hymie Worner", "Margette Le Floch", "Spense Shercliff", "Dalenna Birch", "Charline Masham", "Nicolea Van der Hoeven", "Carmel Masterman", "Emelita Singleton", "Humbert Ruddiman", "Hiram Chamney", "Aundrea Scramage", "Sondra Brear", "Amabel Routham", "Leann Fernyhough", "Kent Comelini", "Cherin Bracken", "Jedediah Tyres", "Catherin Whiteland", "Alene Shorto", "Massimiliano Storey", "Therine Cornewell", "Angele Tippell", "Jerad Salter", "Biron Valens-Smith", "Griz Cuseick", "Catharine Slocket", "Sawyere Lusgdin", "Des Oran", "Elisabetta McJarrow", "Vance Marr", "Brianne Goadby", "Jojo Cleminshaw", "Drona Pedden", "Pauli Summerhayes", "Lettie Hocking", "Peta Faire", "Del Noell", "Joelie Mattia", "Kelcy Francklyn"}),
                            "An all day and all night beach party for the epic",
                            R.drawable.beach
                            , 22
                    ));
                    break;
                case 23:
                    events.add(new Event("BU Church",
                            "9pm April 13th",
                            1555182000L,
                            "Lansdowne Rd, Bournemouth BH1 1SB",
                            "Kaspar Josefsen",
                            new Group(21, "Christian Union BU"),
                            new Attendees(23, new String[]{"Sheree Iacobetto", "Hershel Bosket", "Rodd Hutt", "Dore Wrettum", "Torrence Bretherick", "Travis Estick", "Kaspar Josefsen", "Barbette Popworth", "Zelig Stockill", "Prescott Figliovanni", "Kean McGrane", "Salomi Gerriet", "Ruth Colliss", "Aurlie Tansly", "Arlen Brecher", "Winny Madge", "Ardyce Sarvar", "Humbert Ruddiman", "Kerrie McCarthy", "Hailey McGeechan", "Benedick Mechan", "Hermann Pattle", "Robbyn Mandeville", "Faun Ludee", "Alberto McGinty", "Loydie Maffione"}),
                            "The CU meet up at lansdowne for some worship and fellowship.",
                            R.drawable.church
                            , 23
                    ));
                    break;
                case 24:
                    events.add(new Event("Library reading",
                            "5pm April 14th",
                            1555261200L,
                            "Library, Talbot Campus, Fern Barrow, Poole BH12 5BB",
                            "Leann Fernyhough",
                            new Group(22, "BU Reading Society"),
                            new Attendees(24, new String[]{"Bentlee Bellchamber", "Leann Fernyhough", "Guglielma Quaintance", "Tim Trevna", "Chrotoem Bouette", "Keelby Rosenhaupt", "Tiffani Sollowaye", "Bernadene Coventry"}),
                            "We read aloud. Why? Because we're allowed.",
                            R.drawable.library
                            , 24
                    ));
                    break;
                case 25:
                    events.add(new Event("Bloom",
                            "10am April 15th",
                            1555322400L,
                            "Bournemouth Parks - Lower Gardens, Westover Road, Bournemouth BH2 5AH",
                            "Eolanda Hawkshaw",
                            new Group(23, "Bournemouth Gardeners"),
                            new Attendees(25, new String[]{"Georgianne Loudiane", "Jessica Blazek", "Vasily Casebourne", "Alon Duligal", "Eolanda Hawkshaw", "Ferdinand Espina", "Flory Lambersen", "Herbert Yellowlees", "Zenia Gritskov", "Hal De Miranda", "Juieta Tiptaft", "Meryl Westrey"}),
                            "Clematis's and Rohededemdroms bloom",
                            R.drawable.bloom
                            , 25
                    ));
                    break;
                case 26:
                    events.add(new Event("BU Surf club",
                            "10am April 20th",
                            1555754400L,
                            "Bournemouth Beach, Bournemouth, BH2 5AA",
                            "Dru Yanez",
                            new Group(24, "BU Surf club"),
                            new Attendees(26, new String[]{"Darryl Burnett", "Dru Yanez", "Hortense Billyard", "Mirabel Gavrielly", "Florie McArtan", "Ellen Louiset", "Caryl Beany", "Jobyna Vondrak", "Alejandro Bengal", "Arel Dymond", "Uriah Freebury", "Margarette Joannidi", "Sid Matzeitis", "Emilee Durman", "Alberto McGinty"}),
                            "Beginners welcome",
                            R.drawable.surf
                            , 26
                    ));
                    break;
                case 27:
                    events.add(new Event("Red arrows",
                            "3pm April 20th",
                            1555772400L,
                            "Bournemouth, BH1 3DU",
                            "Kathrine Dusting",
                            new Group(25, "Red Arrows Historical Group"),
                            new Attendees(27, new String[]{"Shermy Franck", "Maurise Potticary", "Kathrine Dusting", "Emilee Durman", "Patsy Ryall", "Ynes Greger", "Florance Rolley", "Eadmund Quartermaine", "Twyla Rioch", "Egan Jarlmann", "Zenia Gritskov", "Gretchen Cannaway", "Waylin Rayson", "Kris Nerney", "Giorgio Maybey", "Natasha Wibberley", "Ingemar Northleigh", "Riva Yitzowitz", "Alene Shorto", "Willette Busst", "Fransisco Overill", "Nanete Copin", "Marve Azemar", "Sylas Whorf", "Catharine Slocket", "Kele Eastway", "Lilli Cyples", "Farris Dutteridge", "Carmelina Igglesden", "Lyda Bendik"}),
                            "Fly over in memorial of the Red Arrows",
                            R.drawable.arrow
                            , 27
                    ));
                    break;
                case 28:
                    events.add(new Event("AFC Bournemouth",
                            "2pm April 20th",
                            1555768800L,
                            "Vitality Stadium, Bournemouth BH7 7AF",
                            "Eddie Colam",
                            new Group(11, "The Lads"),
                            new Attendees(28, new String[]{"Andra Gartrell", "Bowie Gregolin", "Peter Brumby", "Gavin Flight", "Eddie Colam", "Jedd De Pero", "Trenton Ewestace", "Caleb O'Murtagh", "Morten Crump", "Lowrance Awde", "Faegan Corre", "Amal Paolicchi", "Neil McCready", "Danell Hainey", "Corin Nettleship", "Adam Macallam", "Jaspar Shoute", "Bill Logg", "Graham Paunton", "Adrienne Maffulli"}),
                            "Cherries never fall.",
                            R.drawable.bournemouth_fc_logo
                            , 28
                    ));
                    break;
            }
        }
    }








       /* events.add(new Event("",
                "",
                L,
                "",
                "",
                new Group(,""),
                new Attendees(, new String[]{}),
                "",
                ,
                ));
        events.add(new Event("",
                "",
                L,
                "",
                "",
                new Group(,""),
                new Attendees(, new String[]{}),
                "",
                ,
                ));
        events.add(new Event("",
                "",
                L,
                "",
                "",
                new Group(,""),
                new Attendees(, new String[]{}),
                "",
                ,
                ));
        events.add(new Event("",
                "",
                L,
                "",
                "",
                new Group(,""),
                new Attendees(, new String[]{}),
                "",
                ,
                ));
        events.add(new Event("",
                "",
                L,
                "",
                "",
                new Group(,""),
                new Attendees(, new String[]{}),
                "",
                , ));


*/


    public Event getEvent(int eventID){
        for (Event event: events) {
           if(event.getEventID()==eventID) {
               return event;
           }
        }
        return  null;
    }
       /* events.add(new Event("",
                "",
                L,
                "",
                "",
                new Group(,""),
                new Attendees(, new String[]{}),
                "",
                ,
                ));
        events.add(new Event("",
                "",
                L,
                "",
                "",
                new Group(,""),
                new Attendees(, new String[]{}),
                "",
                ,
                ));
        events.add(new Event("",
                "",
                L,
                "",
                "",
                new Group(,""),
                new Attendees(, new String[]{}),
                "",
                ,
                ));
        events.add(new Event("",
                "",
                L,
                "",
                "",
                new Group(,""),
                new Attendees(, new String[]{}),
                "",
                ,
                ));
        events.add(new Event("",
                "",
                L,
                "",
                "",
                new Group(,""),
                new Attendees(, new String[]{}),
                "",
                , ));


*/

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public ArrayList<String> getAllDates() {
        ArrayList<String> allDates = new ArrayList<String>();
        for (Event event : events) {
            String dateFormatted = new java.text.SimpleDateFormat("MM/dd/yyyy").format(new java.util.Date(event.getEpoch()));
            allDates.add(dateFormatted);
        }

        return allDates;
    }


}

class Event {

    private String name;
    private String date;
    private long epoch;
    private String location;
    private String host;


    private Attendees attendees;
    private Group group;
    private String description;
    private int image;
    private int eventID;

    public Event(String name, String date, long epoch, String location, String host, Group group, Attendees attendees, String description, int image, int eventID) {
        this.name = name;
        this.date = date;
        this.epoch = epoch;
        this.location = location;
        this.host = host;
        this.attendees = attendees;
        this.group = group;
        this.description = description;
        this.image = image;
        this.eventID = eventID;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public Event(int imageIndex) {
        this.name = "";
        this.date = "";
        this.epoch = 0;
        this.location = "";
        this.host = "";
        this.attendees = new Attendees();
        this.group = new Group();
        this.description = "";
        this.image = 0;
        this.eventID = imageIndex;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageIndex() {
        return eventID;
    }

    public void setImageIndex(int imageIndex) {
        this.eventID = imageIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEpoch() {
        return epoch;
    }

    public void setEpoch(long epoch) {
        this.epoch = epoch;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Attendees getAttendees() {
        return attendees;
    }

    public void setAttendees(Attendees attendees) {
        this.attendees = attendees;
    }
}

class Group {
    public Group(int groupID, String name) {
        this.groupID = groupID;
        this.name = name;
    }

    public Group() {
        this.groupID = 0;
        this.name = "";
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int groupID;
    private String name;

}

class Attendees {

    public Attendees(int attendesID, ArrayList<String> names) {
        this.attendesID = attendesID;
        this.names = names;
    }

    public Attendees(int attendesID, String[] aryNames) {
        this.attendesID = attendesID;
        this.names = new ArrayList<String>();
        for (String name : aryNames) {
            names.add(name);
        }
    }

    public Attendees() {
        this.attendesID = 0;
        this.names = new ArrayList<String>();
    }

    private int attendesID;
    private ArrayList<String> names;


    public int getAttendesID() {
        return attendesID;
    }

    public void setAttendesID(int attendesID) {
        this.attendesID = attendesID;
    }

    public ArrayList<String> getNames() {
        return names;


    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }
}
