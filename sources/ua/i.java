package ua;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import jo.p;
import sa.u;

/* loaded from: classes2.dex */
public final class i extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f54709b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f54710c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final u f54711a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), qa.p.view_holder_notice_present_box, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new i((u) e10, null);
        }
    }

    public i(u uVar) {
        super(uVar.u());
        this.f54711a = uVar;
    }

    public /* synthetic */ i(u uVar, jo.h hVar) {
        this(uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d7, code lost:
        if ((r0.length() > 0) == true) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.dena.mirrorman.net.api.response.notice.PresentBox r13) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.i.a(com.dena.mirrorman.net.api.response.notice.PresentBox):void");
    }
}
