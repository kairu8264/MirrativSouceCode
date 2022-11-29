package ai;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class lt0 implements yq1 {

    /* renamed from: a  reason: collision with root package name */
    public final bu0 f6658a;

    /* renamed from: b  reason: collision with root package name */
    public Context f6659b;

    /* renamed from: c  reason: collision with root package name */
    public l40 f6660c;

    public /* synthetic */ lt0(bu0 bu0Var, st0 st0Var) {
        this.f6658a = bu0Var;
    }

    @Override // ai.yq1
    public final /* bridge */ /* synthetic */ yq1 a(Context context) {
        Objects.requireNonNull(context);
        this.f6659b = context;
        return this;
    }

    @Override // ai.yq1
    public final /* bridge */ /* synthetic */ yq1 b(l40 l40Var) {
        Objects.requireNonNull(l40Var);
        this.f6660c = l40Var;
        return this;
    }

    @Override // ai.yq1
    public final zq1 zza() {
        zn3.c(this.f6659b, Context.class);
        zn3.c(this.f6660c, l40.class);
        return new mt0(this.f6658a, this.f6659b, this.f6660c, null);
    }
}
