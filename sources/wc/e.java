package wc;

import android.content.Context;
import androidx.compose.ui.platform.z;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import jo.f0;
import jo.p;
import jo.q;
import kotlin.KotlinNothingValueException;
import l0.c0;
import l0.l1;
import nc.i;
import of.n;
import uo.q0;
import wn.m;
import wn.v;
import xo.w;

/* loaded from: classes2.dex */
public final class e {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kq.a f58596w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kq.a aVar) {
            super(0);
            this.f58596w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f58596w.b().U();
            p.g(U, "storeOwner.storeOwner.viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ vq.a f58597w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a f58598x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xq.a f58599y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ kq.a f58600z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vq.a aVar, io.a aVar2, xq.a aVar3, kq.a aVar4) {
            super(0);
            this.f58597w = aVar;
            this.f58598x = aVar2;
            this.f58599y = aVar3;
            this.f58600z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            kq.a aVar = this.f58600z;
            vq.a aVar2 = this.f58597w;
            io.a aVar3 = this.f58598x;
            return kq.c.a(this.f58599y, new kq.b(f0.b(wc.f.class), aVar2, null, aVar3, aVar.b(), aVar.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.agreement.ChatConfirmationAgreementPageKt$ChatConfirmationAgreementPage$1", f = "ChatConfirmationAgreementPage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ Context A;
        public final /* synthetic */ io.a<v> B;

        /* renamed from: w  reason: collision with root package name */
        public int f58601w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f58602x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ wc.f f58603y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f58604z;

        @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.agreement.ChatConfirmationAgreementPageKt$ChatConfirmationAgreementPage$1$1", f = "ChatConfirmationAgreementPage.kt", l = {24}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f58605w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ wc.f f58606x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f58607y;

            /* renamed from: wc.e$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0976a implements xo.d<v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.a<v> f58608w;

                public C0976a(io.a<v> aVar) {
                    this.f58608w = aVar;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(v vVar, ao.d<? super v> dVar) {
                    this.f58608w.invoke();
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wc.f fVar, io.a<v> aVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f58606x = fVar;
                this.f58607y = aVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f58606x, this.f58607y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f58605w;
                if (i10 == 0) {
                    m.b(obj);
                    w<v> k10 = this.f58606x.k();
                    C0976a c0976a = new C0976a(this.f58607y);
                    this.f58605w = 1;
                    if (k10.a(c0976a, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.agreement.ChatConfirmationAgreementPageKt$ChatConfirmationAgreementPage$1$2", f = "ChatConfirmationAgreementPage.kt", l = {29}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f58609w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ wc.f f58610x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ Context f58611y;

            /* loaded from: classes2.dex */
            public static final class a implements xo.d<MRError> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ Context f58612w;

                public a(Context context) {
                    this.f58612w = context;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(MRError mRError, ao.d<? super v> dVar) {
                    n nVar = n.f45411a;
                    Context context = this.f58612w;
                    String message = mRError.getMessage();
                    if (message == null) {
                        message = this.f58612w.getString(i.f41875e);
                        p.g(message, "context.getString(R.string.error_access)");
                    }
                    nVar.B(context, message, false);
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(wc.f fVar, Context context, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f58610x = fVar;
                this.f58611y = context;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f58610x, this.f58611y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f58609w;
                if (i10 == 0) {
                    m.b(obj);
                    w<MRError> j10 = this.f58610x.j();
                    a aVar = new a(this.f58611y);
                    this.f58609w = 1;
                    if (j10.a(aVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.agreement.ChatConfirmationAgreementPageKt$ChatConfirmationAgreementPage$1$3", f = "ChatConfirmationAgreementPage.kt", l = {36}, m = "invokeSuspend")
        /* renamed from: wc.e$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0977c extends l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f58613w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ wc.f f58614x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f58615y;

            /* renamed from: wc.e$c$c$a */
            /* loaded from: classes2.dex */
            public static final class a implements xo.d<v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.a<v> f58616w;

                public a(io.a<v> aVar) {
                    this.f58616w = aVar;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(v vVar, ao.d<? super v> dVar) {
                    this.f58616w.invoke();
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0977c(wc.f fVar, io.a<v> aVar, ao.d<? super C0977c> dVar) {
                super(2, dVar);
                this.f58614x = fVar;
                this.f58615y = aVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new C0977c(this.f58614x, this.f58615y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((C0977c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f58613w;
                if (i10 == 0) {
                    m.b(obj);
                    w<v> n10 = this.f58614x.n();
                    a aVar = new a(this.f58615y);
                    this.f58613w = 1;
                    if (n10.a(aVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.agreement.ChatConfirmationAgreementPageKt$ChatConfirmationAgreementPage$1$4", f = "ChatConfirmationAgreementPage.kt", l = {41}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class d extends l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f58617w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ wc.f f58618x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ Context f58619y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f58620z;

            /* loaded from: classes2.dex */
            public static final class a implements xo.d<MRError> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ Context f58621w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ io.a<v> f58622x;

                public a(Context context, io.a<v> aVar) {
                    this.f58621w = context;
                    this.f58622x = aVar;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(MRError mRError, ao.d<? super v> dVar) {
                    n nVar = n.f45411a;
                    Context context = this.f58621w;
                    String message = mRError.getMessage();
                    if (message == null) {
                        message = this.f58621w.getString(i.f41875e);
                        p.g(message, "context.getString(R.string.error_access)");
                    }
                    nVar.B(context, message, false);
                    this.f58622x.invoke();
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(wc.f fVar, Context context, io.a<v> aVar, ao.d<? super d> dVar) {
                super(2, dVar);
                this.f58618x = fVar;
                this.f58619y = context;
                this.f58620z = aVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new d(this.f58618x, this.f58619y, this.f58620z, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f58617w;
                if (i10 == 0) {
                    m.b(obj);
                    w<MRError> m10 = this.f58618x.m();
                    a aVar = new a(this.f58619y, this.f58620z);
                    this.f58617w = 1;
                    if (m10.a(aVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wc.f fVar, io.a<v> aVar, Context context, io.a<v> aVar2, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f58603y = fVar;
            this.f58604z = aVar;
            this.A = context;
            this.B = aVar2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            c cVar = new c(this.f58603y, this.f58604z, this.A, this.B, dVar);
            cVar.f58602x = obj;
            return cVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f58601w == 0) {
                m.b(obj);
                q0 q0Var = (q0) this.f58602x;
                uo.l.d(q0Var, null, null, new a(this.f58603y, this.f58604z, null), 3, null);
                uo.l.d(q0Var, null, null, new b(this.f58603y, this.A, null), 3, null);
                uo.l.d(q0Var, null, null, new C0977c(this.f58603y, this.B, null), 3, null);
                uo.l.d(q0Var, null, null, new d(this.f58603y, this.A, this.B, null), 3, null);
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ wc.a f58623w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(wc.a aVar) {
            super(0);
            this.f58623w = aVar;
        }

        public final void a() {
            this.f58623w.c();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* renamed from: wc.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0978e extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ wc.a f58624w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0978e(wc.a aVar) {
            super(0);
            this.f58624w = aVar;
        }

        public final void a() {
            this.f58624w.d();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f58625w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f58626x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f58627y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a<v> aVar, io.a<v> aVar2, int i10) {
            super(2);
            this.f58625w = aVar;
            this.f58626x = aVar2;
            this.f58627y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            e.a(this.f58625w, this.f58626x, iVar, this.f58627y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(io.a<v> aVar, io.a<v> aVar2, l0.i iVar, int i10) {
        int i11;
        p.h(aVar, "onAgreeSucceeded");
        p.h(aVar2, "onDisagree");
        l0.i h10 = iVar.h(-234349406);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(aVar2) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            Context context = (Context) h10.G(z.g());
            h10.x(1509148303);
            pq.b bVar = pq.b.f48484a;
            xq.a b10 = bVar.get().e().b();
            h10.x(-1688186670);
            h10.x(-1688186362);
            kq.a a10 = iq.a.a(h10, 0);
            h10.O();
            h10.x(-3686552);
            boolean P = h10.P(null) | h10.P(null);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new s0(f0.b(wc.f.class), new a(a10), new b(null, null, b10, a10));
                h10.q(y10);
            }
            h10.O();
            h10.O();
            h10.O();
            wc.f fVar = (wc.f) ((androidx.lifecycle.q0) ((s0) y10).getValue());
            h10.x(-909571169);
            xq.a b11 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P2 = h10.P(null) | h10.P(null);
            Object y11 = h10.y();
            if (P2 || y11 == l0.i.f39065a.a()) {
                y11 = b11.c(f0.b(wc.a.class), null, null);
                h10.q(y11);
            }
            h10.O();
            h10.O();
            wc.a aVar3 = (wc.a) y11;
            c0.c(v.f59242a, new c(fVar, aVar, context, aVar2, null), h10, 64);
            g.a(fVar.l().getValue(), new d(aVar3), new C0978e(aVar3), h10, ha.a.f34693a);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new f(aVar, aVar2, i10));
    }
}
