package uz.mlsoft.travelmyappinfo.country_mvp


import uz.mlsoft.travelmyappinfo.R
import uz.mlsoft.travelmyappinfo.data.DataCountry

class CountryModel : CountryContract.Model {
    private val countries = ArrayList<DataCountry>()

    init {
        countries.add(
            DataCountry(
                R.drawable.jakarta,
                R.drawable.jakarta,
                "Germaniya",
                "Berlin",
                "Yevropa",
                "\tGFR — federativ respublika. Amaldagi konstitutsiyasi 1949-yil 23-mayda qabul qilingan," +
                        " unga 1954, 1956, 1990, 1993 va 1994-yillarda qoʻshimchalar kiritilgan. \tDavlat boshligʻi — federal prezident. U maxsus chaqiriladigan federal majlis tomonidan 5 yil muddatga " +
                        "saylanadi va yana faqat bir marta saylanishi mumkin. Federal majlis bundestag raisi tomonidan chaqiriladi va u bundestag deputatlari hamda landtaglar (yer parlamentlari) tomonidan " +
                        "saylangan aʼzolardan iborat. Prezident ish qobiliyatini yoʻqotsa yoki vafot etsa, bundesrat raisi prezident vakolatlarini bajaradi. Qonun chiqaruvchi hokimiyatni parlament amalga oshiradi." +
                        " U ikki palata: bundestag va bundesratdan iborat. Bundestag aholi tomonidan 4 yil muddatga saylanadi. Bundesrat esa yer hukumatlari oʻz orasidan 4 yil muddatga tayinlaydigan vakillardan iborat. " +
                        "Ijroiya hokimiyat federal kansler boshchiligidagi federal hukumat qoʻlida. Federal kansler bundestagda prezidentning taklifiga binoan koʻpchilik ovoz bilan saylanadi. Vazirlar federal kanslerning " +
                        "taklifi bilan prezident tomonidan tayinlanadi. Har bir yerning oʻz konstitutsiyasi, parlament va hukumati bor.",
                52.520008, 13.404954
            )
        )
        countries.add(
            DataCountry(
                R.drawable.italiya1,
                R.drawable.italiya1,
                "Italiya",
                "Rim",
                "Yevropa",
                "\tITALIYA\n" +
                        "\tITALIYA (Italia), Italiya Respublikasi (Repubblika Italiana) — Yevropa jan. da, Oʻrta dengiz havzasida joylashgan davlat. Apennin ya. o., " +
                        "Sitsiliya, Sardiniya va b. kichik orollarni oʻz ichiga olgan. Mayd. 301,2 ming km2. Aholisi 57,679 mln. kishi (2001). Maʼmuriy jixatdan 20 viloyat (regione)ra boʻlinadi. Poytaxti — Rim sh.\n" +
                        "\n" +
                        "\tDavlat tuzumi. Italiya — respublika. Amaldagi konstitutsiyasi 1947-y. 22 dek. da qabul qilingan va 1948-y. 1 yanv. dan kuchga kirgan. " +
                        "Davlat boshligi — prezident (1999-y. maydan K. A. Champi). U parlament ikkala palatasining qoʻshma majlisida viloyatlar vakillari ishtirokida 7 y. muddatga saylanadi. " +
                        "Qo-nun chiqaruvchi organ deputatlar palatasi va senatdan iborat parlament. Ijrochi xrkimiyatni Vazirlar Kengashi amalga oshiradi. Prezident Vazirlar Kengashi raisi " +
                        "va uning taklifiga binoan vazirlarni tayinlaydi.",
                9.550, 8.750
            )
        )
        countries.add(
            DataCountry(
                R.drawable.biritain1,
                R.drawable.biritain1,
                "Buyuk Britaniya",
                "London",
                "Yevropa",

                "\tBirlashgan Qirollikning yer yuzasi asosan pastgekislik. Angliyaning shimoli-gʻarbi toglikdan, markazi va janubi-sharqi tekislik va sertepa pasttekisliklardan," +
                        " Shotlandiyaning qirgʻogi egribugri, shim; qismi tor va chuqur Glen-Mor depressiyasi 2 qismga boʻlib turgan Shimoliy Shotlandiya togʻligidan iborat. Bu ikkala qismning janubida (Grampian togʻlari) mamlakatning eng baland choʻqqisi — Ben-Nevis (1343 m) koʻtarilib turadi. " +
                        "Grampian togʻlaridan janubida Shotlandiya pasttekisligi, undan jan.rokda Janubiy Shotlandiya qiri (balandligi 842 m gacha) joylashgan. Ulardan gʻarbda Kamberlend togʻlari (Skofell togʻi, 978 m) qad koʻtargan. Jan.ga tomon orol kengaya boradi; bu yerda — Uels yarim orolning gʻarbida Kembriy toglari " +
                        "(Snoudon togʻi, 1085 m) bor. Angliyaning gʻarbiy qirgʻogʻida keng qoʻltiqlar (Liverpul, Kardigan, Bristol), markaziy va janubiy qismlarida pasttekisliklar (Shim.\n" +
                        "\n" +
                        "\tSharqiy Feni, London havzasi, Midlend, Xempshir), qator asimmetrik tepalar (balandligi 200- 300 m) bor. Shimoliy Irlandiya ayrim kichikkichik qirlardan (Antrim, Sperriin, Morn va boshqalar) iborat.\n" +
                        "\n" + "\tBirlashgan Qirollikda foydali qazilmalar kam. Asosan temir rudasi va yuqori sifatli toshkoʻmir, tosh tuz, kaolin, ozroq miqdorda yonuvchi slanes qazib olinadi. Neft va rangli metall konlari mavjud. Shimoliy dengizning Birlashgan Qirollik qirtogʻi yaqinida tabiiy gaz konlari bor.",
                54.13569604906881, -2.572741443733534
            )
        )
        countries.add(
            DataCountry(
                R.drawable.norvegiya,
                R.drawable.norvegiya,
                "Norvegiya",
                "Oslo",
                "Yevropa",

                "\tNorvegiya — togʻli oʻlka. Hududining qariyb 2/3 qismi dengiz sathidan 500 m dan baland; dengiz sohilidagina pasttekislik bor. Gʻarbiy qirgʻogʻida tik yon bagʻirli tor qoʻltiq (ford) koʻp." +
                        " Yirik orollari — Lofoten, Vesterolen, Senya, Mageryo va boshqalar. Hududining katta qismini Skandinaviya togʻlari ishgʻol qiladi (eng baland joyi Galxyopiggen togʻi — 2470 m)." +
                        " Foydali qazilmalari: temir, nikel, mis, titan, uran, molibden, kobalt va kumush rudalari. Shimoliy dengizning quruqlikka yaqin sayoz qismida neft va gaz konlari bor." +
                        " Iqlimi moʻtadil, shimoliy chekkasida subarktika, sohilida okean iqlimi yanvarning oʻrtacha harorati shimolda —2—4 °C, janubda 2 °C. Yozi salqin, tez-tez yomgʻir yogʻadi. Yillik yogʻin 1000–3000 mm. Muzliklarning umumiy maydoni 3000 km2 ga yaqinni tashkil etadi. Yirik daryolari — Glomma, " +
                        "Logen (Gudbransdal), Logen (Numedal). Katta gidroenergiya salohiyatiga ega boʻlgan bu daryolar qor, yomgʻir va muzliklardan toʻyinadi. Eng katta koʻli — Myosa. Asosiy tuprogʻi — yupqa tundra tuprogʻi, janubda togʻ podzol tuprogʻi uchraydi. Mamlakat hududining 27 % oʻrmon. Yovvoyi hayvonlardan tulki," +
                        " silovsin, rosomaxa, suvsar, los, bugʻu, quyon, tiyin, lemming va boshqalar bor. Dengiz sohilida gala-gala qushlar, dengizlarda turli baliq va tyulen koʻp.",

                60.4720, 8.4689
            )
        )
        countries.add(
            DataCountry(
                R.drawable.germaniya1,
                R.drawable.germaniya1,
                "Shvetsiya",
                "Stokgolm",
                "Yevropa",

                "\tShvetsiya Yevropaning Atlantika boʻyi qismida, moʻʼtadil mintaqa shimolida joylashgan. Shimoliy va gʻarbiy qismi togʻli (Skandinaviya togʻlari, " +
                        "eng baland joyi 2123 m, Kebnekayse togʻi). Shvetsiya shimolida Norland yassitogʻligi (bal. 200–800 m), janubida Smoland qiri bor. Qolgan qismi pasttekislik va koʻllardan iborat. Foydali qazilmalardan temir," +
                        " mis, qoʻrgʻoshin, rux, uran rudalari, oltin, kumush, marganets, volfram konlari hamda mineral buloqlar bor. Iqlimi moʻʼtadil, Golfstrim iliq oqimining taʼsiri katta. Shimolida iqlim sovuq. Yanvarning oʻrtacha " +
                        "temperaturasi janubida 0–5°, shimolida –6° dan –14° gacha, iyulniki xuddi shu joylarda 15–17° va 10–11°. Yillik yogʻin togʻlarda 1500–2000 mm, tekisliklarda 700–800 mm. Daryolari qisqa va serostona. Shvetsiya " +
                        "hududining 9% qoʻllar bilan band. Yirik koʻllari: Venern, Vettern, Yelmaren, Melaren. Hududining 57% oʻrmon, asosan, igna bargli daraxtlar, aralash oʻrmonlar, shimolida tundra oʻsimligi oʻsadi. Tuproqlari podzol, " +
                        "chimli podzol, qoʻngʻir oʻrmon, togʻ podzol, togʻ tundra va botqoq tuproqlar. shahrida oʻrmon hayvonlari va suv parrandalari koʻproq uchraydi. Abisku, Muddus, Sarsk Shyoffallet milliy bogʻlari va koʻrixonalar bor.",


                51.1657, 10.4515
            )
        )
        countries.add(
            DataCountry(
                R.drawable.finlandiya1,
                R.drawable.finlandiya1,
                "Finlyandiya",
                "Xelsinli",
                "Yevropa",

                "\tBotniya, Fin qoʻltiqlari va Boltik, dengizi sohillari koʻpgina buxta va shxerlar (suv ostidagi va suvdan chiqib turadigan qoyalar) bilan parchalangan." +
                        " Hududining aksar qismi dengiz sathidan 100–200 m pastda yotuvchi tekislik. Markaziy qismidagi koʻllar atrofi hamda shimoliy va sharqida tepalik va qirlar bor. Shimoli-gʻarbida Skandinaviya togʻlarining tarmoqlari joylashgan" +
                        " (eng baland joyi 1365 m — Xaltiatunturi choʻqqisi). Foydali qazilmalardan xromit, temir, mis kolchedani, misnikel, polimetall rudalar, apatit, grafit, magnezit, asbest, talk, marmar, muskovit konlari bor, torf qazib olinadi." + " Iqlimi moʻʼtadil, shimolida kontinental iklim. Boltiq dengizi va Golfstrim oqimining yaqinligi iqlimga yumshatuvchi taʼsir qiladi. Oʻrtacha temperatura fevralda —3° dan — 14° gacha, iyulda 14° dan 17° gacha. Yillik yogʻin 600– 700 mm. " +
                        "Dare koʻp, qisqa, sersuv, serostona. Yiriklari — KemiYoki, KyumiYoki, KokemyaenYoki, TornioYoki. 60 mingga yaqin koʻl bor (mamlakat hududining 8%), yirik koʻli — Sayma. Botqoq koʻp. Hududning 61% oʻrmon, asosan, igna bargli daraxtlar," +
                        " janubidagi podzol, gleypodzol, torfli botqoq tuproklarda aralash oʻrmonlar, shimolida togʻ tundrasi. Yirik milliy bogʻlari — Lemmenyoki, PallasOunastunturi, Oulanka va boshqa Finlandiyada 18 qoʻriqxona bor.",
                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.slovakiya1,
                R.drawable.slovakiya1,
                "Daniya",
                "Kopengagen",
                "Yevropa",

                "\tDaniya hududi keng bargli urmonlar zonasida joylashgan, yer yuzasi tekislik. Eng baland joyi Yutlandiya yarim oroldagi Ayer-Bavnexoy tepaligi (172 m). " +
                        "Toʻrtlamchi davrda yer ustini qoplagan muzlikning izlari saqlanib qolgan. Yutlandiya yarim orol va boshqa orollarning sohillarida qoʻltiqlar va boʻgʻozlar koʻp. Daniyada qazilma boyliklar oz. Kaolin, boʻr, neft, torf," +
                        " qoʻngʻir kumir, gaz va tuz konlari bor. Iqlimi moʻʼtadil dengiz iqlimi, yozi salqin, bahor va kuz fasllari uzok, davom etadi. Kishi yumshoq. Fevralda oʻrtacha temperatura 0°, iyulda 15—16°. Yillik yogin 600–900 mm. " +
                        "Yogʻinning koʻp qismi kuzda yogʻadi, bahorda va yozda yogʻin kam boʻladi. Tez-tez tuman tushadi. Daryolari juda qisqa (eng kattasi Gudeno, 158 km). Kichik oqar koʻl koʻp. Mamlakat gʻarbining tuprogʻi podzol, sharqiniki" +
                        " qoʻngʻir oʻrmon tuproqlardir. Bu yerlarda dehqonchilik qilinadi. Dengiz sohillarida oʻtloqi allyuvial tuproq, karbonat jinslarda esa karbonatli qoʻngʻir tuproqlar paydo boʻlgan. Hududining 10 % ga yaqini oʻrmon bilan band." +
                        " Qaragʻay, qoraqaragʻay, qoraqayin va dub oʻrmonlari bor. Bu oʻrmonlarda yovvoyi xayvonlardan ohu, asil va chipor bugʻu, elik, tiyin, tustovuq uchraydi. Sohillarda parranda koʻp. Yirik qoʻriqxonalari: Xesselyo, Vorse.\n" +
                        "\n" +
                        "\tAholisining 98 % danlar; olmonlar va frizlar ham bor. Aholining oʻrtacha zichligi bir km2 ga 114 kishi. Aholining 84,9 % shaharlarda yashaydi. Rasmiy tili — dan tili." +
                        " Dindorlarning 91 % — lyuteranlar. Yirik shaharlari: Kopengagen, Orxus, Odense, Olborg .",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.islandiya1,
                R.drawable.islandiya1,
                "Islandiya",
                "Reykyavik",
                "Yevropa",

                "\tIslandiya qirgʻogʻi janubida tekis, qolgan qirgʻoqlari yirik qoʻltiq va fiordlar bilan parchalangan[1]. Yer yuzasining koʻp qismi vulqonlardan xreil boʻlgan plato." +
                        " Bal. 800 m li togʻ massivlari va 200 ta vulkan (30 tasi harakatda) bor. Mashhurlari: Gekla, Laki, Askya va Xvannadalsxnukur (baland nuqtasi 2119 m).Islandiya hududining 6 %i lava dalalaridan iborat. Sohilda pasttekisliklar bor. " +
                        "Tez-tez zilzila boʻlib turadi. Shpat, oltingugurt, torf, lignit va b. konlar (issiq suvli, bug'li, maʼdanli buloqlar va geyzerlar) mavjud. Iqlimi subarktika, dengiz iqlimiga, Golfstrimning taʼsiri kuchli. Sohilda yanvarning oʻrtacha " +
                        "temperaturaasi — 1, —3°, iyulniki 9, 1G. Yillik yogʻin 500–4000 mm. Islandiyaning markaziy qismlarida qishda 5 oygacha qor erimaydi. Islandiya maydonining 11,8 ming km2 muzlik. Yiriklari: Vatnayyokudl (mayd. 8400 km2, qalinligi 1000 m)" +
                        " va boshqa. Daryolari qisqa, serostona, qor va muzliklardan toʻyinadi, gidroenergiya resurslariga boy. Koʻl koʻp. Sohillarda serunum torflichim, ichkarilarda tog arktika tuproqlari uchraydi. Oʻsimligi kam, jami 400 tur kjsak oʻsimlik bor." + " Islandiya hududining 2/3 qismi mox va lishaynikli toshloq. Lava dalalarida hech narsa oʻsmaydi. Katta maydonlar torfli botqoqlik va oʻtloq. Kichikroq oq qayin oʻrmonlari saklangan. Qutb tulkisi, sichqonsimonlar, shimoliy bugʻusi, norka, morj," +
                        " tyulen, baliqchi qushlar, baliqlar, kitlar bor. Milliy bogʻlari (Tingvedlir, Mivati-och-Lax-sau, Skaftafedl, Yekyul-Saurgl-yurvyur) va qoʻriqxonalar bor.\n" +
                        "\n" +
                        "\tAholisining 99 % islandlar. Qolgan qismi nemis, norveg va danlar. Rasmiy til — island tili. Dindor aholining 93 % protestant (lyuteran). Aholining " +
                        "91 % shaharlarda yashaydi. Yirik shaharlari: Reykyavik, Koupa-vogur, Akureyri.",


                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.irlandiya1,
                R.drawable.irlandiya1,
                "Irlandiya",
                "Dublin",
                "Yevropa",

                "\tSharqiy qirgʻoklari ancha tekis, janubiy qirgʻoqlarida buxta va qoyali burunlar, gʻarbiy qirgʻoqlarida ichkariga chuqur kirgan qoʻltiklar koʻp. Yer yuzasining yarmidan koʻpini " +
                        "Mar-kaziy tekislik (bal. 40–100 m) egallagan, bu tekislikda tepalar va past togʻlar bor. Tepalar, asosan, qumtoshlardan, past togʻlar ohaktoshlardan iborat, ularning ustini morena yotq-iziqlari qoplagan. Ohaktoshli yerlarda ungur, gʻor kabi" +
                        " karst relyef shak-llari, yer osti daryo va koʻllari uchraydi. Chekka qismlarida past va oʻrtacha balandlikdagi togʻlar bor. Janubi-gʻarbidagi Kerri togʻi (1041 m) Irlandiyadagi eng baland togʻdir. Irlandiyada torfning katta zaxiralari," +
                        " toshkoʻmir, qoʻrgʻoshinrux, mis, fosforit bor.\n" +
                        "\n" +
                        "\tIqlimi — moʻʼtadil okean iqlimi, obhavosi beqaror, seryomgʻir, tuman koʻp tushadi, tez-tez shamol esadi. Yanvarning oʻrtacha temperaturasi 5—8°, iyulniki — 14—16°. Yillik yogʻin 700–2000 mm. Irlandiyada daryo, koʻl va botqoklik koʻp." +
                        " Daryolari sersuv, muzlamaydi, kemachilikda va elektr energiyasi olishda foydalaniladi. Yirik daryosi — Shannon.\n" +
                        "\n" +
                        "\tIrlandiyaning koʻp qismi torfli yalangliklar, oʻtloklar. Oʻtloqlari doimo koʻmkoʻk. Yalangliklarda torfli-botqoq va qumoq tuproqlar uchraydi. Oʻtloq joylarning tuprogʻi — podzol va oʻtloqpodzol tuproqlar. Hayvonlari Gʻarbiy Yevropanikiga " +
                        "oʻxshash, turi kam. Yovvo-yi hayvonlarning kupi qirib tashlangan. Milliy bogʻlari: Glenya, Killari.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.faryer_orollari1,
                R.drawable.faryer_orollari1,
                "Faryer orollari",
                "Torsxvan",
                "Yevropa",

                "\tKo'pgina shimoliy mamlakatlar bayroqlari singari, Farer orollari bayrog'ida hamSkandinaviya xochi mavjud. Bayroq oq fonda ko‘k hoshiyali qizil xochli, tomonlar nisbati 8:11 bo‘lgan to‘rtburchaklar paneldir.\n" +
                        "\n" +
                        "\tOq fondagi qizil xoch - Daniyaning o'zgartirilgan bayrog'i (qizil fonda oq xoch), uning avtonom hududi orollardir.\n" +
                        "\n" +
                        "\tFarer orollarida bayroq juda hurmatga sazovor va Merkid (Merkið) deb ataladi.\n" +
                        "\n" +
                        "\tBayroq 1919-yilda Yens Oliver Lisberg (Jens Oliver Lisberg) tomonidan ikki o'rtog'i bilan Kopengagenda o'qish paytida yaratilgan. " +
                        "Ular Norvegiya bayrog'ini asos qilib oldilar[1], Farer orollari ilgari Norvegiya tarkibiga kirgan. Norvegiya bayrog'i singari," +
                        " Farer bayrog'ida ham chegaralangan Skandinaviya xochi va qizil, oq va ko'k ranglar boshqacha ketma-ketlikda joylashgan[2]." +
                        " Farer orollarida birinchi marta Merkid 1919-yil 22-iyunda Lisbergning vatani Foyin (Fámjin)da (Suvuroy oroli) uyiga qaytganidan so'ng, " +
                        "to'y marosimlarida osilgan. Moviy rang dastlab Norvegiya bayrog'idagi rangdan quyuqroq edi, lekin keyinchalik o'zgartirildi[3] va" +
                        " endi Norvegiya va Islandiya bayroqlariga qaraganda yorqinroq[4].\n" +
                        "\n" + "\tIkkinchi Jahon urushi paytida, 1940-yil 12-aprelda, fashistlar qo'shinlari Daniya hududiga bostirib kirgandan so'ng," +
                        " orollar Buyuk Britaniya tomonidan bosib olindi . 1940-yil 25-aprelda Britaniya hukumati Farer kemalari uchun Merkidni " +
                        "tasdiqladi. Shundan beri 25-aprel milliy bayram - Bayroq kuni (Flaggdagur) deb nishonlanadi. 1948-yil 23-martda ushbu " +
                        "bayroq Farer orollarining rasmiy bayrog'iga aylandi.",


                61.9241, 25.7482
            )
        )

        countries.add(
            DataCountry(
                R.drawable.fransiya1,
                R.drawable.fransiya1,
                "Fransiya",
                "Parij",
                "Yevropa",

                "\tFransiyaning sharq va janubida togʻ tizmalari," +
                        " markazining janubiy qismida togʻ va keng tekisliklar bor. Alp togʻlari bilan Yura togʻlari Italiya va Shveysariya " +
                        "bilan tabiiy chegarani tashkil etgan. Fransiyadagi Alp togʻlarining koʻp choʻqqilari 4000 m dan ziyod. Eng baland joyi " +
                        "— Monblan togʻi (4807 m). Balandligi 1700 m gacha boʻlgan Yura togʻlari Belfort pastligi tomonga Rona daryosi vodiylari " +
                        "uzra pasayib boradi. Belfort pastligining shimoli- sharqiy tomonidan Reyn boʻylab, Fransiya Germaniya chegarasi oʻtadi." +
                        " Bu joyda balandligi 1424 m boʻlgan Vogez togʻ tizmasi mavjud. Fransiya va Ispaniya oʻrtasida tabiiy chegara boʻlgan " +
                        "Pirenei togʻlarining balandligi Fransiya tomonida 3298 m ga (Vinmal) yetadi. Fransiyada foydali qazilmalardan koʻmir," +
                        " temir rudasi, uran, tabiiy gaz, volfram va surma, talk xomashyosi, qoʻrgʻoshin, oltingugurt va rux bor. Neft va gaz juda kam miqdorda.\n" +
                        "\n" +
                        "\tIqlimi asosan uch xil: okean, kontinental va dengiz iqlimi. Fransiya iqlimi qishloq xoʻjaligi uchun qulay. Mamlakatning koʻp " +
                        "qismida okean iqlimi. Gʻarb va shimolida Atlantika okeanidan nam havo oqimi kelib, moʻtadil iqlimni hosil qiladi: yozda salqin, " +
                        "qishda iliq. Yil boʻyi yomgʻir yogʻib turadi. Oʻrta dengiz sohillari, Yura, Rona pasttekisliklari va Korsikaning iqlimi subtropik. " +
                        "U yerlarda qish iliq, yoz esa quruq va issiq. Sharq va shimoli-sharqdagi tekislik hamda pasttekisliklarda yanvar -fevralda oʻrtacha " +
                        "temperatura 13°, gʻarb va janubi-gʻarbda 5—7°, mamlakat janubida 8—10°. Iyul va avgustda tekisliklarda 16—18°, shimolida 20—22°, " +
                        "janubi-gʻarbda 23—24\". Yillik yogʻinning eng koʻpi (1500-2000 mm) Alp, Vogez, Sevenn va Pirenei togʻlarining gʻarbiy qismiga toʻgʻri " +
                        "keladi. Yirik daryolari: Luara, Rona, Sena, Garonna.Mamlakat sharqida Reyn daryosining bir qismi oʻtgan. Fransiyada koʻl kam, Jeneva" +
                        " koʻlining koʻp qismi Shveysariya hududida joylashgan. Tuprogʻi qoʻngʻir oʻrmon tuproqlari, shoʻrxok kulrang, chimli kulrang, qoʻngʻir" +
                        " rendzin, kulrang hamda „terra rossa“ deb ataluvchi qizil tuproqlardan iborat. Oʻrmonlar mamlakat hududining 20 % ni tashkil etadi. " +
                        "Shimolda keng bargli oʻrmonlar (dub, qayin, shumtol), Oʻrta dengiz sohilida dub va qaragʻay oʻsadi. Hayvonot dunyosi: sut emizuvchilardan " +
                        "yovvoyi oʻrmon mushugi, tulki, boʻrsiq, bugʻu, kiyik, toʻngʻiz, olmaxon, quyon; togʻ tepalarida togʻ echkisi, olmaxon, alp sugʻuri, qora " +
                        "echki uchraydi. Qushlardan kaklik, bulduruq, loyxoʻrak, yakantovuq, olaqargʻa, qorayaloq, chumchuq, kaptar, burgut, janubda qizil gʻoz" +
                        " yashaydi. Daryolarda turli baliq\n" +
                        "\n" +
                        "\tlar bor. Mamlakat hududining 10 % himoya ostiga olingan. Ular: milliy bogʻ (Ekren, Sevenn va boshqalar), hududiy milliy bogʻ va kichik tabiiy" +
                        " qoʻriqxonalar. Koʻp qoʻriqxonalar togʻlarda joylashgan (Alpdagi Vanuaz va" +
                        " Pelvu milliy bogʻlari, Pireneydagi Neuvyel qoʻriqxonasi).",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.belgiya1,
                R.drawable.belgiya1,
                "Belgiya",
                "Bryussel",
                "Yevropa",

                "\tBu. xududining koʻpchilik kismi payettekislikdan iborat boʻlib," +
                        " shimoli-gʻarbdan janubi-sharqqa tomon kutarila boradi. Eng baland nuqtasi — Botranj choʻqkisi (694 m). Sohil yaqinidagi qum uyumlari " +
                        "va dambalar serhosil ekinzorlarni dengnz suvidan himoya qiladi. Foydali qazilmalari: toshkoʻmir, qurilish materiallari, jumladan marmar," +
                        " kam miqdorda temir va polimetall rudalar, surma. Iqlimi — moʻʼtadil, dengiz iqlimi. Yanvarda oʻrtacha temperatura 3°, 4°, iyulda 18°, 19°. " +
                        "Yillik yogʻin miqdori 700 – 1500 mm. Yirik daryolari: Maas. Shelda. Izer; ular bir-biri bilan kanallar orqali tutashtirilgan. " +
                        "Tuprogʻi shimolida asosai qoʻngʻir oʻrmon; janubda podzol va qoʻngʻir. B. maydoniining 18,7% ga yaqini oʻrmon, koʻproq dub va buk " +
                        "daraxtlari bilan qoplangan. Ardenn togʻlarida milliy bogʻ bor. Yovvoyi hayvonlardan bugʻu. toʻngʻiz, oʻrmon mushugi, oʻrmon suvsari, " +
                        "tovushqon va boshqa yashaydi. Olmaxon, dala sichqoni kabi kemiruvchilar, qirgovul, kaklik, oʻrmon loyxoʻragi kabi ovlanadigan qushlar bor.\n" +
                        "\n" +
                        "\tAholisi milliy tarkibi jihatidan 2 asosiy guruhga: flamandlar (58%) va vallonlar (32.5%)ga boʻlinadi. B.da 1 mln.ga yaqin ajnabiylar — italyanlar," +
                        " ispanlar, fransuzlar, greklar, gollandlar, marokashliklar, turklar va boshqalarlar ham bor. Aholining 96,5% shaharlarda yashaydi. " +
                        "Rasmiy tili — fransuz, niderland va nemis tili. Dindorlarning aksariyati katoliklar. " +
                        "Yirik shaharlari: Bryussel, Antverpen, Lyej, Rent, Sharlerua.",
                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.niderlandiya1,
                R.drawable.niderlandiya1,
                "Niderlandiya",
                "Amsterdam",
                "Yevropa",

                "\tNiderlandiya Oʻrta Yevropa tekisligining gʻarbiy" +
                        " qismida joylashgan. Shimoldan sayoz qoʻltiq va buxtalar oʻrab turadi. Soqili 56 m gacha balandlikdagi doʻngliklardan iborat," +
                        " toshqindan saqlanish uchun toʻgʻon va dambalar qurilgan. Yer yuzasi, asosan, payettekislik. Niderlandiya hududining 40 % " +
                        "dengiz sathidan pastda, faqat 2 % 50 m dan yuqori. Eng baland joyi 321 m. Niderlandiyaning payettekislik qismlari doim dengiz " +
                        "suvi bosish xavfi ostida. 1282-yilgi kuchli suv toshqini natijasida Zeyder-Ze qoʻltigʻi hosil boʻlgan. 33 km li damba qurilgach," +
                        " Zeyder-Zening janubiy qismi chuchuk suvli berk koʻlga aylangan. Niderlandiyaning sharqi morenali tepalik; shimoliy qum va gilli " +
                        "dengiz va daryo yotqiziqlaridan, sharqi muzlik yotqiziqlaridan, daryo deltalari esa allyuvial yotqiziqlardan tuzilgan. Koʻmir," +
                        " neft va gaz, torf, osh tuzi, kaolin konlari bor.\n" +
                        "\n" +
                        "Iqlim — dengiz iqlimi, qishi yumshoq, yozi iliq. Atlantika okeanidan yil boʻyi shamol esadi. Yanvarning oʻrtacha harorati " +
                        "1—3 °C, iyulniki 16—17 °C. Yillik yogʻin 650-750 mm. Tez-tez tuman tushadi. Qattiq sovuqlar ahyon-ahyonda boʻladi. Qor kam, " +
                        "yomgʻir koʻproq yogʻadi. Daryolar yil boʻyi sersuv; yiriklari: Reyn, Maas, Shelda. Sohil tuprogʻi unumdor, daryo vodiylariniki " +
                        "allyu-vial-oʻtloqi tuproq. Niderlandiyaning shimol va sharqida, asosan, chimli podzol, ayrim joylarida botqoqlangan tuproq. " +
                        "Niderlandiya hududining 70 % madaniy landshaft, 8 % oʻrmon. Qumli joylari butali vereyekzor (archagul), daryolar sohili tolzor. " +
                        "Hayvonot dunyosi juda kambagʻal. Yovvoyi quyon, tiyin, suvsar, sassiq-koʻzan, yelik yashaydi. Niderlandiyada qushlarning 180 turi bor." +
                        " Daryo deltalaridagi suzuvchi qushlar qishlaydigan joylar qoʻriqlanadi. Velyuzom, Kennemer doʻngliklari, Xoge-Velyuve milliy bogʻlari " + "va 8 ta qoʻriqxonasi bor.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.lixtinshteyn1,
                R.drawable.lixtinshteyn1,
                "Lixtenshteyn",
                "Vadus",
                "Yevropa",

                "\tLixtenshteyn hududining koʻp qismini Alp togʻlarining tarmoqlari egallagan." +
                        " Gʻarbida Reyn vodiysi joylashgan. Iqlimi moʻʼtadil, yillik yogʻin — 700–1200 mm. Hududining 1/4 qismi oʻrmon, asosan, qoraqaragʻay, qora qayin," +
                        " eman oʻsadi. Togʻlarda subalp va alp oʻtlokdari bor.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.lyukssemburg1,
                R.drawable.lyukssemburg1,
                "Lyuksemburg",
                "Lyuksemburg",
                "Yevropa",

                "\tMamlakat hududining koʻp qismi tepaliklar uchrab turadigan" +
                        " 300-400 m balandlikdagi tekisliklardan iborat. Shimolida Ardenna va Reyn Slanetsli togʻlarining tarmoqlari (balandligi 400-500 m)" +
                        " joylashgan. Temir ruda, slanets, ohaktosh konlari bor. Iqlimi moʻʼtadil, yumshoq. Yanvarning oʻrtacha temperaturasi 0 dan 2° gacha," +
                        " iyulniki 17° atro-fida. Yillik yogʻin 700-800 mm. Daryolari zich, sertarmoq, asosiy daryosi — Mozel. Tuprogi aksar qismida qoʻngʻir " +
                        "oʻrmon va chimli podzol tuproq. Luksemburg hududining 1/3 qismi (asosan, shim.) oʻrmon.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.shvetsariya1,
                R.drawable.shvetsariya1,
                "Sheytsariya",
                "Bern",
                "Yevropa",

                "\tHududining katta qismida Alp togʻlari joylashgan (bal. 4634 m gacha," +
                        " Dyufur togʻi). Mamlakat markazida Shveysariya yassitogʻligi, shimoliy gʻarbida Yura togʻlari bor. Iqlimi nam, moʻtadil iqlim boʻlib, " +
                        "Jenevada yanvar oyining oʻrtacha temperaturasi 0°, iyul oyining oʻrtacha temperaturasi 19°. Oʻrtacha yillik yogʻin miqdori 800–2500 mm." +
                        " shahrida daryo koʻp. Reyn (Aare irmogʻi bilan) daryosi, Rona, Inn, Tichino daryolarining yuqori oqimi shahridan oqib oʻtadi. Jeneva," +
                        " Boden va boshqalar koʻllar bor. Togʻ qoʻngʻir oʻrmon va togʻ oʻtloqi tuproqlar tarqalgan. Mamlakat hududining 24% i oʻrmon. " +
                        "Yassitogʻlik va togʻlarda kengbargli hamda ignabargli daraxtlar oʻsadi, baland togʻlar subalp va alp oʻtloqlari bilan qoplangan." +
                        " Alp togʻlarida muzliklar bor (2 ming km²ga yaqin). Hayvonot dunyosi boy. Togʻlarda sut emizuvchilardan yovvoyi echki, suvsar, " +
                        "quyon, sugʻur, ayiq, tulki va boshqalar, parrandalardan burgut, karqur, togʻchumchuq, daryo va koʻl qirgʻoqlarida baliqchi qush " +
                        "uchraydi, suvlarda turli xil baliqlar bor. Togʻlarda turizm, alpinizm, sportning qishki turlari bilan shug'ullanish uchun " +
                        "sharoitlar yaratilgan. Shveysariya milliy bogʻi, koʻplab rezervat va buyurtma qoʻriqxonalar bor.\n" +
                        "\n" +
                        "\tAholisi olmon-shveysariyaliklar, fransuz-shveysariyaliklar, italyanshveysariyaliklar va reto-romanlardan iborat. " +
                        "Italyan, nemis, ispan, fransuz, portugal va boshqalar ham yashaydi. Rasmiy tillar — nemis, fransuz, italyan va reto-roman tillari. " +
                        "Aholining 67,7% shaharlarda istiqomat qiladi. Dindorlarning aksariyati katolik va protestantlar. Yirik shaharlari: Syurix, Bazel," +
                        " Jeneva, Bern, Lozanna.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.polsha1,
                R.drawable.polsha1,
                "Polsha",
                "Varshava",
                "Yevropa",
                "\tPolsha Visla va Odra daryolari havzasida, shimolida Boltiq dengizi" +
                        " va janubida Karpat va Sudet togʻlari oraligʻida joylashgan. Hududining 90% dan koʻprogʻi tekislik va payettekislik, janubida" +
                        " togʻliklar bor. Dengiz boʻylari past, qumloq. Qazilma boyliklari – toshkoʻmir, qoʻngʻir koʻmir, tabiiy gaz va neft, temir, " +
                        "mis, qoʻrgʻoshin, oltingugurt, rux; kaliymagniy tuz konlari bor. Iqlimi moʻʼtadil, okean iqlimi bilan kontinental iqlim oʻrta-sida." + " Yanvarning oʻrtacha temperaturasi –G dan – 6° gacha, iyulniki 10–19°. Yillik yogʻin 500–1800 mm. Yomgʻir va qordan suv oladigan Odra," +
                        " Visla, Bug, Notets va Var-ta daryolarida kema katnaydi. Polshada 9000 dan ortiq koʻl bor. Eng kattalari: Snyar-dvi (113,8 km²), Mamri (104 km²).\n" +
                        "\n" +
                        "\tPolsha hududining yarmidan koʻprogʻi haydaladigan yerlar, 28% oʻrmon. Aksariyat joylarda igna bargli, gʻarbi " +
                        "va janubida keng bargli daraxtlar usadi. Mamlakat shimoliy va sharqida yaxlit oʻrmon-zorlar (Belaya Veja pushchasining " +
                        "bir qismi va boshqalar) saqlangan. Shimoliy va shim,-sharkda katta maydonlar vereyekzor va torfli yerlar bilan band. Tekisliklarda" +
                        " aksari chimli-podzolli tuproqlar, sharq va shimoli-sharqda botqoqli tuproqlar, togʻ oldi va togʻ etaklarida qoʻngʻir oʻrmon va " +
                        "qora tuproklar, togʻlarda esa, togʻ qoʻngʻir, daryo vodiylarida allyuvial tuproqlar tarqalgan. Oʻrmonlarda boʻri, silovsin, tulki, " +
                        "boʻrsiq, ayiq; tuyoqlilardan toʻngʻiz, los, bugʻu yashaydi. Kushlardan karqur, kaklik, togʻlarda burgut uchraydi. Dengiz, koʻl va " +
                        "daryolarda baliq koʻp. Polshada Tatra, Penin va boshqa milliy bogʻlar bor.\n" +
                        "\n" +
                        "\tAholisining 98,5% polyaklar; ukrainlar, belaruslar, slovaklar ham yashaydi. Rasmiy til – polyak tili. Dindorlarning" +
                        " koʻpchiligi – katoliklar. Shahar aholisi –62,1%. Yirik shaharlari: Varshava, Lodz, Krakov, Vrotslav, Poznan, Gdansk " +
                        "va boshqa",
                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.chexiya1,
                R.drawable.chexiya1,
                "Chexiya",
                "Praga",
                "Yevropa",

                "\tChexiya hududining katta qismi Chexiya togʻlarida joylashgan." +
                        " Uning atrofida oʻrtacha balandlikdagi Shumova, Chexiya oʻrmoni, Rudali togʻlar (KrushneGori), Krkonoshe togʻlari " +
                        "(eng baland joyi 1602 m, Snejka togʻi) bor. Chexiya togʻlarining ichki qismi – Chexiya soyligi tepaliklar va ularni" +
                        " ajratib turuvchi past toglardan iborat. Moraviyada ham tepalik va past togʻlar koʻp. Chexiyaning janubiy va markaziy " +
                        "kismida ChexiyaMoraviya qirlari bor. Chexiyada kumir, temir rudasi, grafit, kaolin konlari mavjud.\n" +
                        "\n" +
                        "\tIklimi moʻʼtadil iklim. Gʻarbdan sharqqa va ichki soyliklarda kontinentallashib boradi. Tekisliklarda oʻrtacha " +
                        "temperatura yanvarda –2° dan –4° gacha, togʻlarda –8° dan – 10° gacha, iyulda 19–20°, togʻlarda 4–8°. " +
                        "Yillik yogʻin tekisliklarda oʻrtacha 500–700 mm, togʻlarda 1600–2100 mm. Mamlakatjanubiy va gʻarbida " +
                        "uncha katta boʻlmagan koʻllar bor. Asosiy daryolari – Laba (Elba), Vltava. Togʻ yon bagʻirlari aralash " +
                        "va igna bargli oʻrmonlar bilan qoplangan. Hayvonlardan togʻlarda qoʻngʻir ayiq, tulki, kiyik, yovvoyi echki," +
                        " tekisliklarda kemiruvchilar, kaltakesak va qushlarning koʻp turlari bor.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.germaniya2,
                R.drawable.germaniya2,
                "Slovakiya",
                "Slovakiya",
                "Yevropa",

                "\tGermaniya – togʻli mamlakat. Hududining aksariyat qismi Gʻarbiy Karpat togʻlari doirasida (Slovakiya Rudali togʻlari " +
                        "va boshqalar) joylashgan. Lisets shahridagi Zlati Vrx bazaltli tepaligi tabiat yodgorligidir. GerlaxovskiShtit togʻi (2655 m) – Gʻarbiy Karpat togʻlarining eng baland nuqtasi." +
                        " Janubini Oʻrta Dunay tekisligining bir kismi egallagan. Slovakiyada qoʻngʻir kumir, temir, marganets, polimetall rudalari, surma, magnezit konlari bor. Iklimi moʻʼtadil, kontinental." +
                        " Tekisliklarda oʻrtacha tempatura yanvarda –G dan –4°, Karpat togʻida –10° gacha, iyulda 19– 2G, togʻlarda 4° gacha. Yillik yogʻin tekisliklarda 450–700 mm, togʻlarda 2100 mm gacha. " + "Slovakiya daryolari (Dunay va uning irmoklari, Morava, Vag, Gron va boshqalar) gidroenergiyaning muxim manbalaridir. Slovakiya togʻlari oʻrmonlar bilan krplangan (mamlakat hududining 1/3 kismi)." +
                        " Janubiy qiyaliklarda keng bargli va aralash, shimoliy qiyaliklarda igna bargli daraxtlar oʻsadi. Tekisliklarda dehqonchilik qilinadi. Hayvonlardan qoʻngʻir ayiq, boʻri, silovsin, toʻngʻiz, quyon, " +
                        "olmaxon, tipratikan, turli qushlar bor, dare va koʻllarda baliq koʻp.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.norvegiya2,
                R.drawable.norvegiya2,
                "Albaniya",
                "Alistek",
                "Yevropa",
                "\tSlovakiya – togʻli mamlakat. Hududining aksariyat qismi Gʻarbiy Karpat togʻlari doirasida (Slovakiya Rudali togʻlari " +
                        "va boshqalar) joylashgan. Lisets shahridagi Zlati Vrx bazaltli tepaligi tabiat yodgorligidir. GerlaxovskiShtit togʻi (2655 m) – Gʻarbiy Karpat togʻlarining eng baland nuqtasi." +
                        " Janubini Oʻrta Dunay tekisligining bir kismi egallagan. Slovakiyada qoʻngʻir kumir, temir, marganets, polimetall rudalari, surma, magnezit konlari bor. Iklimi moʻʼtadil, kontinental." +
                        " Tekisliklarda oʻrtacha tempatura yanvarda –G dan –4°, Karpat togʻida –10° gacha, iyulda 19– 2G, togʻlarda 4° gacha. Yillik yogʻin tekisliklarda 450–700 mm, togʻlarda 2100 mm gacha. " + "Slovakiya daryolari (Dunay va uning irmoklari, Morava, Vag, Gron va boshqalar) gidroenergiyaning muxim manbalaridir. Slovakiya togʻlari oʻrmonlar bilan krplangan (mamlakat hududining 1/3 kismi)." +
                        " Janubiy qiyaliklarda keng bargli va aralash, shimoliy qiyaliklarda igna bargli daraxtlar oʻsadi. Tekisliklarda dehqonchilik qilinadi. Hayvonlardan qoʻngʻir ayiq, boʻri, silovsin, toʻngʻiz, quyon, " +
                        "olmaxon, tipratikan, turli qushlar bor, dare va koʻllarda baliq koʻp.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.islandiya2,
                R.drawable.islandiya2,
                "Kanada ",
                "Kanada",
                "Yevropa",

                "\tSlovakiya – togʻli mamlakat. Hududining aksariyat qismi Gʻarbiy Karpat togʻlari doirasida (Slovakiya Rudali togʻlari " +
                        "va boshqalar) joylashgan. Lisets shahridagi Zlati Vrx bazaltli tepaligi tabiat yodgorligidir. GerlaxovskiShtit togʻi (2655 m) – Gʻarbiy Karpat togʻlarining eng baland nuqtasi." +
                        " Janubini Oʻrta Dunay tekisligining bir kismi egallagan. Slovakiyada qoʻngʻir kumir, temir, marganets, polimetall rudalari, surma, magnezit konlari bor. Iklimi moʻʼtadil, kontinental." +
                        " Tekisliklarda oʻrtacha tempatura yanvarda –G dan –4°, Karpat togʻida –10° gacha, iyulda 19– 2G, togʻlarda 4° gacha. Yillik yogʻin tekisliklarda 450–700 mm, togʻlarda 2100 mm gacha. " + "Slovakiya daryolari (Dunay va uning irmoklari, Morava, Vag, Gron va boshqalar) gidroenergiyaning muxim manbalaridir. Slovakiya togʻlari oʻrmonlar bilan krplangan (mamlakat hududining 1/3 kismi)." +
                        " Janubiy qiyaliklarda keng bargli va aralash, shimoliy qiyaliklarda igna bargli daraxtlar oʻsadi. Tekisliklarda dehqonchilik qilinadi. Hayvonlardan qoʻngʻir ayiq, boʻri, silovsin, toʻngʻiz, quyon, " +
                        "olmaxon, tipratikan, turli qushlar bor, dare va koʻllarda baliq koʻp.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.lyuksemburg2,
                R.drawable.lyuksemburg2,
                "Kolumbia ",
                "Bogota",
                "Yevropa",

                "\tSlovakiya – togʻli mamlakat. Hududining aksariyat qismi Gʻarbiy Karpat togʻlari doirasida (Slovakiya Rudali togʻlari " +
                        "va boshqalar) joylashgan. Lisets shahridagi Zlati Vrx bazaltli tepaligi tabiat yodgorligidir. GerlaxovskiShtit togʻi (2655 m) – Gʻarbiy Karpat togʻlarining eng baland nuqtasi." +
                        " Janubini Oʻrta Dunay tekisligining bir kismi egallagan. Slovakiyada qoʻngʻir kumir, temir, marganets, polimetall rudalari, surma, magnezit konlari bor. Iklimi moʻʼtadil, kontinental." +
                        " Tekisliklarda oʻrtacha tempatura yanvarda –G dan –4°, Karpat togʻida –10° gacha, iyulda 19– 2G, togʻlarda 4° gacha. Yillik yogʻin tekisliklarda 450–700 mm, togʻlarda 2100 mm gacha. " + "Slovakiya daryolari (Dunay va uning irmoklari, Morava, Vag, Gron va boshqalar) gidroenergiyaning muxim manbalaridir. Slovakiya togʻlari oʻrmonlar bilan krplangan (mamlakat hududining 1/3 kismi)." +
                        " Janubiy qiyaliklarda keng bargli va aralash, shimoliy qiyaliklarda igna bargli daraxtlar oʻsadi. Tekisliklarda dehqonchilik qilinadi. Hayvonlardan qoʻngʻir ayiq, boʻri, silovsin, toʻngʻiz, quyon, " +
                        "olmaxon, tipratikan, turli qushlar bor, dare va koʻllarda baliq koʻp.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.lixtwynshteyn2,
                R.drawable.lixtwynshteyn2,
                "Cyprus",
                "Nicosia",
                "Yevropa",

                "\tCyours – togʻli mamlakat. Hududining aksariyat qismi Gʻarbiy Karpat togʻlari doirasida (Slovakiya Rudali togʻlari " +
                        "va boshqalar) joylashgan. Lisets shahridagi Zlati Vrx bazaltli tepaligi tabiat yodgorligidir. GerlaxovskiShtit togʻi (2655 m) – Gʻarbiy Karpat togʻlarining eng baland nuqtasi." +
                        " Janubini Oʻrta Dunay tekisligining bir kismi egallagan. Slovakiyada qoʻngʻir kumir, temir, marganets, polimetall rudalari, surma, magnezit konlari bor. Iklimi moʻʼtadil, kontinental." +
                        " Tekisliklarda oʻrtacha tempatura yanvarda –G dan –4°, Karpat togʻida –10° gacha, iyulda 19– 2G, togʻlarda 4° gacha. Yillik yogʻin tekisliklarda 450–700 mm, togʻlarda 2100 mm gacha. " + "Slovakiya daryolari (Dunay va uning irmoklari, Morava, Vag, Gron va boshqalar) gidroenergiyaning muxim manbalaridir. Slovakiya togʻlari oʻrmonlar bilan krplangan (mamlakat hududining 1/3 kismi)." +
                        " Janubiy qiyaliklarda keng bargli va aralash, shimoliy qiyaliklarda igna bargli daraxtlar oʻsadi. Tekisliklarda dehqonchilik qilinadi. Hayvonlardan qoʻngʻir ayiq, boʻri, silovsin, toʻngʻiz, quyon, " +
                        "olmaxon, tipratikan, turli qushlar bor, dare va koʻllarda baliq koʻp.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.polsha2,
                R.drawable.polsha2,
                "Ekvador",
                "Quito",
                "Yevropa",

                "\tSlovakiya – togʻli mamlakat. Hududining aksariyat qismi Gʻarbiy Karpat togʻlari doirasida (Slovakiya Rudali togʻlari " +
                        "va boshqalar) joylashgan. Lisets shahridagi Zlati Vrx bazaltli tepaligi tabiat yodgorligidir. GerlaxovskiShtit togʻi (2655 m) – Gʻarbiy Karpat togʻlarining eng baland nuqtasi." +
                        " Janubini Oʻrta Dunay tekisligining bir kismi egallagan. Slovakiyada qoʻngʻir kumir, temir, marganets, polimetall rudalari, surma, magnezit konlari bor. Iklimi moʻʼtadil, kontinental." +
                        " Tekisliklarda oʻrtacha tempatura yanvarda –G dan –4°, Karpat togʻida –10° gacha, iyulda 19– 2G, togʻlarda 4° gacha. Yillik yogʻin tekisliklarda 450–700 mm, togʻlarda 2100 mm gacha. " + "Slovakiya daryolari (Dunay va uning irmoklari, Morava, Vag, Gron va boshqalar) gidroenergiyaning muxim manbalaridir. Slovakiya togʻlari oʻrmonlar bilan krplangan (mamlakat hududining 1/3 kismi)." +
                        " Janubiy qiyaliklarda keng bargli va aralash, shimoliy qiyaliklarda igna bargli daraxtlar oʻsadi. Tekisliklarda dehqonchilik qilinadi. Hayvonlardan qoʻngʻir ayiq, boʻri, silovsin, toʻngʻiz, quyon, " +
                        "olmaxon, tipratikan, turli qushlar bor, dare va koʻllarda baliq koʻp.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.shvetsariya3,
                R.drawable.shvetsariya3,
                "Indonesia",
                "Jakarta",
                "Asia",

                "\tIndonesia – togʻli mamlakat. Hududining aksariyat qismi Gʻarbiy Karpat togʻlari doirasida (Slovakiya Rudali togʻlari " +
                        "va boshqalar) joylashgan. Lisets shahridagi Zlati Vrx bazaltli tepaligi tabiat yodgorligidir. GerlaxovskiShtit togʻi (2655 m) – Gʻarbiy Karpat togʻlarining eng baland nuqtasi." +
                        " Janubini Oʻrta Dunay tekisligining bir kismi egallagan. Slovakiyada qoʻngʻir kumir, temir, marganets, polimetall rudalari, surma, magnezit konlari bor. Iklimi moʻʼtadil, kontinental." +
                        " Tekisliklarda oʻrtacha tempatura yanvarda –G dan –4°, Karpat togʻida –10° gacha, iyulda 19– 2G, togʻlarda 4° gacha. Yillik yogʻin tekisliklarda 450–700 mm, togʻlarda 2100 mm gacha. " + "Slovakiya daryolari (Dunay va uning irmoklari, Morava, Vag, Gron va boshqalar) gidroenergiyaning muxim manbalaridir. Slovakiya togʻlari oʻrmonlar bilan krplangan (mamlakat hududining 1/3 kismi)." +
                        " Janubiy qiyaliklarda keng bargli va aralash, shimoliy qiyaliklarda igna bargli daraxtlar oʻsadi. Tekisliklarda dehqonchilik qilinadi. Hayvonlardan qoʻngʻir ayiq, boʻri, silovsin, toʻngʻiz, quyon, " +
                        "olmaxon, tipratikan, turli qushlar bor, dare va koʻllarda baliq koʻp.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.shvetsariya4,
                R.drawable.shvetsariya4,
                "Malti ",
                "Valetta",
                "Yevropa",

                "\tSlovakiya – togʻli mamlakat. Hududining aksariyat qismi Gʻarbiy Karpat togʻlari doirasida (Slovakiya Rudali togʻlari " +
                        "va boshqalar) joylashgan. Lisets shahridagi Zlati Vrx bazaltli tepaligi tabiat yodgorligidir. GerlaxovskiShtit togʻi (2655 m) – Gʻarbiy Karpat togʻlarining eng baland nuqtasi." +
                        " Janubini Oʻrta Dunay tekisligining bir kismi egallagan. Slovakiyada qoʻngʻir kumir, temir, marganets, polimetall rudalari, surma, magnezit konlari bor. Iklimi moʻʼtadil, kontinental." +
                        " Tekisliklarda oʻrtacha tempatura yanvarda –G dan –4°, Karpat togʻida –10° gacha, iyulda 19– 2G, togʻlarda 4° gacha. Yillik yogʻin tekisliklarda 450–700 mm, togʻlarda 2100 mm gacha. " + "Slovakiya daryolari (Dunay va uning irmoklari, Morava, Vag, Gron va boshqalar) gidroenergiyaning muxim manbalaridir. Slovakiya togʻlari oʻrmonlar bilan krplangan (mamlakat hududining 1/3 kismi)." +
                        " Janubiy qiyaliklarda keng bargli va aralash, shimoliy qiyaliklarda igna bargli daraxtlar oʻsadi. Tekisliklarda dehqonchilik qilinadi. Hayvonlardan qoʻngʻir ayiq, boʻri, silovsin, toʻngʻiz, quyon, " +
                        "olmaxon, tipratikan, turli qushlar bor, dare va koʻllarda baliq koʻp.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.polsha2,
                R.drawable.polsha2,
                "Montenegro",
                "Podgorica",
                "Yevropa",

                "\tSlovakiya – togʻli mamlakat. Hududining aksariyat qismi Gʻarbiy Karpat togʻlari doirasida (Slovakiya Rudali togʻlari " +
                        "va boshqalar) joylashgan. Lisets shahridagi Zlati Vrx bazaltli tepaligi tabiat yodgorligidir. GerlaxovskiShtit togʻi (2655 m) – Gʻarbiy Karpat togʻlarining eng baland nuqtasi." +
                        " Janubini Oʻrta Dunay tekisligining bir kismi egallagan. Slovakiyada qoʻngʻir kumir, temir, marganets, polimetall rudalari, surma, magnezit konlari bor. Iklimi moʻʼtadil, kontinental." +
                        " Tekisliklarda oʻrtacha tempatura yanvarda –G dan –4°, Karpat togʻida –10° gacha, iyulda 19– 2G, togʻlarda 4° gacha. Yillik yogʻin tekisliklarda 450–700 mm, togʻlarda 2100 mm gacha. " + "Slovakiya daryolari (Dunay va uning irmoklari, Morava, Vag, Gron va boshqalar) gidroenergiyaning muxim manbalaridir. Slovakiya togʻlari oʻrmonlar bilan krplangan (mamlakat hududining 1/3 kismi)." +
                        " Janubiy qiyaliklarda keng bargli va aralash, shimoliy qiyaliklarda igna bargli daraxtlar oʻsadi. Tekisliklarda dehqonchilik qilinadi. Hayvonlardan qoʻngʻir ayiq, boʻri, silovsin, toʻngʻiz, quyon, " +
                        "olmaxon, tipratikan, turli qushlar bor, dare va koʻllarda baliq koʻp.",

                61.9241, 25.7482
            )
        )

        countries.add(
            DataCountry(
                R.drawable.italiya2,
                R.drawable.italiya2,
                "Boliviya",
                "Boliv",
                "Yevropa",

                "\tSlovakiya – togʻli mamlakat. Hududining aksariyat qismi Gʻarbiy Karpat togʻlari doirasida (Slovakiya Rudali togʻlari " +
                        "va boshqalar) joylashgan. Lisets shahridagi Zlati Vrx bazaltli tepaligi tabiat yodgorligidir. GerlaxovskiShtit togʻi (2655 m) – Gʻarbiy Karpat togʻlarining eng baland nuqtasi." +
                        " Janubini Oʻrta Dunay tekisligining bir kismi egallagan. Slovakiyada qoʻngʻir kumir, temir, marganets, polimetall rudalari, surma, magnezit konlari bor. Iklimi moʻʼtadil, kontinental." +
                        " Tekisliklarda oʻrtacha tempatura yanvarda –G dan –4°, Karpat togʻida –10° gacha, iyulda 19– 2G, togʻlarda 4° gacha. Yillik yogʻin tekisliklarda 450–700 mm, togʻlarda 2100 mm gacha. " + "Slovakiya daryolari (Dunay va uning irmoklari, Morava, Vag, Gron va boshqalar) gidroenergiyaning muxim manbalaridir. Slovakiya togʻlari oʻrmonlar bilan krplangan (mamlakat hududining 1/3 kismi)." +
                        " Janubiy qiyaliklarda keng bargli va aralash, shimoliy qiyaliklarda igna bargli daraxtlar oʻsadi. Tekisliklarda dehqonchilik qilinadi. Hayvonlardan qoʻngʻir ayiq, boʻri, silovsin, toʻngʻiz, quyon, " +
                        "olmaxon, tipratikan, turli qushlar bor, dare va koʻllarda baliq koʻp.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.niderlandiya2,
                R.drawable.niderlandiya2,
                "Somalia",
                "Mogadishu",
                "Yevropa",

                "\tSlovakiya – togʻli mamlakat. Hududining aksariyat qismi Gʻarbiy Karpat togʻlari doirasida (Slovakiya Rudali togʻlari " +
                        "va boshqalar) joylashgan. Lisets shahridagi Zlati Vrx bazaltli tepaligi tabiat yodgorligidir. GerlaxovskiShtit togʻi (2655 m) – Gʻarbiy Karpat togʻlarining eng baland nuqtasi." +
                        " Janubini Oʻrta Dunay tekisligining bir kismi egallagan. Slovakiyada qoʻngʻir kumir, temir, marganets, polimetall rudalari, surma, magnezit konlari bor. Iklimi moʻʼtadil, kontinental." +
                        " Tekisliklarda oʻrtacha tempatura yanvarda –G dan –4°, Karpat togʻida –10° gacha, iyulda 19– 2G, togʻlarda 4° gacha. Yillik yogʻin tekisliklarda 450–700 mm, togʻlarda 2100 mm gacha. " + "Slovakiya daryolari (Dunay va uning irmoklari, Morava, Vag, Gron va boshqalar) gidroenergiyaning muxim manbalaridir. Slovakiya togʻlari oʻrmonlar bilan krplangan (mamlakat hududining 1/3 kismi)." +
                        " Janubiy qiyaliklarda keng bargli va aralash, shimoliy qiyaliklarda igna bargli daraxtlar oʻsadi. Tekisliklarda dehqonchilik qilinadi. Hayvonlardan qoʻngʻir ayiq, boʻri, silovsin, toʻngʻiz, quyon, " +
                        "olmaxon, tipratikan, turli qushlar bor, dare va koʻllarda baliq koʻp.",

                61.9241, 25.7482
            )
        )
        countries.add(
            DataCountry(
                R.drawable.irlandiya2,
                R.drawable.irlandiya2,
                "Australiya",
                "Kanberra",
                "Australiya",

                "\tAvstraliya sayyoramizni lol qoldirishda davom etmoqda. Dunyoning qolgan qismidan ajralgandek ko‘rinadigan qit'a sirli pushtirang ko‘li, flora va faunaning eng zaharli turlari, shuningdek, boshqa ajoyibotlari bilan maqtana oladi. Bu mamlakat haqida nimalarni bilamiz?" +
                        "Bu yerda qariyb 11 mingta plyaj borligini bilarmidingiz? Aniqroq aytadigan bo‘lsak, 10 685 ta. Yana 800 tasi orollarda joylashgan. Agar har kuni yangi plyajga borilsa, buning uchun 30 yil kerak bo‘ladi. Aholining katta qismi aynan qirg‘oq bo‘yida yashaydi. Axir, bu yerda dam olish uchun ham, sport bilan faol shug‘ullanish uchun ham plyajlarni topish mumkin-da!" +
                        "Biz uchun odatiy tus olgan simsiz internet aynan Avstraliyada paydo bo‘lganini bilasizmi? U yerda sakrovchi chastotalar uslubi 1940 yildayoq kashf etilgan. Ana undan keyin texnologiya zamonaviy ko‘rinishga olib kelindi." +
                        "Sayyoraning 10 ta eng zaharli ilonlari aynan shu qit'ada yashaydi. Sezgir bo‘ling: qirg‘oqda dam ola turib yoki shahar markazidagi supermarketga borganda kutilmaganda ularga duch kelishingiz mumkin." +
                        "Bu yerda o‘rgimchaklar aqlbovar qilmas darajada ko‘p. Avstraliyaliklar bunday mehmonlarni uylarida uchratishga odatlanib qolishgan. Xavflilari ham, bezararlari ham bor. Umuman olganda, vaziyat yoqimsiz tus olganida tibbiyot vakillarining yordami talab etiladi. O‘rgimchaklar bilan bog‘liq so‘nggi o‘lim holati o‘tgan asrning 80-yillarida sodir bo‘lgan." +
                        "Kuber-Pedi – sahrodagi yerosti konchilar shahri. Chidab bo‘lmas darajadagi jazirama odamlarni yerosti uylari qurishga majbur qilgan." +
                        "Bugungi kunda o‘z turining yagona vakili sanaladi. Albinos-kit Migala nomini olgan. Mana 20 yildirki Sidney aholisi va mehmonlariga zavq ulashib kelmoqda. Shu yili o‘z zurriyodini dunyoga keltirdi. Demak, tez orada qirg‘oqbo‘yi suvlarida xalqning ikkita oppoq sevimli jonzoti suzib yuradi.",
                61.9241, 25.7482
            )
        )
    }

    override fun getCountries(): ArrayList<DataCountry> {
        val top10 = ArrayList<DataCountry>()
        for (i in 0 until countries.size) {
            top10.add(countries[i])
        }
        return top10
    }

    override fun getAll() = countries
}