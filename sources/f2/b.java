package f2;

import java.util.List;
import java.util.Locale;
import jo.p;
import xn.r;

/* loaded from: classes.dex */
public final class b implements h {
    @Override // f2.h
    public List<g> a() {
        Locale locale = Locale.getDefault();
        p.g(locale, "getDefault()");
        return r.d(new a(locale));
    }

    @Override // f2.h
    public g b(String str) {
        p.h(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        p.g(forLanguageTag, "forLanguageTag(languageTag)");
        return new a(forLanguageTag);
    }
}
