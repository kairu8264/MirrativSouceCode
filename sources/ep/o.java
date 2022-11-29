package ep;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f30984a = new o();

    public static final String a(String str, String str2, Charset charset) {
        jo.p.h(str, "username");
        jo.p.h(str2, "password");
        jo.p.h(charset, "charset");
        String a10 = rp.f.f51677z.c(str + ':' + str2, charset).a();
        return "Basic " + a10;
    }

    public static /* synthetic */ String b(String str, String str2, Charset charset, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            jo.p.g(charset, "ISO_8859_1");
        }
        return a(str, str2, charset);
    }
}
