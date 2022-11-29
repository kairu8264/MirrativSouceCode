package ai;

import java.util.ArrayList;
import rg.s;

/* loaded from: classes3.dex */
public final class zv {

    /* renamed from: g  reason: collision with root package name */
    public static zv f13200g;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13202b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public boolean f13203c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13204d = false;

    /* renamed from: e  reason: collision with root package name */
    public rg.o f13205e = null;

    /* renamed from: f  reason: collision with root package name */
    public rg.s f13206f = new s.a().a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Object> f13201a = new ArrayList<>();

    public static zv a() {
        zv zvVar;
        synchronized (zv.class) {
            if (f13200g == null) {
                f13200g = new zv();
            }
            zvVar = f13200g;
        }
        return zvVar;
    }

    public final rg.s b() {
        return this.f13206f;
    }
}
