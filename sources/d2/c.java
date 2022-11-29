package d2;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import uo.g1;
import uo.q0;

/* loaded from: classes.dex */
public final class c {

    @co.f(c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", f = "AndroidFontLoader.android.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super Typeface>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f29059w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ h0 f29060x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Context f29061y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0 h0Var, Context context, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f29060x = h0Var;
            this.f29061y = context;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f29060x, this.f29061y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super Typeface> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f29059w == 0) {
                wn.m.b(obj);
                return c.c(this.f29060x, this.f29061y);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final Typeface c(h0 h0Var, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return i0.f29099a.a(context, h0Var);
        }
        Typeface h10 = e3.h.h(context, h0Var.d());
        jo.p.e(h10);
        jo.p.g(h10, "{\n        ResourcesCompa…t(context, resId)!!\n    }");
        return h10;
    }

    public static final Object d(h0 h0Var, Context context, ao.d<? super Typeface> dVar) {
        return uo.j.f(g1.b(), new a(h0Var, context, null), dVar);
    }
}
