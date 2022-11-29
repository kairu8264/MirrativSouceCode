package t7;

import com.bumptech.glide.load.data.j;
import com.google.android.exoplayer2.DefaultLoadControl;
import java.io.InputStream;
import m7.h;
import s7.g;
import s7.m;
import s7.n;
import s7.o;
import s7.r;

/* loaded from: classes.dex */
public class a implements n<g, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final m7.g<Integer> f53246b = m7.g.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf((int) DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS));

    /* renamed from: a  reason: collision with root package name */
    public final m<g, g> f53247a;

    /* renamed from: t7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0821a implements o<g, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final m<g, g> f53248a = new m<>(500);

        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<g, InputStream> c(r rVar) {
            return new a(this.f53248a);
        }
    }

    public a(m<g, g> mVar) {
        this.f53247a = mVar;
    }

    @Override // s7.n
    /* renamed from: c */
    public n.a<InputStream> b(g gVar, int i10, int i11, h hVar) {
        m<g, g> mVar = this.f53247a;
        if (mVar != null) {
            g a10 = mVar.a(gVar, 0, 0);
            if (a10 == null) {
                this.f53247a.b(gVar, 0, 0, gVar);
            } else {
                gVar = a10;
            }
        }
        return new n.a<>(gVar, new j(gVar, ((Integer) hVar.c(f53246b)).intValue()));
    }

    @Override // s7.n
    /* renamed from: d */
    public boolean a(g gVar) {
        return true;
    }
}
