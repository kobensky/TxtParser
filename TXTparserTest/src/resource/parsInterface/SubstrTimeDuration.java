package resource.parsInterface;

public class SubstrTimeDuration implements ParseFuncInterface{
    @Override
    public void substringMeth(String s, StringBuilder sb) {
        if(s.contains(" мин")) {
            sb.append(s.substring(s.indexOf("y\">") + 3, s.indexOf(" мин")));
        }
    }
}
