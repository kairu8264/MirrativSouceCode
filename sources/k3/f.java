package k3;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final f f38376b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    public h f38377a;

    public f(h hVar) {
        this.f38377a = hVar;
    }

    public static f a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d(new LocaleList(localeArr));
        }
        return new f(new g(localeArr));
    }

    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static f d(LocaleList localeList) {
        return new f(new i(localeList));
    }

    public Locale c(int i10) {
        return this.f38377a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f38377a.equals(((f) obj).f38377a);
    }

    public int hashCode() {
        return this.f38377a.hashCode();
    }

    public String toString() {
        return this.f38377a.toString();
    }
}
