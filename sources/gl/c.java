package gl;

import al.o;
import android.content.Context;
import cg.t;
import cl.a0;
import com.google.android.exoplayer2.C;
import dl.g;
import java.nio.charset.Charset;
import vi.h;
import zf.e;
import zf.f;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    public static final g f33655c = new g();

    /* renamed from: d  reason: collision with root package name */
    public static final String f33656d = f("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e  reason: collision with root package name */
    public static final String f33657e = f("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f  reason: collision with root package name */
    public static final e<a0, byte[]> f33658f = a.f33652a;

    /* renamed from: a  reason: collision with root package name */
    public final f<a0> f33659a;

    /* renamed from: b  reason: collision with root package name */
    public final e<a0, byte[]> f33660b;

    public c(f<a0> fVar, e<a0, byte[]> eVar) {
        this.f33659a = fVar;
        this.f33660b = eVar;
    }

    public static c c(Context context) {
        t.f(context);
        zf.g g10 = t.c().g(new ag.a(f33656d, f33657e));
        zf.b b10 = zf.b.b("json");
        e<a0, byte[]> eVar = f33658f;
        return new c(g10.a("FIREBASE_CRASHLYTICS_REPORT", a0.class, b10, eVar), eVar);
    }

    public static /* synthetic */ void d(h hVar, o oVar, Exception exc) {
        if (exc != null) {
            hVar.d(exc);
        } else {
            hVar.e(oVar);
        }
    }

    public static /* synthetic */ byte[] e(a0 a0Var) {
        return f33655c.E(a0Var).getBytes(Charset.forName(C.UTF8_NAME));
    }

    public static String f(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb2.append(str.charAt(i10));
                if (str2.length() > i10) {
                    sb2.append(str2.charAt(i10));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public vi.g<o> g(final o oVar) {
        a0 b10 = oVar.b();
        final h hVar = new h();
        this.f33659a.a(zf.c.f(b10), new zf.h() { // from class: gl.b
            @Override // zf.h
            public final void a(Exception exc) {
                c.d(h.this, oVar, exc);
            }
        });
        return hVar.a();
    }
}
