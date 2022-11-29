package gc;

import ac.t4;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public final class i extends RelativeLayout {

    /* renamed from: w  reason: collision with root package name */
    public final String f32953w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f32954x;

    /* renamed from: y  reason: collision with root package name */
    public final t4 f32955y;

    /* renamed from: z  reason: collision with root package name */
    public a f32956z;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String str, boolean z10) {
        super(context);
        jo.p.h(str, "title");
        this.f32953w = str;
        this.f32954x = z10;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(getContext()), xb.p.view_dialog_alert, this, true);
        jo.p.g(e10, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f32955y = (t4) e10;
        i();
    }

    public static final void j(i iVar, View view) {
        jo.p.h(iVar, "this$0");
        iVar.g();
    }

    public static final void k(i iVar, View view) {
        jo.p.h(iVar, "this$0");
        iVar.f();
    }

    public static final void l(i iVar, View view) {
        jo.p.h(iVar, "this$0");
        iVar.e();
    }

    public final void d(a aVar) {
        this.f32956z = aVar;
    }

    public final void e() {
        a aVar;
        if (!this.f32954x || (aVar = this.f32956z) == null) {
            return;
        }
        jo.p.e(aVar);
        aVar.a();
    }

    public final void f() {
        a aVar = this.f32956z;
        if (aVar != null) {
            jo.p.e(aVar);
            aVar.c();
        }
    }

    public final void g() {
        a aVar = this.f32956z;
        if (aVar != null) {
            jo.p.e(aVar);
            aVar.b();
        }
    }

    public final void h(RelativeLayout relativeLayout) {
        jo.p.h(relativeLayout, "view_to_remevefrom");
        relativeLayout.removeView(this);
    }

    public final void i() {
        this.f32955y.F.setText(this.f32953w);
        this.f32955y.D.setOnClickListener(new View.OnClickListener() { // from class: gc.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.j(i.this, view);
            }
        });
        this.f32955y.C.setOnClickListener(new View.OnClickListener() { // from class: gc.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.k(i.this, view);
            }
        });
        this.f32955y.E.setOnClickListener(new View.OnClickListener() { // from class: gc.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.l(i.this, view);
            }
        });
    }

    public final void m(RelativeLayout relativeLayout) {
        jo.p.h(relativeLayout, "view_to_add");
        relativeLayout.addView(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(android.content.Context r2, int r3, boolean r4) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            jo.p.h(r2, r0)
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r0 = "context.resources.getString(titleTextId)"
            jo.p.g(r3, r0)
            r1.<init>(r2, r3, r4)
            r1.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.i.<init>(android.content.Context, int, boolean):void");
    }
}
