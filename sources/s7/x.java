package s7;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import s7.n;

/* loaded from: classes.dex */
public class x<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f52302b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a  reason: collision with root package name */
    public final n<g, Data> f52303a;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {
        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<Uri, InputStream> c(r rVar) {
            return new x(rVar.d(g.class, InputStream.class));
        }
    }

    public x(n<g, Data> nVar) {
        this.f52303a = nVar;
    }

    @Override // s7.n
    /* renamed from: c */
    public n.a<Data> b(Uri uri, int i10, int i11, m7.h hVar) {
        return this.f52303a.b(new g(uri.toString()), i10, i11, hVar);
    }

    @Override // s7.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return f52302b.contains(uri.getScheme());
    }
}
