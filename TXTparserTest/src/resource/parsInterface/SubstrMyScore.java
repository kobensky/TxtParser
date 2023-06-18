package resource.parsInterface;

public class SubstrMyScore implements ParseFuncInterface{
    @Override
    public void substringMeth(String s, StringBuilder sb) {
        if(s.contains("удалить оценку")) {
            sb.append(s.substring(s.indexOf("show();\">") + 9, s.indexOf("</div><div class=")));
        }
    }
}
