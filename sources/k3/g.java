package k3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: c  reason: collision with root package name */
    public static final Locale[] f38378c = new Locale[0];

    /* renamed from: d  reason: collision with root package name */
    public static final Locale f38379d = new Locale("en", "XA");

    /* renamed from: e  reason: collision with root package name */
    public static final Locale f38380e = new Locale("ar", "XB");

    /* renamed from: f  reason: collision with root package name */
    public static final Locale f38381f = f.b("en-Latn");

    /* renamed from: a  reason: collision with root package name */
    public final Locale[] f38382a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38383b;

    public g(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f38382a = f38378c;
            this.f38383b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    b(sb2, locale2);
                    if (i10 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i10 + "] is null");
            }
        }
        this.f38382a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
        this.f38383b = sb2.toString();
    }

    public static void b(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb2.append('-');
        sb2.append(locale.getCountry());
    }

    @Override // k3.h
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        Locale[] localeArr = ((g) obj).f38382a;
        if (this.f38382a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f38382a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // k3.h
    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f38382a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int i10 = 1;
        int i11 = 0;
        while (true) {
            Locale[] localeArr = this.f38382a;
            if (i11 >= localeArr.length) {
                return i10;
            }
            i10 = (i10 * 31) + localeArr[i11].hashCode();
            i11++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f38382a;
            if (i10 < localeArr.length) {
                sb2.append(localeArr[i10]);
                if (i10 < this.f38382a.length - 1) {
                    sb2.append(',');
                }
                i10++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
