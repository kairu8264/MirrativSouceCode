package so;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f52771a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f52772b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f52773c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f52774d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f52775e;

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f52776f;

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f52777g;

    /* renamed from: h  reason: collision with root package name */
    public static Charset f52778h;

    /* renamed from: i  reason: collision with root package name */
    public static Charset f52779i;

    static {
        Charset forName = Charset.forName(C.UTF8_NAME);
        jo.p.g(forName, "forName(\"UTF-8\")");
        f52772b = forName;
        Charset forName2 = Charset.forName(C.UTF16_NAME);
        jo.p.g(forName2, "forName(\"UTF-16\")");
        f52773c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        jo.p.g(forName3, "forName(\"UTF-16BE\")");
        f52774d = forName3;
        Charset forName4 = Charset.forName(C.UTF16LE_NAME);
        jo.p.g(forName4, "forName(\"UTF-16LE\")");
        f52775e = forName4;
        Charset forName5 = Charset.forName(C.ASCII_NAME);
        jo.p.g(forName5, "forName(\"US-ASCII\")");
        f52776f = forName5;
        Charset forName6 = Charset.forName(C.ISO88591_NAME);
        jo.p.g(forName6, "forName(\"ISO-8859-1\")");
        f52777g = forName6;
    }

    public final Charset a() {
        Charset charset = f52779i;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32BE");
            jo.p.g(forName, "forName(\"UTF-32BE\")");
            f52779i = forName;
            return forName;
        }
        return charset;
    }

    public final Charset b() {
        Charset charset = f52778h;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32LE");
            jo.p.g(forName, "forName(\"UTF-32LE\")");
            f52778h = forName;
            return forName;
        }
        return charset;
    }
}
