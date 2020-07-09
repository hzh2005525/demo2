package com.sogal.wx.core.tool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiUtils {
    public static String filterEmoji(String nick_name) {
        //nick_name 所获取的用户昵称
        if (nick_name == null) { return nick_name; }
        Pattern emoji = Pattern.compile("[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]", Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
        Matcher emojiMatcher = emoji.matcher(nick_name);
        if (emojiMatcher.find()) {
            //将所获取的表情转换为*
            nick_name = emojiMatcher.replaceAll("");
            nick_name = nick_name.replaceAll(" ","");
            return nick_name;
        }
        return nick_name;
    }

}
