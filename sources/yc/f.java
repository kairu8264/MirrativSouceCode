package yc;

import android.content.Context;
import androidx.compose.ui.platform.z;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import jo.f0;
import jo.p;
import jo.q;
import kotlin.KotlinNothingValueException;
import l0.c0;
import l0.c2;
import l0.l1;
import of.n;
import uo.q0;
import wn.m;
import wn.v;
import xo.w;

/* loaded from: classes2.dex */
public final class f {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kq.a f61641w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kq.a aVar) {
            super(0);
            this.f61641w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f61641w.b().U();
            p.g(U, "storeOwner.storeOwner.viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ vq.a f61642w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a f61643x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xq.a f61644y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ kq.a f61645z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vq.a aVar, io.a aVar2, xq.a aVar3, kq.a aVar4) {
            super(0);
            this.f61642w = aVar;
            this.f61643x = aVar2;
            this.f61644y = aVar3;
            this.f61645z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            kq.a aVar = this.f61645z;
            vq.a aVar2 = this.f61642w;
            io.a aVar3 = this.f61643x;
            return kq.c.a(this.f61644y, new kq.b(f0.b(yc.g.class), aVar2, null, aVar3, aVar.b(), aVar.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.generationpicker.ChatConfirmationGenerationPickerPageKt$ChatConfirmationGenerationPickerPage$1", f = "ChatConfirmationGenerationPickerPage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ Context A;
        public final /* synthetic */ io.a<v> B;

        /* renamed from: w  reason: collision with root package name */
        public int f61646w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f61647x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ yc.g f61648y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<ChatStatus, v> f61649z;

        @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.generationpicker.ChatConfirmationGenerationPickerPageKt$ChatConfirmationGenerationPickerPage$1$1", f = "ChatConfirmationGenerationPickerPage.kt", l = {26}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f61650w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ yc.g f61651x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.l<ChatStatus, v> f61652y;

            /* renamed from: yc.f$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C1055a implements xo.d<ChatStatus> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.l<ChatStatus, v> f61653w;

                /* JADX WARN: Multi-variable type inference failed */
                public C1055a(io.l<? super ChatStatus, v> lVar) {
                    this.f61653w = lVar;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(ChatStatus chatStatus, ao.d<? super v> dVar) {
                    this.f61653w.invoke(chatStatus);
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(yc.g gVar, io.l<? super ChatStatus, v> lVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f61651x = gVar;
                this.f61652y = lVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f61651x, this.f61652y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f61650w;
                if (i10 == 0) {
                    m.b(obj);
                    w<ChatStatus> l10 = this.f61651x.l();
                    C1055a c1055a = new C1055a(this.f61652y);
                    this.f61650w = 1;
                    if (l10.a(c1055a, this) == c10) {
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

        @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.generationpicker.ChatConfirmationGenerationPickerPageKt$ChatConfirmationGenerationPickerPage$1$2", f = "ChatConfirmationGenerationPickerPage.kt", l = {31}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f61654w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ yc.g f61655x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ Context f61656y;

            /* loaded from: classes2.dex */
            public static final class a implements xo.d<MRError> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ Context f61657w;

                public a(Context context) {
                    this.f61657w = context;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(MRError mRError, ao.d<? super v> dVar) {
                    n nVar = n.f45411a;
                    Context context = this.f61657w;
                    String message = mRError.getMessage();
                    if (message == null) {
                        message = this.f61657w.getString(nc.i.f41875e);
                        p.g(message, "context.getString(R.string.error_access)");
                    }
                    nVar.B(context, message, false);
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(yc.g gVar, Context context, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f61655x = gVar;
                this.f61656y = context;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f61655x, this.f61656y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f61654w;
                if (i10 == 0) {
                    m.b(obj);
                    w<MRError> k10 = this.f61655x.k();
                    a aVar = new a(this.f61656y);
                    this.f61654w = 1;
                    if (k10.a(aVar, this) == c10) {
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

        @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.generationpicker.ChatConfirmationGenerationPickerPageKt$ChatConfirmationGenerationPickerPage$1$3", f = "ChatConfirmationGenerationPickerPage.kt", l = {38}, m = "invokeSuspend")
        /* renamed from: yc.f$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C1056c extends l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f61658w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ yc.g f61659x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f61660y;

            /* renamed from: yc.f$c$c$a */
            /* loaded from: classes2.dex */
            public static final class a implements xo.d<v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.a<v> f61661w;

                public a(io.a<v> aVar) {
                    this.f61661w = aVar;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(v vVar, ao.d<? super v> dVar) {
                    this.f61661w.invoke();
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1056c(yc.g gVar, io.a<v> aVar, ao.d<? super C1056c> dVar) {
                super(2, dVar);
                this.f61659x = gVar;
                this.f61660y = aVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new C1056c(this.f61659x, this.f61660y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((C1056c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f61658w;
                if (i10 == 0) {
                    m.b(obj);
                    w<v> j10 = this.f61659x.j();
                    a aVar = new a(this.f61660y);
                    this.f61658w = 1;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(yc.g gVar, io.l<? super ChatStatus, v> lVar, Context context, io.a<v> aVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f61648y = gVar;
            this.f61649z = lVar;
            this.A = context;
            this.B = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            c cVar = new c(this.f61648y, this.f61649z, this.A, this.B, dVar);
            cVar.f61647x = obj;
            return cVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f61646w == 0) {
                m.b(obj);
                q0 q0Var = (q0) this.f61647x;
                uo.l.d(q0Var, null, null, new a(this.f61648y, this.f61649z, null), 3, null);
                uo.l.d(q0Var, null, null, new b(this.f61648y, this.A, null), 3, null);
                uo.l.d(q0Var, null, null, new C1056c(this.f61648y, this.B, null), 3, null);
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.l<Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ yc.b f61662w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(yc.b bVar) {
            super(1);
            this.f61662w = bVar;
        }

        public final void a(int i10) {
            this.f61662w.d(i10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ yc.g f61663w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ yc.b f61664x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(yc.g gVar, yc.b bVar) {
            super(0);
            this.f61663w = gVar;
            this.f61664x = bVar;
        }

        public final void a() {
            String value = this.f61663w.m().getValue();
            if (value == null) {
                return;
            }
            this.f61664x.e(value);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* renamed from: yc.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1057f extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ yc.b f61665w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1057f(yc.b bVar) {
            super(0);
            this.f61665w = bVar;
        }

        public final void a() {
            this.f61665w.c();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<ChatStatus, v> f61666w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f61667x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f61668y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(io.l<? super ChatStatus, v> lVar, io.a<v> aVar, int i10) {
            super(2);
            this.f61666w = lVar;
            this.f61667x = aVar;
            this.f61668y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            f.a(this.f61666w, this.f61667x, iVar, this.f61668y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(io.l<? super ChatStatus, v> lVar, io.a<v> aVar, l0.i iVar, int i10) {
        int i11;
        p.h(lVar, "onRegisterGenerationSucceeded");
        p.h(aVar, "onCancel");
        l0.i h10 = iVar.h(739937733);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(lVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(aVar) ? 32 : 16;
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
                y10 = new s0(f0.b(yc.g.class), new a(a10), new b(null, null, b10, a10));
                h10.q(y10);
            }
            h10.O();
            h10.O();
            h10.O();
            yc.g gVar = (yc.g) ((androidx.lifecycle.q0) ((s0) y10).getValue());
            h10.x(-909571169);
            xq.a b11 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P2 = h10.P(null) | h10.P(null);
            Object y11 = h10.y();
            if (P2 || y11 == l0.i.f39065a.a()) {
                y11 = b11.c(f0.b(yc.b.class), null, null);
                h10.q(y11);
            }
            h10.O();
            h10.O();
            yc.b bVar2 = (yc.b) y11;
            c0.c(v.f59242a, new c(gVar, lVar, context, aVar, null), h10, 64);
            h.a(b(gVar.i()), new d(bVar2), new e(gVar, bVar2), new C1057f(bVar2), h10, 8);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new g(lVar, aVar, i10));
    }

    public static final yc.d b(c2<yc.d> c2Var) {
        return c2Var.getValue();
    }
}
