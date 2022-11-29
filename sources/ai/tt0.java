package ai;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class tt0 implements yk2 {

    /* renamed from: a  reason: collision with root package name */
    public final bu0 f10461a;

    /* renamed from: b  reason: collision with root package name */
    public Context f10462b;

    /* renamed from: c  reason: collision with root package name */
    public String f10463c;

    public /* synthetic */ tt0(bu0 bu0Var, st0 st0Var) {
        this.f10461a = bu0Var;
    }

    @Override // ai.yk2
    public final /* bridge */ /* synthetic */ yk2 a(Context context) {
        Objects.requireNonNull(context);
        this.f10462b = context;
        return this;
    }

    @Override // ai.yk2
    public final /* bridge */ /* synthetic */ yk2 t(String str) {
        this.f10463c = str;
        return this;
    }

    @Override // ai.yk2
    public final zk2 zza() {
        zn3.c(this.f10462b, Context.class);
        return new ut0(this.f10461a, this.f10462b, this.f10463c, null);
    }
}
