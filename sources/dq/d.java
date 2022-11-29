package dq;

import android.os.Looper;
import dq.f;
import dq.g;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: m  reason: collision with root package name */
    public static final ExecutorService f29811m = Executors.newCachedThreadPool();

    /* renamed from: e  reason: collision with root package name */
    public boolean f29816e;

    /* renamed from: g  reason: collision with root package name */
    public boolean f29818g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f29819h;

    /* renamed from: j  reason: collision with root package name */
    public List<fq.b> f29821j;

    /* renamed from: k  reason: collision with root package name */
    public f f29822k;

    /* renamed from: l  reason: collision with root package name */
    public g f29823l;

    /* renamed from: a  reason: collision with root package name */
    public boolean f29812a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f29813b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f29814c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f29815d = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f29817f = true;

    /* renamed from: i  reason: collision with root package name */
    public ExecutorService f29820i = f29811m;

    public static Object a() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public f b() {
        f fVar = this.f29822k;
        return fVar != null ? fVar : f.a.a();
    }

    public g c() {
        Object a10;
        g gVar = this.f29823l;
        if (gVar != null) {
            return gVar;
        }
        if (!eq.a.c() || (a10 = a()) == null) {
            return null;
        }
        return new g.a((Looper) a10);
    }
}
