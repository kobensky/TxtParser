package resource.parsInterface;

public class SubstrTotalScore implements ParseFuncInterface{
    @Override
    public void substringMeth(String s, StringBuilder sb) {
        if(s.contains("<b>")) {
            sb.append(s.substring(s.indexOf("<b>") + 3, s.indexOf("</b>")));
        }
    }
}
