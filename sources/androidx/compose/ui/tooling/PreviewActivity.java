package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import h0.m0;
import h0.v0;
import io.p;
import java.util.Arrays;
import jo.q;
import l0.i;
import l0.s0;
import l0.z1;
import so.o;
import wn.v;
import y.t0;

/* loaded from: classes.dex */
public final class PreviewActivity extends ComponentActivity {
    public final String H = "PreviewActivity";

    /* loaded from: classes.dex */
    public static final class a extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f14717w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f14718x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(2);
            this.f14717w = str;
            this.f14718x = str2;
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                k2.a.f38368a.g(this.f14717w, this.f14718x, iVar, new Object[0]);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object[] f14719w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f14720x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f14721y;

        /* loaded from: classes.dex */
        public static final class a extends q implements p<i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ s0<Integer> f14722w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ Object[] f14723x;

            /* renamed from: androidx.compose.ui.tooling.PreviewActivity$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0055a extends q implements io.a<v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ s0<Integer> f14724w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ Object[] f14725x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0055a(s0<Integer> s0Var, Object[] objArr) {
                    super(0);
                    this.f14724w = s0Var;
                    this.f14725x = objArr;
                }

                public final void a() {
                    s0<Integer> s0Var = this.f14724w;
                    s0Var.setValue(Integer.valueOf((s0Var.getValue().intValue() + 1) % this.f14725x.length));
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ v invoke() {
                    a();
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s0<Integer> s0Var, Object[] objArr) {
                super(2);
                this.f14722w = s0Var;
                this.f14723x = objArr;
            }

            public final void a(i iVar, int i10) {
                if ((i10 & 11) == 2 && iVar.j()) {
                    iVar.I();
                } else {
                    m0.a(k2.b.f38369a.a(), new C0055a(this.f14722w, this.f14723x), null, null, null, null, 0L, 0L, null, iVar, 6, 508);
                }
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
                a(iVar, num.intValue());
                return v.f59242a;
            }
        }

        /* renamed from: androidx.compose.ui.tooling.PreviewActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0056b extends q implements io.q<t0, i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f14726w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f14727x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ Object[] f14728y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ s0<Integer> f14729z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0056b(String str, String str2, Object[] objArr, s0<Integer> s0Var) {
                super(3);
                this.f14726w = str;
                this.f14727x = str2;
                this.f14728y = objArr;
                this.f14729z = s0Var;
            }

            public final void a(t0 t0Var, i iVar, int i10) {
                jo.p.h(t0Var, "it");
                if ((i10 & 81) == 16 && iVar.j()) {
                    iVar.I();
                } else {
                    k2.a.f38368a.g(this.f14726w, this.f14727x, iVar, this.f14728y[this.f14729z.getValue().intValue()]);
                }
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ v s0(t0 t0Var, i iVar, Integer num) {
                a(t0Var, iVar, num.intValue());
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object[] objArr, String str, String str2) {
            super(2);
            this.f14719w = objArr;
            this.f14720x = str;
            this.f14721y = str2;
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            iVar.x(-492369756);
            Object y10 = iVar.y();
            if (y10 == i.f39065a.a()) {
                y10 = z1.e(0, null, 2, null);
                iVar.q(y10);
            }
            iVar.O();
            s0 s0Var = (s0) y10;
            v0.a(null, null, null, null, null, s0.c.b(iVar, 2137630662, true, new a(s0Var, this.f14719w)), 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s0.c.b(iVar, -1578412612, true, new C0056b(this.f14720x, this.f14721y, this.f14719w, s0Var)), iVar, 196608, 12582912, 131039);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f14730w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f14731x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Object[] f14732y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, Object[] objArr) {
            super(2);
            this.f14730w = str;
            this.f14731x = str2;
            this.f14732y = objArr;
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            k2.a aVar = k2.a.f38368a;
            String str = this.f14730w;
            String str2 = this.f14731x;
            Object[] objArr = this.f14732y;
            aVar.g(str, str2, iVar, Arrays.copyOf(objArr, objArr.length));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final void X2(String str) {
        String str2 = this.H;
        Log.d(str2, "PreviewActivity has composable " + str);
        String K0 = o.K0(str, '.', null, 2, null);
        String E0 = o.E0(str, '.', null, 2, null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            Y2(K0, E0, stringExtra);
            return;
        }
        String str3 = this.H;
        Log.d(str3, "Previewing '" + E0 + "' without a parameter provider.");
        a.a.b(this, null, s0.c.c(-161032931, true, new a(K0, E0)), 1, null);
    }

    public final void Y2(String str, String str2, String str3) {
        String str4 = this.H;
        Log.d(str4, "Previewing '" + str2 + "' with parameter provider: '" + str3 + '\'');
        Object[] b10 = k2.c.b(k2.c.a(str3), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (b10.length > 1) {
            a.a.b(this, null, s0.c.c(-1735847170, true, new b(b10, str, str2)), 1, null);
        } else {
            a.a.b(this, null, s0.c.c(1507674311, true, new c(str, str2, b10)), 1, null);
        }
    }

    @Override // androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            Log.d(this.H, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        X2(stringExtra);
    }
}
