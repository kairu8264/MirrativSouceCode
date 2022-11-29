package d6;

import a6.r;
import android.webkit.MimeTypeMap;
import d6.h;
import j6.m;
import java.io.File;
import rp.y;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final File f29207a;

    /* loaded from: classes.dex */
    public static final class a implements h.a<File> {
        @Override // d6.h.a
        /* renamed from: b */
        public h a(File file, m mVar, x5.e eVar) {
            return new i(file);
        }
    }

    public i(File file) {
        this.f29207a = file;
    }

    @Override // d6.h
    public Object a(ao.d<? super g> dVar) {
        return new l(r.d(y.a.d(y.f51736x, this.f29207a, false, 1, null), null, null, null, 14, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(go.e.d(this.f29207a)), a6.d.DISK);
    }
}
