package p6;

import java.util.Map;

/* loaded from: classes.dex */
public class h {

    /* renamed from: h  reason: collision with root package name */
    public static z f45952h = k.h();

    /* renamed from: a  reason: collision with root package name */
    public String f45953a;

    /* renamed from: b  reason: collision with root package name */
    public Double f45954b;

    /* renamed from: c  reason: collision with root package name */
    public String f45955c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f45956d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, String> f45957e;

    /* renamed from: f  reason: collision with root package name */
    public String f45958f;

    /* renamed from: g  reason: collision with root package name */
    public String f45959g;

    public h(String str) {
        if (a(str, f45952h)) {
            this.f45953a = str;
        }
    }

    public static boolean a(String str, z zVar) {
        if (str == null) {
            zVar.c("Missing Event Token", new Object[0]);
            return false;
        } else if (str.length() <= 0) {
            zVar.c("Event Token can't be empty", new Object[0]);
            return false;
        } else {
            return true;
        }
    }

    public final boolean b(Double d10, String str) {
        if (d10 != null) {
            if (d10.doubleValue() < 0.0d) {
                f45952h.c("Invalid amount %.5f", d10);
                return false;
            } else if (str == null) {
                f45952h.c("Currency must be set with revenue", new Object[0]);
                return false;
            } else if (str.equals("")) {
                f45952h.c("Currency is empty", new Object[0]);
                return false;
            }
        } else if (str != null) {
            f45952h.c("Revenue must be set with currency", new Object[0]);
            return false;
        }
        return true;
    }

    public boolean c() {
        return this.f45953a != null;
    }

    public void d(double d10, String str) {
        if (b(Double.valueOf(d10), str)) {
            this.f45954b = Double.valueOf(d10);
            this.f45955c = str;
        }
    }
}
