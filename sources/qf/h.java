package qf;

import ae.oc;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.ProfileImageView;
import ud.e4;

/* loaded from: classes3.dex */
public final class h extends RecyclerView.e0 {

    /* renamed from: b */
    public static final a f49175b = new a(null);

    /* renamed from: c */
    public static final int f49176c = 8;

    /* renamed from: a */
    public final oc f49177a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_comment_app_id, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new h((oc) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ ud.s2 f49178w;

        /* renamed from: x */
        public final /* synthetic */ h f49179x;

        /* renamed from: y */
        public final /* synthetic */ io.l<String, wn.v> f49180y;

        /* renamed from: z */
        public final /* synthetic */ io.l<String, wn.v> f49181z;

        /* loaded from: classes3.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f49182a;

            static {
                int[] iArr = new int[jf.a.values().length];
                iArr[jf.a.GAME_ID.ordinal()] = 1;
                iArr[jf.a.URL.ordinal()] = 2;
                f49182a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ud.s2 s2Var, h hVar, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2) {
            super(1);
            this.f49178w = s2Var;
            this.f49179x = hVar;
            this.f49180y = lVar;
            this.f49181z = lVar2;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            int i10 = a.f49182a[this.f49178w.b().ordinal()];
            if (i10 == 1) {
                this.f49179x.f(this.f49178w.a());
                this.f49180y.invoke(this.f49178w.a());
            } else if (i10 != 2) {
            } else {
                this.f49181z.invoke(this.f49178w.a());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ io.l<String, wn.v> f49183w;

        /* renamed from: x */
        public final /* synthetic */ ud.s2 f49184x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.l<? super String, wn.v> lVar, ud.s2 s2Var) {
            super(1);
            this.f49183w = lVar;
            this.f49184x = s2Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<String, wn.v> lVar = this.f49183w;
            if (lVar != null) {
                lVar.invoke(this.f49184x.e());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ e4 f49185w;

        /* renamed from: x */
        public final /* synthetic */ h f49186x;

        /* renamed from: y */
        public final /* synthetic */ io.l<String, wn.v> f49187y;

        /* renamed from: z */
        public final /* synthetic */ io.l<String, wn.v> f49188z;

        /* loaded from: classes3.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f49189a;

            static {
                int[] iArr = new int[jf.a.values().length];
                iArr[jf.a.GAME_ID.ordinal()] = 1;
                iArr[jf.a.URL.ordinal()] = 2;
                f49189a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(e4 e4Var, h hVar, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2) {
            super(1);
            this.f49185w = e4Var;
            this.f49186x = hVar;
            this.f49187y = lVar;
            this.f49188z = lVar2;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            int i10 = a.f49189a[this.f49185w.i().ordinal()];
            if (i10 == 1) {
                this.f49186x.f(this.f49185w.a());
                this.f49187y.invoke(this.f49185w.a());
            } else if (i10 != 2) {
            } else {
                this.f49188z.invoke(this.f49185w.a());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ io.l<String, wn.v> f49190w;

        /* renamed from: x */
        public final /* synthetic */ e4 f49191x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(io.l<? super String, wn.v> lVar, e4 e4Var) {
            super(1);
            this.f49190w = lVar;
            this.f49191x = e4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<String, wn.v> lVar = this.f49190w;
            if (lVar != null) {
                lVar.invoke(this.f49191x.e());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public h(oc ocVar) {
        super(ocVar.u());
        this.f49177a = ocVar;
    }

    public /* synthetic */ h(oc ocVar, jo.h hVar) {
        this(ocVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(h hVar, e4 e4Var, int i10, int i11, io.l lVar, io.l lVar2, io.l lVar3, int i12, Object obj) {
        io.l<? super String, wn.v> lVar4 = lVar3;
        if ((i12 & 32) != 0) {
            lVar4 = null;
        }
        hVar.c(e4Var, i10, i11, lVar, lVar2, lVar4);
    }

    public final void b(ud.s2 s2Var, int i10, int i11, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.l<? super String, wn.v> lVar3) {
        jo.p.h(s2Var, "bindModel");
        jo.p.h(lVar, "copyListener");
        jo.p.h(lVar2, "urlListener");
        this.f49177a.H.setText(s2Var.c());
        this.f49177a.F.setText(s2Var.a());
        ProfileImageView profileImageView = this.f49177a.G;
        jo.p.g(profileImageView, "binding.profileImage");
        ProfileImageView.b(profileImageView, s2Var.i(), s2Var.f(), null, null, 12, null);
        this.f49177a.E.setText(s2Var.h());
        oc ocVar = this.f49177a;
        ocVar.E.setTextColor(c3.a.d(ocVar.u().getContext(), i10));
        this.f49177a.C.setBackgroundResource(i11);
        View view = this.f49177a.B;
        jo.p.g(view, "binding.clickableView");
        yd.g1.a(view, new b(s2Var, this, lVar, lVar2));
        View u10 = this.f49177a.u();
        jo.p.g(u10, "binding.root");
        yd.g1.a(u10, new c(lVar3, s2Var));
        this.f49177a.o();
    }

    public final void c(e4 e4Var, int i10, int i11, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.l<? super String, wn.v> lVar3) {
        jo.p.h(e4Var, "bindModel");
        jo.p.h(lVar, "copyListener");
        jo.p.h(lVar2, "urlListener");
        this.f49177a.H.setText(e4Var.c());
        this.f49177a.F.setText(e4Var.a());
        ProfileImageView profileImageView = this.f49177a.G;
        jo.p.g(profileImageView, "binding.profileImage");
        ProfileImageView.b(profileImageView, e4Var.f(), e4Var.g(), null, null, 12, null);
        this.f49177a.E.setText(e4Var.j());
        oc ocVar = this.f49177a;
        ocVar.E.setTextColor(c3.a.d(ocVar.u().getContext(), i10));
        this.f49177a.C.setBackgroundResource(i11);
        View view = this.f49177a.B;
        jo.p.g(view, "binding.clickableView");
        yd.g1.a(view, new d(e4Var, this, lVar, lVar2));
        View u10 = this.f49177a.u();
        jo.p.g(u10, "binding.root");
        yd.g1.a(u10, new e(lVar3, e4Var));
        this.f49177a.o();
    }

    public final void f(String str) {
        ClipData clipData = new ClipData(new ClipDescription("text_data", new String[]{"text/plain"}), new ClipData.Item(str));
        Object systemService = this.f49177a.u().getContext().getSystemService("clipboard");
        jo.p.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(clipData);
    }
}
