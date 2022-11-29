package v4;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import z4.h;

/* loaded from: classes.dex */
public class v0 implements h.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f56728a;

    /* renamed from: b  reason: collision with root package name */
    public final File f56729b;

    /* renamed from: c  reason: collision with root package name */
    public final Callable<InputStream> f56730c;

    /* renamed from: d  reason: collision with root package name */
    public final h.c f56731d;

    public v0(String str, File file, Callable<InputStream> callable, h.c cVar) {
        this.f56728a = str;
        this.f56729b = file;
        this.f56730c = callable;
        this.f56731d = cVar;
    }

    @Override // z4.h.c
    public z4.h a(h.b bVar) {
        return new u0(bVar.f62506a, this.f56728a, this.f56729b, this.f56730c, bVar.f62508c.f62505a, this.f56731d.a(bVar));
    }
}
