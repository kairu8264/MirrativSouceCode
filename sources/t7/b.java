package t7;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import m7.h;
import s7.n;
import s7.o;
import s7.r;

/* loaded from: classes.dex */
public class b implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f53249a;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f53250a;

        public a(Context context) {
            this.f53250a = context;
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<Uri, InputStream> c(r rVar) {
            return new b(this.f53250a);
        }
    }

    public b(Context context) {
        this.f53249a = context.getApplicationContext();
    }

    @Override // s7.n
    /* renamed from: c */
    public n.a<InputStream> b(Uri uri, int i10, int i11, h hVar) {
        if (n7.b.d(i10, i11)) {
            return new n.a<>(new h8.d(uri), n7.c.e(this.f53249a, uri));
        }
        return null;
    }

    @Override // s7.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return n7.b.a(uri);
    }
}
