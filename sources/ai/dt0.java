package ai;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class dt0 implements ph2 {

    /* renamed from: a  reason: collision with root package name */
    public final bu0 f3400a;

    /* renamed from: b  reason: collision with root package name */
    public Context f3401b;

    /* renamed from: c  reason: collision with root package name */
    public String f3402c;

    /* renamed from: d  reason: collision with root package name */
    public fs f3403d;

    public /* synthetic */ dt0(bu0 bu0Var, st0 st0Var) {
        this.f3400a = bu0Var;
    }

    @Override // ai.ph2
    public final /* bridge */ /* synthetic */ ph2 A(String str) {
        Objects.requireNonNull(str);
        this.f3402c = str;
        return this;
    }

    @Override // ai.ph2
    public final /* bridge */ /* synthetic */ ph2 a(fs fsVar) {
        Objects.requireNonNull(fsVar);
        this.f3403d = fsVar;
        return this;
    }

    @Override // ai.ph2
    public final /* bridge */ /* synthetic */ ph2 b(Context context) {
        Objects.requireNonNull(context);
        this.f3401b = context;
        return this;
    }

    @Override // ai.ph2
    public final qh2 zza() {
        zn3.c(this.f3401b, Context.class);
        zn3.c(this.f3402c, String.class);
        zn3.c(this.f3403d, fs.class);
        return new et0(this.f3400a, this.f3401b, this.f3402c, this.f3403d, null);
    }
}
