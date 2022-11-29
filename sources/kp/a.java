package kp;

import com.google.android.exoplayer2.util.FileTypes;
import ep.b0;
import ep.c0;
import ep.d0;
import ep.e0;
import ep.m;
import ep.n;
import ep.w;
import ep.x;
import java.io.IOException;
import java.util.List;
import jo.p;
import rp.t;
import xn.s;

/* loaded from: classes4.dex */
public final class a implements w {

    /* renamed from: a  reason: collision with root package name */
    public final n f38911a;

    public a(n nVar) {
        p.h(nVar, "cookieJar");
        this.f38911a = nVar;
    }

    public final String a(List<m> list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.t();
            }
            m mVar = (m) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(mVar.e());
            sb2.append('=');
            sb2.append(mVar.g());
            i10 = i11;
        }
        String sb3 = sb2.toString();
        p.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // ep.w
    public d0 intercept(w.a aVar) throws IOException {
        e0 a10;
        p.h(aVar, "chain");
        b0 j10 = aVar.j();
        b0.a h10 = j10.h();
        c0 a11 = j10.a();
        if (a11 != null) {
            x b10 = a11.b();
            if (b10 != null) {
                h10.d(FileTypes.HEADER_CONTENT_TYPE, b10.toString());
            }
            long a12 = a11.a();
            if (a12 != -1) {
                h10.d("Content-Length", String.valueOf(a12));
                h10.g("Transfer-Encoding");
            } else {
                h10.d("Transfer-Encoding", "chunked");
                h10.g("Content-Length");
            }
        }
        boolean z10 = false;
        if (j10.d("Host") == null) {
            h10.d("Host", fp.b.N(j10.j(), false, 1, null));
        }
        if (j10.d("Connection") == null) {
            h10.d("Connection", "Keep-Alive");
        }
        if (j10.d("Accept-Encoding") == null && j10.d("Range") == null) {
            h10.d("Accept-Encoding", "gzip");
            z10 = true;
        }
        List<m> loadForRequest = this.f38911a.loadForRequest(j10.j());
        if (!loadForRequest.isEmpty()) {
            h10.d("Cookie", a(loadForRequest));
        }
        if (j10.d("User-Agent") == null) {
            h10.d("User-Agent", "okhttp/4.9.3");
        }
        d0 a13 = aVar.a(h10.b());
        e.f(this.f38911a, j10.j(), a13.p());
        d0.a r10 = a13.z().r(j10);
        if (z10 && so.n.q("gzip", d0.o(a13, "Content-Encoding", null, 2, null), true) && e.b(a13) && (a10 = a13.a()) != null) {
            rp.n nVar = new rp.n(a10.n());
            r10.k(a13.p().j().i("Content-Encoding").i("Content-Length").g());
            r10.b(new h(d0.o(a13, FileTypes.HEADER_CONTENT_TYPE, null, 2, null), -1L, t.c(nVar)));
        }
        return r10.c();
    }
}
