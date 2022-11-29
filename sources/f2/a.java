package f2;

import java.util.Locale;
import jo.p;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Locale f31704a;

    public a(Locale locale) {
        p.h(locale, "javaLocale");
        this.f31704a = locale;
    }

    @Override // f2.g
    public String a() {
        String languageTag = this.f31704a.toLanguageTag();
        p.g(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    public final Locale b() {
        return this.f31704a;
    }
}
