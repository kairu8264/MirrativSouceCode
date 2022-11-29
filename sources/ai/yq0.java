package ai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class yq0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f12706a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f12707b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        Matcher matcher = f12706a.matcher(str);
        int i10 = 0;
        if (matcher.find()) {
            int end = matcher.end();
            sb2.append(str.substring(0, end));
            while (i10 <= 0) {
                String str2 = strArr[i10];
                if (str2 != null) {
                    sb2.append(str2);
                }
                i10++;
            }
            sb2.append(str.substring(end));
        } else {
            if (!f12707b.matcher(str).find()) {
                while (i10 <= 0) {
                    String str3 = strArr[i10];
                    if (str3 != null) {
                        sb2.append(str3);
                    }
                    i10++;
                }
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
