package f2;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jo.p;

/* loaded from: classes.dex */
public final class c implements h {
    @Override // f2.h
    public List<g> a() {
        LocaleList localeList = LocaleList.getDefault();
        p.g(localeList, "getDefault()");
        ArrayList arrayList = new ArrayList();
        int size = localeList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Locale locale = localeList.get(i10);
            p.g(locale, "localeList[i]");
            arrayList.add(new a(locale));
        }
        return arrayList;
    }

    @Override // f2.h
    public g b(String str) {
        p.h(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        p.g(forLanguageTag, "forLanguageTag(languageTag)");
        return new a(forLanguageTag);
    }
}
