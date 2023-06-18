package resource.parsInterface;

public class SubstrName implements ParseFuncInterface{
    @Override
    public void substringMeth(String s, StringBuilder sb) {
        if(s.contains("nameRus")) {
            sb.append(s.substring(s.indexOf("/\">") + 3, s.indexOf("</a>")));
        }
    }
}
