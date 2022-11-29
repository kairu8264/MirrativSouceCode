package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kk.h;
import lk.b0;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f40227a;

    /* renamed from: b  reason: collision with root package name */
    public int f40228b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f40229c = -1;
    @MonotonicNonNullDecl

    /* renamed from: d  reason: collision with root package name */
    public b0.n f40230d;
    @MonotonicNonNullDecl

    /* renamed from: e  reason: collision with root package name */
    public b0.n f40231e;
    @MonotonicNonNullDecl

    /* renamed from: f  reason: collision with root package name */
    public kk.e<Object> f40232f;

    public int a() {
        int i10 = this.f40229c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    public int b() {
        int i10 = this.f40228b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    public kk.e<Object> c() {
        return (kk.e) kk.h.a(this.f40232f, d().a());
    }

    public b0.n d() {
        return (b0.n) kk.h.a(this.f40230d, b0.n.STRONG);
    }

    public b0.n e() {
        return (b0.n) kk.h.a(this.f40231e, b0.n.STRONG);
    }

    public <K, V> ConcurrentMap<K, V> f() {
        if (!this.f40227a) {
            return new ConcurrentHashMap(b(), 0.75f, a());
        }
        return b0.e(this);
    }

    public a0 g(b0.n nVar) {
        b0.n nVar2 = this.f40230d;
        kk.j.p(nVar2 == null, "Key strength was already set to %s", nVar2);
        this.f40230d = (b0.n) kk.j.i(nVar);
        if (nVar != b0.n.STRONG) {
            this.f40227a = true;
        }
        return this;
    }

    @CanIgnoreReturnValue
    public a0 h() {
        return g(b0.n.WEAK);
    }

    public String toString() {
        h.b b10 = kk.h.b(this);
        int i10 = this.f40228b;
        if (i10 != -1) {
            b10.a("initialCapacity", i10);
        }
        int i11 = this.f40229c;
        if (i11 != -1) {
            b10.a("concurrencyLevel", i11);
        }
        b0.n nVar = this.f40230d;
        if (nVar != null) {
            b10.b("keyStrength", kk.b.b(nVar.toString()));
        }
        b0.n nVar2 = this.f40231e;
        if (nVar2 != null) {
            b10.b("valueStrength", kk.b.b(nVar2.toString()));
        }
        if (this.f40232f != null) {
            b10.f("keyEquivalence");
        }
        return b10.toString();
    }
}
