package yd;

import ae.en;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.Toast;
import oq.a;

/* loaded from: classes2.dex */
public final class t1 extends FrameLayout implements oq.a {

    /* renamed from: x  reason: collision with root package name */
    public static final a f61795x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f61796y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final en f61797w;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final void a(Context context, String str) {
            jo.p.h(context, "context");
            jo.p.h(str, "text");
            Toast toast = new Toast(context.getApplicationContext());
            toast.setGravity(17, 0, 0);
            toast.setDuration(0);
            Context applicationContext = context.getApplicationContext();
            jo.p.g(applicationContext, "context.applicationContext");
            t1 t1Var = new t1(applicationContext);
            t1Var.setText(str);
            toast.setView(t1Var);
            toast.show();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(Context context) {
        super(context);
        jo.p.h(context, "context");
        this.f61797w = (en) androidx.databinding.f.e(LayoutInflater.from(getContext()), nd.b1.view_toast, this, true);
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final void setText(String str) {
        jo.p.h(str, "text");
        this.f61797w.B.setText(str);
    }
}
