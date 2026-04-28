package net.tlotd.roads_n_vehicles.block.custom.entity.renderer;

import java.util.HashMap;
import java.util.Map;

public class PlateGlyphs {

    private static final Map<Character, Character> CHAR_MAP = new HashMap<>();

    static {
        CHAR_MAP.put('0', '\uE000');
        CHAR_MAP.put('1', '\uE001');
        CHAR_MAP.put('2', '\uE002');
        CHAR_MAP.put('3', '\uE003');
        CHAR_MAP.put('4', '\uE004');
        CHAR_MAP.put('5', '\uE005');
        CHAR_MAP.put('6', '\uE006');
        CHAR_MAP.put('7', '\uE007');
        CHAR_MAP.put('8', '\uE008');
        CHAR_MAP.put('9', '\uE009');
        CHAR_MAP.put('-', '\uE00A');
        CHAR_MAP.put('A', '\uE00B');
        CHAR_MAP.put('B', '\uE00C');
        CHAR_MAP.put('C', '\uE00D');
        CHAR_MAP.put('D', '\uE00E');
        CHAR_MAP.put('E', '\uE00F');
        CHAR_MAP.put('F', '\uE010');
        CHAR_MAP.put('G', '\uE011');
        CHAR_MAP.put('H', '\uE012');
        CHAR_MAP.put('I', '\uE013');
        CHAR_MAP.put('J', '\uE014');
        CHAR_MAP.put('K', '\uE015');
        CHAR_MAP.put('L', '\uE016');
        CHAR_MAP.put('M', '\uE017');
        CHAR_MAP.put('N', '\uE018');
        CHAR_MAP.put('O', '\uE019');
        CHAR_MAP.put('P', '\uE01A');
        CHAR_MAP.put('Q', '\uE01B');
        CHAR_MAP.put('R', '\uE01C');
        CHAR_MAP.put('S', '\uE01D');
        CHAR_MAP.put('T', '\uE01E');
        CHAR_MAP.put('U', '\uE01F');
        CHAR_MAP.put('V', '\uE020');
        CHAR_MAP.put('W', '\uE021');
        CHAR_MAP.put('X', '\uE022');
        CHAR_MAP.put('Y', '\uE023');
        CHAR_MAP.put('Z', '\uE024');
        CHAR_MAP.put('Ä', '\uE025');
        CHAR_MAP.put('Ö', '\uE026');
        CHAR_MAP.put('Ü', '\uE027');
    }

    private static final Map<String, Character> TOKEN_MAP = new HashMap<>();

    static {
        TOKEN_MAP.put("[A]", '\uE100');
        TOKEN_MAP.put("[AL]", '\uE101');
        TOKEN_MAP.put("[B]", '\uE102');
        TOKEN_MAP.put("[BIH]", '\uE103');
        TOKEN_MAP.put("[BG]", '\uE104');
        TOKEN_MAP.put("[CH]", '\uE105');
        TOKEN_MAP.put("[CY]", '\uE106');
        TOKEN_MAP.put("[CX]", '\uE107');
        TOKEN_MAP.put("[D]", '\uE108');
        TOKEN_MAP.put("[DK]", '\uE109');
        TOKEN_MAP.put("[E]", '\uE10A');
        TOKEN_MAP.put("[EST]", '\uE10B');
        TOKEN_MAP.put("[F]", '\uE10C');
        TOKEN_MAP.put("[FIN]", '\uE10D');
        TOKEN_MAP.put("[GR]", '\uE10E');
        TOKEN_MAP.put("[H]", '\uE10F');
        TOKEN_MAP.put("[HR]", '\uE110');
        TOKEN_MAP.put("[I]", '\uE111');
        TOKEN_MAP.put("[IRL]", '\uE112');
        TOKEN_MAP.put("[L]", '\uE113');
        TOKEN_MAP.put("[LT]", '\uE114');
        TOKEN_MAP.put("[LV]", '\uE115');
        TOKEN_MAP.put("[M]", '\uE116');
        TOKEN_MAP.put("[MD]", '\uE117');
        TOKEN_MAP.put("[MNE]", '\uE118');
        TOKEN_MAP.put("[N]", '\uE119');
        TOKEN_MAP.put("[NL]", '\uE11A');
        TOKEN_MAP.put("[NMK]", '\uE11B');
        TOKEN_MAP.put("[P]", '\uE11C');
        TOKEN_MAP.put("[PL]", '\uE11D');
        TOKEN_MAP.put("[RO]", '\uE11E');
        TOKEN_MAP.put("[S]", '\uE11F');
        TOKEN_MAP.put("[SK]", '\uE120');
        TOKEN_MAP.put("[SLO]", '\uE121');
        TOKEN_MAP.put("[UA]", '\uE122');
        TOKEN_MAP.put("[UK]", '\uE123');
        TOKEN_MAP.put("[LTD]", '\uE124');
        TOKEN_MAP.put("[NIS]", '\uE125');
        TOKEN_MAP.put("[LAZ]", '\uE126');
        TOKEN_MAP.put("[LKR]", '\uE127');
        TOKEN_MAP.put("[COM]", '\uE128');
        TOKEN_MAP.put("[-]", '\uE129');
        TOKEN_MAP.put("{EMPTY}", '\uE12A');
        TOKEN_MAP.put("{LTD}", '\uE12B');
        TOKEN_MAP.put("{NIS}", '\uE12C');
        TOKEN_MAP.put("{LAZ}", '\uE12D');
        TOKEN_MAP.put("{LKR}", '\uE12E');
        TOKEN_MAP.put("{COM}", '\uE12F');
        TOKEN_MAP.put("{-}", '\uE130');
        TOKEN_MAP.put("{LTD:16}", '\uE131');
        TOKEN_MAP.put("{LTD:17}", '\uE132');
        TOKEN_MAP.put("{LTD:18}", '\uE133');
        TOKEN_MAP.put("{LTD:19}", '\uE134');
        TOKEN_MAP.put("{LTD:20}", '\uE135');
        TOKEN_MAP.put("{LTD:21}", '\uE136');
        TOKEN_MAP.put("{LTD:22}", '\uE137');
        TOKEN_MAP.put("{LTD:23}", '\uE138');
        TOKEN_MAP.put("{LTD:24}", '\uE139');
        TOKEN_MAP.put("{LTD:25}", '\uE13A');
        TOKEN_MAP.put("{LTD:26}", '\uE13B');
        TOKEN_MAP.put("{LTD:27}", '\uE13C');
        TOKEN_MAP.put("{LTD:28}", '\uE13D');
        TOKEN_MAP.put("{LTD:29}", '\uE13E');
        TOKEN_MAP.put("{LTD:30}", '\uE13F');
    }

    public static boolean isAllowedChar(char c) {
        return CHAR_MAP.containsKey(Character.toUpperCase(c));
    }

    public static String filterAllowed(String input) {
        if (input == null) return "";
        StringBuilder out = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c == '[' || c == ']' || c == '{' || c == '}' || c == ':' || c == ' ' || PlateGlyphs.isAllowedChar(c)) {
                out.append(c);
            }
        }
        return out.toString();
    }

    public static String convert(String input, boolean plate) {
        if (input == null || input.isEmpty()) return "";
        StringBuilder out = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); ) {
            char c = input.charAt(i);
            if (c == '[') {
                int end = input.indexOf(']', i);
                if (end != -1) {
                    String token = input.substring(i, end + 1);
                    Character mapped = TOKEN_MAP.get(token);
                    if (mapped != null) {
                        out.append(mapped);
                        i = end + 1;
                        continue;
                    }
                }
            }
            if (c == '{') {
                int end = input.indexOf('}', i);
                if (end != -1) {
                    String token = input.substring(i, end + 1);
                    Character mapped = TOKEN_MAP.get(token);
                    if (mapped != null) {
                        out.append(mapped);
                        i = end + 1;
                        continue;
                    }
                }
            }
            char upper = Character.toUpperCase(c);
            if (plate) {
                out.append(CHAR_MAP.getOrDefault(upper, ' '));
            } else {
                out.append(upper);
            }
            i++;
        }
        return out.toString();
    }
}
