package t7;

import java.io.InputStream;
import java.net.URL;
import m7.h;
import s7.g;
import s7.n;
import s7.o;
import s7.r;

/* loaded from: classes.dex */
public class e implements n<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final n<g, InputStream> f53263a;

    /* loaded from: classes.dex */
    public static class a implements o<URL, InputStream> {
        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<URL, InputStream> c(r rVar) {
            return new e(rVar.d(g.class, InputStream.class));
        }
    }

    public e(n<g, InputStream> nVar) {
        this.f53263a = nVar;
    }

    @Override // s7.n
    /* renamed from: c */
    public n.a<InputStream> b(URL url, int i10, int i11, h hVar) {
        return this.f53263a.b(new g(url), i10, i11, hVar);
    }

    @Override // s7.n
    /* renamed from: d */
    public boolean a(URL url) {
        return true;
    }
}
