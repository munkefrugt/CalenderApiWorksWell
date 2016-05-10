package com.example.calendarquickstart2;

import java.util.List;

/**
 * Created by v on 4/27/16.
 */


// when we call the link, aka url api thing, what we are fething from the server.
// here we recive the response.
// with a plugin "GsonFormat" plugin.

// rightclick-> generate-> GsonFormat-> insert the json file from the, that has first been organised in json viewer.
    //-> click format  and ok

public class Response {


    /**
     * geocoded_waypoints : [{"geocoder_status":"OK","partial_match":true,"place_id":"ChIJ0QcEupxTUkYR6cXMT2pE3XM","types":["train_station","transit_station","point_of_interest","establishment"]},{"geocoder_status":"OK","place_id":"ChIJM1J2oRZSUkYRLque0xTAuLw","types":["locality","political"]}]
     * routes : [{"bounds":{"northeast":{"lat":55.724238,"lng":12.5923013},"southwest":{"lat":55.6626651,"lng":12.5332139}},"copyrights":"Map data ©2016 Google","legs":[{"arrival_time":{"text":"1:31pm","time_zone":"Europe/Copenhagen","value":1462879910},"departure_time":{"text":"1:01pm","time_zone":"Europe/Copenhagen","value":1462878060},"distance":{"text":"12.4 km","value":12404},"duration":{"text":"31 mins","value":1850},"end_address":"2400 Emdrup, Denmark","end_location":{"lat":55.724238,"lng":12.5334013},"start_address":"Enghave St., 1720 København, Denmark","start_location":{"lat":55.663447,"lng":12.539486},"steps":[{"distance":{"text":"11.6 km","value":11597},"duration":{"text":"21 mins","value":1260},"end_location":{"lat":55.720887,"lng":12.540687},"html_instructions":"Commuter train towards Farum St.","polyline":{"points":"qwvrIybpkAbAV@GFiAJyAHeAD_@NeCR_DHuBBoB@iBCgBGeBGcAK_BOwAOwAQyAQyAOsAQ_BO}AKuAI_AIwAK_BEcAGyAG_BOyDIwBGkBKsBGcBG_AGqAIyAIkBK}AKoAIs@K_AMu@SkAESI]U}@I]Mc@Um@Ws@a@aAg@gAUc@a@_A]u@]w@]aAa@iAc@oAc@mAa@iASm@Yo@c@{@a@s@QWMQ?AKIIKMMQUOMGGMKKIAAQOKIMMQMAAOOSQSQUOSKSMe@OQEICYI]ISCA?AAWGWGWEUC]CU?UBKBYDOFWJWJYNUNOJOJ}DhEw@~@g@qB_BdB]`@yA`Bc@h@SNQPiAlAcA~@y@f@o@RC??|@a@@[AWAWCUEQCSE[K[KYMKGOGOIKEo@e@g@e@II_@a@[a@Ya@]k@Ue@Oc@EOCMEOCOGQOu@Qm@Mi@YcAQe@Uc@W_@c@k@kCkDiA_BeA{AoAaBoBmCgBmCu@eAo@gAQ][i@y@_BsBqDyBoDsBmDmB}CaBsCcAiBeAyB{@gBi@eAk@kAYm@]s@a@aA[q@M]GKM[KWIQM[[y@[{@CKM]I]mA}CGIIOIQGOQa@Wq@Oa@EGO_@M_@Qa@KUGOQa@Ue@Yk@Wg@Yk@We@Yk@}AwCqAiCyBeEGKQ_@w@}AaAiBgAuBU_@mBeDe@s@wBmC_@_@_Aw@KEYQGE]Qe@Q]K_@Ke@Ie@CGC[AY?K?Y@Y@YB]Dg@Fe@Fi@Fa@D[BWBoALsAHe@BoAJuAJkAHcAHuAHoAJsAHm@FaAFYBe@D_@B_@BG@}@Di@F_AJ[D]Hy@Rq@TOFDh@WFg@Ng@Li@No@P_@Jc@N]LC?c@PE?e@Re@Nm@Tg@Pg@PEBe@Pg@Pa@NC@_@NC@c@Ne@Tg@V[Pa@Va@Z]V]Xa@Z[Xc@b@i@h@e@h@g@j@u@~@wAjBeAfBgAbC]x@mAnDY~@ENOj@[hAOf@I\\Ql@Mh@Of@St@Kb@Ol@[dAQp@U|@WbAW~@a@xAq@jCM^Op@Qn@Of@i@tBs@lCK^Kd@e@vBKp@OdASdBEl@Ex@GlACn@C~BEtDCtDE~DA`CAx@?lAAx@?NAvA?JCpCA\\AhBAzC@bA@`@@v@FjADj@HlAFd@NlAJx@Pv@Nv@Rx@Z`A\\bAZt@d@~@^n@j@x@p@|@HJDHNPf@n@\\h@b@p@d@t@d@z@BFb@x@\\p@^t@`@v@d@bARf@Vn@h@vABFh@fB\\nA^vA^~AFTJb@Lp@Lt@Hn@Fj@BLNrAHr@H~@HnADpA@jA?|@Ct@?FCp@?DG~@KbAIr@G^G\\ETETQr@Uz@[z@]v@a@v@[f@WZc@d@u@j@o@\\u@Xg@Nk@Nw@TWHm@Tk@Xi@ZkAv@eAr@mAz@m@`@wAbAk@`@sA~@}B|A}AdAmAz@w@h@YRYTUNqCfB[Re@XFb@"},"start_location":{"lat":55.663447,"lng":12.539486},"transit_details":{"arrival_stop":{"location":{"lat":55.720887,"lng":12.540687},"name":"Emdrup St."},"arrival_time":{"text":"1:22pm","time_zone":"Europe/Copenhagen","value":1462879320},"departure_stop":{"location":{"lat":55.663447,"lng":12.539486},"name":"Enghave St."},"departure_time":{"text":"1:01pm","time_zone":"Europe/Copenhagen","value":1462878060},"headsign":"Farum St.","line":{"agencies":[{"name":"DSB S-tog","phone":"011 45 70 13 14 15","url":"http://www.dsb.dk/"}],"short_name":"B","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/rail.png","name":"Commuter train","type":"COMMUTER_TRAIN"}},"num_stops":9},"travel_mode":"TRANSIT"},{"distance":{"text":"0.8 km","value":807},"duration":{"text":"10 mins","value":590},"end_location":{"lat":55.724238,"lng":12.5334013},"html_instructions":"Walk to 2400 Emdrup, Denmark","polyline":{"points":"q~asIijpkAe@IEBiBdA]RCQMwA}BfASDQB?nAAnA?zAAdHClBAdAMxEEt@KpCA`@CfAExDiBSiAKiAE"},"start_location":{"lat":55.720887,"lng":12.540687},"steps":[{"distance":{"text":"0.1 km","value":120},"duration":{"text":"2 mins","value":96},"end_location":{"lat":55.7218762,"lng":12.5408044},"html_instructions":"Head <b>north<\/b> toward <b>Emdrupvej<\/b><div style=\"font-size:0.9em\">Take the stairs<\/div>","polyline":{"points":"q~asIijpkAe@IEBiBdA]RCQMwA"},"start_location":{"lat":55.720887,"lng":12.540687},"travel_mode":"WALKING"},{"distance":{"text":"0.1 km","value":95},"duration":{"text":"1 min","value":63},"end_location":{"lat":55.7226972,"lng":12.5403934},"html_instructions":"Turn <b>left<\/b> onto <b>Emdrupvej<\/b>","maneuver":"turn-left","polyline":{"points":"wdbsI_kpkA}BfASDQB"},"start_location":{"lat":55.7218762,"lng":12.5408044},"travel_mode":"WALKING"},{"distance":{"text":"0.5 km","value":451},"duration":{"text":"6 mins","value":333},"end_location":{"lat":55.722972,"lng":12.5332139},"html_instructions":"Turn <b>left<\/b> to stay on <b>Emdrupvej<\/b>","maneuver":"turn-left","polyline":{"points":"{ibsImhpkA?nAAnA?zAAdHClBAdAMxEEt@KpCA`@CfAExD"},"start_location":{"lat":55.7226972,"lng":12.5403934},"travel_mode":"WALKING"},{"distance":{"text":"0.1 km","value":141},"duration":{"text":"2 mins","value":98},"end_location":{"lat":55.724238,"lng":12.5334013},"html_instructions":"Turn <b>right<\/b> onto <b>Emdrupgårdsvej<\/b><div style=\"font-size:0.9em\">Destination will be on the left<\/div>","maneuver":"turn-right","polyline":{"points":"qkbsIq{nkAiBSiAKiAE"},"start_location":{"lat":55.722972,"lng":12.5332139},"travel_mode":"WALKING"}],"travel_mode":"WALKING"}],"traffic_speed_entry":[],"via_waypoint":[]}],"overview_polyline":{"points":"qwvrIybpkAbAV@GRcDr@kKLeFAqEOiD[wDcA_Ja@}DUuCc@uIi@}Nc@iJSeEWmDUsBa@aCo@mCc@qAy@uB}BaFaCsGeAwCm@}AeAoB_@i@c@e@cB}Aq@m@g@c@i@[y@][ImAWiAWUCs@Ca@Fi@Lo@Vo@^_@VuFhGg@qB_BdBwBbCsCxCcA~@y@f@o@RC??|@a@@s@Cm@Ie@Iw@WeAg@{@k@q@o@{@cAw@mAe@iAI]a@gB_@wAk@iBm@cAoDwEoIkL}CsEaAeBuAiCmFaJaFkIeD}FwEsJuBuEo@}AoAcDQi@wA{Dc@{@{BuFiAcCcBeDeOqYcCeE}CaE_BwAe@We@WcA]eAUm@G{A?s@DeALmCXaF^}QrAqHh@{APwA\\aA\\Dh@WFoA\\yA`@eBh@yFrBsBt@mBv@cAh@cAr@yBfBmAlAmAtAmCjDeAfBgAbCkBhF_@nAeAzDmC~JiEhPyBjIq@|C[vBYrCMfCGnDIjJIhMClDItLBdBHbCNxBVrB\\pBb@pBx@dC`AtBjAhBz@hAzAtBhAfBh@bAbCxEx@jB`AfCjBvG`AjEb@~CXfCRnCF|CCrBK~BUvBO|@Kj@g@nBy@rB}@~A{@`Au@j@o@\\}Ah@cBd@eA^uAt@mGhEuIbG}F~D}E`De@XFb@e@IEBgCxAQiB}BfASDQB?nAAjDErKO~GQfEEhBExDiBSsCQ"},"summary":"","warnings":["Walking directions are in beta.    Use caution \u2013 This route may be missing sidewalks or pedestrian paths."],"waypoint_order":[]}]
     * status : OK
     */

    private String status;
    /**
     * geocoder_status : OK
     * partial_match : true
     * place_id : ChIJ0QcEupxTUkYR6cXMT2pE3XM
     * types : ["train_station","transit_station","point_of_interest","establishment"]
     */

    private List<GeocodedWaypointsBean> geocoded_waypoints;
    /**
     * bounds : {"northeast":{"lat":55.724238,"lng":12.5923013},"southwest":{"lat":55.6626651,"lng":12.5332139}}
     * copyrights : Map data ©2016 Google
     * legs : [{"arrival_time":{"text":"1:31pm","time_zone":"Europe/Copenhagen","value":1462879910},"departure_time":{"text":"1:01pm","time_zone":"Europe/Copenhagen","value":1462878060},"distance":{"text":"12.4 km","value":12404},"duration":{"text":"31 mins","value":1850},"end_address":"2400 Emdrup, Denmark","end_location":{"lat":55.724238,"lng":12.5334013},"start_address":"Enghave St., 1720 København, Denmark","start_location":{"lat":55.663447,"lng":12.539486},"steps":[{"distance":{"text":"11.6 km","value":11597},"duration":{"text":"21 mins","value":1260},"end_location":{"lat":55.720887,"lng":12.540687},"html_instructions":"Commuter train towards Farum St.","polyline":{"points":"qwvrIybpkAbAV@GFiAJyAHeAD_@NeCR_DHuBBoB@iBCgBGeBGcAK_BOwAOwAQyAQyAOsAQ_BO}AKuAI_AIwAK_BEcAGyAG_BOyDIwBGkBKsBGcBG_AGqAIyAIkBK}AKoAIs@K_AMu@SkAESI]U}@I]Mc@Um@Ws@a@aAg@gAUc@a@_A]u@]w@]aAa@iAc@oAc@mAa@iASm@Yo@c@{@a@s@QWMQ?AKIIKMMQUOMGGMKKIAAQOKIMMQMAAOOSQSQUOSKSMe@OQEICYI]ISCA?AAWGWGWEUC]CU?UBKBYDOFWJWJYNUNOJOJ}DhEw@~@g@qB_BdB]`@yA`Bc@h@SNQPiAlAcA~@y@f@o@RC??|@a@@[AWAWCUEQCSE[K[KYMKGOGOIKEo@e@g@e@II_@a@[a@Ya@]k@Ue@Oc@EOCMEOCOGQOu@Qm@Mi@YcAQe@Uc@W_@c@k@kCkDiA_BeA{AoAaBoBmCgBmCu@eAo@gAQ][i@y@_BsBqDyBoDsBmDmB}CaBsCcAiBeAyB{@gBi@eAk@kAYm@]s@a@aA[q@M]GKM[KWIQM[[y@[{@CKM]I]mA}CGIIOIQGOQa@Wq@Oa@EGO_@M_@Qa@KUGOQa@Ue@Yk@Wg@Yk@We@Yk@}AwCqAiCyBeEGKQ_@w@}AaAiBgAuBU_@mBeDe@s@wBmC_@_@_Aw@KEYQGE]Qe@Q]K_@Ke@Ie@CGC[AY?K?Y@Y@YB]Dg@Fe@Fi@Fa@D[BWBoALsAHe@BoAJuAJkAHcAHuAHoAJsAHm@FaAFYBe@D_@B_@BG@}@Di@F_AJ[D]Hy@Rq@TOFDh@WFg@Ng@Li@No@P_@Jc@N]LC?c@PE?e@Re@Nm@Tg@Pg@PEBe@Pg@Pa@NC@_@NC@c@Ne@Tg@V[Pa@Va@Z]V]Xa@Z[Xc@b@i@h@e@h@g@j@u@~@wAjBeAfBgAbC]x@mAnDY~@ENOj@[hAOf@I\\Ql@Mh@Of@St@Kb@Ol@[dAQp@U|@WbAW~@a@xAq@jCM^Op@Qn@Of@i@tBs@lCK^Kd@e@vBKp@OdASdBEl@Ex@GlACn@C~BEtDCtDE~DA`CAx@?lAAx@?NAvA?JCpCA\\AhBAzC@bA@`@@v@FjADj@HlAFd@NlAJx@Pv@Nv@Rx@Z`A\\bAZt@d@~@^n@j@x@p@|@HJDHNPf@n@\\h@b@p@d@t@d@z@BFb@x@\\p@^t@`@v@d@bARf@Vn@h@vABFh@fB\\nA^vA^~AFTJb@Lp@Lt@Hn@Fj@BLNrAHr@H~@HnADpA@jA?|@Ct@?FCp@?DG~@KbAIr@G^G\\ETETQr@Uz@[z@]v@a@v@[f@WZc@d@u@j@o@\\u@Xg@Nk@Nw@TWHm@Tk@Xi@ZkAv@eAr@mAz@m@`@wAbAk@`@sA~@}B|A}AdAmAz@w@h@YRYTUNqCfB[Re@XFb@"},"start_location":{"lat":55.663447,"lng":12.539486},"transit_details":{"arrival_stop":{"location":{"lat":55.720887,"lng":12.540687},"name":"Emdrup St."},"arrival_time":{"text":"1:22pm","time_zone":"Europe/Copenhagen","value":1462879320},"departure_stop":{"location":{"lat":55.663447,"lng":12.539486},"name":"Enghave St."},"departure_time":{"text":"1:01pm","time_zone":"Europe/Copenhagen","value":1462878060},"headsign":"Farum St.","line":{"agencies":[{"name":"DSB S-tog","phone":"011 45 70 13 14 15","url":"http://www.dsb.dk/"}],"short_name":"B","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/rail.png","name":"Commuter train","type":"COMMUTER_TRAIN"}},"num_stops":9},"travel_mode":"TRANSIT"},{"distance":{"text":"0.8 km","value":807},"duration":{"text":"10 mins","value":590},"end_location":{"lat":55.724238,"lng":12.5334013},"html_instructions":"Walk to 2400 Emdrup, Denmark","polyline":{"points":"q~asIijpkAe@IEBiBdA]RCQMwA}BfASDQB?nAAnA?zAAdHClBAdAMxEEt@KpCA`@CfAExDiBSiAKiAE"},"start_location":{"lat":55.720887,"lng":12.540687},"steps":[{"distance":{"text":"0.1 km","value":120},"duration":{"text":"2 mins","value":96},"end_location":{"lat":55.7218762,"lng":12.5408044},"html_instructions":"Head <b>north<\/b> toward <b>Emdrupvej<\/b><div style=\"font-size:0.9em\">Take the stairs<\/div>","polyline":{"points":"q~asIijpkAe@IEBiBdA]RCQMwA"},"start_location":{"lat":55.720887,"lng":12.540687},"travel_mode":"WALKING"},{"distance":{"text":"0.1 km","value":95},"duration":{"text":"1 min","value":63},"end_location":{"lat":55.7226972,"lng":12.5403934},"html_instructions":"Turn <b>left<\/b> onto <b>Emdrupvej<\/b>","maneuver":"turn-left","polyline":{"points":"wdbsI_kpkA}BfASDQB"},"start_location":{"lat":55.7218762,"lng":12.5408044},"travel_mode":"WALKING"},{"distance":{"text":"0.5 km","value":451},"duration":{"text":"6 mins","value":333},"end_location":{"lat":55.722972,"lng":12.5332139},"html_instructions":"Turn <b>left<\/b> to stay on <b>Emdrupvej<\/b>","maneuver":"turn-left","polyline":{"points":"{ibsImhpkA?nAAnA?zAAdHClBAdAMxEEt@KpCA`@CfAExD"},"start_location":{"lat":55.7226972,"lng":12.5403934},"travel_mode":"WALKING"},{"distance":{"text":"0.1 km","value":141},"duration":{"text":"2 mins","value":98},"end_location":{"lat":55.724238,"lng":12.5334013},"html_instructions":"Turn <b>right<\/b> onto <b>Emdrupgårdsvej<\/b><div style=\"font-size:0.9em\">Destination will be on the left<\/div>","maneuver":"turn-right","polyline":{"points":"qkbsIq{nkAiBSiAKiAE"},"start_location":{"lat":55.722972,"lng":12.5332139},"travel_mode":"WALKING"}],"travel_mode":"WALKING"}],"traffic_speed_entry":[],"via_waypoint":[]}]
     * overview_polyline : {"points":"qwvrIybpkAbAV@GRcDr@kKLeFAqEOiD[wDcA_Ja@}DUuCc@uIi@}Nc@iJSeEWmDUsBa@aCo@mCc@qAy@uB}BaFaCsGeAwCm@}AeAoB_@i@c@e@cB}Aq@m@g@c@i@[y@][ImAWiAWUCs@Ca@Fi@Lo@Vo@^_@VuFhGg@qB_BdBwBbCsCxCcA~@y@f@o@RC??|@a@@s@Cm@Ie@Iw@WeAg@{@k@q@o@{@cAw@mAe@iAI]a@gB_@wAk@iBm@cAoDwEoIkL}CsEaAeBuAiCmFaJaFkIeD}FwEsJuBuEo@}AoAcDQi@wA{Dc@{@{BuFiAcCcBeDeOqYcCeE}CaE_BwAe@We@WcA]eAUm@G{A?s@DeALmCXaF^}QrAqHh@{APwA\\aA\\Dh@WFoA\\yA`@eBh@yFrBsBt@mBv@cAh@cAr@yBfBmAlAmAtAmCjDeAfBgAbCkBhF_@nAeAzDmC~JiEhPyBjIq@|C[vBYrCMfCGnDIjJIhMClDItLBdBHbCNxBVrB\\pBb@pBx@dC`AtBjAhBz@hAzAtBhAfBh@bAbCxEx@jB`AfCjBvG`AjEb@~CXfCRnCF|CCrBK~BUvBO|@Kj@g@nBy@rB}@~A{@`Au@j@o@\\}Ah@cBd@eA^uAt@mGhEuIbG}F~D}E`De@XFb@e@IEBgCxAQiB}BfASDQB?nAAjDErKO~GQfEEhBExDiBSsCQ"}
     * summary :
     * warnings : ["Walking directions are in beta.    Use caution \u2013 This route may be missing sidewalks or pedestrian paths."]
     * waypoint_order : []
     */

    private List<RoutesBean> routes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<GeocodedWaypointsBean> getGeocoded_waypoints() {
        return geocoded_waypoints;
    }

    public void setGeocoded_waypoints(List<GeocodedWaypointsBean> geocoded_waypoints) {
        this.geocoded_waypoints = geocoded_waypoints;
    }

    public List<RoutesBean> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RoutesBean> routes) {
        this.routes = routes;
    }

    public static class GeocodedWaypointsBean {
        private String geocoder_status;
        private boolean partial_match;
        private String place_id;
        private List<String> types;

        public String getGeocoder_status() {
            return geocoder_status;
        }

        public void setGeocoder_status(String geocoder_status) {
            this.geocoder_status = geocoder_status;
        }

        public boolean isPartial_match() {
            return partial_match;
        }

        public void setPartial_match(boolean partial_match) {
            this.partial_match = partial_match;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }
    }

    public static class RoutesBean {
        /**
         * northeast : {"lat":55.724238,"lng":12.5923013}
         * southwest : {"lat":55.6626651,"lng":12.5332139}
         */

        private BoundsBean bounds;
        private String copyrights;
        /**
         * points : qwvrIybpkAbAV@GRcDr@kKLeFAqEOiD[wDcA_Ja@}DUuCc@uIi@}Nc@iJSeEWmDUsBa@aCo@mCc@qAy@uB}BaFaCsGeAwCm@}AeAoB_@i@c@e@cB}Aq@m@g@c@i@[y@][ImAWiAWUCs@Ca@Fi@Lo@Vo@^_@VuFhGg@qB_BdBwBbCsCxCcA~@y@f@o@RC??|@a@@s@Cm@Ie@Iw@WeAg@{@k@q@o@{@cAw@mAe@iAI]a@gB_@wAk@iBm@cAoDwEoIkL}CsEaAeBuAiCmFaJaFkIeD}FwEsJuBuEo@}AoAcDQi@wA{Dc@{@{BuFiAcCcBeDeOqYcCeE}CaE_BwAe@We@WcA]eAUm@G{A?s@DeALmCXaF^}QrAqHh@{APwA\aA\Dh@WFoA\yA`@eBh@yFrBsBt@mBv@cAh@cAr@yBfBmAlAmAtAmCjDeAfBgAbCkBhF_@nAeAzDmC~JiEhPyBjIq@|C[vBYrCMfCGnDIjJIhMClDItLBdBHbCNxBVrB\pBb@pBx@dC`AtBjAhBz@hAzAtBhAfBh@bAbCxEx@jB`AfCjBvG`AjEb@~CXfCRnCF|CCrBK~BUvBO|@Kj@g@nBy@rB}@~A{@`Au@j@o@\}Ah@cBd@eA^uAt@mGhEuIbG}F~D}E`De@XFb@e@IEBgCxAQiB}BfASDQB?nAAjDErKO~GQfEEhBExDiBSsCQ
         */

        private OverviewPolylineBean overview_polyline;
        private String summary;
        /**
         * arrival_time : {"text":"1:31pm","time_zone":"Europe/Copenhagen","value":1462879910}
         * departure_time : {"text":"1:01pm","time_zone":"Europe/Copenhagen","value":1462878060}
         * distance : {"text":"12.4 km","value":12404}
         * duration : {"text":"31 mins","value":1850}
         * end_address : 2400 Emdrup, Denmark
         * end_location : {"lat":55.724238,"lng":12.5334013}
         * start_address : Enghave St., 1720 København, Denmark
         * start_location : {"lat":55.663447,"lng":12.539486}
         * steps : [{"distance":{"text":"11.6 km","value":11597},"duration":{"text":"21 mins","value":1260},"end_location":{"lat":55.720887,"lng":12.540687},"html_instructions":"Commuter train towards Farum St.","polyline":{"points":"qwvrIybpkAbAV@GFiAJyAHeAD_@NeCR_DHuBBoB@iBCgBGeBGcAK_BOwAOwAQyAQyAOsAQ_BO}AKuAI_AIwAK_BEcAGyAG_BOyDIwBGkBKsBGcBG_AGqAIyAIkBK}AKoAIs@K_AMu@SkAESI]U}@I]Mc@Um@Ws@a@aAg@gAUc@a@_A]u@]w@]aAa@iAc@oAc@mAa@iASm@Yo@c@{@a@s@QWMQ?AKIIKMMQUOMGGMKKIAAQOKIMMQMAAOOSQSQUOSKSMe@OQEICYI]ISCA?AAWGWGWEUC]CU?UBKBYDOFWJWJYNUNOJOJ}DhEw@~@g@qB_BdB]`@yA`Bc@h@SNQPiAlAcA~@y@f@o@RC??|@a@@[AWAWCUEQCSE[K[KYMKGOGOIKEo@e@g@e@II_@a@[a@Ya@]k@Ue@Oc@EOCMEOCOGQOu@Qm@Mi@YcAQe@Uc@W_@c@k@kCkDiA_BeA{AoAaBoBmCgBmCu@eAo@gAQ][i@y@_BsBqDyBoDsBmDmB}CaBsCcAiBeAyB{@gBi@eAk@kAYm@]s@a@aA[q@M]GKM[KWIQM[[y@[{@CKM]I]mA}CGIIOIQGOQa@Wq@Oa@EGO_@M_@Qa@KUGOQa@Ue@Yk@Wg@Yk@We@Yk@}AwCqAiCyBeEGKQ_@w@}AaAiBgAuBU_@mBeDe@s@wBmC_@_@_Aw@KEYQGE]Qe@Q]K_@Ke@Ie@CGC[AY?K?Y@Y@YB]Dg@Fe@Fi@Fa@D[BWBoALsAHe@BoAJuAJkAHcAHuAHoAJsAHm@FaAFYBe@D_@B_@BG@}@Di@F_AJ[D]Hy@Rq@TOFDh@WFg@Ng@Li@No@P_@Jc@N]LC?c@PE?e@Re@Nm@Tg@Pg@PEBe@Pg@Pa@NC@_@NC@c@Ne@Tg@V[Pa@Va@Z]V]Xa@Z[Xc@b@i@h@e@h@g@j@u@~@wAjBeAfBgAbC]x@mAnDY~@ENOj@[hAOf@I\\Ql@Mh@Of@St@Kb@Ol@[dAQp@U|@WbAW~@a@xAq@jCM^Op@Qn@Of@i@tBs@lCK^Kd@e@vBKp@OdASdBEl@Ex@GlACn@C~BEtDCtDE~DA`CAx@?lAAx@?NAvA?JCpCA\\AhBAzC@bA@`@@v@FjADj@HlAFd@NlAJx@Pv@Nv@Rx@Z`A\\bAZt@d@~@^n@j@x@p@|@HJDHNPf@n@\\h@b@p@d@t@d@z@BFb@x@\\p@^t@`@v@d@bARf@Vn@h@vABFh@fB\\nA^vA^~AFTJb@Lp@Lt@Hn@Fj@BLNrAHr@H~@HnADpA@jA?|@Ct@?FCp@?DG~@KbAIr@G^G\\ETETQr@Uz@[z@]v@a@v@[f@WZc@d@u@j@o@\\u@Xg@Nk@Nw@TWHm@Tk@Xi@ZkAv@eAr@mAz@m@`@wAbAk@`@sA~@}B|A}AdAmAz@w@h@YRYTUNqCfB[Re@XFb@"},"start_location":{"lat":55.663447,"lng":12.539486},"transit_details":{"arrival_stop":{"location":{"lat":55.720887,"lng":12.540687},"name":"Emdrup St."},"arrival_time":{"text":"1:22pm","time_zone":"Europe/Copenhagen","value":1462879320},"departure_stop":{"location":{"lat":55.663447,"lng":12.539486},"name":"Enghave St."},"departure_time":{"text":"1:01pm","time_zone":"Europe/Copenhagen","value":1462878060},"headsign":"Farum St.","line":{"agencies":[{"name":"DSB S-tog","phone":"011 45 70 13 14 15","url":"http://www.dsb.dk/"}],"short_name":"B","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/rail.png","name":"Commuter train","type":"COMMUTER_TRAIN"}},"num_stops":9},"travel_mode":"TRANSIT"},{"distance":{"text":"0.8 km","value":807},"duration":{"text":"10 mins","value":590},"end_location":{"lat":55.724238,"lng":12.5334013},"html_instructions":"Walk to 2400 Emdrup, Denmark","polyline":{"points":"q~asIijpkAe@IEBiBdA]RCQMwA}BfASDQB?nAAnA?zAAdHClBAdAMxEEt@KpCA`@CfAExDiBSiAKiAE"},"start_location":{"lat":55.720887,"lng":12.540687},"steps":[{"distance":{"text":"0.1 km","value":120},"duration":{"text":"2 mins","value":96},"end_location":{"lat":55.7218762,"lng":12.5408044},"html_instructions":"Head <b>north<\/b> toward <b>Emdrupvej<\/b><div style=\"font-size:0.9em\">Take the stairs<\/div>","polyline":{"points":"q~asIijpkAe@IEBiBdA]RCQMwA"},"start_location":{"lat":55.720887,"lng":12.540687},"travel_mode":"WALKING"},{"distance":{"text":"0.1 km","value":95},"duration":{"text":"1 min","value":63},"end_location":{"lat":55.7226972,"lng":12.5403934},"html_instructions":"Turn <b>left<\/b> onto <b>Emdrupvej<\/b>","maneuver":"turn-left","polyline":{"points":"wdbsI_kpkA}BfASDQB"},"start_location":{"lat":55.7218762,"lng":12.5408044},"travel_mode":"WALKING"},{"distance":{"text":"0.5 km","value":451},"duration":{"text":"6 mins","value":333},"end_location":{"lat":55.722972,"lng":12.5332139},"html_instructions":"Turn <b>left<\/b> to stay on <b>Emdrupvej<\/b>","maneuver":"turn-left","polyline":{"points":"{ibsImhpkA?nAAnA?zAAdHClBAdAMxEEt@KpCA`@CfAExD"},"start_location":{"lat":55.7226972,"lng":12.5403934},"travel_mode":"WALKING"},{"distance":{"text":"0.1 km","value":141},"duration":{"text":"2 mins","value":98},"end_location":{"lat":55.724238,"lng":12.5334013},"html_instructions":"Turn <b>right<\/b> onto <b>Emdrupgårdsvej<\/b><div style=\"font-size:0.9em\">Destination will be on the left<\/div>","maneuver":"turn-right","polyline":{"points":"qkbsIq{nkAiBSiAKiAE"},"start_location":{"lat":55.722972,"lng":12.5332139},"travel_mode":"WALKING"}],"travel_mode":"WALKING"}]
         * traffic_speed_entry : []
         * via_waypoint : []
         */

        private List<LegsBean> legs;
        private List<String> warnings;
        private List<?> waypoint_order;

        public BoundsBean getBounds() {
            return bounds;
        }

        public void setBounds(BoundsBean bounds) {
            this.bounds = bounds;
        }

        public String getCopyrights() {
            return copyrights;
        }

        public void setCopyrights(String copyrights) {
            this.copyrights = copyrights;
        }

        public OverviewPolylineBean getOverview_polyline() {
            return overview_polyline;
        }

        public void setOverview_polyline(OverviewPolylineBean overview_polyline) {
            this.overview_polyline = overview_polyline;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<LegsBean> getLegs() {
            return legs;
        }

        public void setLegs(List<LegsBean> legs) {
            this.legs = legs;
        }

        public List<String> getWarnings() {
            return warnings;
        }

        public void setWarnings(List<String> warnings) {
            this.warnings = warnings;
        }

        public List<?> getWaypoint_order() {
            return waypoint_order;
        }

        public void setWaypoint_order(List<?> waypoint_order) {
            this.waypoint_order = waypoint_order;
        }

        public static class BoundsBean {
            /**
             * lat : 55.724238
             * lng : 12.5923013
             */

            private NortheastBean northeast;
            /**
             * lat : 55.6626651
             * lng : 12.5332139
             */

            private SouthwestBean southwest;

            public NortheastBean getNortheast() {
                return northeast;
            }

            public void setNortheast(NortheastBean northeast) {
                this.northeast = northeast;
            }

            public SouthwestBean getSouthwest() {
                return southwest;
            }

            public void setSouthwest(SouthwestBean southwest) {
                this.southwest = southwest;
            }

            public static class NortheastBean {
                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class SouthwestBean {
                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }
        }

        public static class OverviewPolylineBean {
            private String points;

            public String getPoints() {
                return points;
            }

            public void setPoints(String points) {
                this.points = points;
            }
        }

        public static class LegsBean {
            /**
             * text : 1:31pm
             * time_zone : Europe/Copenhagen
             * value : 1462879910
             */

            private ArrivalTimeBean arrival_time;
            /**
             * text : 1:01pm
             * time_zone : Europe/Copenhagen
             * value : 1462878060
             */

            private DepartureTimeBean departure_time;
            /**
             * text : 12.4 km
             * value : 12404
             */

            private DistanceBean distance;
            /**
             * text : 31 mins
             * value : 1850
             */

            private DurationBean duration;
            private String end_address;
            /**
             * lat : 55.724238
             * lng : 12.5334013
             */

            private EndLocationBean end_location;
            private String start_address;
            /**
             * lat : 55.663447
             * lng : 12.539486
             */

            private StartLocationBean start_location;
            /**
             * distance : {"text":"11.6 km","value":11597}
             * duration : {"text":"21 mins","value":1260}
             * end_location : {"lat":55.720887,"lng":12.540687}
             * html_instructions : Commuter train towards Farum St.
             * polyline : {"points":"qwvrIybpkAbAV@GFiAJyAHeAD_@NeCR_DHuBBoB@iBCgBGeBGcAK_BOwAOwAQyAQyAOsAQ_BO}AKuAI_AIwAK_BEcAGyAG_BOyDIwBGkBKsBGcBG_AGqAIyAIkBK}AKoAIs@K_AMu@SkAESI]U}@I]Mc@Um@Ws@a@aAg@gAUc@a@_A]u@]w@]aAa@iAc@oAc@mAa@iASm@Yo@c@{@a@s@QWMQ?AKIIKMMQUOMGGMKKIAAQOKIMMQMAAOOSQSQUOSKSMe@OQEICYI]ISCA?AAWGWGWEUC]CU?UBKBYDOFWJWJYNUNOJOJ}DhEw@~@g@qB_BdB]`@yA`Bc@h@SNQPiAlAcA~@y@f@o@RC??|@a@@[AWAWCUEQCSE[K[KYMKGOGOIKEo@e@g@e@II_@a@[a@Ya@]k@Ue@Oc@EOCMEOCOGQOu@Qm@Mi@YcAQe@Uc@W_@c@k@kCkDiA_BeA{AoAaBoBmCgBmCu@eAo@gAQ][i@y@_BsBqDyBoDsBmDmB}CaBsCcAiBeAyB{@gBi@eAk@kAYm@]s@a@aA[q@M]GKM[KWIQM[[y@[{@CKM]I]mA}CGIIOIQGOQa@Wq@Oa@EGO_@M_@Qa@KUGOQa@Ue@Yk@Wg@Yk@We@Yk@}AwCqAiCyBeEGKQ_@w@}AaAiBgAuBU_@mBeDe@s@wBmC_@_@_Aw@KEYQGE]Qe@Q]K_@Ke@Ie@CGC[AY?K?Y@Y@YB]Dg@Fe@Fi@Fa@D[BWBoALsAHe@BoAJuAJkAHcAHuAHoAJsAHm@FaAFYBe@D_@B_@BG@}@Di@F_AJ[D]Hy@Rq@TOFDh@WFg@Ng@Li@No@P_@Jc@N]LC?c@PE?e@Re@Nm@Tg@Pg@PEBe@Pg@Pa@NC@_@NC@c@Ne@Tg@V[Pa@Va@Z]V]Xa@Z[Xc@b@i@h@e@h@g@j@u@~@wAjBeAfBgAbC]x@mAnDY~@ENOj@[hAOf@I\\Ql@Mh@Of@St@Kb@Ol@[dAQp@U|@WbAW~@a@xAq@jCM^Op@Qn@Of@i@tBs@lCK^Kd@e@vBKp@OdASdBEl@Ex@GlACn@C~BEtDCtDE~DA`CAx@?lAAx@?NAvA?JCpCA\\AhBAzC@bA@`@@v@FjADj@HlAFd@NlAJx@Pv@Nv@Rx@Z`A\\bAZt@d@~@^n@j@x@p@|@HJDHNPf@n@\\h@b@p@d@t@d@z@BFb@x@\\p@^t@`@v@d@bARf@Vn@h@vABFh@fB\\nA^vA^~AFTJb@Lp@Lt@Hn@Fj@BLNrAHr@H~@HnADpA@jA?|@Ct@?FCp@?DG~@KbAIr@G^G\\ETETQr@Uz@[z@]v@a@v@[f@WZc@d@u@j@o@\\u@Xg@Nk@Nw@TWHm@Tk@Xi@ZkAv@eAr@mAz@m@`@wAbAk@`@sA~@}B|A}AdAmAz@w@h@YRYTUNqCfB[Re@XFb@"}
             * start_location : {"lat":55.663447,"lng":12.539486}
             * transit_details : {"arrival_stop":{"location":{"lat":55.720887,"lng":12.540687},"name":"Emdrup St."},"arrival_time":{"text":"1:22pm","time_zone":"Europe/Copenhagen","value":1462879320},"departure_stop":{"location":{"lat":55.663447,"lng":12.539486},"name":"Enghave St."},"departure_time":{"text":"1:01pm","time_zone":"Europe/Copenhagen","value":1462878060},"headsign":"Farum St.","line":{"agencies":[{"name":"DSB S-tog","phone":"011 45 70 13 14 15","url":"http://www.dsb.dk/"}],"short_name":"B","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/rail.png","name":"Commuter train","type":"COMMUTER_TRAIN"}},"num_stops":9}
             * travel_mode : TRANSIT
             */

            private List<StepsBean> steps;
            private List<?> traffic_speed_entry;
            private List<?> via_waypoint;

            public ArrivalTimeBean getArrival_time() {
                return arrival_time;
            }

            public void setArrival_time(ArrivalTimeBean arrival_time) {
                this.arrival_time = arrival_time;
            }

            public DepartureTimeBean getDeparture_time() {
                return departure_time;
            }

            public void setDeparture_time(DepartureTimeBean departure_time) {
                this.departure_time = departure_time;
            }

            public DistanceBean getDistance() {
                return distance;
            }

            public void setDistance(DistanceBean distance) {
                this.distance = distance;
            }

            public DurationBean getDuration() {
                return duration;
            }

            public void setDuration(DurationBean duration) {
                this.duration = duration;
            }

            public String getEnd_address() {
                return end_address;
            }

            public void setEnd_address(String end_address) {
                this.end_address = end_address;
            }

            public EndLocationBean getEnd_location() {
                return end_location;
            }

            public void setEnd_location(EndLocationBean end_location) {
                this.end_location = end_location;
            }

            public String getStart_address() {
                return start_address;
            }

            public void setStart_address(String start_address) {
                this.start_address = start_address;
            }

            public StartLocationBean getStart_location() {
                return start_location;
            }

            public void setStart_location(StartLocationBean start_location) {
                this.start_location = start_location;
            }

            public List<StepsBean> getSteps() {
                return steps;
            }

            public void setSteps(List<StepsBean> steps) {
                this.steps = steps;
            }

            public List<?> getTraffic_speed_entry() {
                return traffic_speed_entry;
            }

            public void setTraffic_speed_entry(List<?> traffic_speed_entry) {
                this.traffic_speed_entry = traffic_speed_entry;
            }

            public List<?> getVia_waypoint() {
                return via_waypoint;
            }

            public void setVia_waypoint(List<?> via_waypoint) {
                this.via_waypoint = via_waypoint;
            }

            public static class ArrivalTimeBean {
                private String text;
                private String time_zone;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getTime_zone() {
                    return time_zone;
                }

                public void setTime_zone(String time_zone) {
                    this.time_zone = time_zone;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DepartureTimeBean {
                private String text;
                private String time_zone;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getTime_zone() {
                    return time_zone;
                }

                public void setTime_zone(String time_zone) {
                    this.time_zone = time_zone;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DistanceBean {
                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DurationBean {
                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class EndLocationBean {
                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StartLocationBean {
                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StepsBean {
                /**
                 * text : 11.6 km
                 * value : 11597
                 */

                private DistanceBean distance;
                /**
                 * text : 21 mins
                 * value : 1260
                 */

                private DurationBean duration;
                /**
                 * lat : 55.720887
                 * lng : 12.540687
                 */

                private EndLocationBean end_location;
                private String html_instructions;
                /**
                 */

                private PolylineBean polyline;
                /**
                 * lat : 55.663447
                 * lng : 12.539486
                 */

                private StartLocationBean start_location;
                /**
                 * arrival_stop : {"location":{"lat":55.720887,"lng":12.540687},"name":"Emdrup St."}
                 * arrival_time : {"text":"1:22pm","time_zone":"Europe/Copenhagen","value":1462879320}
                 * departure_stop : {"location":{"lat":55.663447,"lng":12.539486},"name":"Enghave St."}
                 * departure_time : {"text":"1:01pm","time_zone":"Europe/Copenhagen","value":1462878060}
                 * headsign : Farum St.
                 * line : {"agencies":[{"name":"DSB S-tog","phone":"011 45 70 13 14 15","url":"http://www.dsb.dk/"}],"short_name":"B","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/rail.png","name":"Commuter train","type":"COMMUTER_TRAIN"}}
                 * num_stops : 9
                 */

                private TransitDetailsBean transit_details;
                private String travel_mode;

                public DistanceBean getDistance() {
                    return distance;
                }

                public void setDistance(DistanceBean distance) {
                    this.distance = distance;
                }

                public DurationBean getDuration() {
                    return duration;
                }

                public void setDuration(DurationBean duration) {
                    this.duration = duration;
                }

                public EndLocationBean getEnd_location() {
                    return end_location;
                }

                public void setEnd_location(EndLocationBean end_location) {
                    this.end_location = end_location;
                }

                public String getHtml_instructions() {
                    return html_instructions;
                }

                public void setHtml_instructions(String html_instructions) {
                    this.html_instructions = html_instructions;
                }

                public PolylineBean getPolyline() {
                    return polyline;
                }

                public void setPolyline(PolylineBean polyline) {
                    this.polyline = polyline;
                }

                public StartLocationBean getStart_location() {
                    return start_location;
                }

                public void setStart_location(StartLocationBean start_location) {
                    this.start_location = start_location;
                }

                public TransitDetailsBean getTransit_details() {
                    return transit_details;
                }

                public void setTransit_details(TransitDetailsBean transit_details) {
                    this.transit_details = transit_details;
                }

                public String getTravel_mode() {
                    return travel_mode;
                }

                public void setTravel_mode(String travel_mode) {
                    this.travel_mode = travel_mode;
                }

                public static class DistanceBean {
                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class DurationBean {
                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class EndLocationBean {
                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class PolylineBean {
                    private String points;

                    public String getPoints() {
                        return points;
                    }

                    public void setPoints(String points) {
                        this.points = points;
                    }
                }

                public static class StartLocationBean {
                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class TransitDetailsBean {
                    /**
                     * location : {"lat":55.720887,"lng":12.540687}
                     * name : Emdrup St.
                     */

                    private ArrivalStopBean arrival_stop;
                    /**
                     * text : 1:22pm
                     * time_zone : Europe/Copenhagen
                     * value : 1462879320
                     */

                    private ArrivalTimeBean arrival_time;
                    /**
                     * location : {"lat":55.663447,"lng":12.539486}
                     * name : Enghave St.
                     */

                    private DepartureStopBean departure_stop;
                    /**
                     * text : 1:01pm
                     * time_zone : Europe/Copenhagen
                     * value : 1462878060
                     */

                    private DepartureTimeBean departure_time;
                    private String headsign;
                    /**
                     * agencies : [{"name":"DSB S-tog","phone":"011 45 70 13 14 15","url":"http://www.dsb.dk/"}]
                     * short_name : B
                     * vehicle : {"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/rail.png","name":"Commuter train","type":"COMMUTER_TRAIN"}
                     */

                    private LineBean line;
                    private int num_stops;

                    public ArrivalStopBean getArrival_stop() {
                        return arrival_stop;
                    }

                    public void setArrival_stop(ArrivalStopBean arrival_stop) {
                        this.arrival_stop = arrival_stop;
                    }

                    public ArrivalTimeBean getArrival_time() {
                        return arrival_time;
                    }

                    public void setArrival_time(ArrivalTimeBean arrival_time) {
                        this.arrival_time = arrival_time;
                    }

                    public DepartureStopBean getDeparture_stop() {
                        return departure_stop;
                    }

                    public void setDeparture_stop(DepartureStopBean departure_stop) {
                        this.departure_stop = departure_stop;
                    }

                    public DepartureTimeBean getDeparture_time() {
                        return departure_time;
                    }

                    public void setDeparture_time(DepartureTimeBean departure_time) {
                        this.departure_time = departure_time;
                    }

                    public String getHeadsign() {
                        return headsign;
                    }

                    public void setHeadsign(String headsign) {
                        this.headsign = headsign;
                    }

                    public LineBean getLine() {
                        return line;
                    }

                    public void setLine(LineBean line) {
                        this.line = line;
                    }

                    public int getNum_stops() {
                        return num_stops;
                    }

                    public void setNum_stops(int num_stops) {
                        this.num_stops = num_stops;
                    }

                    public static class ArrivalStopBean {
                        /**
                         * lat : 55.720887
                         * lng : 12.540687
                         */

                        private LocationBean location;
                        private String name;

                        public LocationBean getLocation() {
                            return location;
                        }

                        public void setLocation(LocationBean location) {
                            this.location = location;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public static class LocationBean {
                            private double lat;
                            private double lng;

                            public double getLat() {
                                return lat;
                            }

                            public void setLat(double lat) {
                                this.lat = lat;
                            }

                            public double getLng() {
                                return lng;
                            }

                            public void setLng(double lng) {
                                this.lng = lng;
                            }
                        }
                    }

                    public static class ArrivalTimeBean {
                        private String text;
                        private String time_zone;
                        private int value;

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public String getTime_zone() {
                            return time_zone;
                        }

                        public void setTime_zone(String time_zone) {
                            this.time_zone = time_zone;
                        }

                        public int getValue() {
                            return value;
                        }

                        public void setValue(int value) {
                            this.value = value;
                        }
                    }

                    public static class DepartureStopBean {
                        /**
                         * lat : 55.663447
                         * lng : 12.539486
                         */

                        private LocationBean location;
                        private String name;

                        public LocationBean getLocation() {
                            return location;
                        }

                        public void setLocation(LocationBean location) {
                            this.location = location;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public static class LocationBean {
                            private double lat;
                            private double lng;

                            public double getLat() {
                                return lat;
                            }

                            public void setLat(double lat) {
                                this.lat = lat;
                            }

                            public double getLng() {
                                return lng;
                            }

                            public void setLng(double lng) {
                                this.lng = lng;
                            }
                        }
                    }

                    public static class DepartureTimeBean {
                        private String text;
                        private String time_zone;
                        private int value;

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public String getTime_zone() {
                            return time_zone;
                        }

                        public void setTime_zone(String time_zone) {
                            this.time_zone = time_zone;
                        }

                        public int getValue() {
                            return value;
                        }

                        public void setValue(int value) {
                            this.value = value;
                        }
                    }

                    public static class LineBean {
                        private String short_name;
                        /**
                         * icon : //maps.gstatic.com/mapfiles/transit/iw2/6/rail.png
                         * name : Commuter train
                         * type : COMMUTER_TRAIN
                         */

                        private VehicleBean vehicle;
                        /**
                         * name : DSB S-tog
                         * phone : 011 45 70 13 14 15
                         * url : http://www.dsb.dk/
                         */

                        private List<AgenciesBean> agencies;

                        public String getShort_name() {
                            return short_name;
                        }

                        public void setShort_name(String short_name) {
                            this.short_name = short_name;
                        }

                        public VehicleBean getVehicle() {
                            return vehicle;
                        }

                        public void setVehicle(VehicleBean vehicle) {
                            this.vehicle = vehicle;
                        }

                        public List<AgenciesBean> getAgencies() {
                            return agencies;
                        }

                        public void setAgencies(List<AgenciesBean> agencies) {
                            this.agencies = agencies;
                        }

                        public static class VehicleBean {
                            private String icon;
                            private String name;
                            private String type;

                            public String getIcon() {
                                return icon;
                            }

                            public void setIcon(String icon) {
                                this.icon = icon;
                            }

                            public String getName() {
                                return name;
                            }

                            public void setName(String name) {
                                this.name = name;
                            }

                            public String getType() {
                                return type;
                            }

                            public void setType(String type) {
                                this.type = type;
                            }
                        }

                        public static class AgenciesBean {
                            private String name;
                            private String phone;
                            private String url;

                            public String getName() {
                                return name;
                            }

                            public void setName(String name) {
                                this.name = name;
                            }

                            public String getPhone() {
                                return phone;
                            }

                            public void setPhone(String phone) {
                                this.phone = phone;
                            }

                            public String getUrl() {
                                return url;
                            }

                            public void setUrl(String url) {
                                this.url = url;
                            }
                        }
                    }
                }
            }
        }
    }
}