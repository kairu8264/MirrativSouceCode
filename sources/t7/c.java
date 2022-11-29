package t7;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import m7.h;
import s7.n;
import s7.o;
import s7.r;
import v7.c0;

/* loaded from: classes.dex */
public class c implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f53251a;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f53252a;

        public a(Context context) {
            this.f53252a = context;
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<Uri, InputStream> c(r rVar) {
            return new c(this.f53252a);
        }
    }

    public c(Context context) {
        this.f53251a = context.getApplicationContext();
    }

    @Override // s7.n
    /* renamed from: c */
    public n.a<InputStream> b(Uri uri, int i10, int i11, h hVar) {
        if (n7.b.d(i10, i11) && e(hVar)) {
            return new n.a<>(new h8.d(uri), n7.c.g(this.f53251a, uri));
        }
        return null;
    }

    @Override // s7.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return n7.b.c(uri);
    }

    public final boolean e(h hVar) {
        Long l10 = (Long) hVar.c(c0.f56840d);
        return l10 != null && l10.longValue() == -1;
    }
}
