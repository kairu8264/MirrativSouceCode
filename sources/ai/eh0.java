package ai;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class eh0 {

    /* renamed from: a  reason: collision with root package name */
    public Context f3665a;

    /* renamed from: b  reason: collision with root package name */
    public vh.f f3666b;

    /* renamed from: c  reason: collision with root package name */
    public yg.r1 f3667c;

    /* renamed from: d  reason: collision with root package name */
    public ai0 f3668d;

    public /* synthetic */ eh0(fh0 fh0Var) {
    }

    public final eh0 a(Context context) {
        Objects.requireNonNull(context);
        this.f3665a = context;
        return this;
    }

    public final eh0 b(vh.f fVar) {
        Objects.requireNonNull(fVar);
        this.f3666b = fVar;
        return this;
    }

    public final eh0 c(yg.r1 r1Var) {
        this.f3667c = r1Var;
        return this;
    }

    public final eh0 d(ai0 ai0Var) {
        this.f3668d = ai0Var;
        return this;
    }

    public final bi0 e() {
        zn3.c(this.f3665a, Context.class);
        zn3.c(this.f3666b, vh.f.class);
        zn3.c(this.f3667c, yg.r1.class);
        zn3.c(this.f3668d, ai0.class);
        return new gh0(this.f3665a, this.f3666b, this.f3667c, this.f3668d, null);
    }
}
