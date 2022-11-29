package ai;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class jt0 implements qq1 {

    /* renamed from: a  reason: collision with root package name */
    public final bu0 f5917a;

    /* renamed from: b  reason: collision with root package name */
    public final mt0 f5918b;

    /* renamed from: c  reason: collision with root package name */
    public Long f5919c;

    /* renamed from: d  reason: collision with root package name */
    public String f5920d;

    public /* synthetic */ jt0(bu0 bu0Var, mt0 mt0Var, st0 st0Var) {
        this.f5917a = bu0Var;
        this.f5918b = mt0Var;
    }

    @Override // ai.qq1
    public final /* bridge */ /* synthetic */ qq1 a(long j10) {
        this.f5919c = Long.valueOf(j10);
        return this;
    }

    @Override // ai.qq1
    public final /* bridge */ /* synthetic */ qq1 t(String str) {
        Objects.requireNonNull(str);
        this.f5920d = str;
        return this;
    }

    @Override // ai.qq1
    public final rq1 zza() {
        zn3.c(this.f5919c, Long.class);
        zn3.c(this.f5920d, String.class);
        return new kt0(this.f5917a, this.f5918b, this.f5919c, this.f5920d, null);
    }
}
