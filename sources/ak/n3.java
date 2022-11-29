package ak;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* loaded from: classes3.dex */
public final class n3 {

    /* renamed from: c  reason: collision with root package name */
    public static final dk.f f13555c = new dk.f("PatchSliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    public final o0 f13556a;

    /* renamed from: b  reason: collision with root package name */
    public final dk.b0<u4> f13557b;

    public n3(o0 o0Var, dk.b0<u4> b0Var) {
        this.f13556a = o0Var;
        this.f13557b = b0Var;
    }

    public final void a(m3 m3Var) {
        File v10 = this.f13556a.v(m3Var.f13533b, m3Var.f13534c, m3Var.f13535d);
        File file = new File(this.f13556a.w(m3Var.f13533b, m3Var.f13534c, m3Var.f13535d), m3Var.f13539h);
        try {
            InputStream inputStream = m3Var.f13541j;
            if (m3Var.f13538g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            r0 r0Var = new r0(v10, file);
            File D = this.f13556a.D(m3Var.f13533b, m3Var.f13536e, m3Var.f13537f, m3Var.f13539h);
            if (!D.exists()) {
                D.mkdirs();
            }
            u3 u3Var = new u3(this.f13556a, m3Var.f13533b, m3Var.f13536e, m3Var.f13537f, m3Var.f13539h);
            dk.y.a(r0Var, inputStream, new s1(D, u3Var), m3Var.f13540i);
            u3Var.i(0);
            inputStream.close();
            f13555c.d("Patching and extraction finished for slice %s of pack %s.", m3Var.f13539h, m3Var.f13533b);
            this.f13557b.zza().f(m3Var.f13532a, m3Var.f13533b, m3Var.f13539h, 0);
            try {
                m3Var.f13541j.close();
            } catch (IOException unused) {
                f13555c.e("Could not close file for slice %s of pack %s.", m3Var.f13539h, m3Var.f13533b);
            }
        } catch (IOException e10) {
            f13555c.b("IOException during patching %s.", e10.getMessage());
            throw new p1(String.format("Error patching slice %s of pack %s.", m3Var.f13539h, m3Var.f13533b), e10, m3Var.f13532a);
        }
    }
}
