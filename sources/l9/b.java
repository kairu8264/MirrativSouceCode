package l9;

import android.content.Context;
import com.dena.mirrativ.customview.StatusView;
import io.l;
import io.p;
import jo.q;
import l0.i;
import wn.v;
import y.d1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f39693a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static p<i, Integer, v> f39694b = s0.c.c(-2014916653, false, a.f39695w);

    /* loaded from: classes.dex */
    public static final class a extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f39695w = new a();

        /* renamed from: l9.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0566a extends q implements l<Context, StatusView> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0566a f39696w = new C0566a();

            public C0566a() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final StatusView invoke(Context context) {
                jo.p.h(context, "it");
                StatusView statusView = new StatusView(context, null, 0, 6, null);
                statusView.b(StatusView.b.C0181b.f20790w);
                return statusView;
            }
        }

        public a() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                o2.e.a(C0566a.f39696w, d1.n(x0.f.f59359u, 0.0f, 1, null), null, iVar, 54, 4);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final p<i, Integer, v> a() {
        return f39694b;
    }
}
