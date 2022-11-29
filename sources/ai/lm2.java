package ai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes3.dex */
public final class lm2 {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f6619a;

    public lm2() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) ft.c().c(ox.f7978e5));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f6619a = pattern;
    }

    public final String a(String str) {
        Pattern pattern = this.f6619a;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
