package q7;

import java.io.File;
import q7.a;

/* loaded from: classes.dex */
public class d implements a.InterfaceC0736a {

    /* renamed from: a  reason: collision with root package name */
    public final long f48756a;

    /* renamed from: b  reason: collision with root package name */
    public final a f48757b;

    /* loaded from: classes.dex */
    public interface a {
        File a();
    }

    public d(a aVar, long j10) {
        this.f48756a = j10;
        this.f48757b = aVar;
    }

    @Override // q7.a.InterfaceC0736a
    public q7.a a() {
        File a10 = this.f48757b.a();
        if (a10 == null) {
            return null;
        }
        if (a10.isDirectory() || a10.mkdirs()) {
            return e.c(a10, this.f48756a);
        }
        return null;
    }
}
