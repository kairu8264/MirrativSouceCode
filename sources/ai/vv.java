package ai;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes3.dex */
public final class vv {

    /* renamed from: g  reason: collision with root package name */
    public Date f11372g;

    /* renamed from: h  reason: collision with root package name */
    public String f11373h;

    /* renamed from: k  reason: collision with root package name */
    public Location f11376k;

    /* renamed from: l  reason: collision with root package name */
    public String f11377l;

    /* renamed from: m  reason: collision with root package name */
    public String f11378m;

    /* renamed from: o  reason: collision with root package name */
    public boolean f11380o;

    /* renamed from: p  reason: collision with root package name */
    public fh.a f11381p;

    /* renamed from: q  reason: collision with root package name */
    public String f11382q;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<String> f11366a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f11367b = new Bundle();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<Class<Object>, Object> f11368c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<String> f11369d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f11370e = new Bundle();

    /* renamed from: f  reason: collision with root package name */
    public final HashSet<String> f11371f = new HashSet<>();

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f11374i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public int f11375j = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f11379n = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f11383r = 60000;

    @Deprecated
    public final void A(Date date) {
        this.f11372g = date;
    }

    @Deprecated
    public final void a(int i10) {
        this.f11375j = i10;
    }

    public final void b(Location location) {
        this.f11376k = location;
    }

    @Deprecated
    public final void c(boolean z10) {
        this.f11379n = z10 ? 1 : 0;
    }

    @Deprecated
    public final void d(boolean z10) {
        this.f11380o = z10;
    }

    public final void w(String str) {
        this.f11366a.add(str);
    }

    public final void x(Class<Object> cls, Bundle bundle) {
        this.f11367b.putBundle(cls.getName(), bundle);
    }

    public final void y(String str) {
        this.f11369d.add(str);
    }

    public final void z(String str) {
        this.f11369d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }
}
