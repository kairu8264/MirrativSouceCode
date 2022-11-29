package dc;

import ac.d5;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import fa.b;

/* loaded from: classes2.dex */
public final class f extends FrameLayout implements fa.b {

    /* renamed from: x  reason: collision with root package name */
    public static final a f29393x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f29394y = 8;

    /* renamed from: w  reason: collision with root package name */
    public d5 f29395w;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        jo.p.h(context, "context");
        d5 T = d5.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f29395w = T;
    }

    private static /* synthetic */ void getBinding$annotations() {
    }

    @Override // fa.b
    public View getFloatViewContentView() {
        return this;
    }

    @Override // fa.b
    public int getFloatViewGravity() {
        return b.a.a(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutFlags() {
        return b.a.b(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutHeight() {
        return b.a.c(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutWidth() {
        return b.a.d(this);
    }

    @Override // fa.b
    public String getFloatViewTag() {
        return "FloatLoadingView";
    }
}
