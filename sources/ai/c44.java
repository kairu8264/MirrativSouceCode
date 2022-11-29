package ai;

import com.google.android.gms.internal.ads.zzwl;

/* loaded from: classes3.dex */
public final class c44<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f2709a;

    /* renamed from: b  reason: collision with root package name */
    public final h34 f2710b;

    /* renamed from: c  reason: collision with root package name */
    public final zzwl f2711c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2712d;

    public c44(zzwl zzwlVar) {
        this.f2712d = false;
        this.f2709a = null;
        this.f2710b = null;
        this.f2711c = zzwlVar;
    }

    public c44(T t10, h34 h34Var) {
        this.f2712d = false;
        this.f2709a = t10;
        this.f2710b = h34Var;
        this.f2711c = null;
    }

    public static <T> c44<T> a(T t10, h34 h34Var) {
        return new c44<>(t10, h34Var);
    }

    public static <T> c44<T> b(zzwl zzwlVar) {
        return new c44<>(zzwlVar);
    }

    public final boolean c() {
        return this.f2711c == null;
    }
}
