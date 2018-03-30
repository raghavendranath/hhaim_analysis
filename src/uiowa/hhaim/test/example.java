package uiowa.hhaim.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by kandula on 2/22/2018.
 */
public class example {

    public static void main(String args[]){
        String arr[] = {"KJ704793", "KJ704790", "AY247218", "AY247219", "AY247220", "AY247221", "AY247222", "AY247223", "AY247224", "AY835759", "AY247225", "EF159970", "EF159971", "EF159972", "AY835777", "AY835770", "AY835754", "AY835748", "K02007", "EF159973", "EF159974", "K03455", "M17451", "M13137", "AY835779", "AY835762", "M38431", "M17450", "U90934", "AY352275", "AF025751", "AF025758", "AF025764", "AY835769", "AY835755", "KX129293", "M38430", "AB221005", "AY357338", "U69584", "M12507", "AF025749", "AF025750", "AF025752", "AF025756", "AF025759", "AF025760", "AF025761", "AY835757", "AY835774", "AF004394", "AY426125", "M93258", "AF025755", "AF025757", "L02317", "AF025754", "AF025762", "AF286365", "AF025763", "AY835766", "U39362", "HQ110664", "AF128126", "KT283686", "KT283762", "GU331748", "AY173952", "AY173954", "AY223743", "AF069139", "GU331722", "AY608576", "AB485638", "U04908", "KT283704", "AF277059", "KT283800", "AF277058", "AJ277821", "AF277064", "AF277067", "AY713410", "AY612855", "AY835437", "KT283729", "DQ313246", "EU289197", "AF277056", "AF277055", "AF277057", "EF593245", "AF277061", "AF277063", "AF277065", "AF277066", "JQ609870", "AF277069", "AF277070", "EF593197", "AY835436", "AY835435", "AY835438", "KT283740", "JN024274", "EF593231", "KU678161", "AF277072", "AF277068", "AF277071", "AF277073", "AF277074", "AY308760", "AY331292", "AY835753", "EF593199", "EF593319", "EF593301", "EF593195", "EF593196", "EF593303", "AY331291", "EF593198", "U84819", "KT283856", "AY835443", "EF593243", "AF277075", "AY314044", "AY331284", "AY331289", "EF593181", "EF593182", "JN562755", "JN562791", "JN562785", "JN562770", "EF593200", "EF593302", "EF593204", "EF593205", "EF593206", "EF593207", "EF593308", "EF593309", "EF593311", "EF593211", "EF593304", "EF593201", "EF593202", "EF593305", "EF593306", "EU575734", "KT124770", "GU562028", "AY779553", "GU562058", "AB078005", "GU562218", "U84854", "EF593232", "AY835442", "AY560110", "GU562080", "AY331294", "EF593186", "AY560107", "AY560108", "AY560109", "EF593208", "EF593209", "EF593310", "EF593312", "EF593313", "EF593314", "EF593315", "EF593316", "EF593317", "EF593210", "EF593318", "KT124747", "KT124769", "KT124771", "GU562001", "AY835446", "AY779550", "AY779557", "DQ853427", "DQ853455", "EF593263", "EF593264", "EF593265", "EF593282", "EF593283", "EF593284", "JQ609973", "JN562759", "JN786724", "EF593212", "EF593213", "JN786767", "EF593300", "EF593187", "KT124759", "KT124776", "KT124798", "GU331218", "GU331463", "JN786795", "EF593233", "AY331296", "EF593267", "EF593268", "EF593285", "EF593286", "EU577480", "EF593287", "JQ403100", "JN562764", "EU839606", "EU839609", "KT124806", "DQ869026", "EF363122", "EF593234", "AY835447", "EF593240", "HQ217651", "AY835448", "EF593266", "AY835451", "EF593288", "EF593289", "JQ609684", "EU839608", "EU839610", "HM769943", "KT124748", "KT124799", "DQ869014", "DQ869017", "DQ869019", "DQ869027", "DQ869028", "EF593221", "AY835449", "EF593254", "AY835450", "EF593259", "HQ217760", "EF593260", "EF593261", "EF593262", "EF121405", "EU577589", "EF593290", "EF593291", "EF593292", "EF593293", "EF593294", "JQ403101", "FJ469738", "JN562802", "JX863967", "KT124764", "KT124777", "KT124795", "KT124814", "GU330247", "GU330333", "FJ496072", "GU331496", "GU331550", "DQ869020", "DQ869021", "DQ869022", "DQ869023", "HQ217193", "EF593223", "EF593224", "EF593229", "EF593253", "JQ403102", "EF593295", "EF593296", "EF593297", "JQ403105", "FJ469728", "FJ469730", "FJ469748", "FJ469734", "FJ469735", "FJ469754", "FJ469757", "FJ469758", "FJ469741", "FJ469737", "FJ469688", "FJ469687", "FJ469749", "FJ469760", "FJ469762", "FJ469693", "DQ410427", "GU562105", "GU562134", "KR868847", "KT124807", "KT124813", "GU330396", "GU330462", "GU330499", "GU330524", "GU330549", "GU331590", "DQ869016", "DQ869024", "DQ869025", "DQ869029", "DQ869031", "DQ869032", "DQ869030", "EF125655", "KC473846", "EF593222", "EF593228", "KT283923", "FJ469764", "GU562271", "HQ217443", "HM234502", "EF593256", "KJ698244", "EF593298", "EF593299", "JQ403106", "FJ469742", "FJ469755", "FJ469739", "FJ469753", "FJ469701", "FJ469686", "FJ469765", "FJ469759", "FJ469740", "FJ469743", "FJ469731", "FJ469770", "DQ410227", "DQ410246", "DQ410284", "DQ410325", "DQ410511", "DQ410527", "DQ410479", "DQ410619", "GU562153", "JN562797", "HM771423", "JN562775", "KT124758", "JX863968", "JX863969", "JX863970", "GU330598", "KM259127", "DQ869015", "DQ869033", "DQ410528", "AY835452", "HQ217167", "DQ410217", "KC935957", "DQ410040", "DQ410062", "DQ410069", "DQ410087", "DQ410101", "DQ410188", "JQ250925", "JQ251015", "HQ217315", "EF593225", "EF593226", "JQ251105", "KM259061", "JN024203", "JN024100", "EF593238", "EF593269", "EF593188", "EF593270", "EF593271", "EF593272", "EF593273", "EF593190", "EF593192", "EF593274", "EF593275", "EF593193", "EF593276", "EF593277", "EF593203", "HQ216367", "HQ216397", "HQ216471", "HQ216501", "JQ403107", "JQ403103", "JQ403104", "FJ469733", "FJ469695", "FJ469732", "FJ469772", "FJ469722", "FJ469697", "FJ469745", "FJ469698", "FJ469684", "DQ410373", "DQ410404", "EU839602", "EU839600", "EU839604", "EU839597", "EU839596", "EU839598", "JX863965", "JX863966", "JX863971", "JX863972", "JX863983", "JX863984", "JX863985", "JX863986", "KT124778", "HQ238279", "GU330622", "FJ496081", "GU330692", "JF320059", "JF320043", "JF320361", "JF320482", "JF320185", "JF320054", "KM258969", "KM258999", "DQ410607", "DQ410542", "DQ410560", "DQ410573", "DQ410588", "FJ469718", "DQ410109", "DQ410131", "EU839605", "DQ886037", "KF990605", "FJ653218", "FJ653122", "FJ653098", "FJ653146", "FJ653194", "KM259100", "JF689852", "JF689854", "JF689856", "JF689857", "JF689859", "JF689860", "FJ653572", "FJ653596", "FJ653452", "FJ653380", "FJ653476", "FJ653332", "FJ653500", "FJ653524", "FJ653404", "FJ653548", "JN024469", "JN024450", "JN024349", "JN024459", "JN024339", "HQ217474", "HQ217541", "HQ217733", "EF593189", "EF593191", "EF593194", "HQ216557", "HQ216577", "HQ216601", "HQ216632", "HQ216675", "HQ216702", "HQ216730", "HQ216755", "HQ216785", "HQ216810", "HQ216841", "HQ216861", "EF593279", "HQ217818", "HQ217840", "HQ217860", "HQ217874", "HQ217892", "HQ217914", "FJ469706", "FJ469683", "FJ469717", "FJ469703", "FJ469724", "FJ469682", "FJ469747", "KX129208", "FJ152546", "FJ152547", "JN562779", "KM353586", "KM353665", "KM353701", "JX863987", "JX863988", "JX863989", "JX863991", "JX863992", "JX863993", "KT124791", "GU330731", "GU330809", "GU330839", "KR423693", "EF593217", "KR423725", "EF593218", "EF593219", "EF593220", "KR423028", "GU330916", "KR423015", "KR423052", "HQ908232", "EF593216", "GU331039", "HQ217019", "GU331066", "GU331094", "JF320615", "JF320613", "JF320363", "JF320036", "JF320048", "JF320308", "JF320083", "JF320038", "JF320520", "JF320329", "JF320259", "JF320497", "JF320160", "JF320011", "JF320411", "JF320564", "JF320044", "JF320144", "JF320356", "JF320120", "JF320427", "JF320184", "JF320592", "JF320145", "KX587162", "KM259197", "JN687749", "JN687750", "JN687758", "JF689862", "JF689863", "JF689865", "JF689866", "JF689867", "HQ217256", "GU562249", "EF593227", "KF990608", "KM259048", "KM259155", "JF689871", "JF689872", "JF689873", "JF689875", "JF689876", "JQ250872", "HQ216893", "HQ216915", "HQ216949", "EF593281", "HQ217930", "HQ217947", "HQ217967", "HQ217984", "HQ218001", "HQ218020", "HQ218034", "HM204589", "HM204582", "HM204580", "JQ403097", "JQ403095", "JQ403068", "FJ469709", "FJ469708", "FJ469723", "FJ469710", "FJ469714", "FJ469696", "FJ469700", "FJ469691", "KM353733", "KM353807", "KM354092", "KM354114", "JX863994", "JX863995", "JX864006", "JX864007", "JX864008", "JX863922", "JX864020", "KT124801", "GU330862", "KR423118", "HQ216971", "GU330956", "GU330994", "HQ908150", "KR423153", "KR423183", "HM638460", "HQ217043", "GU331183", "KR423796", "KR423500", "HQ908184", "KR423527", "JF320375", "JF320559", "JF320315", "JF320530", "JF320072", "JF320630", "JF320380", "JF320045", "JF320422", "JF320173", "JF320150", "JF320387", "JF320394", "JF320099", "JF320179", "JF320276", "JF320539", "JF320197", "JF320570", "JF320131", "KM258899", "KM259085", "KM258919", "HQ217079", "HQ217099", "JN687759", "JN687761", "JN687762", "JN687763", "HQ217115", "JF689877", "JF689883", "JF689886", "HQ908139", "HQ908109", "HQ217144", "FJ469721", "HQ217283", "HQ217340", "HQ217368", "HQ217393", "HQ217418", "KM259080", "KM259229", "JQ610053", "KM258941", "KM259030", "JF689889", "JF689890", "JF689893", "JQ250832", "HQ217574", "HQ217708", "GQ256645", "HQ217784", "JQ403093", "JQ403077", "JQ403075", "JQ403073", "JQ403071", "JQ403059", "JQ403096", "JQ403092", "JQ403078", "JQ403066", "JQ403064", "JQ403060", "JQ403058", "JQ403056", "FJ469716", "FJ469689", "FJ469707", "FJ469713", "KM353846", "KM354155", "KM354232", "KM354355", "KT124761", "JX864024", "JX864026", "KT124774", "KR868894", "KR423212", "HQ908219", "HM638516", "JX972390", "KR423234", "KR423279", "KR423303", "KR423319", "KR423340", "KR423358", "KR423363", "KR423373", "KR423391", "KR423410", "KY112522", "KR423545", "KR423553", "KR423567", "KR423590", "HM638583", "KR423602", "JN687773", "JF689895", "JF689896", "JF680925", "JQ610120", "JQ403030", "JQ403062", "FJ817365", "JF421421", "JQ403099", "JQ403091", "JQ403089", "JQ403087", "JQ403085", "JQ403083", "JQ403069", "JQ403067", "JQ403061", "JQ403035", "JQ403094", "JQ403088", "JQ403086", "JQ403084", "JQ403082", "JQ403080", "JQ403074", "JQ403070", "HM204596", "HQ615981", "KM081846", "KM081860", "KM081862", "KM081898", "KM081934", "KM082124", "KM354431", "KM354585", "KM354670", "JX863923", "JX863924", "KR423423", "KR423435", "KR423444", "KR423464", "KR423482", "HM638548", "KR423619", "KR423648", "JX140657", "KX587201", "KX587376", "KC473824", "KC935958", "KC935959", "GU733713", "HM030564", "HM030559", "HM030560", "HM030562", "HM030565", "KX228825", "KX228807", "JF680914", "JF680915", "JF680916", "JF680917", "KF526120", "JQ182824", "JQ182896", "JN599164", "KM081850", "KM081999", "KM082062", "KM353922", "KM354703", "KM354740", "KM354781", "KM354821", "KM354862", "KX587035", "KX587114", "KX587239", "KX587296", "JN397365", "HQ846900", "KU677989", "KU678069", "KX228803", "KC473830", "KC473828", "KC473826", "KC473829", "KC473827", "KC473825", "KX228802", "KF526174", "KF526228", "KF526261", "KF526298", "KF526318", "KM082076", "KM082156", "KM354470", "KM354904", "KM354962", "KM355003", "KM355044", "KT124766", "KT124773", "KT124775", "KT124809", "KU901727", "KF384798", "JN397363", "KF384801", "KF384802", "KF384803", "KF384804", "KF384805", "KF384806", "KF384807", "KC473831", "KC473832", "KC473833", "KC473834", "KC473835", "KF384808", "KF384809", "JN397362", "KF384810", "KF384811", "KU901757", "KM516886", "KU641402", "KU901831", "KF384812", "KF384813", "KF384814", "KY658702", "KM355085", "KM355159", "KT124750", "KT124756", "KT124768", "KT124784", "KT124785", "KT124790", "KX587074", "KU901788", "KU901807", "KM986883", "KU901875", "KU901856", "KU901898", "KX595119", "KR914675", "KT124796", "KX505583", "KX505602", "KX505643", "KX505649", "KX505664", "KX505707", "KY748513", "KY057587", "KT284371", "KU749387", "KR182473", "KR182437", "KR182371", "KR182343", "KR182342", "KR182340", "KR182321", "KR182276", "KR182218", "KR182192", "KR182177", "KX028188", "KT986553", "KX028313", "KX505395", "KX505412", "KX505435", "KX505460", "KX505504", "KX028499", "KX028620", "KX027965", "KX028066", "KX505734", "KU678025", "KU678049", "KU678125", "KY658693", "KR914678", "KR914676", "KT986933", "KX505441", "KX505552", "KY323724", "KY323813", "KY323883", "KY323997", "KY324081", "KY324166", "KY324398", "KY324503", "KX587007", "KX587277", "KX587339", "KY113882", "KY113735", "KY113566", "KY113379", "KY057382", "KY612718", "KY057496", "KY057570", "KX505535", "KX587433", "KX587448"};
        HashSet<String> hs = new HashSet<String>(Arrays.asList(arr));
        String arr1[] = {"K03455", "AF277059", "AF277058", "AF277067", "AF277066", "AF277065", "AF277064", "AF277063", "AF277061", "AF277057", "AF277056", "AF277055", "EF593245", "AF277074", "AF277073", "AF277072", "AF277071", "AF277070", "AF277069", "AF277068", "AF277075", "EF593243", "EF593263", "EF593264", "EF593265", "AY586543", "AY586542", "EF593267", "EF593268", "EU839609", "EU839607", "EU839606", "HQ217651", "EF593240", "EF593266", "EU839610", "EU839608", "HQ217760", "EF593259", "EF593261", "EF593262", "EF593260", "EU839605", "EU839604", "EU839603", "EU839602", "EU839601", "EU839600", "EU839598", "EU839597", "EU839596", "FJ817365", "JF680925", "HM030565", "HM030564", "HM030563", "HM030562", "HM030561", "HM030560", "HM030559", "KY658702", "KR914675", "KR914678", "KR914677", "KR914676"};
        for(int i=0; i< arr1.length;i++){
            if(hs.contains(arr1[i]))
                System.out.println(arr1[i]);
            else
                System.out.println(arr1[i]+"+++++");
        }
        }
}
